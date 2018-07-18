import Vue from 'vue'
import Vuex from 'vuex'

import cnode from './cnode'
import user from './user'
import viewModel from './viewModel'

Vue.use(Vuex)

export default new Vuex.Store({
  strict: process.env.NODE_ENV !== 'production',
  modules: {
    cnode,
    user,
    viewModel
  }
})
