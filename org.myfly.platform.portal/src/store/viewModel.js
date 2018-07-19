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
            commit('SET_VIEW_MODEL', data);
            //console.info("成功加载显示模型：" + data.apiName);
        }
        params.callback && params.callback();
    }
}

const mutations = {
    SET_VIEW_MODEL(state, viewModel) {
        state.viewModels[viewModel.apiName.toLowerCase()] = viewModel;
        state[viewModel.apiName.toLowerCase()] = viewModel;
    }
}

export default {
    state,
    actions,
    mutations
}