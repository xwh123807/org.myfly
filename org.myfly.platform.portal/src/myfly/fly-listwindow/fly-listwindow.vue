<template>
    <div>
      <h2>fly-listwindow: {{mainTab.name}}</h2>
      <div>
        <el-button-group>
          <el-button icon="fa fa-undo">撤销</el-button>
          <el-button icon="fa fa-file">新增</el-button>
          <el-button icon="fa fa-copy">复制</el-button>
          <el-button type="primary" icon="fa fa-save" :disabled="saveDisabled" @click="saveHandler">保存</el-button>
          <el-button icon="fa fa-refresh">刷新</el-button>
          <el-button icon="fa fa-search">查找</el-button>
          <el-button icon="fa fa-print">打印</el-button>
          <el-button icon="fa fa-print" @click="switchMode">单屏/表格</el-button>
          <el-button type="primary" icon="el-icon-d-arrow-left" :disabled="firstDisabled" @click="toFirstHandler">首张</el-button>
          <el-button type="primary" icon="el-icon-arrow-left" :disabled="priorDisabled" @click="toPriorHandler">上张</el-button>
          <el-button type="primary" icon="el-icon-arrow-right" :disabled="nextDisabled" @click="toNextHandler">下张</el-button>
          <el-button type="primary" icon="el-icon-d-arrow-right" :disabled="lastDisabled" @click="toLastHandler">尾张</el-button>
          <el-button icon="fa fa-paperclip">附件</el-button>
          <el-button icon="fa fa-close" @click="backHandler()">关闭</el-button>
        </el-button-group>
      </div>
      <hr/>
      <el-tabs v-model="viewMode">
         <el-tab-pane label="列表" name="list">
           <fly-eltable :tabModel="mainTab" :data="mainTableData" :rowDblClick="rowDoubleClickHandler"></fly-eltable>
         </el-tab-pane>
         <el-tab-pane label="表单" name="form">
           <fly-form :tabModel="mainTab" :data="currentRow"></fly-form>
         </el-tab-pane>
      </el-tabs>
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-listwindow",
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
      viewModel: null,
      /**
       * 主Tab模型定义
       */
      mainTab: null,
      /**
       * 主Tab数据
       */
      mainTableData: [],
      /**
       * 显示模型，单屏form还是列表list
       */
      viewMode: "list",
      /**
       * 禁用首张按钮
       */
      firstDisabled: false,
      /**
       * 禁用上张按钮
       */
      priorDisabled: false,
      /**
       * 禁用下张按钮
       */
      nextDisabled: false,
      /**
       * 禁用尾张按钮
       */
      lastDisabled: false,
      /**
       * 禁用保存按钮
       */
      saveDisabled: false,
      /**
       * 当前记录索引号
       */
      currentRowIndex: 0
    };
  },
  created() {
    this.prepareViewModel(this.windowName);
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    /**
     * 实体主键
     */
    keyColumn() {
      return this.tabModel ? this.tabModel.keyColumn : null;
    },
    /**
     * 当前行数据
     */
    currentRow() {
      return this.mainTableData[this.currentRowIndex];
    }
  },
  watch: {
    windowName() {
      this.prepareViewModel(this.windowName);
    }
  },
  methods: {
    ...mapActions(["getViewModel"]),
    /**
     * 准备窗口显示模型
     */
    prepareViewModel(windowName) {
      var self = this;
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          self.viewModel = self.viewModels[windowName];
          self.mainTab = self.viewModel.tabs[this.viewModel.mainTabName];
          self.searchHandler(self.mainTab.tableApiName);
        }
      });
    },
    /**
     * 查询数据
     */
    searchHandler(tableApiName) {
      if (tableApiName) {
        this.$http.get("/flydata3/" + tableApiName).then(data => {
          this.mainTableData = data;
        });
      } else {
        this.$message.error("tableApiName参数不能为空.");
      }
    },
    /**
     * 切换单屏/表格模式
     */
    switchMode() {},
    /**
     * 设置记录索引号，并更新按钮状态
     */
    setRowIndex(index) {
      if (this.isSingleRow) {
        return;
      }
      if (index < 0) {
        index = 0;
      } else if (index > this.length - 1) {
        index = this.length - 1;
      }
      this.rowIndex = index;
      this.controlButtonState(index);
    },
    /**
     * 控制按钮是否显示
     */
    controlButtonState(index) {
      var isEmpty = this.length === 0;
      this.firstDisabled = isEmpty || index === 0;
      this.lastDisabled = isEmpty || this.length - 1 === index;
      this.priorDisabled = isEmpty || index === 0;
      this.nextDisabled = isEmpty || this.length - 1 === index;
    },
    /**
     * 首张
     */
    toFirstHandler() {
      this.setRowIndex(0);
    },
    /**
     * 下张
     */
    toLastHandler() {
      this.setRowIndex(this.length - 1);
    },
    /**
     * 上张
     */
    toPriorHandler() {
      this.setRowIndex(this.rowIndex - 1);
    },
    /**
     * 下张
     */
    toNextHandler() {
      this.setRowIndex(this.rowIndex + 1);
    },
    /**
     * 保存
     */
    saveHandler() {},
    /**
     * 返回按钮
     */
    backHandler() {
      app._router.push({name: "home"});
    },
    /**
     * 表格双击事件
     */
    rowDoubleClickHandler(row, event) {
      this.currentRowIndex = this.getRowIndex(this.mainTableData, row, this.keyColumn);
      this.viewMode = "form";
    },
    /**
     * 获取row在data中的顺序
     */
    getRowIndex(data, row, keyColumn) {
      for (var i = 0; i < data.length; i++) {
        var item = data[i];
        if (item[keyColumn] === row[keyColumn]) {
          return i;
        }
      }
      return 0;
    },
  }
};
</script>
