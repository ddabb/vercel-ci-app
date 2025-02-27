
  const __sfc__ = defineComponent({
    data() {
      return {
        backgroundSelect: true,
        directionData: ['to right', 'to left', 'to bottom', 'to top', 'to bottom left', 'to bottom right', 'to top left', 'to top right'],
        testStyle: "background:linear-gradient(to right, red, yellow)"
      }
    },
    methods: {
      //供自动化测试使用
      updateBackgroundSelect() {
        this.backgroundSelect = !this.backgroundSelect
      },
      changeBg() {
        const isColor = this.testStyle == "background:blue"
        if (isColor) {
          this.setBackgroundImage()
        } else {
          this.setBackgroundColor()
        }
      },
      setBackgroundColor() {
        this.testStyle = "background:blue"
      },
      setBackgroundImage() {
        this.testStyle = "background:linear-gradient(to right, red, yellow)"
      }
    }
  })

export default __sfc__
function GenPagesCSSBackgroundBackgroundImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"0px","height":"0px","background-image":"linear-gradient(to bottom,#f5f5f5,#eff2f5)"}))
      }), null, 4 /* STYLE */),
      createElementVNode("text", null, "不支持背景图片，仅支持linear-gradient方法"),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.directionData, (direction, __key, __index, _cached): any => {
        return createElementVNode("view", null, [
          createElementVNode("text", null, "background-image: linear-gradient(" + toDisplayString(direction) + ", red, yellow)", 1 /* TEXT */),
          createElementVNode("view", utsMapOf({
            class: "common",
            style: normalizeStyle(utsMapOf({'background-image': _ctx.backgroundSelect ?'linear-gradient('+direction+', red, yellow)':''}))
          }), null, 4 /* STYLE */)
        ])
      }), 256 /* UNKEYED_FRAGMENT */),
      createElementVNode("view", null, [
        createElementVNode("text", null, "style 动态切换 background"),
        createElementVNode("view", utsMapOf({
          onClick: _ctx.changeBg,
          class: "common",
          style: normalizeStyle(_ctx.testStyle)
        }), null, 12 /* STYLE, PROPS */, ["onClick"])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSBackgroundBackgroundImageStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["width", 250], ["height", 250]]))]])]
