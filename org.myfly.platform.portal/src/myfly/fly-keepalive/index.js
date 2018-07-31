import FlyKeepAlive from './fly-keepalive'


FlyKeepAlive.install = function (Vue) {
  Vue.component(FlyKeepAlive.name, FlyKeepAlive)
}

export default FlyKeepAlive
