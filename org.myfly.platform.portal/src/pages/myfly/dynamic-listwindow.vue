<template>
    <div>
        <fly-listwindow :windowName="windowName ? windowName : this.$route.params.windowName"></fly-listwindow>
    </div>
</template>
<script>
export default {
  props:{
    windowName: String
  },
  computed: {
    // windowName() {
    //   return this.$route.params.windowName;
    // }
  }
};
</script>
