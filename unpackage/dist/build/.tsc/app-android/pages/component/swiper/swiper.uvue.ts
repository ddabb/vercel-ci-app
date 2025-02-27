
  type SwiperEventTest = {
    type : string;
    target : UniElement | null;
    currentTarget : UniElement | null;
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        background: ['color1', 'color2', 'color3'],
        dotsSelect: false,
        reboundSelect: false,
        autoplaySelect: false,
        circularSelect: false,
        indicatorColorSelect: false,
        verticalSelect: false,
        currentSelect: false,
        currentItemIdSelect: false,
        intervalSelect: 2000,
        indicatorColor: "",
        indicatorColorActive: "",
        currentVal: 0,
        currentItemIdVal: "",
        disableTouchSelect: false,
        swiperTransitionSelect: false,
        swiperAnimationfinishSelect: false,
        swiperChangeSelect: false,
        currentValChange: 0,
        // 自动化测试
        changeDetailTest: null as UniSwiperChangeEventDetail | null,
        transitionDetailTest: null as UniSwiperTransitionEventDetail | null,
        animationfinishDetailTest: null as UniSwiperAnimationFinishEventDetail | null,
        isChangeTest: '',
        isTransitionTest: '',
        isAnimationfinishTest: '',
        swipeX: 0,
        swipeY: 0
      }
    },
    onReady() {

      // 获取模拟滑动手势的起始点
      let ele = uni.getElementById("swiper-view")
      let eleRect = ele?.getBoundingClientRect()
      if(eleRect != null) {
        this.swipeX = eleRect.width - 10
        this.swipeY += eleRect.y + uni.getSystemInfoSync().safeArea.top + 44 + 35
      }

    },
    methods: {
      swipertouchStart(e: UniTouchEvent) {
        console.log("swiper touchstart")
      },
      viewtouchStart(e: UniTouchEvent) {
        console.log("view touchstart:")
      },
      swiperChange: function (e : UniSwiperChangeEvent) {
        this.changeDetailTest = e.detail
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget
        } as SwiperEventTest, 'change')
        this.currentValChange = e.detail.current
        console.log(this.currentValChange)
        if (this.swiperChangeSelect) {
          console.log("swiperChange")
          console.log(e)
        }
      },
      swiperTransition: function (e : UniSwiperTransitionEvent) {
        this.transitionDetailTest = e.detail
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget
        } as SwiperEventTest, 'transition')
        if (this.swiperTransitionSelect) {
          console.log("swiperTransition")
          console.log(e)
        }
      },
      swiperAnimationfinish: function (e : UniSwiperAnimationFinishEvent) {
        this.animationfinishDetailTest = e.detail
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget
        } as SwiperEventTest, 'animationfinish')
        if (this.swiperAnimationfinishSelect) {
          console.log("swiperAnimationfinish")
          console.log(e)
        }
      },
      // 自动化测试专用（由于事件event参数对象中存在循环引用，在ios端JSON.stringify报错，自动化测试无法page.data获取）
      checkEventTest(e : SwiperEventTest, eventName : String) {

        const isPass = e.type === eventName && e.target instanceof UniElement && e.currentTarget instanceof UniElement;




        const result = isPass ? `${eventName}:Success` : `${eventName}:Fail`;
        switch (eventName) {
          case 'change':
            this.isChangeTest = result
            break;
          case 'transition':
            this.isTransitionTest = result
            break;
          case 'animationfinish':
            this.isAnimationfinishTest = result
            break;
          default:
            break;
        }
      },
      dotsChange: function (e : UniSwitchChangeEvent) {
        this.dotsSelect = e.detail.value
      },
      swiperTransitionChange: function (e : UniSwitchChangeEvent) {
        this.swiperTransitionSelect = e.detail.value
      },
      swiperChangeChange: function (e : UniSwitchChangeEvent) {
        this.swiperChangeSelect = e.detail.value
      },
      swiperAnimationfinishChange: function (e : UniSwitchChangeEvent) {
        this.swiperAnimationfinishSelect = e.detail.value
      },
      autoplayChange: function (e : UniSwitchChangeEvent) {
        this.autoplaySelect = e.detail.value
      },
      verticalChange: function (e : UniSwitchChangeEvent) {
        this.verticalSelect = e.detail.value
      },
      disableTouchChange: function (e : UniSwitchChangeEvent) {
        this.disableTouchSelect = e.detail.value
      },
      currentItemIdChange: function (e : UniSwitchChangeEvent) {
        this.currentItemIdSelect = e.detail.value
        if (this.currentItemIdSelect) {
          this.currentItemIdVal = 'C'
        } else {
          this.currentItemIdVal = 'A'
        }
      },
      currentChange: function (e : UniSwitchChangeEvent) {
        this.currentSelect = e.detail.value
        if (this.currentSelect) {
          this.currentVal = 2
        } else {
          this.currentVal = 0
        }

      },
      circularChange: function (e : UniSwitchChangeEvent) {
        this.circularSelect = e.detail.value
        console.log(this.circularSelect)
      },
      reboundSelectChange: function (e : UniSwitchChangeEvent) {
        this.reboundSelect = e.detail.value
        console.log(this.reboundSelect)
      },
      sliderChange(e : UniSliderChangeEvent) {
        this.intervalSelect = e.detail.value
      },
      indicatorColorChange(e : UniSwitchChangeEvent) {
        this.indicatorColorSelect = e.detail.value
        if (this.indicatorColorSelect) {
          // 选择了定制指示器颜色
          this.indicatorColor = "#ff00ff"
          this.indicatorColorActive = "#0000ff"
        } else {
          // 没有选择颜色
          this.indicatorColor = ""
          this.indicatorColorActive = ""
        }
      }
    }
  })

