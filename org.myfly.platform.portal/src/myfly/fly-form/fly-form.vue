<template>
    <div>
        <hr/>
        <el-row>
            <el-form ref="flyForm" :model="data" size="mini" label-width="10px" style="width:100%">
                <el-col :span="column.dataType === 'Text' ? 22 : 11" v-for="column in columns" v-bind:key="column.fieldID">
                    <el-form-item :prop="column.model">
                        <el-row>
                            <el-col :span="column.dataType === 'Text' ? 3 : 6" style="text-align:right">
                                <span v-if="column.dataType === 'Table' || column.dataType === 'TableDirect' || column.dataType === 'List'">
                                    <a href="#" @click="viewRelationFieldHandler(column, data)" :m="column.relationTable">{{column.name}}&nbsp;&nbsp;</a>
                                </span>
                                <span v-else>{{column.dataType === 'YesNo' ? '&nbsp;' : column.name + '&nbsp;&nbsp;'}}</span>
                            </el-col>
                            <el-col :span="column.dataType === 'Text' ? 21 : 18">
                                <!-- <el-date-picker v-if="column.dataType === 'Date'" type="date" v-model="data[column.model]" style="width:100%"></el-date-picker>
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
                                <el-input v-else v-model="data[column.model]"></el-input> -->
                                <fly-input :column="column" :data="data"></fly-input>
                            </el-col>
                        </el-row>
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
  methods: {
    /**
     * 引用字段点击显示实体
     */
    viewRelationFieldHandler(column, data) {
      var route = {
        name: "dynamic-form2",
        params: {
          dynamicType: "form",
          windowName: column.relationTable,
          keyField: column.relationKeyColumn,
          uid: data[column.model]
        }
      };
      if (route.params.uid) {
        this.$router.push(route);
      } else {
        this.$message("没有选中值.");
      }
    },
    /**
     * 对整个表单进行重置，将所有字段值重置为初始值并移除校验结果
     */
    resetFields() {
      this.$refs.flyForm.resetFields();
    },
    /**
     * 对整个表单进行校验的方法,返回一个 promise
     */
    validate(){
      return this.$refs.flyForm.validate();
    }
  }
};
</script>
