import Vue from 'vue'
import Vuex from 'vuex'

import cnode from './cnode'
import user from './user'
import viewModel from './viewModel'
import flyRouter from './flyRouter'
import processModel from './processModel'

Vue.use(Vuex)

export default new Vuex.Store({
  strict: process.env.NODE_ENV !== 'production',
  modules: {
    cnode,
    user,
    viewModel,
    flyRouter,
    processModel
  }
})
