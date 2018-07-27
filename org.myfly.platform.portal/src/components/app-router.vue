<template>
    <el-tabs>
        <el-tab-pane v-for="route in routers" v-bind:key="route.name">
            <router-view name="route.name"></router-view>
        </el-tab-pane>
    </el-tabs>
</template>
<script>
import { mapState, mapActions } from "vuex";
export default {
  computed: {
    ...mapState({
      routers: ({ router }) => router.routers
    })
  }
};
</script>
