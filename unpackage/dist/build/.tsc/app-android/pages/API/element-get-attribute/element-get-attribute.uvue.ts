
  const __sfc__ = defineComponent({
    data() {
      return {
        boxTarget: null as null | UniElement,
        scrollViewTarget: null as null | UniElement,
        attrId: "",
        attrStyle:"",
        propertyValue:""
      }
    },
    onReady() {
      this.boxTarget = this.$refs['box'] as UniElement
      this.scrollViewTarget = this.$refs['scrollView'] as UniElement;
    },
    methods: {
      scrollTo() {






        this.scrollViewTarget!.scrollTo(200,0)

      },
      getAttributeId() {
        this.attrId = this.boxTarget!.getAttribute('id') ?? ""
      },
      setStyle() {
        this.boxTarget!.style.setProperty("background-color", "#FFF000")
      },
      getPropertyValue() {
        this.propertyValue = this.boxTarget!.style.getPropertyValue("background-color") as string
      },
      getAttributeStyle() {
        this.attrStyle = this.boxTarget!.getAttribute('style')?? ""
      }
    }
  })

export default __sfc__
function GenPagesAPIElementGetAttributeElementGetAttributeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", null, [
    createElementVNode("view", utsMapOf({
      id: "box",
      ref: "box",
      style: normalizeStyle(utsMapOf({"padding":"20rpx"}))
    }), [
      createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "元素的id：" + toDisplayString(_ctx.attrId), 1 /* TEXT */),
      createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "元素的背景色样式值：" + toDisplayString(_ctx.propertyValue), 1 /* TEXT */),
      createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "小程序端：getAttribute 获取元素的属性值，目前仅支持id、style"),
      createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "App端：getAttribute 不支持获取 class、style 属性")
    ], 4 /* STYLE */),
    createElementVNode("button", utsMapOf({ onClick: _ctx.getAttributeId }), "getAttribute获取元素的id", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({ onClick: _ctx.setStyle }), "setProperty设置背景色", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({ onClick: _ctx.getPropertyValue }), "getPropertyValue获取背景色值", 8 /* PROPS */, ["onClick"]),
    createElementVNode("scroll-view", utsMapOf({
      ref: "scrollView",
      class: "scroll-view_H",
      direction: "horizontal"
    }), [
      createElementVNode("view", utsMapOf({ class: "scroll-view-item_H uni-bg-red" }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "A")
      ]),
      createElementVNode("view", utsMapOf({ class: "scroll-view-item_H uni-bg-green" }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "B")
      ]),
      createElementVNode("view", utsMapOf({ class: "scroll-view-item_H uni-bg-blue" }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "C")
      ])
    ], 512 /* NEED_PATCH */),
    createElementVNode("button", utsMapOf({ onClick: _ctx.scrollTo }), "scrollTo设置left滚动200px", 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesAPIElementGetAttributeElementGetAttributeStyles = [utsMapOf([["scroll-view_H", padStyleMapOf(utsMapOf([["width", "100%"], ["flexDirection", "row"], ["marginTop", "30rpx"]]))], ["scroll-view-item_H", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 150], ["justifyContent", "center"], ["alignItems", "center"]]))], ["text", padStyleMapOf(utsMapOf([["fontSize", 18], ["color", "#ffffff"]]))]])]
