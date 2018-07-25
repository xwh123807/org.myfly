<template>
    <div>
        <h2>fly-formwindow: {{windowName}}</h2>
        <el-row>
            <el-button-group>
                <el-button icon="fa fa-undo" @click="undoHandler">撤销</el-button>
                <el-button type="primary" icon="fa fa-save" :disabled="saveDisabled" @click="saveHandler">保存</el-button>
                <el-button icon="fa fa-paperclip">附件</el-button>
                <el-button icon="fa fa-close" @click="backHandler()">关闭</el-button>
            </el-button-group>
        </el-row>
        <fly-form :tabModel="mainTab" :data="data"></fly-form>
        <el-row v-for="subTabName in mainTab.subTabs" v-bind:key="subTabName">
          <fly-subtable :windowName="windowName" :tabName="subTabName" :parentKeyColumn="mainTab.keyColumn" 
            :parentUid="keyValue">
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
      mainTab: {},
      /**
       * 数据
       */
      data: {},
      /**
       * 保存按钮状态
       */
      saveDisabled: false
    };
  },
  created() {
    this.prepareViewModel(this.windowName, true);
  },
  beforeRouteUpdate(to, from, next) {
    console.info("fly-formwindow: " + to.params);
    next();
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    keyValue() {
      return this.data[this.mainTab.keyColumn];
    }
  },
  watch: {
    /**
     * 监听窗口名称改变，重新构建窗口
     */
    windowName() {
      this.data = {};
      this.prepareViewModel(this.windowName, false);
    },
    /**
     * 监听主键变化，重新取数
     */
    uid() {
      this.searchHandler(this.mainTab.tableApiName, this.uid);
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
          self.viewModel = self.viewModels[windowName];
          self.mainTab = self.viewModel.tabs[self.viewModel.mainTabName];
          isSearch & self.searchHandler(self.mainTab.tableApiName, self.uid);
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
        });
      } else {
        this.$message.error("tableApiName或uid参数不能为空.");
      }
    },
    /**
     * 撤销操作
     */
    undoHandler() {},
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
