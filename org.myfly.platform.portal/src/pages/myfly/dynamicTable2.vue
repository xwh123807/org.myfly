<template>
    <el-row>
        <h1>动态表格: {{windowName}}</h1>
        <el-table :data="tableData" @row-click="rowClickHandler">
            <el-table-column v-for="column in columns" :prop="column.model" :label="column.name" v-bind:key="column.fieldID"></el-table-column>
        </el-table>
    </el-row>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  data() {
    return {
      //viewModel: {},
      columns: [],
      tableData: [],
      mainTab: {}
    };
  },
  beforeCreate() {
    // //读取显示模型配置数据
    // this.$http.get("/mvm/" + this.$route.params.windowName).then(data => {
    //   this.viewModel = data;
    //   this.mainTab = data.tabs[data.mainTabName];
    //   this.columns = this.mainTab.fieldList;
    //   var tableApiName = this.mainTab.tableApiName;
    //   //读取表数据
    //   this.$http.get("/flydata3/" + tableApiName).then(data => {
    //     this.tableData = data;
    //   });
    // });
  },
  created() {
      this.getViewModel({windowName: this.$route.params.windowName});
  },
  deactivated() {
    this.$destroy(true);
  },
  computed: {
    ...mapState({ viewModels: ({viewModel}) => viewModel.viewModels }),
    windowName() {
      return this.viewModel ? this.viewModel.name : "";
    },
    viewModel() {
        return this.viewModels[this.windowName.toLowerCase()];
    }
  },
  methods: {
    ...mapActions(["getViewModel"]),
    rowClickHandler(row, event, column) {}
  }
};
</script>

