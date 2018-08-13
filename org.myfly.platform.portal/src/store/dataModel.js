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
                commit('SET_REFLIST', {
                    element: params.element,
                    model: data
                });
            } else {
                app.$notify.error({
                    title: '服务错误',
                    message: '找不到引用值列表[' + params.element + ']'
                })
            }
        }
        params.callback && params.callback();
    },
    async getRefTable({
        commit,
        state
    }, params) {
        if (!state.refTables[params.relationTable]) {
            var data = await Vue.http.get('/flydata3/idNames/' + params.relationTable + 
                '/' + params.relationKeyColumn + '/' + params.relationDisplayColumn);
            if (data) {
                commit('SET_REFTABLE', {
                    relationTable: params.relationTable,
                    model: data
                });
            } else {
                app.$notify.error({
                    title: '服务错误',
                    message: '找不到引用表[' + params.relationTable + ']'
                })
            }
        }
        params.callback && params.callback();
    }
}

const mutations = {
    SET_REFLIST(state, params) {
        state.refLists[params.element] = params.model;
    },
    SET_REFTABLE(state, params) {
        state.refTables[params.relationTable] = params.model;
    }
}

export default {
    state,
    actions,
    mutations
}