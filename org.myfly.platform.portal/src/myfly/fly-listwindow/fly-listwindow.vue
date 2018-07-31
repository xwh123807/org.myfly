<template>
    <div class="fly-listwindow">
      <!-- <h2>fly-listwindow: {{tabModel.name}}</h2> -->
      <div>
        <el-button-group>
          <el-button icon="fa fa-undo" size="medium"></el-button>
          <el-button icon="fa fa-file" size="medium"></el-button>
          <el-button icon="fa fa-copy" size="medium"></el-button>
          <el-button type="primary" icon="fa fa-save" :disabled="saveDisabled" @click="saveHandler" size="medium"></el-button>
          <el-button icon="fa fa-refresh" size="medium"></el-button>
          <el-button icon="fa fa-search" size="medium"></el-button>
          <el-button icon="fa fa-print" size="medium"></el-button>
          <el-button :icon="viewMode === 'form' ? 'fa fa-table' : 'fa fa-server'" @click="switchMode" size="medium"></el-button>
          <el-button type="primary" icon="el-icon-d-arrow-left" :disabled="firstDisabled" @click="toFirstHandler" size="medium"></el-button>
          <el-button type="primary" icon="el-icon-arrow-left" :disabled="priorDisabled" @click="toPriorHandler" size="medium"></el-button>
          <el-button type="primary" icon="el-icon-arrow-right" :disabled="nextDisabled" @click="toNextHandler" size="medium"></el-button>
          <el-button type="primary" icon="el-icon-d-arrow-right" :disabled="lastDisabled" @click="toLastHandler" size="medium"></el-button>
          <el-button icon="fa fa-paperclip" size="medium"></el-button>
          <el-button icon="fa fa-close" @click="backHandler()" size="medium"></el-button>
        </el-button-group>
      </div>
      <hr/>
      <el-tabs v-model="viewMode">
         <el-tab-pane label="列表" name="list">
           <span slot="label"><i class="fa fa-table"></i> 列表</span>
           <fly-eltable :tabModel="tabModel" :data="tabData" @row-dblclick="rowDoubleClickHandler" 
            @row-click="rowClickHandler" :currentRowIndex="currentRowIndex">
           </fly-eltable>
         </el-tab-pane>
         <el-tab-pane label="表单" name="form">
           <span slot="label"><i class="fa fa-server"></i> 表单</span>
           <fly-form :tabModel="tabModel" :data="currentRow"></fly-form>
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
      viewModel: {},
      /**
       * 主Tab模型定义
       */
      tabModel: {},
      /**
       * 主Tab数据
       */
      tabData: [],
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
    console.info(this.windowName + " created.");
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
      var data = this.tabData[this.currentRowIndex];
      return data ? data : {};
    }
  },
  watch: {
    windowName1(to, from) {
      to && this.prepareViewModel(to);
      this.viewMode = "list";
      this.currentRowIndex = 0;
    }
  },
  methods: {
    ...mapActions(["getViewModel", "setTabTitle"]),
    /**
     * 准备窗口显示模型
     */
    prepareViewModel(windowName) {
      if (!windowName){
        this.$message.error("组件[fly-listwindow]windowName参数不能为空.");
      }
      var self = this;
      this.getViewModel({
        windowName: windowName,
        callback: () => {
          self.viewModel = self.viewModels[windowName];
          self.setTabTitle({
            route: self.$route.path,
            name: self.viewModel.name
          });
          self.tabModel = self.viewModel.tabs[self.viewModel.mainTabName];
          self.searchHandler(self.tabModel.tableApiName);
        }
      });
    },
    /**
     * 查询数据
     */
    searchHandler(tableApiName) {
      if (tableApiName) {
        this.$http.get("/flydata3/" + tableApiName).then(data => {
          this.tabData = data;
        });
      } else {
        this.$message.error("组件[fly-listwindow]tableApiName参数不能为空.");
      }
    },
    /**
     * 切换单屏/表格模式
     */
    switchMode() {
      if (this.viewMode === "list") {
        this.viewMode = "form";
      } else if (this.viewMode === "form") {
        this.viewMode = "list";
      }
    },
    /**
     * 设置记录索引号，并更新按钮状态
     */
    setRowIndex(index) {
      if (index < 0) {
        index = 0;
      } else if (index > this.tabData.length - 1) {
        index = this.tabData.length - 1;
      }
      this.currentRowIndex = index;
      this.controlButtonState(index);
    },
    /**
     * 控制按钮是否显示
     */
    controlButtonState(index) {
      var isEmpty = this.length === 0;
      this.firstDisabled = isEmpty || index === 0;
      this.lastDisabled = isEmpty || this.tabData.length - 1 === index;
      this.priorDisabled = isEmpty || index === 0;
      this.nextDisabled = isEmpty || this.tabData.length - 1 === index;
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
      this.setRowIndex(this.tabData.length - 1);
    },
    /**
     * 上张
     */
    toPriorHandler() {
      this.setRowIndex(this.currentRowIndex - 1);
    },
    /**
     * 下张
     */
    toNextHandler() {
      this.setRowIndex(this.currentRowIndex + 1);
    },
    /**
     * 保存
     */
    saveHandler() {},
    /**
     * 返回按钮
     */
    backHandler() {
      app._router.push({ name: "home" });
    },
    /**
     * 表格单击事件
     */
    rowClickHandler(row, event, column) {
      this.currentRowIndex = this.getRowIndex(
        this.tabData,
        row,
        this.keyColumn
      );
    },
    /**
     * 表格双击事件
     */
    rowDoubleClickHandler(row, event) {
      this.currentRowIndex = this.getRowIndex(
        this.tabData,
        row,
        this.keyColumn
      );
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
    }
  }
};
</script>
<style type="text/css">
.fly-listwindow .el-button {
  padding: 10px;
}
</style>