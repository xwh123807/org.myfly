import Vue from 'vue';

const state = {
    viewModels: {}
}

const actions = {
    /**
     * 根据窗口名称获取显示模型
     * @param {*} param0 
     * @param {windowName: 窗口名称, callback: 回调函数} params 
     */
    async getViewModel({
        commit,
        state
    }, params) {
        if (!state.viewModels[params.windowName]) {
            var data = await Vue.http.get('/mvm/' + params.windowName)
            if (data) {
                commit('SET_VIEW_MODEL', { windowName: params.windowName, viewModel: data });
                console.info("成功加载显示模型：" + data.apiName);
            } else {
                app.$notify.error({
                    title: '服务错误',
                    message: '找不到显示模型[' + params.windowName + ']'
                })
            }
        }
        params.callback && params.callback();
    }
}

const mutations = {
    /**
     * 设置窗口的显示模型
     * @param {*} state 
     * @param {windowName: 窗口名称, viewModel: 显示模型} params 
     */
    SET_VIEW_MODEL(state, params) {
        state.viewModels[params.windowName] = params.viewModel;
    }
}

export default {
    state,
    actions,
    mutations
}