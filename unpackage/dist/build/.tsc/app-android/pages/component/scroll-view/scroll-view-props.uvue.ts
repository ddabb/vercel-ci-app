
  type Item = {
    id : string,
    label : string,
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        items: [] as Item[],
        scrollX: false,
        scrollY: true,
        bounces: false,
        scrollTop: 0,
        scrollLeft: 0,
        scrollChangeTop: 0,
        scrollIntoView: "",
        enableBackToTop: false,
        scrollWithAnimation: false,
        showScrollbar: true,
        upperThreshold: 50,
        lowerThreshold: 50,
      }
    },

    onLoad() {
      for (let i = 0; i < 10; i++) {
        const item = {
          id: "item" + i,
          label: "item" + i,
        } as Item;
        this.items.push(item);
      }
    },
    methods: {
      handleChangeScrollLeft(e : UniSliderChangeEvent) {
        this.scrollLeft = e.detail.value;
      },
      handleChangeScrollTop(e : UniSliderChangeEvent) {
        this.scrollTop = e.detail.value;
      },
      changeDirectionX() {
        this.scrollX = !this.scrollX;
        if (this.scrollX) {
          this.scrollY = false
        }
        this.scrollTop = 0;
        this.scrollLeft = 0;
      },
      changeDirectionY() {
        this.scrollY = !this.scrollY;
        if (this.scrollY) {
          this.scrollX = false
        }
        this.scrollTop = 0;
        this.scrollLeft = 0;
      },
      handleScrollIntoView() {
        if (this.scrollX) {
          this.scrollIntoView = "horizontal_item3";
        } else {
          this.scrollIntoView = "item3";
        }
        //重置状态，由于响应式的原因，设置的值与当前值相同，会导致再次设置无效果。
        setTimeout(() => {
          this.scrollIntoView = "";
        }, 0);
      },
      handleUpperThresholdInput(e : InputEvent) {
        const value = e.detail.value;
        if (value == "") {
          this.upperThreshold = 50;
        } else {
          this.upperThreshold = parseInt(e.detail.value);
        }
      },
      handleLowerThresholdInput(e : InputEvent) {
        const value = e.detail.value;
        if (value == "") {
          this.lowerThreshold = 50;
        } else {
          this.lowerThreshold = parseInt(e.detail.value);
        }
      },
      //事件监听
      scrolltoupper() {
        console.log("滚动到顶部");
      },
      scrolltolower() {
        console.log("滚动到底部");
      },
      scroll(e : ScrollEvent) {
        this.scrollChangeTop = e.detail.scrollTop
        console.log("scroll-top : " + e.detail.scrollTop + " scroll-left : " + e.detail.scrollLeft);
      },
      scrollend() {
        console.log("滚动停止");
      },
      onTouchMove() {
        console.log("TouchMove");
      },
      //自动化测试专用
      checkScrollHeight() : Boolean {
        var element = this.$refs["scrollViewY"]
        if (element != null) {
          var scrollHeight = (element as UniElement).scrollHeight
          console.log("checkScrollHeight" + scrollHeight)
          if (scrollHeight > 1900) {
            return true
          }
        }
        return false
      },
      //自动化测试专用
      checkScrollWidth() : Boolean {
        var element = this.$refs["scrollViewX"]
        if (element != null) {
          var scrollWidth = (element as UniElement).scrollWidth
          console.log("checkScrollWidth---" + scrollWidth)
          if (scrollWidth > 1900) {
            return true
          }
        }
        return false
      }
    }
  })

