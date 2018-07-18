<!--表格动态添加列-->
<template>
    <el-row>
        <el-form :model="selectRow" size="mini" label-width="120px" style="width:80%">
            <el-form-item v-for="column in columns" :label="column.desc" v-bind:key="column.name">
                <el-date-picker v-if="column.type === 'Date'" type="date" v-model="selectRow[column.name]"></el-date-picker>
                <el-date-picker v-else-if="column.type === 'DateTime'" type="datetime" v-model="selectRow[column.name]"></el-date-picker>
                <el-select v-else-if="column.type === 'List'" v-model="selectRow[column.name]"></el-select>
                <el-switch v-else-if="column.type === 'YesNo'" v-model="selectRow[column.name]"></el-switch>
                <el-input v-else v-model="selectRow[column.name]"></el-input>
            </el-form-item>
        </el-form>
        <span>{{selectRow}}</span>
        <el-table :data="tableData" @row-click="rowClickHandler">
            <el-table-column v-for="column in columns" :prop="column.name" :label="column.desc" v-bind:key="column.name"></el-table-column>
        </el-table>
    </el-row>
</template>
<script>
export default {
  data() {
    return {
      columns: [
        { name: "apiName", desc: "API Name", type: "Text" },
        { name: "name", desc: "名称", type: "Text" },
        { name: "dataType", desc: "数据类型", type: "List" },
        { name: "created", desc: "创建时间", type: "Date" },
        { name: "isActive", desc: "激活", type: "YesNo" },
        { name: "timestamp", desc: "时间", type: "DateTime" }
      ],
      tableData: [
        {
          apiName: "name",
          name: "名称",
          dataType: "String",
          created: "2018-07-17",
          isActive: true,
          timestamp: "2018-07-04T16:00:00.000Z"
        },
        {
          apiName: "ptable",
          name: "表",
          dataType: "Date",
          created: "2018-07-17",
          isActive: false,
          timestamp: "2018-06-04T16:00:00.000Z"
        }
      ],
      currentRow: 0
    };
  },
  created() {
    // this.$http.get("/flydata3/pdatatype").then(data => {
    //     console.info(data);
    // })
  },
  methods: {
    rowClickHandler(row, event, column) {
      console.info(column);
    }
  },
  computed: {
    selectRow() {
      return this.tableData[this.currentRow];
    }
  }
};
</script>
