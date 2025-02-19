
  const defaultStyle = 'border:2px solid black;background :#57BE6A;'
  const __sfc__ = defineComponent({

    data() {
      return {
        currentIndex: 1,
        style: '' as string,
      }
    },
    computed: {
      isSelect() : boolean {
        return this.style == defaultStyle
      }
    },
    methods: {
      changeIndex(index : number) {
        this.currentIndex = index
      },
      setBorderBlank() {
        this.style = this.style == '' ? defaultStyle : ''
      }
    }
  })

export default __sfc__
function GenPagesCSSBorderDynamicBorderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"margin":"15px","border-radius":"10px","background-color":"white"}))
    }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(10, (index, __key, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          key: index,
          class: normalizeClass((index < 9 ? 'bb1' : '') + ' ' + (_ctx.currentIndex == 0 ? 'btlr10 btrr10' : _ctx.currentIndex == 9 ? 'bblr10 bbrr10' : '')),
          style: normalizeStyle([utsMapOf({"flex-direction":"row","align-items":"center","padding":"15px"}), index == _ctx.currentIndex ? 'background-color :#57BE6A;' : '']),
          onClick: () => {_ctx.currentIndex = index}
        }), [
          createElementVNode("view", null, [
            createElementVNode("text", utsMapOf({
              style: normalizeStyle([utsMapOf({"font-size":"14px"}), index == _ctx.currentIndex ? 'color: #FFFFFF;' : ''])
            }), toDisplayString(index), 5 /* TEXT, STYLE */)
          ])
        ], 14 /* CLASS, STYLE, PROPS */, ["onClick"])
      }), 64 /* STABLE_FRAGMENT */)
    ], 4 /* STYLE */),
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"margin":"15px","margin-top":"20px"}))
    }), [
      createElementVNode("text", null, "动态切换 border 为空值"),
      createElementVNode("text", utsMapOf({
        onClick: _ctx.setBorderBlank,
        class: "common",
        style: normalizeStyle(_ctx.style)
      }), toDisplayString(_ctx.isSelect?'选中':'未选中'), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSBorderDynamicBorderStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["borderRadius", 4], ["width", 120], ["textAlign", "center"], ["marginTop", 10]]))], ["bb1", padStyleMapOf(utsMapOf([["borderBottomWidth", "1rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#EEEEEE"]]))], ["btlr10", padStyleMapOf(utsMapOf([["borderTopLeftRadius", "10rpx"]]))], ["btrr10", padStyleMapOf(utsMapOf([["borderTopRightRadius", "10rpx"]]))], ["bblr10", padStyleMapOf(utsMapOf([["borderBottomLeftRadius", "10rpx"]]))], ["bbrr10", padStyleMapOf(utsMapOf([["borderBottomRightRadius", "10rpx"]]))]])]
