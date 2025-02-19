
  const __sfc__ = defineComponent({
    data() {
      return {
        zIndex: 5,
        // 自动化测试
        autoTest: false
      }
    },
    methods: {
      changeZIndex(zIndex : number) {
        this.zIndex = 20;
        (this.$refs['view'] as UniElement).style.setProperty('z-index', zIndex);
      }
    }
  })

export default __sfc__
function GenPagesCSSLayoutZIndexRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode(Fragment, null, [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex-grow":"1"}))
    }), [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"position":"absolute","z-index":"0"}))
      }), [
        createElementVNode("view", utsMapOf({ class: "common fixed default" }), [
          createElementVNode("text", null, "position: fixed"),
          createElementVNode("text", null, "z-index: 10")
        ]),
        createElementVNode("view", utsMapOf({ class: "common fixed specified" }), [
          createElementVNode("text", null, "position: fixed"),
          createElementVNode("text", null, "z-index: 5")
        ]),
        createElementVNode("view", utsMapOf({ class: "common fixed floor" }), [
          createElementVNode("text", null, "position: fixed"),
          createElementVNode("text", null, "z-index: -1")
        ])
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"top":"250px"}))
      }), [
        createElementVNode("view", utsMapOf({
          class: "common",
          style: normalizeStyle(utsMapOf({"background-color":"red","z-index":"10"}))
        }), [
          createElementVNode("text", null, "z-index: 10")
        ], 4 /* STYLE */),
        createElementVNode("view", utsMapOf({
          ref: "view",
          class: "common",
          style: normalizeStyle(utsMapOf({"background-color":"green","z-index":"5","top":"-37px","left":"87px"})),
          onClick: () => {_ctx.changeZIndex(20)}
        }), [
          createElementVNode("text", null, "z-index: " + toDisplayString(_ctx.zIndex), 1 /* TEXT */),
          createElementVNode("text", null, "点击修改z-index")
        ], 12 /* STYLE, PROPS */, ["onClick"]),
        createElementVNode("view", utsMapOf({
          class: "common",
          style: normalizeStyle(utsMapOf({"background-color":"blue","top":"-75px","left":"175px"}))
        }), [
          createElementVNode("text", null, "z-index: 0")
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", null, [
        createElementVNode("view", null, [
          createElementVNode("view", utsMapOf({
            class: "common fixed popup",
            style: normalizeStyle(utsMapOf({"background-color":"aqua","z-index":"5"}))
          }), [
            createElementVNode("text", null, "position: fixed"),
            createElementVNode("text", null, "z-index: 5")
          ], 4 /* STYLE */)
        ])
      ])
    ], 4 /* STYLE */),
    isTrue(_ctx.autoTest)
      ? createElementVNode("view", utsMapOf({ key: 0 }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"z-index":"1","position":"fixed"}))
          }), "111", 4 /* STYLE */),
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"width":"750rpx"}))
          }), "222", 4 /* STYLE */)
        ])
      : createCommentVNode("v-if", true)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesCSSLayoutZIndexStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["width", 125], ["height", 125], ["justifyContent", "center"], ["alignItems", "center"]]))], ["fixed", padStyleMapOf(utsMapOf([["position", "fixed"]]))], ["default", padStyleMapOf(utsMapOf([["backgroundColor", "#FF0000"], ["zIndex", 10], ["top", CSS_VAR_WINDOW_TOP]]))], ["specified", padStyleMapOf(utsMapOf([["backgroundColor", "#008000"], ["zIndex", 5], ["left", 87], ["top", 87]]))], ["floor", padStyleMapOf(utsMapOf([["backgroundColor", "#D2691E"], ["top", 250], ["left", 175], ["zIndex", -1]]))], ["popup", padStyleMapOf(utsMapOf([["top", 320], ["left", 87], ["height", 40]]))]])]