export default __sfc__
function GenPagesComponentSwiperSwiperRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")
const _component_slider = resolveComponent("slider")
const _component_navigator = resolveComponent("navigator")

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: "swiper,可滑动视图" })),
      createElementVNode("view", utsMapOf({ class: "uni-margin-wrap" }), [
        createElementVNode("swiper", utsMapOf({
          id: "swiper-view",
          class: "swiper",
          vertical: _ctx.verticalSelect,
          "indicator-dots": _ctx.dotsSelect,
          autoplay: _ctx.autoplaySelect,
          rebound: _ctx.reboundSelect,
          interval: _ctx.intervalSelect,
          circular: _ctx.circularSelect,
          "indicator-color": _ctx.indicatorColor,
          "indicator-active-color": _ctx.indicatorColorActive,
          "disable-touch": _ctx.disableTouchSelect,
          current: _ctx.currentVal,
          "current-item-id": _ctx.currentItemIdVal,
          onChange: _ctx.swiperChange,
          onTransition: _ctx.swiperTransition,
          onAnimationfinish: _ctx.swiperAnimationfinish,
          onTouchstart: _ctx.swipertouchStart
        }), [
          createElementVNode("swiper-item", utsMapOf({ "item-id": "A" }), [
            createElementVNode("view", utsMapOf({ class: "swiper-item uni-bg-red" }), [
              createElementVNode("text", utsMapOf({
                class: "swiper-item-Text",
                onTouchstart: _ctx.viewtouchStart
              }), "A", 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart"])
            ])
          ]),
          createElementVNode("swiper-item", utsMapOf({ "item-id": "B" }), [
            createElementVNode("view", utsMapOf({ class: "swiper-item uni-bg-green" }), [
              createElementVNode("text", utsMapOf({ class: "swiper-item-Text" }), "B")
            ])
          ]),
          createElementVNode("swiper-item", utsMapOf({ "item-id": "C" }), [
            createElementVNode("view", utsMapOf({ class: "swiper-item uni-bg-blue" }), [
              createElementVNode("text", utsMapOf({ class: "swiper-item-Text" }), "C")
            ])
          ])
        ], 40 /* PROPS, NEED_HYDRATION */, ["vertical", "indicator-dots", "autoplay", "rebound", "interval", "circular", "indicator-color", "indicator-active-color", "disable-touch", "current", "current-item-id", "onChange", "onTransition", "onAnimationfinish", "onTouchstart"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示面板指示点"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.dotsSelect,
            onChange: _ctx.dotsChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否自动切换"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.autoplaySelect,
            onChange: _ctx.autoplayChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否循环"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.circularSelect,
            onChange: _ctx.circularChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示rebound效果"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.reboundSelect,
            onChange: _ctx.reboundSelectChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-title uni-list-cell-padding" }), "间隔时间(毫秒)"),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell-padding" }), [
          createVNode(_component_slider, utsMapOf({
            onChange: _ctx.sliderChange,
            value: 1000,
            min: 500,
            max: 5000,
            "show-value": true
          }), null, 8 /* PROPS */, ["onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "定制指示器颜色"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.indicatorColorSelect,
            onChange: _ctx.indicatorColorChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "纵向"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.verticalSelect,
            onChange: _ctx.verticalChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "指定current为最后一个元素"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.currentSelect,
            onChange: _ctx.currentChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "指定current-item-id为最后一个元素"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.currentItemIdSelect,
            onChange: _ctx.currentItemIdChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "禁止用户 touch 操作"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.disableTouchSelect,
            onChange: _ctx.disableTouchChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "swiperTransition 是否打印"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.swiperTransitionSelect,
            onChange: _ctx.swiperTransitionChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "swiperAnimationfinish 是否打印"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.swiperAnimationfinishSelect,
            onChange: _ctx.swiperAnimationfinishChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "swiperChange 是否打印"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.swiperChangeSelect,
            onChange: _ctx.swiperChangeChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createVNode(_component_navigator, utsMapOf({ url: "/pages/component/swiper/swiper-list-view" }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode("button", utsMapOf({ type: "primary" }), " swiper 嵌套 list-view 测试 ")
          ]),
          _: 1 /* STABLE */
        }))
      ])
    ])
  ])
}
const GenPagesComponentSwiperSwiperStyles = [utsMapOf([["swiper", padStyleMapOf(utsMapOf([["height", 150]]))], ["swiper-item", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 150]]))], ["swiper-item-Text", padStyleMapOf(utsMapOf([["width", "100%"], ["textAlign", "center"], ["lineHeight", "150px"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
