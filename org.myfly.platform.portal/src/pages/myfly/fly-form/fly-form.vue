<template>
    <div>
        <el-row>
            <el-button-group>
                <el-button type="primary" icon="el-icon-d-arrow-left" :disabled="firstDisabled" @click="toFirstHandler">首张</el-button>
                <el-button type="primary" icon="el-icon-arrow-left" :disabled="priorDisabled" @click="toPriorHandler">上张</el-button>
                <el-button type="primary" icon="el-icon-arrow-right" :disabled="nextDisabled" @click="toNextHandler">下张</el-button>
                <el-button type="primary" icon="el-icon-d-arrow-right" :disabled="lastDisabled" @click="toLastHandler">尾张</el-button>
            </el-button-group>
        </el-row>
        <el-row>
            <el-form :model="currentRow" size="mini" label-width="120px" style="width:100%">
                <el-col :span="column.dataType === 'Text' ? 22 : 11" v-for="column in columns" v-bind:key="column.fieldID">
                    <el-form-item :label="column.dataType === 'YesNo' ? '' : column.name" :m="column.model" >
                        <el-date-picker v-if="column.dataType === 'Date'" type="date" v-model="currentRow[column.model]" style="width:100%"></el-date-picker>
                        <el-date-picker v-else-if="column.dataType === 'DateTime'" type="datetime" v-model="currentRow[column.model]" style="width:100%"></el-date-picker>
                        <el-select v-else-if="column.dataType === 'List'" v-model="currentRow[column.model]" style="width:100%"></el-select>
                        <el-switch v-else-if="column.dataType === 'YesNo'" v-model="currentRow[column.model]" :active-text="column.name"></el-switch>
                        <el-input v-else-if="column.dataType === 'Text'" v-model="currentRow[column.model]" type="textarea"></el-input>
                        <el-button v-else-if="column.dataType === 'Button'" type="primary" style="width:100%">{{column.name}}</el-button>
                        <el-input v-else-if="column.dataType === 'ID'" v-model="currentRow[column.model]" disabled style="width:100%"></el-input>
                        <el-input v-else-if="column.dataType === 'Table'" v-model="currentRow[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else-if="column.dataType === 'TableDirect'" v-model="currentRow[column.model]" prefix-icon="el-icon-search"></el-input>
                        <el-input v-else v-model="currentRow[column.model]"></el-input>
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
     * 数据
     */
    data: { type: Array, default: () => [] },
    /**
     * 指定记录索引号，界面显示时定位到该记录
     */
    index: { type: Number, default: -1 }
  },
  data() {
    return {
      rowIndex: -1,
      firstDisabled: false,
      priorDisabled: false,
      nextDisabled: false,
      lastDisabled: false
    };
  },
  computed: {
    /**
     * 列定义
     */
    columns() {
      return this.tabModel ? this.tabModel.fieldList : [];
    },
    /**
     * 记录数
     */
    length() {
      return this.data ? this.data.length : 0;
    },
    /**
     * 当前记录
     */
    currentRow() {
      return this.data[this.rowIndex === -1 ? this.index : this.rowIndex];
    }
  },
  watch: {
    index() {
      this.setRowIndex(this.index);
    }
  },
  methods: {
    toFirstHandler() {
      this.setRowIndex(0);
    },
    toLastHandler() {
      this.setRowIndex(this.length - 1);
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
      } else if (index > this.length - 1) {
        index = this.length - 1;
      }
      this.rowIndex = index;
      this.controlButtonState(index);
    },
    /**
     * 控制按钮是否显示
     */
    controlButtonState(index) {
      var isEmpty = this.length === 0;
      this.firstDisabled = isEmpty || index === 0;
      this.lastDisabled = isEmpty || this.length - 1 === index;
      this.priorDisabled = isEmpty || index === 0;
      this.nextDisabled = isEmpty || this.length - 1 === index;
    }
  }
};
</script>
