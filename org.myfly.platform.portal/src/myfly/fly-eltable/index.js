import FlyELTable from './fly-eltable'
import FlyElTableColumn from './fly-eltablecolumn'


FlyELTable.install = function (Vue) {
  Vue.component(FlyELTable.name, FlyELTable)
  Vue.component(FlyElTableColumn.name, FlyElTableColumn)
}

export default FlyELTable
