<template>
    <div>
        <el-table :data="data" @row-click="rowClickHandler" @row-dblclick="rowDoubleClickHandler" height="500" border >
            <el-table-column v-for="column in columns" :prop="column.model" :label="column.name" 
              v-bind:key="column.fieldID" sortable></el-table-column>
        </el-table>
        <el-dialog title="明细表单" :visible.sync="dialogVisible" width="100%">
          <fly-form :tabModel="tabModel" :data="data" :index="selectedRowIndex"></fly-form>
        </el-dialog>
    </div>
</template>
<script>
export default {
  name: "fly-eltable",
  props: {
    /**
     * 显示模型定义
     */
    tabModel: { type: Object, default: () => {} },
    /**
     * 数据
     */
    data: { type: Array, default: () => [] }
  },
  data() {
    return {
      // 明细窗口是否显示
      dialogVisible: false,
      // 表格中选中行索引
      selectedRowIndex: -1
    };
  },
  computed: {
    /**
     * 列定义
     */
    columns() {
      return this.tabModel ? this.tabModel.fieldList : [];
    },
    /**
     * 实体主键
     */
    keyColumn() {
      return this.tabModel ? this.tabModel.keyColumn : null;
    }
  },
  methods: {
    rowClickHandler() {},
    /**
     * 表格双击事件
     */
    rowDoubleClickHandler(row, event) {
      this.selectedRowIndex = this.getIndex(this.data, row, this.tabModel.keyColumn);
      this.dialogVisible = true;
    },
    /**
     * 获取row在data中的顺序
     */
    getIndex(data, row, keyColumn){
      for (var i = 0; i < data.length; i ++){
        var item = data[i];
        if (item[keyColumn] === row[keyColumn]){
          return i; 
        }
      }
      return 0;
    }
  }
};
</script>
