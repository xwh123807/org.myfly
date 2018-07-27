import Vue from 'vue'

const state = {
    routers: {}
}

const actions = {
    addRoute({state}, route){
        var name = route.name;
        state.routers[name] = route;
    },
    delRoute({state}, name){
        delete state.route[name];
    }
}

const mutations = {

}

export default {
    state,
    actions,
    mutations
}