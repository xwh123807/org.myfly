<template>
    <div>
        <fly-listwindow :windowName="windowName"></fly-listwindow>
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
