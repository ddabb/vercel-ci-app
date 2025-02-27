
  const __sfc__ = defineComponent({
    data() {
      return {
        src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4'
      }
    },
    methods: {
      onPause(e : UniEvent) {
        console.log(JSON.stringify(e));
      }
    }
  })

export default __sfc__
function GenPagesComponentListViewListViewMultiplexVideoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("list-view", utsMapOf({ class: "list" }), [
    createElementVNode(Fragment, null, RenderHelpers.renderList(20, (_, index, __index, _cached): any => {
      return createElementVNode("list-item", utsMapOf({ class: "list-item" }), [
        createElementVNode("text", null, "第" + toDisplayString(index + 1) + "个视频", 1 /* TEXT */),
        createElementVNode("video", utsMapOf({
          class: "video",
          src: _ctx.src,
          controls: true,
          onPause: _ctx.onPause
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onPause"])
      ])
    }), 64 /* STABLE_FRAGMENT */)
  ])
}
const GenPagesComponentListViewListViewMultiplexVideoStyles = [utsMapOf([["list", padStyleMapOf(utsMapOf([["flex", 1]]))], ["list-item", padStyleMapOf(utsMapOf([["backgroundColor", "#FFFFFF"], ["marginBottom", 30]]))], ["video", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 200]]))]])]
