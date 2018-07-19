import Vue from 'vue';

const state = {
    viewModels: {}
}

const actions = {
    async getViewModel({
        commit,
        state
    }, params) {
        if (!state.viewModels[params.windowName]) {
            var data = await Vue.http.get('/mvm/' + params.windowName)
            if (data) {
                commit('SET_VIEW_MODEL', { windowName: params.windowName, viewModel: data });
                //console.info("成功加载显示模型：" + data.apiName);
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
    SET_VIEW_MODEL(state, params) {
        state.viewModels[params.windowName] = params.viewModel;
    }
}

export default {
    state,
    actions,
    mutations
}