<!--表格动态添加列-->
<template>
    <el-row>
        <el-form :model="selectRow" size="mini" label-width="120px" style="width:80%">
            <el-form-item v-for="column in columns" :label="column.desc">
                <el-date-picker v-if="column.type === 'Date'" type="date" v-model="selectRow[column.name]"></el-date-picker>
                <el-select v-else-if="column.type === 'List'" v-model="selectRow[column.name]"></el-select>
                <el-input v-else v-model="selectRow[column.name]"></el-input>
            </el-form-item>
        </el-form>
        <el-table :data="tableData">
            <el-table-column v-for="column in columns" :prop="column.name" :label="column.desc"></el-table-column>
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
        { name: "dataType", desc: "数据类型", type: "List"},
        { name: "created", desc: "创建时间", type: "Date"}
      ],
      tableData: [
        { apiName: "name", name: "名称", dataType: "String", created: "2018-7-17" },
        { apiName: "ptable", name: "表", dataType: "Date", created: "2018-7-17"  }
      ],
      currentRow: 0
    };
  },
  created() {
    // this.$http.get("/flydata3/pdatatype").then(data => {
    //     console.info(data);
    // })
  },
  computed: {
    selectRow() {
        return this.tableData[this.currentRow];
    }
  }
};
</script>
