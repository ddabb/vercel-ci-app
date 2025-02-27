
  const __sfc__ = defineComponent({
    data() {
      return {
        item_count: 20,
        listViewElement: null as UniListViewElement | null
      }
    },
    onReady() {
      this.listViewElement = uni.getElementById<UniListViewElement>('listview')
    },
    methods: {
      onScrollTolower(_ : ScrollToLowerEvent) {
        setTimeout(() => {
          this.item_count += 20
        }, 300)
      },
      itemClick(index : number) {
        console.log("itemTextClick---" + index)
      }
    }
  })

export default __sfc__
function GenPagesComponentListViewListViewMultiplexInputRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("list-view", utsMapOf({
    id: "listview",
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    "show-scrollbar": "false",
    onScrolltolower: _ctx.onScrollTolower
  }), [
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.item_count, (index, __key, __index, _cached): any => {
      return createElementVNode("list-item", utsMapOf({
        class: "item",
        onClick: () => {_ctx.itemClick(index)}
      }), [
        createElementVNode("text", null, [
          "item-------",
          createElementVNode("text", null, toDisplayString(index), 1 /* TEXT */)
        ]),
        createElementVNode("input", utsMapOf({
          style: normalizeStyle(utsMapOf({"border-width":"1px","border-style":"solid"})),
          placeholder: index + '',
          value: index ==1 ? `第一个` :index 
        }), null, 12 /* STYLE, PROPS */, ["placeholder", "value"])
      ], 8 /* PROPS */, ["onClick"])
    }), 256 /* UNKEYED_FRAGMENT */)
  ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onScrolltolower"])
}
const GenPagesComponentListViewListViewMultiplexInputStyles = [utsMapOf([["item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginTop", 0], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["backgroundColor", "#ffffff"], ["borderRadius", 5]]))], ["button_item", padStyleMapOf(utsMapOf([["width", 200]]))]])]
