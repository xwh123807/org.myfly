<template>
    <el-row>
        <h1>动态表格: {{windowName}}</h1>
        <el-table :data="tableData" @row-click="rowClickHandler" height="500">
            <el-table-column v-for="column in columns" :prop="column.model" :label="column.name" v-bind:key="column.fieldID"></el-table-column>
        </el-table>
    </el-row>
</template>
<script>
export default {
  data() {
    return {
      viewModel: {},
      columns: [],
      tableData: [],
      mainTab: {}
    };
  },
  created() {
    this.searchHandler(this.$route.params.windowName);
  },
  beforeRouteUpdate(to, from, next) {
    this.searchHandler(to.params.windowName);
    next();
  },
  computed: {
    windowName() {
      return this.viewModel ? this.viewModel.name : "";
    }
  },
  methods: {
    rowClickHandler(row, event, column) {},
    searchHandler(windowName) {
      //读取显示模型配置数据
      this.$http.get("/mvm/" + windowName).then(data => {
        this.viewModel = data;
        this.mainTab = data.tabs[data.mainTabName];
        this.columns = this.mainTab.fieldList;
        var tableApiName = this.mainTab.tableApiName;
        //读取表数据
        this.$http.get("/flydata3/" + tableApiName).then(data => {
          this.tableData = data;
        });
      });
    }
  }
};
</script>

