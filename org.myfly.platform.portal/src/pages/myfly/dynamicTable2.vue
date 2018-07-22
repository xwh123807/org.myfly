<template>
    <el-row>
        <h1>动态表格: {{windowName}}</h1>
        <el-table :data="tableData" @row-click="rowClickHandler" @row-dblclick="rowDoubleClickHandler" height=500>
            <el-table-column v-for="column in columns" :prop="column.model" :label="column.name" v-bind:key="column.fieldID"></el-table-column>
        </el-table>
        <el-dialog title="明细表单" :visible.sync="dialogVisible" width="100%">
          <dynamic-form></dynamic-form>
        </el-dialog>
    </el-row>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  components: {
    DynamicForm: () => import("./dynamic-form")
  },
  data() {
    return {
      tableData: [],
      viewModel: null,
      mainTab: null,
      tableApiName: null,
      columns: [],
      dialogVisible: false
    };
  },
  beforeCreate() {},
  created() {
    this.prepareViewModel(this.windowName);
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    windowName() {
      return this.$route.params.windowName.toLowerCase();
    }
  },
  beforeRouteUpdate(to, from, next) {
    this.prepareViewModel(to.params.windowName);
    next(); //走到下一个钩子
  },
  methods: {
    ...mapActions(["getViewModel"]),
    rowClickHandler(row, event, column) {},
    rowDoubleClickHandler(row, event) {
      this.dialogVisible = true;
    },
    prepareViewModel(windowName) {
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          this.viewModel = this.viewModels[windowName];
          this.mainTab = this.viewModel.tabs[this.viewModel.mainTabName];
          this.tableApiName = this.mainTab.tableApiName;
          this.columns = this.mainTab.fieldList;
          this.getData(this.tableApiName);
        }
      });
    },
    getData(tableApiName) {
      if (tableApiName) {
        this.$http.get("/flydata3/" + tableApiName).then(data => {
          this.tableData = data;
        });
      } else {
        this.$message.error("tableApiName参数不能为空.");
      }
    }
  }
};
</script>

