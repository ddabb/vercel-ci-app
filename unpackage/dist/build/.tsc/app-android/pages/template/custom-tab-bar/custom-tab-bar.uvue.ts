
  import tab1 from './custom-tab-bar-tab1.uvue';
  import tab2 from './custom-tab-bar-tab2.uvue';

  type TabItem = {
    init : boolean,
    preload : boolean,
  }

  const __sfc__ = defineComponent({
    components: {
      tab1,
      tab2
    },
    data() {
      return {
        tabList: [
          {
            init: true,
            preload: false
          } as TabItem,
          {
            init: false,
            preload: false
          } as TabItem,
        ] as TabItem[],
        selectedIndex: 0,
        displayArrow: false,
        lastTab1Top:0,
        tabViewHeight: 0
      }
    },
    onLoad() {
      uni.$on('tabchange', this.onTabPageEvent) //监听tab1页面发出的tabchange事件，触发到本页面的onTabPageEvent方法。为了判断tab1的scroll-view滚动距离
    },
    onReady() {
      // this.setSelectedIndex(0)
      (this.$refs["tabview"] as UniElement).getBoundingClientRectAsync()!.then((res: DOMRect) => {
        this.tabViewHeight = res.height
      });
    },
    onUnload() {
      uni.$off('tabchange', this.onTabPageEvent)
    },
    methods: {
      onTabClick(index : number) {
        if (this.selectedIndex == index && index == 0 && this.displayArrow == true) { //首页当tab按钮变成向上时，点向上就滚动到顶
          // console.log("11");
          this.displayArrow = false;
          (this.$refs["tab1"]! as ComponentPublicInstance).$callMethod('scrollTop', 0)
        }
        else if (index !=0){ //不在首页时，把箭头变成图标
          // console.log("22");
          this.displayArrow = false
        }
        else if (index == 0 && this.selectedIndex !=0){ //从其他tab切回首页时，检查是否需要把图标变箭头
          // console.log("33",this.lastTab1Top, this.tabViewHeight);
          this.displayArrow = this.lastTab1Top > this.tabViewHeight
        }
        this.setSelectedIndex(index);
        // console.log('index: ',index);
        // console.log('this.selectedIndex: ',this.selectedIndex);
        // console.log('this.displayArrow: ',this.displayArrow);
        // console.log('this.lastTab1Top: ',this.lastTab1Top);
      },
      onTabPageEvent(top : number) {
        // console.log('top: ',top);
        this.displayArrow = top > this.tabViewHeight //滚动1屏后，就把第一个tab的图标从首页变成向上箭头
        this.lastTab1Top = top
      },
      setSelectedIndex(index : number) {
        if (this.selectedIndex === index) {
          return
        }
        if (!this.tabList[index].init) {
          this.tabList[index].init = true
        }
        this.selectedIndex = index
      },
      onPlusClick() {
        uni.showModal({
          title: "提示",
          content: "你点击了 +",
          showCancel: false
        })
      }
    }
  })

