<template>
    <div>
        <div v-for="route in dynamicFormRoutes" :key="route.path">
          <fly-formwindow v-show="route.path === activeRoutePath" :windowName="route.params.windowName" :uid="route.params.uid"></fly-formwindow>
        </div>
    </div>
</template>
<script>
import { mapGetters, mapState } from "vuex";
export default {
  name: "fly-multiformwindow",
   data() {
    return {};
  },
  computed: {
    ...mapState({
      activeRoutePath: ({ flyRouter }) => flyRouter.activeRoutePath
    }),
    ...mapGetters(["dynamicFormRoutes"])
  }
};
</script>
