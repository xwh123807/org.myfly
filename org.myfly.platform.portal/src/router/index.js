import Vue from 'vue'
import Router from 'vue-router'

import AppView from '@/components/app-view'
import Home from '@/pages/home'

Vue.use(Router)

const page = name => () => import('@/pages/' + name)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '',
      component: AppView,
      children: [
        { path: '/', name: 'home', component: Home },
        { path: '/dynamicTest', name: 'dynamicTest', component: page('myfly/dynamicTest') },
        { path: '/dynamicTable/:windowName', name: 'dynamicTable', component: page('myfly/dynamicTable') },
        { path: '/dynamicTable2/:windowName', name: 'dynamicTable2', component: page('myfly/dynamicTable2') },
        { path: '/dynamicComponent/:windowName', name: 'dynamicComponent', component: page('myfly/dynamic-component') },
        { path: '/dynamicForm/:windowName', name: 'dynamicForm', component: page('myfly/dynamic-form') },
        { path: '/dynamicListWindow/:windowName', name: 'dynamicListWindow', component: page('myfly/dynamic-listwindow') },
        { path: '/dynamic/:dynamicType/:windowName', name: 'dynamic-list', component: ()=>import("@/myfly/fly-multicachewindow/fly-multilistwindow") },
        { path: '/dynamic/:dynamicType/:windowName/:uid', name: 'dynamic-form', component:  ()=>import("@/myfly/fly-multicachewindow/fly-multiformwindow") },
        { path: '/dynamicRichListWindow/:windowName', name: 'dynamicRichListWindow', component: page('myfly/dynamic-richlistwindow') },
        { path: '/dynamicFormWindow/:windowName/:uid', name: 'dynamicFormWindow', component: page('myfly/dynamic-formwindow') },
        { path: '/keyboard', name: 'c-keyboard', component: page('c-keyboard') },
        { path: '/404', name: '404', component: page('404') },
        { path: '/500', name: '500', component: page('500') }
      ]
    },
    { path: '/login', name: 'login', component: page('login') },
    { path: '/cnode', name: 'cnode', component: page('cnode') },
    // pages
    { path: '/home-login', name: 'p-login', component: page('home-login') },
    { path: '/register', name: 'p-register', component: page('register') },
    { path: '/keyboard', name: 'p-keyboard', component: page('c-keyboard') },
    // { path: '*', redirect: { name: '404' } }
  ]
})