export default __sfc__
function GenPagesComponentScrollViewScrollViewPropsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")
const _component_slider = resolveComponent("slider")

  return createElementVNode("view", utsMapOf({ class: "page-scroll-view" }), [
    createVNode(_component_page_head, utsMapOf({ title: "非下拉刷新的scroll-view属性示例" })),
    isTrue(_ctx.scrollX)
      ? createElementVNode("scroll-view", utsMapOf({
          key: 0,
          direction: "horizontal",
          "scroll-top": _ctx.scrollTop,
          "scroll-left": _ctx.scrollLeft,
          "upper-threshold": _ctx.upperThreshold,
          "lower-threshold": _ctx.lowerThreshold,
          "scroll-into-view": _ctx.scrollIntoView,
          "enable-back-to-top": _ctx.enableBackToTop,
          "scroll-with-animation": _ctx.scrollWithAnimation,
          style: normalizeStyle(utsMapOf({"flex-direction":"row"})),
          class: "uni-margin-wrap",
          "show-scrollbar": _ctx.showScrollbar,
          bounces: _ctx.bounces,
          onScrolltoupper: _ctx.scrolltoupper,
          onScrolltolower: _ctx.scrolltolower,
          onScroll: _ctx.scroll,
          onScrollend: _ctx.scrollend,
          ref: "scrollViewX",
          id: "scrollViewX"
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
            return createElementVNode("view", utsMapOf({
              class: normalizeClass(["item", index==9 ? 'h-margin-right': '']),
              id: 'horizontal_'+item.id
            }), [
              createElementVNode("text", utsMapOf({ class: "uni-text" }), toDisplayString(item.label), 1 /* TEXT */)
            ], 10 /* CLASS, PROPS */, ["id"])
          }), 256 /* UNKEYED_FRAGMENT */)
        ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["scroll-top", "scroll-left", "upper-threshold", "lower-threshold", "scroll-into-view", "enable-back-to-top", "scroll-with-animation", "show-scrollbar", "bounces", "onScrolltoupper", "onScrolltolower", "onScroll", "onScrollend"])
      : createElementVNode("scroll-view", utsMapOf({
          key: 1,
          direction: "vertical",
          "scroll-top": _ctx.scrollTop,
          "scroll-left": _ctx.scrollLeft,
          "upper-threshold": _ctx.upperThreshold,
          "lower-threshold": _ctx.lowerThreshold,
          "scroll-into-view": _ctx.scrollIntoView,
          "enable-back-to-top": _ctx.enableBackToTop,
          "scroll-with-animation": _ctx.scrollWithAnimation,
          "show-scrollbar": _ctx.showScrollbar,
          bounces: _ctx.bounces,
          onScrolltoupper: _ctx.scrolltoupper,
          onTouchmove: _ctx.onTouchMove,
          onScrolltolower: _ctx.scrolltolower,
          onScroll: _ctx.scroll,
          onScrollend: _ctx.scrollend,
          ref: "scrollViewY",
          id: "scrollViewY",
          class: "uni-margin-wrap"
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
            return createElementVNode("view", utsMapOf({
              class: normalizeClass(["item", index==9 ? 'v-margin-bottom': '']),
              id: item.id
            }), [
              createElementVNode("text", utsMapOf({ class: "uni-text" }), toDisplayString(item.label), 1 /* TEXT */)
            ], 10 /* CLASS, PROPS */, ["id"])
          }), 256 /* UNKEYED_FRAGMENT */)
        ], 40 /* PROPS, NEED_HYDRATION */, ["scroll-top", "scroll-left", "upper-threshold", "lower-threshold", "scroll-into-view", "enable-back-to-top", "scroll-with-animation", "show-scrollbar", "bounces", "onScrolltoupper", "onTouchmove", "onScrolltolower", "onScroll", "onScrollend"]),
    createElementVNode("scroll-view", utsMapOf({
      class: "uni-list",
      showScrollbar: true,
      "scroll-y": true
    }), [
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "点击状态栏回到顶部（仅iOS）"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.enableBackToTop,
          onChange: () => {_ctx.enableBackToTop=!_ctx.enableBackToTop}
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "是否显示滚动条"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.showScrollbar,
          onChange: () => {_ctx.showScrollbar=!_ctx.showScrollbar}
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "是否有反弹效果"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.bounces,
          onChange: () => {_ctx.bounces=!_ctx.bounces}
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "是否开启滚动时使用动画过渡"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.scrollWithAnimation,
          onChange: () => {_ctx.scrollWithAnimation=!_ctx.scrollWithAnimation}
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "是否横向滚动"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.scrollX,
          onChange: _ctx.changeDirectionX
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "是否竖向滚动"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.scrollY,
          onChange: _ctx.changeDirectionY
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-slider uni-list-cell-padding" }), [
        createElementVNode("text", null, "拖动设置scroll-top")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-slider uni-list-cell-padding" }), [
        createVNode(_component_slider, utsMapOf({
          max: 1000,
          min: 0,
          step: 10,
          value: _ctx.scrollTop,
          "show-value": true,
          onChange: _ctx.handleChangeScrollTop
        }), null, 8 /* PROPS */, ["value", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-slider uni-list-cell-padding" }), [
        createElementVNode("text", null, "拖动设置scroll-left")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-slider uni-list-cell-padding" }), [
        createVNode(_component_slider, utsMapOf({
          max: 1000,
          min: 0,
          step: 10,
          value: _ctx.scrollLeft,
          "show-value": true,
          onChange: _ctx.handleChangeScrollLeft
        }), null, 8 /* PROPS */, ["value", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "设置触发scrolltoupper的距离"),
        createElementVNode("input", utsMapOf({
          class: "uni-list-cell-input",
          type: "number",
          value: _ctx.upperThreshold,
          onInput: _ctx.handleUpperThresholdInput
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onInput"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("text", null, "设置触发scrolltolower的距离"),
        createElementVNode("input", utsMapOf({
          class: "uni-list-cell-input",
          type: "number",
          value: _ctx.lowerThreshold,
          onInput: _ctx.handleLowerThresholdInput
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onInput"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          class: "button",
          onClick: _ctx.handleScrollIntoView
        }), " 滚动到id为`item3`的子视图 ", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }))
    ])
  ])
}
const GenPagesComponentScrollViewScrollViewPropsStyles = [utsMapOf([["uni-margin-wrap", padStyleMapOf(utsMapOf([["height", 250], ["marginTop", 0], ["marginRight", 25], ["marginBottom", 25], ["marginLeft", 25]]))], ["item", padStyleMapOf(utsMapOf([["justifyContent", "center"], ["alignItems", "center"], ["height", 250], ["width", "100%"], ["backgroundColor", "#F0FFFF"], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#D2691E"]]))], ["uni-list", padStyleMapOf(utsMapOf([["flex", 1]]))], ["uni-text", padStyleMapOf(utsMapOf([["color", "#000000"], ["fontSize", 50]]))], ["uni-slider", padStyleMapOf(utsMapOf([["justifyContent", "center"]]))], ["uni-list-cell-input", padStyleMapOf(utsMapOf([["width", 50], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#cccccc"], ["textAlign", "center"]]))], ["button", padStyleMapOf(utsMapOf([["flex", 1]]))], ["v-margin-bottom", padStyleMapOf(utsMapOf([["marginBottom", 50]]))], ["h-margin-right", padStyleMapOf(utsMapOf([["marginRight", 50]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
