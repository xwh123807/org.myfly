<template>
    <div>
        <h2>fly-multiprocesswindow</h2>
        <div v-for="route in dynamicProcessRoutes" :key="route.path">
          <fly-processwindow v-show="route.path === activeRoutePath" :processName="route.params.processName"></fly-processwindow>
        </div>
    </div>
</template>
<script>
import { mapGetters, mapState } from "vuex";
export default {
  name: "fly-multiprocesswindow",
  data() {
    return {};
  },
  computed: {
    ...mapState({
      activeRoutePath: ({ flyRouter }) => flyRouter.activeRoutePath
    }),
    ...mapGetters(["dynamicProcessRoutes"])
  }
};
</script>
