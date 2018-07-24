<template>
    <div>
        <el-table ref="table" :data="data" @row-click="rowClickHandler" @row-dblclick="rowDoubleClickHandler" 
          height="500" border :row-key="keyColumn" :highlight-current-row="true" @scroll.native="scrollHandler">
            <template v-for="column in columns">
              <el-table-column v-if="column.dataType === 'YesNo'" :label="column.name" v-bind:key="column.fieldID">
                <template slot-scope="scope">
                  <el-switch v-model="scope.row[column.model]" disabled></el-switch>
                </template>
              </el-table-column>
              <el-table-column v-else :prop="column.refColumn === false ? column.model : column.model  + '__label'" :label="column.name" 
                v-bind:key="column.fieldID" sortable></el-table-column>
            </template>
            <!-- <el-table-column fixed="right" label="操作" width="75">
              <template slot-scope="scope">
                <el-button-group>
                  <a @click="viewHandler(scope.row)"><i class="el-icon-edit"></i></a>
                  <a @click="editHandler(scope.row)"><i class="el-icon-share"></i></a>
                  <a @click="deleteHandler(scope.row)"><i class="el-icon-delete"></i></a>
                </el-button-group>
              </template>
            </el-table-column> -->
        </el-table>
        <el-dialog title="明细表单" :visible.sync="dialogVisible" width="100%">
          <fly-form :tabModel="tabModel" :data="data" :index="currentRowIndex" :isSingleRow="false"></fly-form>
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
    /**
     * 表格当前选中行
     */
    currentRowIndex: { type: Number, default: () => 0 }
  },
  data() {
    return {
      // 明细窗口是否显示
      dialogVisible: false
    };
  },
  created() {},
  mounted() {},
  watch: {
    /**
     * 监听当前选中行，表格同步高亮显示当前行
     */
    currentRowIndex(to) {
      var row = this.data[to];
      if (row) {
        this.$refs.table.setCurrentRow(row);
        if (to == 0) {
        }
      }
    }
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
    /**
     * 表格单击事件
     */
    rowClickHandler(row, event, column) {
      this.$emit("row-click", row, event, column);
    },
    /**
     * 表格双击事件
     */
    rowDoubleClickHandler(row, event) {
      this.$emit("row-dblclick", row, event);
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
    },
    /**
     * 监听表格滚动事件，可用于加载下一批数据
     * 代码异常，报addEventListener不是有效的方法
     */
    listenScroll() {
      var table = this.$refs.table;
      table.addEventListener("scroll", e => {
        // console.log(e.target, e.target.offsetTop)
        var scrollTop =
          document.documentElement.scrollTop || document.body.scrollTop;
        var scrollHeight =
          document.documentElement.scrollHeight || document.body.scrollHeight;
        var scrollViewHeight = document.documentElement.clientHeight;
      });
    },
    scrollHandler(event) {
      console.info(event);
    }
  }
};
</script>
