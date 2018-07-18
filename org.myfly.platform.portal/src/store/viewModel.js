import Vue from 'vue';

const state = {
    viewModels: {}
}

const actions = {
    async getViewModel({ commit }, params) {
        var data = await Vue.http.get('/mvm/' + params.windowName)
        commit('SET_VIEW_MODEL', data);
    }
}

const mutations = {
    SET_VIEW_MODEL(state, viewModel) {
        state.viewModels[viewModel.apiName.toLowerCase()] = viewModel;
    }
}

export default {
    state,
    actions,
    mutations
}