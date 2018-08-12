<template>
    <el-select v-model="data[model]" 
          style="width:100%" default-first-option clearable>
          <el-option v-for="item in refItems" v-bind:key="item[relationKeyColumn]" 
              :value="item[relationKeyColumn]" :label="item[relationDisplayColumn]"></el-option>
    </el-select>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-select-table",
  props: {
    model: String,
    data: Object,
    relationTable: String,
    relationKeyColumn: String,
    relationDisplayColumn: String
  },
  data() {
    return {
      refItems: []
    };
  },
  created() {
    this.prepareDataModel(
      this.relationTable,
      this.relationKeyColumn,
      this.relationDisplayColumn
    );
  },
  computed: {
    ...mapState({
      refTables: ({ dataModel }) => dataModel.refTables
    })
  },
  methods: {
    ...mapActions(["getRefTable"]),
    prepareDataModel(relationTable, relationKeyColumn, relationDisplayColumn) {
      if (relationTable && relationKeyColumn && relationDisplayColumn) {
        this.getRefList({
          relationTable: relationTable,
          relationKeyColumn: relationKeyColumn,
          relationDisplayColumn: relationDisplayColumn,
          callback: () => {
            this.refItems = this.refTables[relationTable];
          }
        });
      }
    }
  }
};
</script>
