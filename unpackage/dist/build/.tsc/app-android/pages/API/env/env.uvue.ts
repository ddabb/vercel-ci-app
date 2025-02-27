
  const __sfc__ = defineComponent({

    data() {
      return {
        log: "",
        userPath: uni.env.USER_DATA_PATH,
        sandboxPath: uni.env.SANDBOX_PATH,
        cachePath: uni.env.CACHE_PATH,
        internalSandboxPath: uni.env.ANDROID_INTERNAL_SANDBOX_PATH,
      }
    },
    onLoad() {
    },

    methods: {
      geAbsPath(path ?: any) {

        this.log += UTSAndroid.convert2AbsFullPath(path as string) + '\n'


      }
    }
  })

export default __sfc__
function GenPagesAPIEnvEnvRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode(Fragment, null, [
    createElementVNode("text", null, "操作日志"),
    createElementVNode("button", utsMapOf({
      size: "mini",
      onClick: () => {_ctx.log=''}
    }), "清空日志", 8 /* PROPS */, ["onClick"]),
    createElementVNode("text", utsMapOf({
      style: normalizeStyle(utsMapOf({"margin":"2px","padding":"2px","border":"1px solid #000000"}))
    }), toDisplayString(_ctx.log), 5 /* TEXT, STYLE */),
    createElementVNode("scroll-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"}))
    }), [
      createElementVNode("button", utsMapOf({
        class: "btnstyle",
        type: "primary",
        onClick: () => {_ctx.geAbsPath(_ctx.sandboxPath)},
        id: "btn-path"
      }), "应用外置沙盒目录uni.env.SANDBOX_PATH", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "btnstyle",
        type: "primary",
        onClick: () => {_ctx.geAbsPath(_ctx.cachePath)},
        id: "btn-path"
      }), "缓存文件目录uni.env.CACHE_PATH", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "btnstyle",
        type: "primary",
        onClick: () => {_ctx.geAbsPath(_ctx.userPath)},
        id: "btn-path"
      }), "用户文件目录uni.env.USER_DATA_PATH", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "btnstyle",
        type: "primary",
        onClick: () => {_ctx.geAbsPath(_ctx.internalSandboxPath)},
        id: "btn-path"
      }), "应用内置沙盒目录uni.env.ANDROID_INTERNAL_SANDBOX_PATH", 8 /* PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIEnvEnvStyles = [utsMapOf([["btnstyle", padStyleMapOf(utsMapOf([["marginTop", 4], ["marginRight", 4], ["marginBottom", 4], ["marginLeft", 4]]))]])]
