
  const __sfc__ = defineComponent({
    data() {
      return {
        isTranstionWidthOrHeight: false,
        widthOrHeight: null as UniElement | null,
        widthProgress: null as UniElement | null,
        progressWidth: 200,
        isTranstionChangeMargin: false,
        styleMargin: null as UniElement | null,
        isTransitionStylePadding: false,
        stylePadding: null as UniElement | null,
        isTransitionstyleBackground: false,
        isTransitionstyleBackground2: false,
        isTransitionstyleOpacity: false,
        styleBackground: null as UniElement | null,
        styleBackground2: null as UniElement | null,
        styleOpacity: null as UniElement | null,
        isTransitionStyleTransform: false,
        styleTransform: null as UniElement | null,
        isTransitionStyleTransformWithWidth: false,
        styleTransformWithWidth: null as UniElement | null,
        isTransitionstyleBorder: false,
        styleBorder: null as UniElement | null,
        isTransitionstylePosition: false,
        stylePosition: null as UniElement | null,
        isSetTransition: false,
        isTransitionpropertystyleBackground: false,
        propertyStyleBackground: null as UniElement | null,
        isTransitionStyleTransformWithOrigin: false,
        styleTransformWithOrigin: null as UniElement | null,
        styleTransformTranslate: null as UniElement | null,
        isTransformTranslate: false,
        styleTransformTranslateScale: null as UniElement | null,
        startX: 0,
        moveX: 0,
        oldX: 0,
      }
    },
    onReady() {
      this.widthOrHeight = uni.getElementById("widthOrHeight")
      this.widthProgress = uni.getElementById("widthProgress")
      this.styleMargin = uni.getElementById("styleMargin")
      this.stylePadding = uni.getElementById("stylePadding")
      this.styleBackground = uni.getElementById("styleBackground")
      this.styleBackground2 = uni.getElementById("styleBackground2")
      this.styleOpacity = uni.getElementById("styleOpacity")
      this.styleTransform = uni.getElementById("styleTransform")
      this.styleBorder = uni.getElementById("styleBorder")
      this.stylePosition = uni.getElementById("stylePosition")
      this.propertyStyleBackground = uni.getElementById("propertyStyleBackground")
      this.styleTransformWithOrigin = uni.getElementById("styleTransformWithOrigin")
      this.styleTransformWithWidth = uni.getElementById("styleTransformWithWidth")
      this.styleTransformTranslate = uni.getElementById("transformTranslate")
      this.styleTransformTranslateScale = uni.getElementById("styleTransformTranslateScale")
    },
    methods: {
      changeWidthOrHeight() {
        this.widthOrHeight?.style?.setProperty("width", this.isTranstionWidthOrHeight
          ? '200px'
          : '300px')
        this.isTranstionWidthOrHeight = !this.isTranstionWidthOrHeight
      },
      changeWidthProgress() {
        this.progressWidth += 20
        this.widthProgress?.style?.setProperty("width", this.progressWidth + 'px')
      },
      changeMargin() {
        this.styleMargin?.style?.setProperty("margin-top", this.isTranstionChangeMargin
          ? '0px'
          : '50px'
        )
        this.styleMargin?.style?.setProperty("margin-left", this.isTranstionChangeMargin
          ? '0px'
          : '50px'
        )
        this.isTranstionChangeMargin = !this.isTranstionChangeMargin
      },

      changePadding() {
        this.stylePadding?.style?.setProperty("padding-top", this.isTransitionStylePadding
          ? '0px'
          : '50px')
        this.stylePadding?.style?.setProperty("padding-left", this.isTransitionStylePadding
          ? '0px'
          : '50px')
        this.isTransitionStylePadding = !this.isTransitionStylePadding
      },
      changeBackground() {
        this.styleBackground?.style?.setProperty("background-color", this.isTransitionstyleBackground
          ? 'brown'
          : 'black'
        )
        this.styleBackground?.style?.setProperty("opacity", this.isTransitionstyleBackground
          ? '1'
          : '0.5'
        )
        this.isTransitionstyleBackground = !this.isTransitionstyleBackground
      },
      changeBackground2() {
        this.styleBackground2?.style?.setProperty("background-color", this.isTransitionstyleBackground2
          ? 'brown'
          : 'rgba(0, 0, 0, 0.5)'
        )
        this.isTransitionstyleBackground2 = !this.isTransitionstyleBackground2
      },
      changeStyleOpacity() {
        this.styleOpacity?.style?.setProperty("opacity", this.isTransitionstyleOpacity
          ? '1'
          : '0'
        )
        this.styleOpacity?.style?.setProperty("transition-duration", "1000ms")
        this.isTransitionstyleOpacity = !this.isTransitionstyleOpacity
      },
      propertyChangeBackground() {
        if (!this.isSetTransition) {
          this.propertyStyleBackground?.style?.setProperty("transition-property", "background-color")
          this.propertyStyleBackground?.style?.setProperty("transition-duration", "1000ms")
          this.isSetTransition = true
        }
        this.propertyStyleBackground?.style?.setProperty("background-color", this.isTransitionpropertystyleBackground
          ? 'brown'
          : 'black'
        )
        this.isTransitionpropertystyleBackground = !this.isTransitionpropertystyleBackground
      },
      changeTransform() {
        this.styleTransform?.style?.setProperty("transform", this.isTransitionStyleTransform
          ? 'rotate(0deg)'
          : 'rotate(135deg)'
        )
        this.isTransitionStyleTransform = !this.isTransitionStyleTransform
      },
      changeTransformTranslate() {
        const translate = this.isTransformTranslate ? `translate(0%,0%)` : `translate(100%,0%)`
        this.styleTransformTranslate?.style?.setProperty('transform', translate)
        this.isTransformTranslate = !this.isTransformTranslate
      },
      changeTransformWithWidth() {
        this.styleTransformWithWidth?.style?.setProperty("transform", this.isTransitionStyleTransformWithWidth
          ? 'rotate(0deg)'
          : 'rotate(135deg)'
        )
        this.styleTransformWithWidth?.style?.setProperty("width", this.isTransitionStyleTransformWithWidth
          ? '200px'
          : '100px'
        )
        this.isTransitionStyleTransformWithWidth = !this.isTransitionStyleTransformWithWidth
      },
      changeTransformWithOrigin() {
        this.styleTransformWithOrigin?.style?.setProperty("transform", this.isTransitionStyleTransformWithOrigin
          ? 'scaleX(1)'
          : 'scaleX(0)'
        )
        this.isTransitionStyleTransformWithOrigin = !this.isTransitionStyleTransformWithOrigin
      },
      changeBorder() {
        this.styleBorder?.style?.setProperty("border-color", this.isTransitionstyleBorder
          ? 'brown'
          : 'yellow'
        )
        this.isTransitionstyleBorder = !this.isTransitionstyleBorder
      },
      changestylePosition() {
        this.stylePosition?.style?.setProperty("left", this.isTransitionstylePosition
          ? '0px'
          : '100px'
        )
        this.isTransitionstylePosition = !this.isTransitionstylePosition
      },
      handleTouchStart(e : UniTouchEvent) {
        this.startX = e.changedTouches[0].clientX
      },
      handleTouchMove(e : UniTouchEvent) {
        console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY);
        e.preventDefault()
        e.stopPropagation()
        const difX = e.changedTouches[0].clientX
        this.moveX = difX - this.startX + this.oldX
        this.styleTransformTranslateScale?.style?.setProperty('transition-duration', '0ms')
        this.styleTransformTranslateScale?.style?.setProperty('transform', `translate(${this.moveX}px,0px) scale(0.5)`)
      },
      handleTouchEnd(_ : UniTouchEvent) {
        this.oldX = this.moveX
      },
    },
  })

