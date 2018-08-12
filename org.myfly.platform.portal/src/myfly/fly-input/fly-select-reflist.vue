<template>
    <el-select v-model="data[model]" 
          style="width:100%" default-first-option clearable>
          <el-option v-for="item in refListItems" v-bind:key="item.refListID" 
              :value="item.refListID" :label="item.name"></el-option>
    </el-select>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-select-reflist",
  props: {
    /**
     * v-model，双向绑定
     */
    model: String,
    data: {},
    /**
     * RefList引用值类型ID
     */
    element: String
  },
  data() {
    return {
      refListItems: []
    };
  },
  created() {
    this.prepareDataModel(this.element);
  },
  computed: {
    ...mapState({
      refLists: ({ dataModel }) => dataModel.refLists
    })
  },
  methods: {
    ...mapActions(["getRefList"]),
    prepareDataModel(element) {
      if (element) {
        this.getRefList({
          element: element,
          callback: () => {
            this.refListItems = this.refLists[element].items;
          }
        });
      }
    }
  }
};
</script>
