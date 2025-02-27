
  type ProviderItem = {
    service : string,
    name : string,
    provider : string[],
    providerObj : UniProvider[]
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'provider',
        flag: false,
        serviceList: [
          { service: "payment", name: "支付", provider: [], providerObj: [] },
          { service: "location", name: "定位", provider: [], providerObj: [] }
        ] as ProviderItem[],
        //自动化测试使用
        providerIds: [] as string[],

        providerObjects: [] as UniProvider[],
      }
    },
    methods: {
      getProvider() {
        this.serviceList.forEach((item : ProviderItem) => {
          var provider = uni.getProviderSync({
            service: item.service,
          } as GetProviderSyncOptions)
          provider.providerIds.forEach((value) => {
            this.providerIds.push(value)
          })
          this.updateProvider(item.service, provider.providerIds, provider.providerObjects);
        })
      },
      updateProvider(service : string, provider : string[] | null, uniProvider : UniProvider[]) {
        //这里需要从新从serviceList 获取item，不能直接用forEach 里面的item，目前存在bug,后续会解决这个问题
        const item : ProviderItem | null = this.serviceList.find((item : ProviderItem) : boolean => {
          return item.service == service
        });

        if (item != null && provider != null) {
          item.provider = provider
          item.providerObj = uniProvider
          item.providerObj.forEach((obj) => {
            this.providerObjects.push(obj)
          })
        }

      }
    }
  })

export default __sfc__
function GenPagesAPIProviderProviderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", utsMapOf({ class: "page" }), [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.serviceList, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          class: "service-item",
          key: index
        }), [
          createElementVNode("text", utsMapOf({ class: "service-name" }), toDisplayString(item.name) + ":", 1 /* TEXT */),
          createElementVNode("view", utsMapOf({ class: "provider-list" }), [
            createElementVNode(Fragment, null, RenderHelpers.renderList(item.provider, (item2, index2, __index, _cached): any => {
              return createElementVNode("text", utsMapOf({
                class: "provider-item",
                key: index2
              }), toDisplayString(item2) + " " + toDisplayString(item.providerObj.length > 0 ? ':' + JSON.stringify(item.providerObj[index2]) : ''), 1 /* TEXT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        ])
      }), 128 /* KEYED_FRAGMENT */),
      createElementVNode("button", utsMapOf({
        class: "btn-get-provider",
        type: "primary",
        onClick: _ctx.getProvider
      }), "getProviderSync", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIProviderProviderStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["service-item", padStyleMapOf(utsMapOf([["marginTop", 10]]))], ["service-name", padStyleMapOf(utsMapOf([["fontWeight", "bold"]]))], ["provider-list", padStyleMapOf(utsMapOf([["marginLeft", 32]]))], ["provider-item", padStyleMapOf(utsMapOf([["lineHeight", 1.5]]))], ["btn-get-provider", padStyleMapOf(utsMapOf([["marginTop", 30]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
