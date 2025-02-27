
  type Item = {
    id : number
    name : string
    info : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: '自定义虚拟列表组件uni-recycle-view',
        list: [] as Item[]
      }
    },
    created() {
      for (let i = 0; i < 2000; i++) {
        this.list.push({
          id: i,
          name: `Wifi_` + i,
          info: `信号强度: -${(Math.floor(Math.random() * 60) + 40)} db, 安全性: WPA/WPA2/WPA3-Personal`
        } as Item)
      }
    },
    methods: {
      scrolltoupper() {
        console.log('scroll top upper')
      },
      scroll() {
        // console.log('scroll')
      }
    }
  })

export default __sfc__
function GenPagesTemplateCustomLongListCustomLongListRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_uni_recycle_item = resolveEasyComponent("uni-recycle-item",_easycom_uni_recycle_item)
const _component_uni_recycle_view = resolveEasyComponent("uni-recycle-view",_easycom_uni_recycle_view)

  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1","background-color":"aliceblue"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "tips" }), "list-view组件虽然在UI层有recycle机制，但长列表的vnode太多也会造成初始化卡顿。本组件仅创建部分vnode，而未使用list-view，也就是UI层其实是短列表。 此示例中仅渲染滚动容器上下5屏的内容。适用于仅使用一个for循环创建所有列表项的场景。文档详见插件市场：https://ext.dcloud.net.cn/plugin?id=17385"),
    createVNode(_component_uni_recycle_view, utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"})),
      list: _ctx.list,
      onScrolltoupper: _ctx.scrolltoupper,
      onScroll: _ctx.scroll
    }), utsMapOf({
      default: withScopedSlotCtx((slotProps: Record<string, any | null>): any[] => {
      const items = slotProps["items"]
      return [
        createElementVNode(Fragment, null, RenderHelpers.renderList((items as Item[]), (item, index, __index, _cached): any => {
          return createVNode(_component_uni_recycle_item, utsMapOf({
            class: "item",
            item: item,
            key: index + '_' + item.id
          }), utsMapOf({
            default: withSlotCtx((): any[] => [
              createElementVNode("view", utsMapOf({ class: "item-wrapper" }), [
                createElementVNode("view", utsMapOf({ class: "name" }), [
                  createElementVNode("text", utsMapOf({
                    style: normalizeStyle(utsMapOf({"font-size":"14px"}))
                  }), toDisplayString(item.name), 5 /* TEXT, STYLE */)
                ]),
                createElementVNode("view", utsMapOf({ class: "info" }), [
                  createElementVNode("text", utsMapOf({
                    style: normalizeStyle(utsMapOf({"font-size":"12px","color":"#999999"}))
                  }), toDisplayString(item.info), 5 /* TEXT, STYLE */)
                ])
              ])
            ]),
            _: 2 /* DYNAMIC */
          }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["item"])
        }), 128 /* KEYED_FRAGMENT */)
      ]}),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["style", "list", "onScrolltoupper", "onScroll"])
  ], 4 /* STYLE */)
}
const GenPagesTemplateCustomLongListCustomLongListStyles = [utsMapOf([["tips", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10], ["borderRadius", 5], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#FFFFFF"]]))], ["item", padStyleMapOf(utsMapOf([["paddingTop", 5], ["paddingRight", 10], ["paddingBottom", 5], ["paddingLeft", 10]]))], ["item-wrapper", padStyleMapOf(utsMapOf([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["borderRadius", 5], ["backgroundColor", "#FFFFFF"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_uni_recycle_item from '@/uni_modules/uni-recycle-view/components/uni-recycle-item/uni-recycle-item.uvue'
import _easycom_uni_recycle_view from '@/uni_modules/uni-recycle-view/components/uni-recycle-view/uni-recycle-view.uvue'
