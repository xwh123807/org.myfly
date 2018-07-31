<template>
    <div>
        <!-- <h1>Multi Cache Window</h1> -->
        <div v-for="route in routes" :key="route.path">
            <h3>{{route.params.dynamicType}}</h3>
            <template v-if="route.params.dynamicType === 'list'">
                <fly-listwindow v-show="route.path === current" :windowName="route.params.windowName"></fly-listwindow>
            </template>
            <template v-if="route.params.dynamicType === 'form'">
                <fly-formwindow v-show="route.path === current" :windowName="route.params.windowName" :uid="route.params.uid"></fly-formwindow>
            </template>
        </div>
    </div>
</template>
<script>
export default {
  name: "fly-multicachewindow",
  data() {
    return {
      /**
       * {path: route.path, name: route.name}
       */
      routes: [],
      current: null
    };
  },
  beforeRouteEnter(to, from, next) {
    //console.info("beforeRouteEnter: " + to.path);
    next(vm => {
      vm.addRoute(to);
      vm.current = to.path;
    });
  },
  beforeRouteUpdate(to, from, next) {
    //console.info("beforeRouteUpdate: " + to.path);
    this.addRoute(to);
    this.current = to.path;
    next();
  },
  beforeRouteLeave(to, from, next) {
    //console.info("beforeRouteLeave: " + to.path);
    next();
  },
  created() {
    console.info("created");
  },
  activated() {
    console.info("activated");
  },
  deactivated() {
    console.info("deactivated");
  },
  computed: {
    /**
     * 动态类型，listwindow
     */
    dynamicType() {
      return this.$route.params.dynamicType;
    }
  },
  methods: {
    addRoute(route) {
      let flag = false;
      for (let item of this.routes) {
        if (item.path === route.path) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        this.routes.push({
          path: route.path,
          name: route.name,
          params: route.params
        });
      }
    }
  }
};
</script>
