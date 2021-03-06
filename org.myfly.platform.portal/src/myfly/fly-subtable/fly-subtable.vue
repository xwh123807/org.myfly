<template>
    <div class="fly-subtable">
        <el-row>
          <el-col :span="4">
            <el-button-group>
              <el-button :icon="viewMode === 'form' ? 'fa fa-table' : 'fa fa-server'" type="text" @click="switchMode">{{tabModel.name}}</el-button>
            </el-button-group>
          </el-col>
          <el-col  :span="20">
            <el-button-group>
              <el-button icon="fa fa-refresh" size="medium" @click="refreshHandler"></el-button>
              <el-button icon="fa fa-undo" size=""></el-button>
              <el-button icon="fa fa-file" size="medium"></el-button>
              <el-button icon="fa fa-copy" size="medium"></el-button>
              <el-button type="primary" icon="fa fa-save" @click="saveHandler"></el-button>
              <el-button :icon="viewMode === 'form' ? 'fa fa-table' : 'fa fa-server'" @click="switchMode" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-d-arrow-left" :disabled="firstDisabled" @click="toFirstHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-arrow-left" :disabled="priorDisabled" @click="toPriorHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-arrow-right" :disabled="nextDisabled" @click="toNextHandler" size="medium"></el-button>
              <el-button type="primary" icon="el-icon-d-arrow-right" :disabled="lastDisabled" @click="toLastHandler" size="medium"></el-button>
            </el-button-group>
          </el-col>
        </el-row>

        <el-row class="table" v-show="viewMode === 'list'">
          <fly-eltable :tabModel="tabModel" :data="tabData" @row-dblclick="rowDoubleClickHandler" 
              @row-click="rowClickHandler" :currentRowIndex="currentRowIndex">
          </fly-eltable>
        </el-row>
        <el-row class="form" v-show="viewMode === 'form'">
          <fly-form ref="flyForm" :tabModel="tabModel" :data="currentRow"></fly-form>
          <el-row v-for="subTabName in tabModel.subTabs" v-bind:key="subTabName">
            <fly-subtable :windowName="windowName" :tabModel="viewModel.tabs[subTabName]" :parentKeyColumn="keyColumn" 
              :parentUid="currentRow[keyColumn]" :needLoaded="loaded">
            </fly-subtable>
          </el-row>
        </el-row>
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
     * tab显示模型
     */
    tabModel: { type: Object },
    /**
     * tab对应父实体的主键名称
     */
    parentKeyColumn: { type: String },
    /**
     * 父实体主键值，用于过滤
     */
    parentUid: { type: String },
    /**
     * 父模型已准备好
     */
    needLoaded: { type: Boolean, default: false }
  },
  data() {
    return {
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
      lastDisabled: false,
      /**
       *
       */
      loaded: false
    };
  },
  created() {
    if (this.needLoaded){
      this.refreshHandler();
    }
  },
  destroyed() {},
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    viewModel() {
      return this.viewModels[this.windowName];
    },
    /**
     * 实体主键
     */
    keyColumn() {
      return this.tabModel ? this.tabModel.keyColumn : null;
    },
    /**
     * 当前行数据
     */
    currentRow: {
      get() {
        var data = this.tabData[this.currentRowIndex];
        return data ? data : {};
      },
      set(val) {
        this.tabData[this.currentRowIndex] = val;
      }
    }
  },
  watch: {
    needLoaded(to) {
      if (to === true) {
        this.refreshHandler();
      }
    },
    currentRowIndex(to) {
      this.refreshHandler();
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
          if (!self.tabModel) {
            self.$message.info(self.tabName);
          }
          if (isSearch && self.needLoaded) {
            self.refreshHandler();
          }
        }
      });
    },
    /**
     * 刷新数据
     */
    refreshHandler() {
      if (this.tabModel) {
        this.searchHandler(
          this.tabModel.tableApiName,
          this.parentKeyColumn,
          this.parentUid
        );
      } else {
        this.$message.error("刷新错误, tabName:" + this.tabName);
      }
    },
    /**
     * 查询子表数据
     */
    searchHandler(tableApiName, parentKeyColumn, parentUid) {
      var self = this;
      self.loaded = false;
      if (tableApiName && parentKeyColumn && parentUid) {
        var example = {};
        example[parentKeyColumn] = parentUid;
        this.$http
          .get("/flydata3/findByExample/" + tableApiName, { params: example })
          .then(data => {
            self.tabData = data;
            self.loaded = true;
          });
      } else if (tableApiName && !parentKeyColumn && !parentUid) {
        this.$http.get("/flydata3/" + tableApiName).then(data => {
          self.tabData = data;
          self.loaded = true;
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
    },
    /**
     * 保存
     */
    saveHandler() {
      var result = this.$refs.flyForm.validate();
      result.then(val => {
        if (val === true) {
          this.$http
            .put(
              "/flydata3/update/" +
                this.tabModel.tableApiName +
                "/" +
                this.currentRow[this.keyColumn],
              this.currentRow
            )
            .then(result => {
              this.currentRow = result;
              this.$message.success("保存成功.");
            });
        }
      });
    }
  }
};
</script>
<style type="text/css">
.fly-richlistwindow .el-button {
  padding: 10px;
}
</style>