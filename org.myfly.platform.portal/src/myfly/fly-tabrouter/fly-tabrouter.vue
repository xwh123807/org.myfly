<template>
    <el-row class="fly-tabrouter">
      <el-tabs v-model="currentRoute" type="border-card" closable 
        @tab-click="tabClickHandler" @tab-remove="tabRemoveHandler" v-if="routes.length">
        <el-tab-pane v-for="item in routes" :label="item.name" :name="item.path" :key="item.path">
        </el-tab-pane>
      </el-tabs>
      <div>
        <keep-alive>
          <router-view v-if="$route.meta.keepAlive"></router-view>
        </keep-alive>
        <router-view v-if="!$route.meta.keepAlive"></router-view>
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
      activeRoutePath: ({ flyRouter }) => flyRouter.activeRoutePath
    }),
    currentRoute: {
      get() {
        return this.activeRoutePath;
      },
      set(val) {
        this.setActiveRoute(val);
      }
    }
  },
  created() {
    //创建时
    this.addTab({ path: this.$route.path, name: this.$route.name, params: this.$route.params });
    this.setActiveRoute(this.$route.path);
  },
  watch: {
    /**
     * 监听路由变化，如果新打开的路由已经打开，则激活tab；如果没有打开，则添加新的tab
     */
    $route(to) {
      //console.info("watch route, " + to.path);
      let flag = false;
      let path = to.path;
      for (let item of this.routes) {
        if (item.path === to.path) {
          flag = true;
          this.setActiveRoute(path);
          break;
        }
      }
      if (!flag) {
        this.addTab({ path: path, name: to.name, params: to.params });
        this.setActiveRoute(path);
      }
    }
  },
  methods: {
    ...mapActions(["addTab", "delTab", "setActiveRoute"]),
    /**
     * 点击tab，用于切换路由
     */
    tabClickHandler(tab) {
      let path = this.activeRoutePath;
      this.$router.push({ path: path });
    },
    /**
     * 删除tab
     */
    tabRemoveHandler(targetName) {
      if (targetName === "/") {
        return;
      }
      this.delTab(targetName);
      if (this.activeRoutePath === targetName) {
        if (this.routes && this.routes.length >= 1) {
          this.setActiveRoute(this.routes[this.routes.length - 1].path);
          this.$router.push({ path: this.activeRoutePath });
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