export default __sfc__
function GenPagesTemplateCustomTabBarCustomTabBarRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_tab1 = resolveComponent("tab1")
const _component_tab2 = resolveComponent("tab2")

  return createElementVNode("view", utsMapOf({ class: "tabs" }), [
    createElementVNode("view", utsMapOf({
      ref: "tabview",
      class: "tab-view"
    }), [
      isTrue(_ctx.tabList[0].init)
        ? createVNode(_component_tab1, utsMapOf({
            key: 0,
            ref: "tab1",
            class: "tab-page",
            style: normalizeStyle(utsMapOf({visibility:(_ctx.selectedIndex==0?'visible':'hidden')}))
          }), null, 8 /* PROPS */, ["style"])
        : createCommentVNode("v-if", true),
      isTrue(_ctx.tabList[1].init)
        ? createVNode(_component_tab2, utsMapOf({
            key: 1,
            ref: "tab2",
            class: "tab-page",
            style: normalizeStyle(utsMapOf({visibility:(_ctx.selectedIndex==1?'visible':'hidden')}))
          }), null, 8 /* PROPS */, ["style"])
        : createCommentVNode("v-if", true)
    ], 512 /* NEED_PATCH */),
    createElementVNode("view", utsMapOf({
      ref: "tabbar",
      class: "tab-bar"
    }), [
      createElementVNode("view", utsMapOf({
        class: "tab-item",
        onClick: () => {_ctx.onTabClick(0)}
      }), [
        createElementVNode("view", utsMapOf({
          ref: "tab-item1",
          class: "tab-item-content"
        }), [
          isTrue(_ctx.displayArrow)
            ? createElementVNode("text", utsMapOf({
                key: 0,
                class: normalizeClass(["tab-item-icon tab-item-arrow uni-icon", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), toDisplayString('\ue6bd'), 2 /* CLASS */)
            : createCommentVNode("v-if", true),
          isTrue(!_ctx.displayArrow)
            ? createElementVNode("text", utsMapOf({
                key: 1,
                class: normalizeClass(["tab-item-icon uni-icon", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), toDisplayString('\ue644'), 2 /* CLASS */)
            : createCommentVNode("v-if", true),
          isTrue(!_ctx.displayArrow)
            ? createElementVNode("text", utsMapOf({
                key: 2,
                class: normalizeClass(["tab-item-text", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), " 首页 ", 2 /* CLASS */)
            : createCommentVNode("v-if", true)
        ], 512 /* NEED_PATCH */)
      ], 8 /* PROPS */, ["onClick"]),
      createElementVNode("view", null, [
        createElementVNode("image", utsMapOf({
          class: "concave-image",
          mode: "heightFix",
          src: "/static/template/custom-tab-bar/concave.png"
        }))
      ]),
      createElementVNode("view", utsMapOf({
        class: "tab-item",
        onClick: () => {_ctx.onTabClick(1)}
      }), [
        createElementVNode("view", utsMapOf({
          ref: "tab-item2",
          class: "tab-item-content"
        }), [
          createElementVNode("text", utsMapOf({
            class: normalizeClass(["tab-item-icon uni-icon", _ctx.selectedIndex==1 ? 'tab-item-text-active' : ''])
          }), toDisplayString('\ue699'), 2 /* CLASS */),
          createElementVNode("text", utsMapOf({
            class: normalizeClass(["tab-item-text", _ctx.selectedIndex==1 ? 'tab-item-text-active' : ''])
          }), " 我的 ", 2 /* CLASS */)
        ], 512 /* NEED_PATCH */)
      ], 8 /* PROPS */, ["onClick"])
    ], 512 /* NEED_PATCH */),
    createElementVNode("view", utsMapOf({
      class: "btn-plus",
      onClick: _ctx.onPlusClick
    }), [
      createElementVNode("text", utsMapOf({ class: "btn-plus-text" }), "+")
    ], 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesTemplateCustomTabBarCustomTabBarStyles = [utsMapOf([["uni-icon", padStyleMapOf(utsMapOf([["fontFamily", "UniIcon"], ["fontSize", 16], ["fontStyle", "normal"]]))], ["tabs", padStyleMapOf(utsMapOf([["flex", 1], ["backgroundColor", "#ffffff"], ["overflow", "visible"]]))], ["tab-view", padStyleMapOf(utsMapOf([["flex", 1]]))], ["tab-page", padStyleMapOf(utsMapOf([["position", "absolute"], ["width", "100%"], ["height", "100%"]]))], ["tab-bar", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["height", 56], ["overflow", "visible"]]))], ["tab-item", padStyleMapOf(utsMapOf([["flex", 1], ["position", "relative"], ["backgroundColor", "#1e90ff"], ["overflow", "visible"]]))], ["tab-item-content", padStyleMapOf(utsMapOf([["marginTop", "auto"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["transitionProperty", "transform"], ["transitionDuration", "0.3s"]]))], ["tab-item-icon", padStyleMapOf(utsMapOf([["color", "#cccccc"], ["fontSize", 12], ["textAlign", "center"], ["marginBottom", 4]]))], ["tab-item-text", padStyleMapOf(utsMapOf([["color", "#cccccc"], ["fontSize", 12], ["textAlign", "center"]]))], ["tab-item-text-active", padStyleMapOf(utsMapOf([["color", "#ffffff"]]))], ["tab-item-arrow", padStyleMapOf(utsMapOf([["!fontSize", 30], ["fontWeight", "bold"]]))], ["concave-image", padStyleMapOf(utsMapOf([["height", 56]]))], ["btn-plus", padStyleMapOf(utsMapOf([["position", "absolute"], ["width", 70], ["height", 70], ["bottom", 21], ["borderRadius", 50], ["backgroundColor", "#FE5722"], ["boxShadow", "0 0 4px rgba(0, 0, 0, 0.5)"], ["alignSelf", "center"], ["alignItems", "center"], ["justifyContent", "center"], ["overflow", "visible"]]))], ["btn-plus-text", padStyleMapOf(utsMapOf([["color", "#ffffff"], ["fontSize", 32]]))], ["@FONT-FACE", utsMapOf([["0", utsMapOf([["fontFamily", "UniIcon"], ["src", "url('/static/fonts/uni-icon.ttf')"]])]])], ["@TRANSITION", utsMapOf([["tab-item-content", utsMapOf([["property", "transform"], ["duration", "0.3s"]])]])]])]
