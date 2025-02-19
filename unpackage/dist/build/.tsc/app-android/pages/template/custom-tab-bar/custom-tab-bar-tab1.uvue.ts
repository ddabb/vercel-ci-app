
  type ListItem = {
    title : string
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        dataList: [] as ListItem[],
        oldScrollTop: 0,
        newScrollTop: 0
      }
    },
    created() {
      this.loadData()
      // console.log("tab1 created");
    },
    methods: {
      loadData() {
        let index = this.dataList.length
        for (let i = 0; i < 20; i++) {
          this.dataList.push({
            title: index.toString(),
          } as ListItem)
          index++
        }
      },
      onScroll(e : ScrollEvent) {
        uni.$emit('tabchange', e.detail.scrollTop)
        this.oldScrollTop = e.detail.scrollTop
      },
      scrollTop(top : number) {
        // (this.$refs["listView"] as UniElement).scrollTop = top
        // console.log("tab1 to top");
        this.newScrollTop = this.oldScrollTop
        this.$nextTick(() => {
          this.newScrollTop = top
        })
      }
    }
  })

export default __sfc__
function GenPagesTemplateCustomTabBarCustomTabBarTab1Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    ref: "listView",
    class: "list",
    rebound: false,
    "scroll-with-animation": true,
    "scroll-y": true,
    "scroll-top": _ctx.newScrollTop,
    onScrolltolower: () => {_ctx.loadData()},
    onScroll: _ctx.onScroll
  }), [
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.dataList, (item, index, __index, _cached): any => {
      return createElementVNode("view", utsMapOf({
        class: "list-item",
        key: index
      }), [
        createElementVNode("view", utsMapOf({ class: "cell-item" }), [
          createElementVNode("text", utsMapOf({ class: "title" }), "内容：" + toDisplayString(item.title), 1 /* TEXT */),
          createElementVNode("input", utsMapOf({
            class: "title",
            style: normalizeStyle(utsMapOf({"margin-top":"8px"})),
            placeholder: "备注:"
          }), null, 4 /* STYLE */)
        ])
      ])
    }), 128 /* KEYED_FRAGMENT */)
  ], 40 /* PROPS, NEED_HYDRATION */, ["scroll-top", "onScrolltolower", "onScroll"])
}
const GenPagesTemplateCustomTabBarCustomTabBarTab1Styles = [utsMapOf([["list", padStyleMapOf(utsMapOf([["flex", 1], ["backgroundColor", "#ffffff"]]))], ["list-item", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["paddingTop", 30], ["paddingRight", 30], ["paddingBottom", 30], ["paddingLeft", 30], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#dbdbdb"]]))], ["title", padStyleMapOf(utsMapOf([["fontSize", 16], ["textAlign", "left"]]))], ["cell-item", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "column"]]))]])]
