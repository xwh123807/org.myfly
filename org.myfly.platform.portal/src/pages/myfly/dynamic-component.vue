<template>
    <div>
      <h1>FlyTable</h1>
      <fly-eltable :tabModel="mainTab" :data="tableData"></fly-eltable>
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  data() {
    return {
      tableData: [],
      viewModel: null,
      mainTab: null,
      tableApiName: null
    };
  },
  created() {
    this.getViewModel({
      windowName: this.windowName,
      callback: () => {
        this.viewModel = this.viewModels[this.windowName];
        this.mainTab = this.viewModel.tabs[this.viewModel.mainTabName];
        this.tableApiName = this.mainTab.tableApiName;
        this.getData(this.tableApiName);
      }
    });
  },
  beforeRouteUpdate(to, from, next) {
    console.info("to: " + to + ", from: " + from);
    next(); //走到下一个钩子
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    windowName() {
      return this.$route.params.windowName.toLowerCase();
    }
  },
  watch: {
    $route(to, from) {
      console.info("to: " + to + ", from: " + from);
    }
  },
  methods: {
    ...mapActions(["getViewModel"]),
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

