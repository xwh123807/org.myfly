<template>
    <div>
        <hr/>
        <el-row>
            <el-form :model="data" size="mini" label-width="120px" style="width:100%">
                <el-col :span="column.dataType === 'Text' ? 22 : 11" v-for="column in columns" v-bind:key="column.fieldID">
                    <el-form-item :label="column.dataType === 'YesNo' ? '' : column.name" :m="column.model" >
                        <el-date-picker v-if="column.dataType === 'Date'" type="date" v-model="data[column.model]" style="width:100%"></el-date-picker>
                        <el-date-picker v-else-if="column.dataType === 'DateTime'" type="datetime" v-model="data[column.model]" style="width:100%"></el-date-picker>
                        <el-select v-else-if="column.dataType === 'List'" v-model="data[column.model]" style="width:100%"></el-select>
                        <el-switch v-else-if="column.dataType === 'YesNo'" v-model="data[column.model]" :active-text="column.name"></el-switch>
                        <el-input v-else-if="column.dataType === 'Text'" v-model="data[column.model]" type="textarea"></el-input>
                        <el-button v-else-if="column.dataType === 'Button'" type="primary" style="width:100%">{{column.name}}</el-button>
                        <el-input v-else-if="column.dataType === 'ID'" v-model="data[column.model]" disabled style="width:100%"></el-input>
                        <el-input v-else-if="column.dataType === 'Table'" v-model="data[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else-if="column.dataType === 'TableDirect'" v-model="data[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else v-model="data[column.model]"></el-input>
                    </el-form-item>
                </el-col>
            </el-form>
        </el-row>
    </div>    
</template>
<script>
export default {
  name: "fly-form",
  props: {
    /**
     * 显示模型定义
     */
    tabModel: { type: Object, default: () => {} },
    /**
     * 非单行模式时的数据
     */
    data: { type: Object, default: () => {} }
  },
  data() {
    return {};
  },
  computed: {
    /**
     * 列定义
     */
    columns() {
      return this.tabModel ? this.tabModel.fieldList : [];
    }
  },
  watch: {},
  methods: {}
};
</script>
