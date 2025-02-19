
  type RefresherEventTest = {
    type : string;
    target : UniElement | null;
    currentTarget : UniElement | null;
    dy : number;
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        scrollData: [] as Array<string>,
        refresherTriggered: false,
        refresherrefresh: false,
        refresherrefreshTimes: 0,
        showScrollbar: false,
        // 自动化测试使用
        refresherrefreshTest: "",
        onRefresherabortTest: "",
        onRefresherrestoreTest: "",
        onRefresherpullingTest: ""
      };
    },
    onLoad() {
      let lists : Array<string> = []
      for (let i = 0; i < 20; i++) {
        lists.push("item---" + i)
      }
      this.scrollData = lists
    },

    methods: {
      onRefresherrefresh(e : UniRefresherEvent) {
        this.refresherrefresh = true
        console.log("onRefresherrefresh------下拉刷新触发")
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherrefresh')
        this.refresherTriggered = true
        this.refresherrefreshTimes++
        setTimeout(() => {
          this.refresherTriggered = false
        }, 1500)
      },
      onRefresherabort(e : UniRefresherEvent) {
        console.log("onRefresherabort------下拉刷新被中止")
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherabort')
      },
      onRefresherrestore(e : UniRefresherEvent) {
        this.refresherrefresh = false
        console.log("onRefresherrestore------下拉刷新被复位")
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherrestore')
      },
      onRefresherpulling(e : UniRefresherEvent) {
        console.log("onRefresherpulling------拉刷新控件被下拉-dy=" + e.detail.dy)
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherpulling')
      },
      onScrolltolower(e : UniScrollToLowerEvent) {
        console.log("onScrolltolower 滚动到底部-----" + e.detail.direction)
      },
      // 自动化测试专用（由于事件event参数对象中存在循环引用，在ios端JSON.stringify报错，自动化测试无法page.data获取）
      checkEventTest(e : RefresherEventTest, eventName : String) {

        const isPass = e.type === eventName && e.target instanceof UniElement && e.currentTarget instanceof UniElement && e.dy > 0;




        const result = isPass ? `${eventName}:Success` : `${eventName}:Fail`;
        switch (eventName) {
          case 'refresherrefresh':
            this.refresherrefreshTest = result
            break;
          case 'refresherpulling':
            this.onRefresherpullingTest = result
            break;
          case 'refresherrestore':
            this.onRefresherrestoreTest = result
            break;
          case 'refresherabort':
            this.onRefresherabortTest = result
            break;
          default:
            break;
        }
      }
    }
  });

export default __sfc__
function GenPagesComponentScrollViewScrollViewRefresherRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("view", utsMapOf({ class: "container" }), [
    createVNode(_component_page_head, utsMapOf({ title: "scroll-view 下拉刷新" })),
    createElementVNode("scroll-view", utsMapOf({
      class: "scroll",
      "refresher-enabled": "true",
      "refresher-triggered": _ctx.refresherTriggered,
      onRefresherrefresh: _ctx.onRefresherrefresh,
      onRefresherabort: _ctx.onRefresherabort,
      onRefresherrestore: _ctx.onRefresherrestore,
      onRefresherpulling: _ctx.onRefresherpulling,
      onScrolltolower: _ctx.onScrolltolower,
      "show-scrollbar": _ctx.showScrollbar
    }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, (key, __key, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({ key: key }), [
          createElementVNode("view", utsMapOf({ class: "scroll-item" }), [
            createElementVNode("text", utsMapOf({ class: "scroll-item-title" }), toDisplayString(key), 1 /* TEXT */)
          ])
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ], 40 /* PROPS, NEED_HYDRATION */, ["refresher-triggered", "onRefresherrefresh", "onRefresherabort", "onRefresherrestore", "onRefresherpulling", "onScrolltolower", "show-scrollbar"])
  ])
}
const GenPagesComponentScrollViewScrollViewRefresherStyles = [utsMapOf([["container", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "column"], ["flex", 1]]))], ["scroll", padStyleMapOf(utsMapOf([["backgroundColor", "#eeeeee"], ["position", "relative"], ["width", "100%"], ["flex", 1], ["display", "flex"], ["flexDirection", "column"], ["borderColor", "#FF0000"]]))], ["scroll-item", padStyleMapOf(utsMapOf([["marginLeft", 6], ["marginRight", 6], ["marginTop", 6], ["backgroundColor", "#ffffff"], ["borderRadius", 4]]))], ["scroll-item-title", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 60], ["lineHeight", "60px"], ["textAlign", "center"], ["color", "#555555"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
