
  import refreshBox from '../../template/custom-refresher/refresh-box/refresh-box.uvue';
  const __sfc__ = defineComponent({
    components: { refreshBox },
    data() {
      return {
        scrollData: [] as Array<string>,
        scrollTop: 0,
        refresherTriggered: false,
        pullingDistance: 0,
        resetting: false
      }
    },
    computed: {
      state() : number {
        if (this.resetting) {
          return 3;
        }
        if (this.refresherTriggered) {
          return 2
        }
        if (this.pullingDistance > 45) {
          return 1
        } else {
          return 0;
        }
      }
    },
    onLoad() {
      let lists : Array<string> = []
      for (let i = 0; i < 30; i++) {
        lists.push("item---" + i)
      }
      this.scrollData = lists
    },
    methods: {
      onRefresherpulling(e : RefresherEvent) {
        this.pullingDistance = e.detail.dy;
      },
      onRefresherrefresh() {
        this.refresherTriggered = true
        setTimeout(() => {
          this.refresherTriggered = false
          this.resetting = true;
        }, 1500)
      },
      onRefreshrestore() {
        this.pullingDistance = 0
        this.resetting = false;
      },
      //自动化测试使用
      testBodyScrollBy(y : number) {
        this.scrollTop = y
      }
    }
  })

export default __sfc__
function GenPagesComponentNestedScrollBodyNestedScrollBodyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_refresh_box = resolveComponent("refresh-box")

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    type: "nested",
    direction: "vertical",
    "refresher-enabled": "true",
    "refresher-default-style": "none",
    bounces: "false",
    "refresher-triggered": _ctx.refresherTriggered,
    onRefresherpulling: _ctx.onRefresherpulling,
    onRefresherrefresh: _ctx.onRefresherrefresh,
    onRefresherrestore: _ctx.onRefreshrestore
  }), [
    createElementVNode("nested-scroll-header", null, [
      createElementVNode("swiper", utsMapOf({
        ref: "header",
        "indicator-dots": "true",
        circular: "true"
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(3, (i, __key, __index, _cached): any => {
          return createElementVNode("swiper-item", utsMapOf({ "item-id": i }), [
            createElementVNode("image", utsMapOf({
              src: "/static/shuijiao.jpg",
              style: normalizeStyle(utsMapOf({"width":"100%","height":"240px"}))
            }), null, 4 /* STYLE */)
          ], 8 /* PROPS */, ["item-id"])
        }), 64 /* STABLE_FRAGMENT */)
      ], 512 /* NEED_PATCH */)
    ]),
    createElementVNode("nested-scroll-body", null, [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex":"1"}))
      }), [
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row"}))
        }), [
          createElementVNode("text", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"12px 15px"}))
          }), "nested-scroll-body", 4 /* STYLE */)
        ], 4 /* STYLE */),
        createElementVNode("list-view", utsMapOf({
          bounces: "false",
          id: "body-list",
          "scroll-top": _ctx.scrollTop,
          style: normalizeStyle(utsMapOf({"flex":"1"})),
          "associative-container": "nested-scroll-view"
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, (key, __key, __index, _cached): any => {
            return createElementVNode("list-item", null, [
              createElementVNode("view", utsMapOf({ class: "scroll-item" }), [
                createElementVNode("text", utsMapOf({ class: "scroll-item-title" }), toDisplayString(key), 1 /* TEXT */)
              ])
            ])
          }), 256 /* UNKEYED_FRAGMENT */)
        ], 12 /* STYLE, PROPS */, ["scroll-top"])
      ], 4 /* STYLE */),
      createElementVNode("text", null, "不会渲染，因为 nested-scroll-body 只会渲染第一个子节点")
    ]),
    createVNode(_component_refresh_box, utsMapOf({
      slot: "refresher",
      state: _ctx.state
    }), null, 8 /* PROPS */, ["state"])
  ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["refresher-triggered", "onRefresherpulling", "onRefresherrefresh", "onRefresherrestore"])
}
const GenPagesComponentNestedScrollBodyNestedScrollBodyStyles = [utsMapOf([["scroll-item", padStyleMapOf(utsMapOf([["marginLeft", 6], ["marginRight", 6], ["marginTop", 6], ["backgroundColor", "#ffffff"], ["borderRadius", 4]]))], ["scroll-item-title", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 60], ["lineHeight", "60px"], ["textAlign", "center"], ["color", "#555555"]]))], ["scroll-header-tiem", padStyleMapOf(utsMapOf([["height", 200], ["backgroundColor", "#66ccff"], ["alignItems", "center"], ["justifyContent", "center"]]))]])]
