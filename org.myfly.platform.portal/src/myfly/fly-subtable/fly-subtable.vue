<template>
    <div>
        <hr/>
        <el-row>
          <el-col :span="4">
            <el-button-group>
              <el-button :icon="viewMode === 'form' ? 'fa fa-table' : 'fa fa-server'" type="text" @click="switchMode">{{tabName}}</el-button>
            </el-button-group>
          </el-col>
          <el-col  :span="20">
            <el-button-group>
              <el-button icon="fa fa-undo" size=""></el-button>
              <el-button icon="fa fa-file" size="medium"></el-button>
              <el-button icon="fa fa-copy" size="medium"></el-button>
              <el-button :icon="viewMode === 'form' ? 'fa fa-table' : 'fa fa-server'" @click="switchMode" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-d-arrow-left" :disabled="firstDisabled" @click="toFirstHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-arrow-left" :disabled="priorDisabled" @click="toPriorHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-arrow-right" :disabled="nextDisabled" @click="toNextHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-d-arrow-right" :disabled="lastDisabled" @click="toLastHandler" size="medium"></el-button>
            </el-button-group>
          </el-col>
        </el-row>

        <el-row class="table" :style="{display: viewMode==='list' ? '' : 'none'}">
          <fly-eltable :tabModel="tabModel" :data="tabData" @row-dblclick="rowDoubleClickHandler" 
              @row-click="rowClickHandler" :currentRowIndex="currentRowIndex">
          </fly-eltable>
        </el-row>
        <el-row class="form"  :style="{display: viewMode==='form' ? '' : 'none'}">
          <fly-form :tabModel="tabModel" :data="currentRow"></fly-form>
        </el-row>
        <!-- <el-tabs v-model="viewMode">
         <el-tab-pane :label="tabName + '- 列表'" name="list">
           <fly-eltable :tabModel="tabModel" :data="tabData" @row-dblclick="rowDoubleClickHandler" 
            @row-click="rowClickHandler" :currentRowIndex="currentRowIndex">
           </fly-eltable>
         </el-tab-pane>
         <el-tab-pane :label="tabName + '- 表单'" name="form">
           <fly-form :tabModel="tabModel" :data="currentRow"></fly-form>
         </el-tab-pane>
      </el-tabs> -->
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-subtable",
  props: {
    /**
     * 窗口名称
     */
    windowName: { type: String },
    /**
     * tab名称
     */
    tabName: { type: String },
    /**
     * tab对应父实体的主键名称
     */
    parentKeyColumn: { type: String },
    /**
     * 父实体主键值，用于过滤
     */
    parentUid: { type: String },
    /**
     * 是否需要加载数据
     */
    needLoaded: { type: Boolean }
  },
  data() {
    return {
      /**
       * tab显示模型
       */
      tabModel: {},
      /**
       * tab数据
       */
      tabData: [],
      /**
       * 显示模型
       */
      viewMode: "list",
      /**
       * 当前记录索引号
       */
      currentRowIndex: 0,
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
      lastDisabled: false
    };
  },
  created() {
    this.prepareViewModel(this.windowName, false);
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
    needLoaded(to) {
      if (to) {
        this.searchHandler(
          this.tabModel.tableApiName,
          this.parentKeyColumn,
          this.parentUid
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
            self.tabData = data;
          });
      }
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
    }
  }
};
</script>
