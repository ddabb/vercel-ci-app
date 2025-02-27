
  const __sfc__ = defineComponent({
    data() {
      return {
        $elementMap: new Map<string, UniElement>()
      }
    },
    methods: {
      onScroll(e : ScrollEvent) {
        const {scrollTop} = e.detail
        let y : number = scrollTop - 110
        let s : number = (100 - scrollTop/3)/100
        if(y < 0){
          y = 0
        }
        if(s < 0.7){
          s = 0.7
        }
        let x : number = (1 - s) * -100
        this.setElementStyle("user-info", "transform", `translate(${x}px, ${y + (s-1)* -50}px) scale(${s})`)
        this.setElementStyle("head-img-box-2", "transform", `translateY(${y}px)`)
      },
      onRefresherpulling(e : RefresherEvent) {
        // console.log('onRefresherpulling',e.detail.dy)
        let pullingDistance : number = e.detail.dy
        this.setElementStyle("head-img-1", 'transform', `scale(${pullingDistance / 200 + 1})`)
        this.setElementStyle("head-img-2", 'transform', `scale(${pullingDistance / 200 + 1})`)
      },
      // 工具方法，用于快速设置 Element 的 style
      setElementStyle(refName : string, propertyName : string, propertyStyle : any) : void {
        let element : UniElement | null = (this.$data['$elementMap'] as Map<string, UniElement>).get(refName)
        if (element == null) {
          element = this.$refs[refName] as UniElement;
          (this.$data['$elementMap'] as Map<string, UniElement>).set(refName, element)
        }
        element.style.setProperty(propertyName, propertyStyle);
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
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesTemplatePullZoomImagePullZoomImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode(Fragment, null, [
    createElementVNode("view", utsMapOf({
      onClick: _ctx.back,
      class: "nav-back"
    }), [
      createElementVNode("image", utsMapOf({
        class: "back-img",
        src: "/static/template/pull-zoom-image/back.png",
        mode: "widthFix"
      }))
    ], 8 /* PROPS */, ["onClick"]),
    createElementVNode("scroll-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"})),
      "refresher-enabled": true,
      "refresher-default-style": "none",
      onRefresherpulling: _ctx.onRefresherpulling,
      "refresher-threshold": 300,
      "refresher-max-drag-distance": 299,
      onScroll: _ctx.onScroll,
      rebound: false
    }), [
      createElementVNode("view", utsMapOf({
        class: "head-img-box-2",
        ref: "head-img-box-2"
      }), [
        createElementVNode("image", utsMapOf({
          class: "img",
          ref: "head-img-2",
          src: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/pull-zoom-image-head-img.jpg",
          mode: "scaleToFill"
        }), null, 512 /* NEED_PATCH */)
      ], 512 /* NEED_PATCH */),
      createElementVNode("view", utsMapOf({
        class: "user-info",
        ref: "user-info"
      }), [
        createElementVNode("image", utsMapOf({
          class: "user-avatar",
          src: "/static/test-image/logo.png",
          mode: "widthFix"
        })),
        createElementVNode("view", utsMapOf({ class: "font-box" }), [
          createElementVNode("text", utsMapOf({ class: "username" }), "uni-app-x"),
          createElementVNode("text", utsMapOf({ class: "slogan" }), "一次开发，多端覆盖")
        ])
      ], 512 /* NEED_PATCH */),
      createElementVNode("view", utsMapOf({ class: "list-box" }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(30, (item, index, __index, _cached): any => {
          return createElementVNode("view", utsMapOf({
            class: "item",
            key: index
          }), [
            createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(item) + ". 占位", 1 /* TEXT */)
          ])
        }), 64 /* STABLE_FRAGMENT */)
      ]),
      createElementVNode("view", utsMapOf({ slot: "refresher" }), [
        createElementVNode("view", utsMapOf({ class: "head-img-box-1" }), [
          createElementVNode("image", utsMapOf({
            class: "img",
            ref: "head-img-1",
            src: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/pull-zoom-image-head-img.jpg",
            mode: "scaleToFill"
          }), null, 512 /* NEED_PATCH */)
        ])
      ])
    ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onRefresherpulling", "onScroll"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesTemplatePullZoomImagePullZoomImageStyles = [utsMapOf([["head-img-box-1", padStyleMapOf(utsMapOf([["position", "relative"], ["height", 300]]))], ["head-img-box-2", padStyleMapOf(utsMapOf([["position", "relative"], ["height", 200], ["zIndex", 9]]))], ["img", utsMapOf([[".head-img-box-1 ", utsMapOf([["position", "absolute"], ["left", "-125rpx"], ["width", "1000rpx"], ["height", 600], ["top", 0]])], [".head-img-box-2 ", utsMapOf([["position", "absolute"], ["left", "-125rpx"], ["width", "1000rpx"], ["height", 600], ["bottom", -100]])]])], ["user-info", padStyleMapOf(utsMapOf([["marginTop", -110], ["width", "750rpx"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["flexDirection", "row"], ["zIndex", 10]]))], ["user-avatar", utsMapOf([[".user-info ", utsMapOf([["width", 75], ["height", 75], ["borderRadius", 100], ["borderWidth", 3], ["borderStyle", "solid"], ["borderColor", "#FFFFFF"]])]])], ["font-box", utsMapOf([[".user-info ", utsMapOf([["flexDirection", "column"], ["justifyContent", "space-around"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]])]])], ["username", utsMapOf([[".user-info ", utsMapOf([["fontSize", 26], ["color", "#FFFFFF"]])]])], ["slogan", utsMapOf([[".user-info ", utsMapOf([["fontSize", 16], ["color", "#FFFFFF"]])]])], ["list-box", padStyleMapOf(utsMapOf([["backgroundColor", "#FFFFFF"], ["zIndex", 1]]))], ["item", utsMapOf([[".list-box ", utsMapOf([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["marginTop", 5], ["marginRight", 5], ["marginBottom", 5], ["marginLeft", 5], ["borderRadius", 5], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "rgba(220,220,220,0.3)"]])]])], ["text", utsMapOf([[".list-box ", utsMapOf([["fontSize", 14], ["color", "#666666"], ["lineHeight", "20px"]])]])], ["nav-back", padStyleMapOf(utsMapOf([["position", "absolute"], ["top", 30], ["left", 10], ["borderRadius", 100], ["width", 28], ["height", 28], ["justifyContent", "center"], ["alignItems", "center"], ["zIndex", 10]]))], ["back-img", utsMapOf([[".nav-back ", utsMapOf([["width", 18], ["height", 18]])]])]])]
