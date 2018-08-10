<template>
    <div class="fly-processwindow">
        <el-row>
          <el-form ref="flyForm" :model="data" size="mini" label-width="200px" style="width:60%">
            <el-form-item :prop="column.model" :label="column.name" v-for="column in processModel.paras" v-bind:key="column.processParaID">
              <fly-input :column="column" :data="data"></fly-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="doHandler">执行</el-button>
              <el-button @click="undoHandler">复位</el-button>
            </el-form-item>
          </el-form>
        </el-row>
    </div>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-processwindow",
  props: {
    processName: String
  },
  data() {
    return {
      processModel: {},
      data: {}
    };
  },
  created() {
    this.prepareProcessModel(this.processName, true);
  },
  computed: {
    ...mapState({
      processModels: ({ processModel }) => processModel.processModels
    })
  },
  methods: {
    ...mapActions(["getProcessModel", "setTabTitle"]),
    prepareProcessModel(processName, isSearch) {
      var self = this;
      this.getProcessModel({
        processName: processName,
        callback: () => {
          self.processModel = self.processModels[processName];
          self.setTabTitle({
            path: self.$route.path,
            name: self.processModel.name
          });
        }
      });
    },
    undoHandler() {},
    doHandler() {}
  }
};
</script>