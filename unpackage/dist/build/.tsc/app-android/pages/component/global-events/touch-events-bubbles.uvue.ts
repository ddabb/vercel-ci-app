
  const __sfc__ = defineComponent({
    data() {
      return {
        iconRect: null as DOMRect | null,
        viewEleRect: null as DOMRect | null,
        touchstartValue: [] as string[],
        touchmoveValue: [] as string[],
        touchendValue: [] as string[],
        ret1: false,
        ret2: false
      }
    },
    onReady() {












    },
    methods: {
      clearValue() {
        this.touchstartValue = []
        this.touchmoveValue = []
        this.touchendValue = []
      },
      isPassTest1() {

        let touchStart = this.touchstartValue.join("")
        let touchMove = this.touchmoveValue.join("")
        let touchEnd = this.touchendValue.join("")
        console.log("touchStart: ", touchStart)
        console.log("touchMove: ", touchMove)
        console.log("touchEnd: ", touchEnd)

        let result = touchStart == "view1-3view1-2view1" &&
          touchMove == "view1-3view1-2view1" &&
          touchEnd == "view1-3view1-2view1"
        console.log('isPassTest1', result)
        this.ret1 = result
        this.clearValue()
      },
      isPassTest2() {

        let touchStart = this.touchstartValue.join("")
        let touchMove = this.touchmoveValue.join("")
        let touchEnd = this.touchendValue.join("")
        console.log("touchStart: ", touchStart)
        console.log("touchMove: ", touchMove)
        console.log("touchEnd: ", touchEnd)

        let result = touchStart == "view2-3view2" &&
          touchMove == "view2" &&
          touchEnd == "view2-3view2-2view2"
        console.log('isPassTest2', result)
        this.ret2 = result
        this.clearValue()
      },
      onTouchStart(e : TouchEvent) {
        let _id = e.currentTarget!.attributes.get("id") as string


        if (!this.touchstartValue.includes(_id)) {
          this.touchstartValue.push(_id)
        }

        console.log('onTouchStart', e.currentTarget!.attributes.get("id"))
      },
      onTouchMove(e : TouchEvent) {


        let _id = e.currentTarget!.attributes.get("id") as string

        if (!this.touchmoveValue.includes(_id)) {
          this.touchmoveValue.push(_id)
        }

        console.log('onTouchMove', e.currentTarget!.attributes.get("id"))
      },
      onTouchEnd(e : TouchEvent) {

        let _id = e.currentTarget!.attributes.get("id") as string

        if (!this.touchendValue.includes(_id)) {
          this.touchendValue.push(_id)
        }
      }
    }
  })

export default __sfc__
function GenPagesComponentGlobalEventsTouchEventsBubblesRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: "事件冒泡测试" })),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("view", utsMapOf({
        class: "view-box",
        id: "view1",
        onTouchstart: _ctx.onTouchStart,
        onTouchmove: _ctx.onTouchMove,
        onTouchend: _ctx.onTouchEnd
      }), [
        createElementVNode("view", utsMapOf({
          class: "mid-view",
          id: "view1-2",
          onTouchstart: _ctx.onTouchStart,
          onTouchmove: _ctx.onTouchMove,
          onTouchend: _ctx.onTouchEnd
        }), [
          createElementVNode("image", utsMapOf({
            class: "icon",
            id: "view1-3",
            src: _imports_0,
            onTouchstart: _ctx.onTouchStart,
            onTouchmove: _ctx.onTouchMove,
            onTouchend: _ctx.onTouchEnd
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend"])
        ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend"])
      ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend"]),
      createElementVNode("view", utsMapOf({
        class: "view-box",
        id: "view2",
        onTouchstart: _ctx.onTouchStart,
        onTouchmove: _ctx.onTouchMove,
        onTouchend: _ctx.onTouchEnd
      }), [
        createElementVNode("view", utsMapOf({
          class: "mid-view",
          id: "view2-2",
          onTouchend: _ctx.onTouchEnd
        }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"background-color":"beige"})),
            class: "icon",
            id: "view2-3",
            onTouchstart: _ctx.onTouchStart,
            onTouchend: _ctx.onTouchEnd
          }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchend"])
        ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchend"])
      ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentGlobalEventsTouchEventsBubblesStyles = [utsMapOf([["container", padStyleMapOf(utsMapOf([["width", "100%"], ["height", "80%"], ["flexDirection", "column"], ["alignItems", "center"], ["justifyContent", "space-between"]]))], ["view-box", padStyleMapOf(utsMapOf([["width", 200], ["height", 200], ["alignItems", "center"], ["justifyContent", "center"], ["borderStyle", "solid"]]))], ["mid-view", padStyleMapOf(utsMapOf([["width", 150], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"], ["backgroundColor", "#00FFFF"]]))], ["icon", padStyleMapOf(utsMapOf([["width", 100], ["height", 100]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _imports_0 from '../image/logo.png'
