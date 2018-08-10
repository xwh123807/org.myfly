<template>
    <div>
      <el-date-picker v-if="column.dataType === 'Date'" type="date" v-model="data[column.model]" style="width:100%"></el-date-picker>
      <el-date-picker v-else-if="column.dataType === 'DateTime'" type="datetime" v-model="data[column.model]" style="width:100%"></el-date-picker>
      <el-select v-else-if="column.dataType === 'List'" v-model="data[column.model]" 
          style="width:100%" default-first-option clearable>
          <el-option v-for="item in column.refListItems" v-bind:key="item[column.relationKeyColumn]" 
              :value="item[column.relationKeyColumn]" :label="item[column.relationDisplayColumn]"></el-option>
      </el-select>
      <el-switch v-else-if="column.dataType === 'YesNo'" v-model="data[column.model]" :active-text="column.name"></el-switch>
      <el-input v-else-if="column.dataType === 'Text'" v-model="data[column.model]" type="textarea"></el-input>
      <el-button v-else-if="column.dataType === 'Button'" type="primary" style="width:100%">{{column.name}}</el-button>
      <el-input v-else-if="column.dataType === 'ID'" v-model="data[column.model]" disabled style="width:100%"></el-input>
      <el-input v-else-if="column.dataType === 'Table'" v-model="data[column.model + '__label']" prefix-icon="el-icon-search"></el-input>
      <el-input v-else-if="column.dataType === 'TableDirect'" v-model="data[column.model + '__label']" prefix-icon="el-icon-search"></el-input>
      <el-input v-else v-model="data[column.model]"></el-input>
    </div>
</template>
<script>
export default {
  name: "fly-input",
  props: {
    column: {
      type: Object,
      default: {}
    },
    data: {
      type: Object,
      default: {}
    }
  },
  data() {
    return {};
  }
};
</script>
