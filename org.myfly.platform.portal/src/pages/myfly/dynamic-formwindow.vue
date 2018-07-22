<template>
    <div>
        <fly-formwindow :windowName="windowName" :uid="uid"></fly-formwindow>
    </div>
</template>
<script>
export default {
  computed: {
    /**
     * 窗口名称
     */
    windowName() {
      return this.$route.params.windowName;
    },
    /**
     * 主键
     */
    uid() {
      return this.$route.params.uid;
    }
  }
};
</script>

