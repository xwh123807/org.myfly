<template>
    <div>
        <div v-for="route in dynamicListRoutes" :key="route.path" v-if="route.params.type === 'list'">
          <fly-listwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName"></fly-listwindow>
        </div>
        <div v-for="route in dynamicListRoutes" :key="route.path" v-if="route.params.type === 'richlist'">
          <fly-richlistwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName"></fly-richlistwindow>
        </div>
    </div>
</template>
<script>
import { mapGetters, mapState } from "vuex";
export default {
  name: "fly-multilistwindow",
  data() {
    return {};
  },
  computed: {
    ...mapState({
      activeRoutePath: ({ flyRouter }) => flyRouter.activeRoutePath
    }),
    ...mapGetters(["dynamicListRoutes"])
  }
  // beforeRouteEnter(to, from, next) {
  //   console.info("beforeRouteEnter: " + to.path);
  //   next(vm => {});
  // },
  // beforeRouteUpdate(to, from, next) {
  //   console.info("beforeRouteUpdate: " + to.path);
  //   next();
  // }
};
</script>
