import Vue from 'vue';

const state = {
    processModels: {}
}

const actions = {
    /**
     * 根据窗口名称获取显示模型
     * @param {*} param0 
     * @param {processName: 窗口名称, callback: 回调函数} params 
     */
    async getProcessModel({
        commit,
        state
    }, params) {
        if (!state.processModels[params.processName]) {
            var data = await Vue.http.get('/mpm/' + params.processName)
            if (data) {
                commit('SET_RPOCESS_MODEL', { processName: params.processName, processModel: data });
            } else {
                app.$notify.error({
                    title: '服务错误',
                    message: '找不到过程模型[' + params.processName + ']'
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
     * @param {processName: 窗口名称, processModel: 过程模型} params 
     */
    SET_RPOCESS_MODEL(state, params) {
        state.processModels[params.processName] = params.processModel;
    }
}

export default {
    state,
    actions,
    mutations
}