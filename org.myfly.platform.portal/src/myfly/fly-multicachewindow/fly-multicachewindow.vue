<template>
    <div class="fly-multicachewindow">
        <div v-for="route in dynamicListRoutes" :key="route.path" v-if="route.params.type === 'list'">
          <fly-listwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName"></fly-listwindow>
        </div>
        <div v-for="route in dynamicListRoutes" :key="route.path" v-if="route.params.type === 'richlist'">
          <fly-richlistwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName"></fly-richlistwindow>
        </div>
        <div v-for="route in dynamicFormRoutes" :key="route.path">
          <fly-formwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName" 
            :keyField="route.params.keyField" :uid="route.params.uid"></fly-formwindow>
        </div>
        <div v-for="route in dynamicProcessRoutes" :key="route.path">
          <fly-processwindow v-show="route.path === activeRoutePath" :processName="route.params.processName"></fly-processwindow>
        </div>
    </div>
</template>
<script>
import { mapGetters, mapState } from "vuex";
export default {
  name: "fly-multicachewindow",
  data() {
    return {};
  },
  computed: {
    ...mapState({
      activeRoutePath: ({ flyRouter }) => flyRouter.activeRoutePath
    }),
    ...mapGetters(["dynamicListRoutes", "dynamicFormRoutes", "dynamicProcessRoutes"])
  }
};
</script>
