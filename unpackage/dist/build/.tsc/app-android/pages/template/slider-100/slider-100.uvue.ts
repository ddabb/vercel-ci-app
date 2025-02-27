
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'sliderx100通信性能测试(小程序卡为正常)',
        sliderValue: 50,
        safeAreaInsetsBottom: 0
      }
    },
    onReady() {
      this.safeAreaInsetsBottom = uni.getWindowInfo().safeAreaInsets.bottom;
    },
    methods: {
      sliderChange(e : UniSliderChangeEvent) {
        this.updateSliderValue(e.detail.value)
      },
      sliderChanging(e : UniSliderChangeEvent) {
        this.updateSliderValue(e.detail.value)
      },
      updateSliderValue(value : number) {

        // TODO 跳过vue框架，直接修改原生组件
        (this.$refs["slider"] as UniSliderElement[]).forEach((item) => {
          item.value = value
        });





      }
    },
  })

export default __sfc__
function GenPagesTemplateSlider100Slider100Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_slider = resolveComponent("slider")

  return createElementVNode(Fragment, null, [
    createElementVNode("scroll-view", utsMapOf({ class: "page" }), [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "grid-view" }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(100, (_, index, __index, _cached): any => {
          return createVNode(_component_slider, utsMapOf({
            ref_for: true,
            ref: "slider",
            class: "slider",
            key: index,
            onChanging: _ctx.sliderChanging,
            onChange: _ctx.sliderChange,
            value: _ctx.sliderValue,
            "block-size": 20,
            "show-value": true
          }), null, 8 /* PROPS */, ["onChanging", "onChange", "value"])
        }), 64 /* STABLE_FRAGMENT */)
      ])
    ]),
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({'height': _ctx.safeAreaInsetsBottom}))
    }), null, 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesTemplateSlider100Slider100Styles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1]]))], ["grid-view", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["flexWrap", "wrap"]]))], ["slider", padStyleMapOf(utsMapOf([["width", "25%"], ["marginTop", 1], ["marginLeft", 0], ["marginRight", 0], ["marginBottom", 1]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
