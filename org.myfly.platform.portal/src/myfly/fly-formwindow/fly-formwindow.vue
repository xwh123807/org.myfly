<template>
    <div class="fly-formwindow">
        <!-- <h2>fly-formwindow: {{windowName}}</h2> -->
        <el-row>
            <el-button-group>
                <el-button icon="fa fa-undo" @click="undoHandler"></el-button>
                <el-button type="primary" icon="fa fa-save" :disabled="saveDisabled" @click="saveHandler"></el-button>
                <el-button icon="fa fa-paperclip"></el-button>
                <el-button icon="fa fa-close" @click="backHandler()"></el-button>
            </el-button-group>
        </el-row>
        <fly-form ref="flyForm" :tabModel="tabModel" :data="data"></fly-form>
        <el-row v-for="subTabName in tabModel.subTabs" v-bind:key="subTabName">
          <fly-subtable :windowName="windowName" :tabName="subTabName" :parentKeyColumn="tabModel.keyColumn" 
            :parentUid="keyValue" :needLoaded="loaded">
          </fly-subtable>
        </el-row>
    </div>
</template>

<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-formwindow",
  props: {
    /**
     * 窗口名称
     */
    windowName: { type: String },
    /**
     * 记录UID，对应主键记录值
     */
    uid: { type: String }
  },
  data() {
    return {
      /**
       * 显示模型
       */
      viewModel: {},
      /**
       * 主Tab模型定义
       */
      tabModel: {},
      /**
       * 数据
       */
      data: {},
      /**
       * 数据是否已经加载
       */
      loaded: false,
      /**
       * 保存按钮状态
       */
      saveDisabled: false
    };
  },
  created() {
    this.prepareViewModel(this.windowName, true);
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    keyValue() {
      return this.data[this.tabModel.keyColumn];
    }
  },
  watch: {
    windowName(to) {
      to && this.prepareViewModel(to, false);
    },
    uid(to) {
      to && this.searchHandler(this.tabModel.tableApiName, to);
    }
  },
  methods: {
    ...mapActions(["getViewModel", "setTabTitle"]),
    /**
     * 准备窗口显示模型
     */
    prepareViewModel(windowName, isSearch) {
      var self = this;
      self.loaded = false;
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          self.viewModel = self.viewModels[windowName];
          self.tabModel = self.viewModel.tabs[self.viewModel.mainTabName];
          if (isSearch && self.uid) {
            self.searchHandler(self.tabModel.tableApiName, self.uid);
          }
        }
      });
    },
    /**
     * 查询数据
     * @param tableApiName  实体名
     * @param uid   主键
     */
    searchHandler(tableApiName, uid) {
      if (tableApiName && uid) {
        var self = this;
        this.$http.get("/flydata3/" + tableApiName + "/" + uid).then(data => {
          self.data = data;
          self.loaded = true;
          self.setTabTitle({
            path: self.$route.path,
            name: self.tabModel.name + ":" + self.data[self.tabModel.displayColumn]
          });
        });
      } else {
        this.$message.error(
          "组件[fly-formwindow]tableApiName或uid参数不能为空."
        );
      }
    },
    /**
     * 撤销操作
     */
    undoHandler() {
      this.$refs.flyForm.resetFields();
    },
    /**
     * 保存操作
     */
    saveHandler() {},
    /**
     * 关闭或返回操作
     */
    backHandler() {
      app._router.push({ name: "home" });
    }
  }
};
</script>
<style type="text/css">
.fly-formwindow .el-button {
  padding: 10px;
}
</style>