export default __sfc__
function GenPagesCSSTransitionTransitionRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改宽度"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-width",
        id: "widthOrHeight",
        onClick: _ctx.changeWidthOrHeight
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改宽度(递增)"),
      createElementVNode("view", utsMapOf({
        class: "width-progress transition-width",
        id: "widthProgress",
        onClick: _ctx.changeWidthProgress
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Margin"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-margin",
        id: "styleMargin",
        onClick: _ctx.changeMargin
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Padding"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-padding",
        id: "stylePadding",
        onClick: _ctx.changePadding
      }), [
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"background-color":"black","height":"50px","width":"50px"}))
        }), null, 4 /* STYLE */)
      ], 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改background-color和opacity"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-background",
        id: "styleBackground",
        onClick: _ctx.changeBackground
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改background-color（rgba）"),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex":"1"}))
      }), [
        createElementVNode("view", utsMapOf({
          class: "base-style transition-background",
          id: "styleBackground2",
          onClick: _ctx.changeBackground2
        }), null, 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */)
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改opacity渐隐渐现"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-opacity",
        id: "styleOpacity",
        onClick: _ctx.changeStyleOpacity
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "动态修改background-color和duration"),
      createElementVNode("view", utsMapOf({
        class: "base-style",
        id: "propertyStyleBackground",
        onClick: _ctx.propertyChangeBackground
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Transform"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-transform",
        id: "styleTransform",
        onClick: _ctx.changeTransform
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改TransformTranslate"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-transform",
        id: "transformTranslate",
        onClick: _ctx.changeTransformTranslate
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({
      class: "container",
      onTouchmove: _ctx.handleTouchMove,
      onTouchstart: _ctx.handleTouchStart,
      onTouchend: _ctx.handleTouchEnd
    }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "在组件内滑动测试是否闪动"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-transform",
        id: "styleTransformTranslateScale"
      }))
    ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchmove", "onTouchstart", "onTouchend"]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Transform和宽"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-transform-width",
        id: "styleTransformWithWidth",
        onClick: _ctx.changeTransformWithWidth
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({
      class: "container",
      onClick: _ctx.changeTransformWithOrigin
    }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Transform（含transform-origin）"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-transform",
        style: normalizeStyle(utsMapOf({"transform-origin":"0 0"})),
        id: "styleTransformWithOrigin"
      }), null, 4 /* STYLE */)
    ], 8 /* PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Border"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-border",
        id: "styleBorder",
        onClick: _ctx.changeBorder
      }), null, 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "点击修改Position"),
      createElementVNode("view", utsMapOf({
        class: "base-style transition-position",
        id: "stylePosition",
        onClick: _ctx.changestylePosition
      }), null, 8 /* PROPS */, ["onClick"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSTransitionTransitionStyles = [utsMapOf([["container", padStyleMapOf(utsMapOf([["marginTop", 7], ["marginRight", 7], ["marginBottom", 7], ["marginLeft", 7], ["backgroundColor", "#FFFFFF"]]))], ["text", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginBottom", 16]]))], ["base-style", padStyleMapOf(utsMapOf([["width", 200], ["height", 200], ["backgroundColor", "#A52A2A"]]))], ["width-progress", padStyleMapOf(utsMapOf([["width", 200], ["height", 200], ["backgroundColor", "#A52A2A"]]))], ["transform-bgColor", padStyleMapOf(utsMapOf([["transitionProperty", "backgroundColor"], ["transitionDuration", "0.5s"]]))], ["transition-width", padStyleMapOf(utsMapOf([["transitionProperty", "width"], ["transitionDuration", "1s"]]))], ["transition-margin", padStyleMapOf(utsMapOf([["transitionProperty", "marginLeft,marginTop"], ["transitionDuration", "1s"]]))], ["transition-padding", padStyleMapOf(utsMapOf([["transitionProperty", "paddingLeft,paddingTop"], ["transitionDuration", "1s"]]))], ["transition-background", padStyleMapOf(utsMapOf([["transitionProperty", "backgroundColor,opacity"], ["transitionDuration", "1s"]]))], ["transition-opacity", padStyleMapOf(utsMapOf([["transitionProperty", "opacity"], ["transitionDuration", "1s"]]))], ["transition-transform", padStyleMapOf(utsMapOf([["transitionProperty", "transform"], ["transitionDuration", "1s"]]))], ["transition-border", padStyleMapOf(utsMapOf([["borderWidth", 5], ["borderColor", "#A52A2A"], ["borderStyle", "solid"], ["transitionProperty", "borderColor"], ["transitionDuration", "1s"]]))], ["transition-position", padStyleMapOf(utsMapOf([["left", 0], ["transitionProperty", "left"], ["transitionDuration", "1s"]]))], ["transition-transform-width", padStyleMapOf(utsMapOf([["transitionProperty", "transform,width"], ["transitionDuration", "1s"]]))], ["@TRANSITION", utsMapOf([["transform-bgColor", utsMapOf([["property", "backgroundColor"], ["duration", "0.5s"]])], ["transition-width", utsMapOf([["property", "width"], ["duration", "1s"]])], ["transition-margin", utsMapOf([["property", "marginLeft,marginTop"], ["duration", "1s"]])], ["transition-padding", utsMapOf([["property", "paddingLeft,paddingTop"], ["duration", "1s"]])], ["transition-background", utsMapOf([["property", "backgroundColor,opacity"], ["duration", "1s"]])], ["transition-opacity", utsMapOf([["property", "opacity"], ["duration", "1s"]])], ["transition-transform", utsMapOf([["property", "transform"], ["duration", "1s"]])], ["transition-border", utsMapOf([["property", "borderColor"], ["duration", "1s"]])], ["transition-position", utsMapOf([["property", "left"], ["duration", "1s"]])], ["transition-transform-width", utsMapOf([["property", "transform,width"], ["duration", "1s"]])]])]])]
