<template>
    <div>
        <el-row>
            <h1>Form</h1>
        </el-row>
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
        </el-row>
    </div>
</template>
<script>
export default {
  data() {
    return {
        columns: [],
        selectRow: {}
    };
  }
};
</script>
