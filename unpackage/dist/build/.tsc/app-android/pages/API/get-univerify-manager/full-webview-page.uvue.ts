
  const __sfc__ = defineComponent({
    data() {
      return {
        url: '',
        title: '',
        animationType: 'slide-out-bottom',
        backIcon: '\ue601'
      }
    },
    onLoad(options : OnLoadOptions) {
      this.url = options["url"] as string;
      this.title = options["title"] as string;
      this.animationType = options["animationType"] as string;
    },
    methods: {
      onBack() {
        uni.closeDialogPage({
          dialogPage: this.$page,
          animationType: this.animationType,
          success(res) {
            console.log('closeThisDialog success', res)
          },
          fail(err) {
            console.log('closeThisDialog fail', err)
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIGetUniverifyManagerFullWebviewPageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "background" }), [
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("view", utsMapOf({ class: "nav" }), [
        createElementVNode("view", utsMapOf({ class: "left_content" }), [
          createElementVNode("text", utsMapOf({
            class: "left_icon",
            onClick: () => {_ctx.onBack()}
          }), toDisplayString(_ctx.backIcon), 9 /* TEXT, PROPS */, ["onClick"])
        ]),
        createElementVNode("view", utsMapOf({ class: "title_content" }), [
          createElementVNode("text", utsMapOf({ class: "title" }), toDisplayString(_ctx.title), 1 /* TEXT */)
        ])
      ]),
      createElementVNode("web-view", utsMapOf({
        class: "web_container",
        src: _ctx.url
      }), null, 8 /* PROPS */, ["src"])
    ])
  ])
}
const GenPagesAPIGetUniverifyManagerFullWebviewPageStyles = [utsMapOf([["background", padStyleMapOf(utsMapOf([["backgroundColor", "#007aff"], ["width", "100%"], ["height", "100%"]]))], ["nav", padStyleMapOf(utsMapOf([["height", 45], ["width", "100%"], ["position", "relative"], ["flexDirection", "row"], ["justifyContent", "space-between"]]))], ["left_content", padStyleMapOf(utsMapOf([["justifyContent", "center"], ["alignItems", "center"], ["width", 40], ["height", "100%"]]))], ["left_icon", padStyleMapOf(utsMapOf([["color", "#FFFFFF"], ["top", 5], ["height", "100%"], ["fontFamily", "uni-icon"], ["fontSize", 26]]))], ["title_content", padStyleMapOf(utsMapOf([["position", "absolute"], ["height", "100%"], ["top", 0], ["bottom", 0], ["left", 45], ["right", 45], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["title", padStyleMapOf(utsMapOf([["color", "#FFFFFF"], ["fontSize", 17]]))], ["container", padStyleMapOf(utsMapOf([["paddingTop", CSS_VAR_STATUS_BAR_HEIGHT], ["width", "100%"], ["position", "absolute"], ["height", "100%"]]))], ["web_container", padStyleMapOf(utsMapOf([["backgroundColor", "#f1f1f1"], ["paddingTop", 10], ["flex", 1], ["width", "100%"]]))]])]
