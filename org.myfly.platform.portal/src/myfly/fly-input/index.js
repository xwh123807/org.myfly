import FlyInput from './fly-input'
import FlySelectRefList from './fly-select-reflist'
import FlySelectTable from './fly-select-table'


FlyInput.install = function (Vue) {
  Vue.component(FlyInput.name, FlyInput),
  Vue.component(FlySelectRefList.name, FlySelectRefList),
  Vue.component(FlySelectTable.name, FlySelectTable)
}

export default FlyInput
