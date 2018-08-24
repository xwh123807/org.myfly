<template>
     <div class="fly-richlistwindow">
      <!-- <div>
        <el-button-group>
          <el-button icon="fa fa-refresh" size="medium" @click="refreshHandler"></el-button>
          <el-button icon="fa fa-search" size="medium"></el-button>
        </el-button-group>
      </div> -->
      <fly-subtable ref="flySubTable" :windowName="windowName" :tabModel="tabModel" :needLoaded="loaded">
      </fly-subtable>
     </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-richlistwindow",
  props: {
    /**
     * 窗口名
     */
    windowName: { type: String, default: null }
  },
  data() {
    return {
      /**
       * 显示模型
       */
      viewModel: {},
      /**
       * 主tab显示模型
       */
      tabModel: {},
      /**
       * 模型是否已经加载
       */
      loaded: false
    };
  },
  created() {
    this.loaded = false;
    this.prepareViewModel(this.windowName);
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    })
  },
  methods: {
    ...mapActions(["getViewModel", "setTabTitle"]),
    /**
     * 准备窗口显示模型
     */
    prepareViewModel(windowName) {
      var self = this;
      self.loaded = false;
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          self.viewModel = self.viewModels[windowName];
          self.tabModel = self.viewModel.tabs[self.viewModel.mainTabName];
          self.setTabTitle({
            path: self.$route.path,
            name: self.viewModel.name
          });
          self.loaded = true;
        }
      });
    },
    /**
     * 刷新，重新装载数据
     */
    refreshHandler(){
      this.$refs.flySubTable.refreshHandler();
    }
  }
};
</script>
