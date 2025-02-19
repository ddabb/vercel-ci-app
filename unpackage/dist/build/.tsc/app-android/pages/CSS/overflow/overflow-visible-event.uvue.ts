
  const __sfc__ = defineComponent({
    data() {
      return {
        jest_result: false,
        jest_click_x: -1,
        jest_click_y: -1,
        jest_parent_top: -1.0,
        startX: 0,
        startY: 0,
        moveX: 0,
        moveY: 0,
        oldX: 0,
        oldY: 0,
        moveEl: null as UniElement | null
      }
    },
    onReady() {
      this.moveEl = uni.getElementById('parent')
    },
    methods: {
      handleClickOverflowPart() {
        console.log("click");
        this.jest_result = true;
        uni.showToast({ "title": "点击红色区域" })
      },
      handleTouchStartOverflowPart(e : UniTouchEvent) {
        this.startX = e.changedTouches[0].clientX
        this.startY = e.changedTouches[0].clientY
      },
      handleTouchMoveOverflowPart(e : UniTouchEvent) {
        console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY);
        e.preventDefault()
        e.stopPropagation()
        const difX = e.changedTouches[0].clientX
        const difY = e.changedTouches[0].clientY
        this.moveX = difX - this.startX + this.oldX
        this.moveY = difY - this.startY + this.oldY
        this.moveEl?.style?.setProperty('transform', `translate(${this.moveX}px,${this.moveY}px)`)
      },
      handleTouchEndOverflowPart(_ : UniTouchEvent) {
        this.oldX = this.moveX
        this.oldY = this.moveY
      },
      handleClick(str : string) {
        console.log(`点击了 ${str} view`);
        if (str == 'red') {
          this.jest_result = true;
        }
      },
      async jest_getRect() {
        const rect = await uni.getElementById('child')!.getBoundingClientRectAsync()!
        let ratio = 1
        if (uni.getSystemInfoSync().platform == 'android'){
          ratio = uni.getSystemInfoSync().devicePixelRatio
        }
        this.jest_click_x = rect.x * ratio + 30
        this.jest_click_y = rect.bottom * ratio - 30
      },
      jest_getParentRect() {
        const transform = uni.getElementById('parent')?.style.getPropertyValue("transform")
        if (transform != null) {
          let value = transform as string
          value = value.split(",")[1].slice(0, -3)
          let ratio = 1
          if (uni.getSystemInfoSync().platform == 'android'){
            ratio = uni.getSystemInfoSync().devicePixelRatio
          }
          this.jest_parent_top = Math.round((parseFloat(value) * ratio))
        }
      },
      async jest_getAbsoluteViewRect() {
        const rect = await uni.getElementById('absolute-view')!.getBoundingClientRectAsync()!
        const systemInfo = uni.getSystemInfoSync()
        const titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight
        let ratio = 1
        if (uni.getSystemInfoSync().platform == 'android'){
          ratio = uni.getSystemInfoSync().devicePixelRatio
        }
        this.jest_click_x = rect.x * ratio + 30
        this.jest_click_y = (rect.top + titleBarHeight) * ratio + 30
      },
      async jest_scrollToDeepOverflow() {
        const scrollView = uni.getElementById('scroll-view') as UniScrollViewElement
        const rect = await uni.getElementById('deep-overflow')!.getBoundingClientRectAsync()!
        scrollView.scrollTo(0, rect.top)
        setTimeout(() => {
          const systemInfo = uni.getSystemInfoSync()
          let ratio = 1
          if (uni.getSystemInfoSync().platform == 'android'){
            ratio = uni.getSystemInfoSync().devicePixelRatio
          }
          const titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight
          uni.getElementById('deep-overflow')!.getBoundingClientRectAsync()!.then((afterRect: DOMRect) => {
            this.jest_click_x = afterRect.x * ratio + 30
            this.jest_click_y = (afterRect.top + titleBarHeight) * ratio + 30
          })
        }, 200)
      }
    }
  })

export default __sfc__
function GenPagesCSSOverflowOverflowVisibleEventRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    id: "scroll-view",
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"font-size":"15px"}))
      }), "overflow=visible 父view（绿色），子view（红色），点击超出父view区域的部分也可触发事件。", 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "backgroundview" }), [
        createElementVNode("view", utsMapOf({
          id: "parent",
          class: "box-visible-border-radius"
        }), [
          createElementVNode("view", utsMapOf({
            id: "child",
            style: normalizeStyle(utsMapOf({"width":"50px","height":"150px","background-color":"red"})),
            onClick: _ctx.handleClickOverflowPart,
            onTouchmove: _ctx.handleTouchMoveOverflowPart,
            onTouchstart: _ctx.handleTouchStartOverflowPart,
            onTouchend: _ctx.handleTouchEndOverflowPart
          }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onClick", "onTouchmove", "onTouchstart", "onTouchend"])
        ])
      ]),
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"font-size":"15px"}))
      }), "overflow=visible组件的子view （绿色）被position: absolute的view（红色）遮挡时，点击事件测试。", 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"300px","height":"300px","background-color":"white"}))
      }), [
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"overflow":"visible","height":"100px","width":"100%"}))
        }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"background-color":"green","height":"100px","width":"100%"})),
            onClick: () => {_ctx.handleClick('green')}
          }), null, 12 /* STYLE, PROPS */, ["onClick"])
        ], 4 /* STYLE */),
        createElementVNode("view", utsMapOf({
          id: "absolute-view",
          style: normalizeStyle(utsMapOf({"position":"absolute","background-color":"red","width":"100px","height":"200px","right":"0px"})),
          onClick: () => {_ctx.handleClick('red')}
        }), null, 12 /* STYLE, PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"font-size":"15px"}))
      }), "overflow=visible组件设置hover-class的测试", 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "backgroundview" }), [
        createElementVNode("view", utsMapOf({
          class: "box-visible-border-radius",
          "hover-class": "hover-class"
        }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"background-color":"red","height":"100px","width":"100px","margin-left":"20px","margin-top":"20px"}))
          }), null, 4 /* STYLE */)
        ])
      ]),
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"font-size":"15px"}))
      }), "overflow=visible组件多层级设置测试", 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "backgroundview" }), [
        createElementVNode("view", utsMapOf({
          id: "deep-overflow",
          style: normalizeStyle(utsMapOf({"overflow":"visible"}))
        }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"overflow":"visible","background-color":"red","width":"100px","height":"100px"})),
            onClick: () => {_ctx.handleClick('red')}
          }), null, 12 /* STYLE, PROPS */, ["onClick"])
        ], 4 /* STYLE */),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"overflow":"visible"}))
        }), [
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"overflow":"visible","background-color":"green","width":"100px","height":"100px"}))
          }), null, 4 /* STYLE */)
        ], 4 /* STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSOverflowOverflowVisibleEventStyles = [utsMapOf([["backgroundview", padStyleMapOf(utsMapOf([["width", 300], ["height", 300], ["marginBottom", 20], ["backgroundColor", "#FFFFFF"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["box-visible-border-radius", padStyleMapOf(utsMapOf([["width", 100], ["height", 100], ["borderRadius", 20], ["overflow", "visible"], ["backgroundColor", "#008000"]]))], ["hover-class", padStyleMapOf(utsMapOf([["backgroundColor", "#00FFFF"]]))]])]
