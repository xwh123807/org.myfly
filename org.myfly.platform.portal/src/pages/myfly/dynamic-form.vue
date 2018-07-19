<template>
    <div>
        <el-row>
            <el-button-group>
                <el-button icon="el-icon-d-arrow-left" @click="toFirstHandler">首张</el-button>
                <el-button icon="el-icon-arrow-left" @click="toPriorHandler">上张</el-button>
                <el-button icon="el-icon-arrow-right" @click="toNextHandler">下张</el-button>
                <el-button icon="el-icon-d-arrow-right" @click="toLastHandler">尾张</el-button>
            </el-button-group>
        </el-row>
        <el-row>
            <h1>表单： {{viewModel.name}}</h1>
        </el-row>
        <el-row>
            <el-form :model="selectRow" size="mini" label-width="120px" style="width:100%">
                <el-col :span="column.dataType === 'Text' ? 22 : 11" v-for="column in columns" v-bind:key="column.fieldID">
                    <el-form-item :label="column.dataType === 'YesNo' ? '' : column.name" :m="column.model" >
                        <el-date-picker v-if="column.dataType === 'Date'" type="date" v-model="selectRow[column.model]" style="width:100%"></el-date-picker>
                        <el-date-picker v-else-if="column.dataType === 'DateTime'" type="datetime" v-model="selectRow[column.model]" style="width:100%"></el-date-picker>
                        <el-select v-else-if="column.dataType === 'List'" v-model="selectRow[column.model]" style="width:100%"></el-select>
                        <el-switch v-else-if="column.dataType === 'YesNo'" v-model="selectRow[column.model]" :active-text="column.name"></el-switch>
                        <el-input v-else-if="column.dataType === 'Text'" v-model="selectRow[column.model]" type="textarea"></el-input>
                        <el-button v-else-if="column.dataType === 'Button'" type="primary" style="width:100%">{{column.name}}</el-button>
                        <el-input v-else-if="column.dataType === 'Table'" v-model="selectRow[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else-if="column.dataType === 'TableDirect'" v-model="selectRow[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else v-model="selectRow[column.model]"></el-input>
                    </el-form-item>
                </el-col>
            </el-form>
        </el-row>
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  data() {
    return {
      columns: [],
      selectRow: {},
      viewModel: null,
      mainTab: null,
      tableData: [],
      rowIndex: -1
    };
  },
  created() {
    this.getViewModel({
      windowName: this.windowName,
      callback: () => {
        this.viewModel = this.viewModels[this.windowName];
        this.mainTab = this.viewModel.tabs[this.viewModel.mainTabName];
        this.tableApiName = this.mainTab.tableApiName;
        this.columns = this.mainTab.fieldList;
        this.getData(this.tableApiName);
      }
    });
  },
  computed: {
    ...mapState({
      viewModels: ({ viewModel }) => viewModel.viewModels
    }),
    windowName() {
      return this.$route.params.windowName.toLowerCase();
    }
  },
  methods: {
    ...mapActions(["getViewModel"]),
    getData(tableApiName) {
      this.$http.get("/flydata3/" + tableApiName).then(data => {
        this.tableData = data;
        if (this.tableData.length > 0) {
          this.toFirstHandler();
        } else {
          this.$message({
            type: "info",
            message: "没有查询到记录"
          });
        }
      });
    },
    toFirstHandler() {
      this.setRowIndex(0);
    },
    toLastHandler() {
      this.setRowIndex(this.tableData.length - 1);
    },
    toPriorHandler() {
      this.setRowIndex(this.rowIndex - 1);
    },
    toNextHandler() {
      this.setRowIndex(this.rowIndex + 1);
    },
    setRowIndex(index) {
      if (index < 0) {
        index = 0;
      } else if (index > this.tableData.length - 1) {
        index = this.tableData.length - 1;
      }
      this.rowIndex = index;
      this.selectRow = this.tableData[this.rowIndex];
    },
    getRefTableData(model) {
      var models = model.split(".");
      return this.selectRow[models[0]][models[1]];
    }
  },
  filters: {
      ref(value, model){
          if (value){
              return value.name;
          }
      }
  }
};
</script>
