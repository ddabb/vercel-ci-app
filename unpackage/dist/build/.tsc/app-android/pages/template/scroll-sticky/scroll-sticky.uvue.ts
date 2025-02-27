
  const __sfc__ = defineComponent({
    data() {
      return {
        list: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15'],
        stickyTop: 0,
        stickyTran: 0,
        scrollTop: 0,
        stickyNode: null as UniElement | null
      }
    },
    methods: {
      onScroll(e : ScrollEvent) {
        if (e.detail.scrollTop > this.stickyTop) {
          let stickyTran = e.detail.scrollTop - this.stickyTop;
          if (stickyTran != this.stickyTran) {
            this.stickyNode?.style?.setProperty('transform', 'translateY(' + stickyTran + 'px)');
          }
          this.stickyTran = stickyTran;
        } else {
          this.stickyNode?.style?.setProperty('transform', '');
          this.stickyTran = 0;
        }
      },
      back() {
        uni.navigateBack({
          success(result) {
            console.log('navigateBack success', result.errMsg)
          },
          fail(error) {
            console.log('navigateBack fail', error.errMsg)
          },
          complete(result) {
            console.log('navigateBack complete', result.errMsg)
          },
        })
      },
      async calcStickyTop() {
        this.stickyNode = this.$refs['sticky'] as UniElement;
        // let rect = this.stickyNode?.getBoundingClientRect();
        // this.stickyTop = rect?.top;
        //this.stickyTop = this.stickyNode?.getBoundingClientRect()?.top;
        const stickyRect = await (this.$refs['sticky'] as UniElement).getBoundingClientRectAsync()!;
        const scrollRect = await (this.$refs['scroll'] as UniElement).getBoundingClientRectAsync()!;
        this.stickyTop = stickyRect.top - scrollRect.top;
        console.log(stickyRect, scrollRect);
      }
    },
    onLoad() {
    },
    onReady() {
      this.calcStickyTop()
    }
  })

export default __sfc__
function GenPagesTemplateScrollStickyScrollStickyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    ref: "scroll",
    onScroll: _ctx.onScroll,
    class: "page",
    rebound: "false"
  }), [
    createElementVNode("view", utsMapOf({ class: "content-item" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "向上滑动页面，体验元素吸顶效果。")
    ]),
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return createElementVNode("view", utsMapOf({
        key: index,
        class: "content-item"
      }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "first content-" + toDisplayString(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */),
    createElementVNode("view", utsMapOf({
      ref: "sticky",
      class: "search"
    }), [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex-direction":"row"}))
      }), [
        createElementVNode("image", utsMapOf({
          src: "/static/template/scroll-fold-nav/search.png",
          style: normalizeStyle(utsMapOf({"width":"15px"})),
          mode: "widthFix"
        }), null, 4 /* STYLE */),
        createElementVNode("text", utsMapOf({ class: "search-tip-text" }), "请输入你要搜索的内容")
      ], 4 /* STYLE */),
      createElementVNode("text", utsMapOf({ class: "search-btn" }), "搜索")
    ], 512 /* NEED_PATCH */),
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return createElementVNode("view", utsMapOf({
        key: index,
        class: "content-item"
      }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "second content-" + toDisplayString(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */),
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return createElementVNode("view", utsMapOf({
        key: index,
        class: "content-item"
      }), [
        createElementVNode("text", utsMapOf({ class: "text" }), "second content-" + toDisplayString(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */)
  ], 40 /* PROPS, NEED_HYDRATION */, ["onScroll"])
}
const GenPagesTemplateScrollStickyScrollStickyStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1], ["paddingTop", 0], ["paddingRight", 15], ["paddingBottom", 0], ["paddingLeft", 15], ["backgroundColor", "#f5f5f5"]]))], ["content-item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginTop", 5], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["backgroundColor", "#ffffff"], ["borderRadius", 5]]))], ["text", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#666666"], ["lineHeight", "20px"]]))], ["search", padStyleMapOf(utsMapOf([["backgroundColor", "#FFFFFF"], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#fbdf0d"], ["height", 35], ["borderRadius", 100], ["marginTop", 0], ["marginRight", 12], ["marginBottom", 0], ["marginLeft", 12], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8], ["flexDirection", "row"], ["alignItems", "center"], ["justifyContent", "space-between"], ["zIndex", 100]]))], ["search-tip-text", padStyleMapOf(utsMapOf([["fontSize", 12], ["color", "#666666"]]))], ["search-btn", padStyleMapOf(utsMapOf([["fontSize", 12], ["backgroundColor", "#ff6900"], ["color", "#FFFFFF"], ["paddingTop", 5], ["paddingRight", 8], ["paddingBottom", 5], ["paddingLeft", 8], ["borderRadius", 100]]))]])]
