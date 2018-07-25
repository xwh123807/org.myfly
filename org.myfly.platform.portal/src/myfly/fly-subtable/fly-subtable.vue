<template>
    <div>
        <hr/>
        <fly-eltable :tabModel="tabModel" :data="data"></fly-eltable>
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-subtable",
  props: {
    windowName: { type: String },
    tabName: { type: String },
    parentKeyColumn: { type: String },
    parentUid: { type: String }
  },
  data() {
    return {
      tabModel: {},
      data: []
    };
  },
  created() {
    this.prepareViewModel(this.windowName, true);
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    })
  },
  watch: {
    parentUid(to) {
      if (to) {
        this.searchHandler(
          this.tabModel.tableApiName,
          this.parentKeyColumn,
          to
        );
      }
    }
  },
  methods: {
    ...mapActions(["getViewModel"]),
    /**
     * 准备窗口显示模型
     */
    prepareViewModel(windowName, isSearch) {
      var self = this;
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          var viewModel = self.viewModels[windowName];
          self.tabModel = viewModel.tabs[self.tabName];
          if (isSearch) {
            this.searchHandler(
              self.tabModel.tableApiName,
              self.parentKeyColumn,
              self.parentUid
            );
          }
        }
      });
    },
    /**
     * 查询子表数据
     */
    searchHandler(tableApiName, parentKeyColumn, parentUid) {
      if (tableApiName && parentKeyColumn && parentUid) {
        var self = this;
        this.$http
          .get(
            "/flydata3/" +
              tableApiName +
              "/" +
              parentKeyColumn +
              "/" +
              parentUid
          )
          .then(data => {
            self.data = data;
          });
      }
    }
  }
};
</script>
