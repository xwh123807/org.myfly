<template>
     <div class="fly-richlistwindow">
      <!-- <h2>fly-richlistwindow: {{viewModel.name}}</h2> -->
      <div>
        <el-button-group>
          <el-button icon="fa fa-refresh" size="medium"></el-button>
          <el-button icon="fa fa-search" size="medium"></el-button>
        </el-button-group>
      </div>
      <fly-subtable :windowName="windowName" :tabName="viewModel.mainTabName" :needLoaded="loaded">
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
       * 模型是否已经加载
       */
      loaded: false
    };
  },
  created() {
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
          self.setTabTitle({
            route: self.$route.path,
            name: self.viewModel.name
          });
          self.loaded = true;
        }
      });
    }
  }
};
</script>
