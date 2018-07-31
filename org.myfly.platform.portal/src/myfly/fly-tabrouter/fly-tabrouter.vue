<template>
    <el-row class="fly-tabrouter">
      <el-tabs v-model="currentRoute" type="border-card" closable 
        @tab-click="tabClickHandler" @tab-remove="tabRemoveHandler" v-if="routes.length">
        <el-tab-pane v-for="item in routes" :label="item.name" :name="item.route" :key="item.route">
        </el-tab-pane>
      </el-tabs>
      <div>
        <keep-alive>
          <router-view></router-view>
        </keep-alive>
      </div>
    </el-row>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  name: "fly-tabrouter",
  computed: {
    ...mapState({
      routes: ({ flyRouter }) => flyRouter.routes,
      activeIndex: ({ flyRouter }) => flyRouter.activeIndex
    }),
    currentRoute: {
      get() {
        return this.activeIndex;
      },
      set(val) {
        this.setActiveRoute(val);
      }
    }
  },
  watch: {
    $route(to) {
      let flag = false;
      let path = to.path;
      for (let item of this.routes) {
        if (item.route === to.path) {
          flag = true;
          this.setActiveRoute(path);
          break;
        }
      }
      if (!flag) {
        this.addTab({ route: path, name: to.name });
        this.setActiveRoute(path);
      }
    }
  },
  methods: {
    ...mapActions(["addTab", "delTab", "setActiveRoute"]),
    tabClickHandler(tab) {
      let path = this.activeIndex;
      this.$router.push({ path: path });
    },
    tabRemoveHandler(targetName) {
      if (targetName === "/") {
        return;
      }
      this.delTab(targetName);
      if (this.activeIndex === targetName) {
        if (this.routes && this.routes.length >= 1) {
          this.setActiveRoute(this.routes[this.routes.length - 1].route);
          this.$router.push({ path: this.activeIndex });
        } else {
          this.$router.push({ path: "/" });
        }
      }
    }
  }
};
</script>
<style  type="text/css">
.fly-tabrouter .el-tabs__content {
  padding: 0px;
}
</style>
