<template>
    <div>
        <el-table :data="data" @row-click="rowClickHandler" @row-dblclick="rowDblClick" 
          height="500" border :row-key="keyColumn">
            <template v-for="column in columns">
              <el-table-column v-if="column.dataType === 'YesNo'" :label="column.name" v-bind:key="column.fieldID">
                <template slot-scope="scope">
                  <el-switch v-model="scope.row[column.model]" disabled></el-switch>
                </template>
              </el-table-column>
              <el-table-column v-else :prop="column.model" :label="column.name" 
                v-bind:key="column.fieldID" sortable></el-table-column>
            </template>
            <el-table-column fixed="right" label="操作" width="75">
              <template slot-scope="scope">
                <el-button-group>
                  <a @click="viewHandler(scope.row)"><i class="el-icon-edit"></i></a>
                  <a @click="editHandler(scope.row)"><i class="el-icon-share"></i></a>
                  <a @click="deleteHandler(scope.row)"><i class="el-icon-delete"></i></a>
                </el-button-group>
              </template>
            </el-table-column>
        </el-table>
        <el-dialog title="明细表单" :visible.sync="dialogVisible" width="100%">
          <fly-form :tabModel="tabModel" :data="data" :index="selectedRowIndex" :isSingleRow="false"></fly-form>
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
    data: { type: Array, default: () => [] },
    rowDblClick: {tpye: Function}
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
      this.selectedRowIndex = this.getIndex(
        this.data,
        row,
        this.tabModel.keyColumn
      );
      this.dialogVisible = true;
    },
    /**
     * 获取row在data中的顺序
     */
    getIndex(data, row, keyColumn) {
      for (var i = 0; i < data.length; i++) {
        var item = data[i];
        if (item[keyColumn] === row[keyColumn]) {
          return i;
        }
      }
      return 0;
    },
    viewHandler(row) {
      //this.rowDoubleClickHandler(row);
      app._router.push({
        path:
          "/dynamicFormWindow/" +
          this.$route.params.windowName +
          "/" +
          row[this.keyColumn]
      });
    },
    editHandler(row) {
      this.rowDoubleClickHandler(row);
    },
    deleteHandler(row) {
      this.rowDoubleClickHandler(row);
    }
  }
};
</script>
