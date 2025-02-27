
  import { setDevicePixelRatio } from '@/store/index.uts'

  type Item = {
    label : string,
    value : string,
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'getDeviceInfo',
        items: [] as Item[],
      }
    },
    onUnload: function () {
    },
    methods: {
      getDeviceInfo: function () {
        const res = uni.getDeviceInfo();
        // 获取像素比, 供截图对比使用
        setDevicePixelRatio(res.devicePixelRatio !== null ? res.devicePixelRatio! : 1)
        this.items = [] as Item[];

        const res_str = JSON.stringify(res);
        const res_obj = JSON.parseObject(res_str);
        const res_map = res_obj!.toMap();
        let keys = [] as string[]
        res_map.forEach((_, key) => {
          keys.push(key);
        });
        keys.sort().forEach(key => {
          const value = res[key];
          if (value != null) {
            const item = {
              label: key,
              value: "" + ((typeof value == "object") ? JSON.stringify(value) : value)
            } as Item;
            this.items.push(item);
          }
        });
      }
    }
  })

export default __sfc__
function GenPagesAPIGetDeviceInfoGetDeviceInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list" }), [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, _, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                class: "uni-list-cell",
                style: normalizeStyle(utsMapOf({"align-items":"center"}))
              }), [
                createElementVNode("view", utsMapOf({ class: "uni-pd" }), [
                  createElementVNode("view", utsMapOf({
                    class: "uni-label",
                    style: normalizeStyle(utsMapOf({"width":"180px"}))
                  }), toDisplayString(item.label), 5 /* TEXT, STYLE */)
                ]),
                createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
                  createElementVNode("text", utsMapOf({ class: "uni-list-cell-db-text" }), toDisplayString(item.value == "" ? "未获取" : item.value), 1 /* TEXT */)
                ])
              ], 4 /* STYLE */)
            }), 256 /* UNKEYED_FRAGMENT */)
          ])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: _ctx.getDeviceInfo
            }), "获取设备信息", 8 /* PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ])
}
const GenPagesAPIGetDeviceInfoGetDeviceInfoStyles = [utsMapOf([["uni-pd", padStyleMapOf(utsMapOf([["paddingLeft", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
