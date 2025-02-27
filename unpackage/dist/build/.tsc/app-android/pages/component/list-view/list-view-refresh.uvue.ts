
  type RefresherEventTest = {
    type : string;
    target : UniElement | null;
    currentTarget : UniElement | null;
    dy : number;
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        item_count: 20,
        list_show: false,
        refresherTriggered: true,
        // 自动化测试使用
        refresherrefreshTest: "",
        onRefresherabortTest: "",
        onRefresherrestoreTest: "",
        onRefresherpullingTest: ""
      }
    },
    onLoad() {
      //延迟显示list-view
      setTimeout(() => {
        this.list_show = true;
      }, 500)
    },
    methods: {
      onRefresherrefresh(e : UniRefresherEvent) {
        console.log('refresherrefresh-----下拉刷新被触发', e.detail.dy);
        this.refresherTriggered = true;
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherrefresh')
        setTimeout(() => {
          this.refresherTriggered = false;
        }, 1000)
      },
      onRefresherabort(e : UniRefresherEvent) {
        console.log("onRefresherabort------下拉刷新被中止", e.detail)
        this.checkEventTest({
          type: e.type,
          target: e.target,
          currentTarget: e.currentTarget,
          dy: e.detail.dy,
        } as RefresherEventTest, 'refresherabort')
      },
      onRefresherrestore(e : UniRefresherEvent) {
        console.log("onRefresherrestore------下拉刷新被复位", e.detail.dy)
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
  })

export default __sfc__
function GenPagesComponentListViewListViewRefreshRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return isTrue(_ctx.list_show)
    ? createElementVNode("list-view", utsMapOf({
        key: 0,
        id: "listview",
        style: normalizeStyle(utsMapOf({"flex":"1"})),
        "show-scrollbar": "false",
        "refresher-enabled": true,
        "refresher-triggered": _ctx.refresherTriggered,
        onRefresherrefresh: _ctx.onRefresherrefresh,
        onRefresherabort: _ctx.onRefresherabort,
        onRefresherrestore: _ctx.onRefresherrestore,
        onRefresherpulling: _ctx.onRefresherpulling
      }), [
        createElementVNode("list-item", utsMapOf({ class: "item" }), [
          createElementVNode("text", null, "向下滑动触发下拉刷新")
        ]),
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.item_count, (index, __key, __index, _cached): any => {
          return createElementVNode("list-item", utsMapOf({ class: "item" }), [
            createElementVNode("text", null, "item-------" + toDisplayString(index), 1 /* TEXT */)
          ])
        }), 256 /* UNKEYED_FRAGMENT */)
      ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["refresher-triggered", "onRefresherrefresh", "onRefresherabort", "onRefresherrestore", "onRefresherpulling"])
    : createCommentVNode("v-if", true)
}
const GenPagesComponentListViewListViewRefreshStyles = [utsMapOf([["item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginTop", 0], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["backgroundColor", "#ffffff"], ["borderRadius", 5]]))], ["button_item", padStyleMapOf(utsMapOf([["width", 200]]))]])]
