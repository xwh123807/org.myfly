import Vue from 'vue';

const state = {
    refLists: {},
    refTables: {}
}

const actions = {
    async getRefList({
        commit,
        state
    }, params) {
        if (!state.refLists[params.element]) {
            var data = await Vue.http.get('/mdm/reflists/' + params.element)
            if (data) {
                commit('SET_REFLIST', { element: params.element, model: data });
            } else {
                app.$notify.error({
                    title: '服务错误',
                    message: '找不到引用值列表[' + params.element + ']'
                })
            }
        }
        params.callback && params.callback();
    },
    async getRefTable({ commit,
        state }, params) {
        if (!state.refTables[params.relationTable]) {
            var data = await Vue.http.get('/flydata3/reftable/' );
        }
    }
}

const mutations = {
    SET_REFLIST(state, params) {
        state.refLists[params.element] = params.model;
    }
}

export default {
    state,
    actions,
    mutations
}