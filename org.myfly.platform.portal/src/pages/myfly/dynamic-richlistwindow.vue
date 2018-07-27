<template>
    <div>
        <fly-richlistwindow :windowName="windowName"></fly-richlistwindow>
    </div>
</template>
<script>
export default {
  computed: {
    windowName() {
      return this.$route.params.windowName;
    }
  }
};
</script>
