import Vue from 'vue'

const state = {
    /**
     * 所有打开的路由
     */
    routes: [],
    /**
     * 当前打开路由
     */
    activeIndex: "/home"
}

const actions = {
    /**
     * 添加tab
     * @param {*} param0 
     * @param {*} data 
     */
    addTab({ commit }, data) {
        commit("ADD_TAB", data);
    },
    /**
     * 删除tab
     * @param {*} param0 
     * @param {*} route 
     */
    delTab({ state, commit }, route) {
        let index = 0;
        for (let item of state.routes) {
            if (item.route === route) {
                break;
            }
            index++;
        }
        commit("DEL_TAB", index);
    },
    /**
     * 设置当前tab
     * @param {*} param0 
     * @param {*} index 
     */
    setActiveRoute({ commit }, index) {
        commit("SET_ACTIVE_INDEX", index);
    },

    /**
     * 设置路由标题
     * @param {*} param0 
     * @param {*} title 
     */
    setTabTitle({ commit }, data) {
        let index = 0;
        for (let item of state.routes) {
            if (item.route === data.route) {
                break;
            }
            index++;
        }
        data.index = index;
        commit("SET_TAB_TITLE", data);
    }
}

const mutations = {
    ADD_TAB(state, data) {
        state.routes.push(data);
    },
    DEL_TAB(state, index) {
        state.routes.splice(index, 1);
    },
    SET_ACTIVE_INDEX(state, index) {
        state.activeIndex = index;
    },
    SET_TAB_TITLE(state, data) {
        if (state.routes.length === 0) {
            state.routes.push(data);
        } else {
            state.routes[data.index].name = data.name;
        }
    },
}

export default {
    state,
    actions,
    mutations
}