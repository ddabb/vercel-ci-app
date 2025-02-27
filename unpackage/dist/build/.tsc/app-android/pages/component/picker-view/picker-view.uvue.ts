
  import { state, setEventCallbackNum } from '@/store/index.uts'
  const __sfc__ = defineComponent({
    data() {
      // 20180112 HBuilderX内测开始 :)
      const _years : number[] = []
      const _year = 2018
      const _months : number[] = []
      const _month : number = 1
      const _days : number[] = []
      const _day = 12
      for (let i = 2000; i <= _year; i++) {
        _years.push(i)
      }
      for (let i = 1; i <= 12; i++) {
        _months.push(i)
      }
      for (let i = 1; i <= 31; i++) {
        _days.push(i)
      }
      return {
        title: 'picker-view',
        years: _years as number[],
        year: _year as number,
        months: _months as number[],
        month: _month as number,
        days: _days as number[],
        day: _day as number,
        value: [_year - 2000, _month - 1, _day - 1] as number[],
        result: [] as number[],
        indicatorStyle: 'height: 50px;',
        // 自动化测试
        indicatorClass: '',
        maskStyle: '',
        maskClass: '',
        maskTopStyle: '',
        maskBottomStyle: ''
      }
    },
    methods: {
      // 自动化测试
      getEventCallbackNum() : number {
        return state.eventCallbackNum
      },
      // 自动化测试
      setEventCallbackNum(num : number) {
        setEventCallbackNum(num)
      },
      bindChange(e : UniPickerViewChangeEvent) {
        // 自动化测试 触发事件元素、type 类型
        // console.log(e.target?.tagName, e.type);
        if ((e.target?.tagName ?? '').includes('PICKER-VIEW')) {
          this.setEventCallbackNum(state.eventCallbackNum + 1)
        }
        if (e.type === 'change') {
          this.setEventCallbackNum(state.eventCallbackNum + 2)
        }
        const val = e.detail.value
        this.result = val
        this.year = this.years[val[0]]
        this.month = this.months[val[1]]
        this.day = this.days[val[2]]
      },
      setValue() {
        this.value = [0, 1, 30] as number[]
      },
      setValue1() {
        this.value = [10, 10, 10] as number[]
      },
    }
  })

export default __sfc__
function GenPagesComponentPickerViewPickerViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_picker_view_column = resolveComponent("picker-view-column")
const _component_picker_view = resolveComponent("picker-view", true)

  return createElementVNode("view", null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), " 日期：" + toDisplayString(_ctx.year) + "年" + toDisplayString(_ctx.month) + "月" + toDisplayString(_ctx.day) + "日 ", 1 /* TEXT */)
    ]),
    createVNode(_component_picker_view, utsMapOf({
      class: "picker-view",
      value: _ctx.value,
      onChange: _ctx.bindChange,
      "indicator-style": _ctx.indicatorStyle,
      "indicator-class": _ctx.indicatorClass,
      "mask-style": _ctx.maskStyle,
      "mask-class": _ctx.maskClass,
      "mask-top-style": _ctx.maskTopStyle,
      "mask-bottom-style": _ctx.maskBottomStyle
    }), utsMapOf({
      default: withSlotCtx((): any[] => [
        createVNode(_component_picker_view_column, utsMapOf({ class: "picker-view-column" }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.years, (item, index, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                class: "item",
                key: index
              }), [
                createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(item) + "年", 1 /* TEXT */)
              ])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        })),
        createVNode(_component_picker_view_column, utsMapOf({ class: "picker-view-column" }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.months, (item, index, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                class: "item",
                key: index
              }), [
                createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(item) + "月", 1 /* TEXT */)
              ])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        })),
        createVNode(_component_picker_view_column, utsMapOf({ class: "picker-view-column" }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.days, (item, index, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                class: "item",
                key: index
              }), [
                createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(item) + "日", 1 /* TEXT */)
              ])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }))
      ]),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["value", "onChange", "indicator-style", "indicator-class", "mask-style", "mask-class", "mask-top-style", "mask-bottom-style"])
  ])
}
const GenPagesComponentPickerViewPickerViewStyles = [utsMapOf([["picker-view", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 320], ["marginTop", 10]]))], ["item", padStyleMapOf(utsMapOf([["height", 50]]))], ["text", padStyleMapOf(utsMapOf([["lineHeight", "50px"], ["textAlign", "center"]]))], ["indicator-test", padStyleMapOf(utsMapOf([["height", 50], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#0055ff"], ["backgroundImage", "none"], ["backgroundColor", "rgba(0,170,0,0.4)"]]))], ["mask-test", padStyleMapOf(utsMapOf([["backgroundImage", "linear-gradient(to bottom, #d8e5ff, rgba(216, 229, 255, 0))"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
