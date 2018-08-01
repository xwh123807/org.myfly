import Vue from 'vue'

const state = {
    /**
     * 所有打开的路由，路由对象{path: String, name: String, params: Object}
     */
    routes: [],
    /**
     * 当前打开路由
     */
    activeRoutePath: "/home"
}

const getters = {
    /**
     * 获取动态列表路由
     */
    dynamicListRoutes: state => {
        return state.routes.filter(item => item.path.startsWith("/dynamic/list/") || item.path.startsWith("/dynamic/richlist/"));
    },
    /**
     * 获取动态表单路由
     */
    dynamicFormRoutes: state => {
        return state.routes.filter(item => item.path.startsWith("/dynamic/form/"));
    }
}

const actions = {
    /**
     * 添加tab
     * @param {*} param0 
     * @param {*} data 
     */
    addTab({
        commit
    }, data) {
        commit("ADD_TAB", data);
    },
    /**
     * 删除tab
     * @param {*} param0 
     * @param {*} path 
     */
    delTab({
        state,
        commit
    }, path) {
        let index = 0;
        for (let item of state.routes) {
            if (item.path === path) {
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
    setActiveRoute({
        commit
    }, index) {
        commit("SET_ACTIVE_INDEX", index);
    },

    /**
     * 设置路由标题
     * @param {*} commit 
     * @param {*} data 
     */
    setTabTitle({
        commit
    }, data) {
        let index = 0;
        for (let item of state.routes) {
            if (item.path === data.path) {
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
    SET_ACTIVE_INDEX(state, path) {
        state.activeRoutePath = path;
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
    getters,
    actions,
    mutations
}