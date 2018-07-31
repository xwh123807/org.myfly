// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import 'babel-polyfill'
import ElementUI from 'element-ui'
import Axios from 'axios'
import NProgress from 'nprogress'


import App from './App'
import store from './store'
import router from './router'
import 'element-ui/lib/theme-chalk/index.css'
import '@/assets/font-awesome-4.7.0/css/font-awesome.min.css'
import '@/assets/css/main.css'
import '@/assets/css/scrollbar.css'
import '@/assets/css/reset.css'
import 'nprogress/nprogress.css'
import 'animate.css'


import DropdownPlugin from './m/dropdown'
import NavbarPlugin from './m/navbar'
import ContextMenuPlugin from './m/context-menu'
import MButton from '@/m/button'
import MSwitch from '@/m/switch'
import MAlert from '@/m/alert'
import MCheckbox from '@/m/checkbox'
import MInput from '@/m/input'
import MLoading from '@/m/loading'
import Mkeyboard from '@/m/keyboard'
import MNumberkeyboard from '@/m/number-keyboard'
import MBox from '@/m/box'
import MBackTop from '@/m/back-top'
import MLoader from '@/m/loader'
import MContainer from '@/m/container'


// import myfly components
import FlyTabRouter from '@/myfly/fly-tabrouter/index.js'
import FlyELTable from '@/myfly/fly-eltable/index.js'
import FlyForm from '@/myfly/fly-form/index.js'
import FlyListWindow from '@/myfly/fly-listwindow/index.js'
import FlyRichListWindow from '@/myfly/fly-richlistwindow/index.js'
import FlyFormWindow from '@/myfly/fly-formwindow/index.js'
import FlySubTable from '@/myfly/fly-subtable/index.js'
import FlyKeepAlive from '@/myfly/fly-keepalive/index.js'
import FlyMultiCacheWindow from '@/myfly/fly-multicachewindow/index.js'

Vue.use(ElementUI)

Vue.use(DropdownPlugin)
Vue.use(NavbarPlugin)
Vue.use(ContextMenuPlugin)
Vue.use(MButton)
Vue.use(MSwitch)
Vue.use(MAlert)
Vue.use(MCheckbox)
Vue.use(MInput)
Vue.use(MLoading)
Vue.use(Mkeyboard)
Vue.use(MNumberkeyboard)
Vue.use(MBox)
Vue.use(MBackTop)
Vue.use(MLoader)
Vue.use(MContainer)

// registger myfly components
Vue.use(FlyTabRouter)
Vue.use(FlyELTable)
Vue.use(FlyForm)
Vue.use(FlyListWindow)
Vue.use(FlyRichListWindow)
Vue.use(FlyFormWindow)
Vue.use(FlySubTable)
Vue.use(FlyKeepAlive)
Vue.use(FlyMultiCacheWindow)

var whiteList = ['demo', 'login']
router.beforeEach((to, from, next) => {
  NProgress.start()
  var token = sessionStorage.getItem('token')
  if (!token && whiteList.indexOf(to.name) === -1) {
    app && app.$message.warning('未授权，请登陆授权后继续')
    NProgress.done()
    return next({ name: 'login' })
  }
  return next()
})

router.afterEach(transition => {
  setTimeout(() => {
    NProgress.done()
  })
})


window.APP_INFO = process.env.APP_INFO

Axios.defaults.baseURL = 'http://localhost:9080'
// status < 500 不会抛错误
Axios.defaults.validateStatus = status => {
  return status < 500
}
// 设置请求token
Axios.interceptors.request.use(config => {
  var token = sessionStorage.getItem('token')
  config.headers['Authorization'] = 'Bearer ' + token
  // console.log(config)
  return config
})

// 接口错误拦截
Axios.interceptors.response.use(res => {
  // console.log(res)
  if (res.status === 401) {
    app && app.$message({
      type: 'warning',
      message: '登录身份过期，请重新登录。'
    })
    sessionStorage.removeItem('token')
    sessionStorage.removeItem('user')
    router.push({ name: 'login' })
    return Promise.reject(new Error('身份过期'))
  } else {
    return res.data
  }
}, err => {
  app.$notify.error({
    title: '服务错误',
    message: '服务器响应错误 ' + err.message
  })
  return Promise.reject(err)
})


Vue.prototype.$http = Axios
Vue.http = Axios


Vue.config.productionTip = false

/* eslint-disable no-new */
var app = new Vue({
  el: '#app',
  store,
  router,
  template: '<App/>',
  components: { App }
})

window.app = app

