
  import iconpath from "./uniicons.ttf";
  const __sfc__ = defineComponent({
    name: "uni-navbar",
    props: {
      title: {
        type: String,
        default: "",
      },
      isLeft: {
        type: Boolean,
        default: false,
      },
      textColor: {
        type: String,
        default: "#000",
      },
      statusBar: {
        type: Boolean,
        default: false,
      }
    },
    data() {
      return {
        statusBarHeight: 0,
      };
    },
    computed: {
      unicode() : string {
        return "\ue600";
      },
    },
    created() {
      uni.loadFontFace({
        global: false,
        family: "UniIconsFontFamily",
        source: `url("${iconpath}")`,
        success() { },
        fail(err) {
          console.log(err);
        },
      });
    },
    mounted() {
      uni.setNavigationBarColor({
        frontColor: "#000000",
        backgroundColor: "#ffffff",
      });




    },
    methods: {
      back() {
        uni.navigateBack({});
      },
    },
  });

export default __sfc__
function GenComponentsUniNavbarLiteUniNavbarLiteRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "uni-navbar" }), [
    isTrue(_ctx.statusBar)
      ? createElementVNode("view", utsMapOf({
          key: 0,
          class: "status-bar"
        }))
      : createCommentVNode("v-if", true),
    createElementVNode("view", utsMapOf({ class: "uni-navbar-inner" }), [
      createElementVNode("view", utsMapOf({
        class: "left-content",
        onClick: _ctx.back
      }), [
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({ color: _ctx.textColor })),
          class: "uni-icons"
        }), toDisplayString(_ctx.unicode), 5 /* TEXT, STYLE */)
      ], 8 /* PROPS */, ["onClick"]),
      createElementVNode("view", utsMapOf({
        class: normalizeClass(["uni-navbar-content", utsMapOf({ 'is-left': _ctx.isLeft })])
      }), [
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({ color: _ctx.textColor }))
        }), [
          renderSlot(_ctx.$slots, "default", {}, (): any[] => [toDisplayString(_ctx.title)])
        ], 4 /* STYLE */)
      ], 2 /* CLASS */),
      createElementVNode("view", utsMapOf({ class: "right-content" }), [
        renderSlot(_ctx.$slots, "right")
      ])
    ])
  ])
}
export type UniNavbarLiteComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsUniNavbarLiteUniNavbarLiteStyles = [utsMapOf([["uni-icons", padStyleMapOf(utsMapOf([["!fontFamily", "UniIconsFontFamily"], ["fontSize", 26], ["fontStyle", "normal"], ["color", "#333333"]]))], ["status-bar", padStyleMapOf(utsMapOf([["height", CSS_VAR_STATUS_BAR_HEIGHT]]))], ["uni-navbar", padStyleMapOf(utsMapOf([["backgroundColor", "#007aff"]]))], ["uni-navbar-inner", padStyleMapOf(utsMapOf([["position", "relative"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["height", 45]]))], ["left-content", padStyleMapOf(utsMapOf([["justifyContent", "center"], ["alignItems", "center"], ["width", 40], ["height", "100%"]]))], ["right-content", padStyleMapOf(utsMapOf([["justifyContent", "center"], ["alignItems", "center"], ["width", 40], ["height", "100%"]]))], ["uni-navbar-content", padStyleMapOf(utsMapOf([["position", "absolute"], ["height", "100%"], ["top", 0], ["bottom", 0], ["left", 45], ["right", 45], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["is-left", padStyleMapOf(utsMapOf([["justifyContent", "flex-start"]]))]])]
