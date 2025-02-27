
  type Item = {
    label : string,
    value : string,
  }

  let globalScreenHeight = 0
  try {
    globalScreenHeight = uni.getWindowInfo().screenHeight
  } catch (e) {
    // 兼容本地测试
    console.error(e)
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'getSystemInfo',
        items: [] as Item[],
        screenHeightAtReady: 0,
        jest_result: false,
      }
    },
    onUnload: function () {
    },
    onReady() {
      this.screenHeightAtReady = uni.getSystemInfoSync().screenHeight
      console.log(`全局获取屏幕高度: ${globalScreenHeight}  onReady内获取屏幕高度: ${this.screenHeightAtReady}`);
    },
    methods: {
      getSystemInfo: function () {
        uni.getSystemInfo({
          success: (res) => {
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
          },
        })
      },
      getSystemInfoSync: function () {
        this.items = [] as Item[];
        const res = uni.getSystemInfoSync()
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
      },
      //自动化测试例专用
      jest_getSystemInfo() : GetSystemInfoResult {
        return uni.getSystemInfoSync();
      },
      jest_getScreenHeight_at_different_stages() {
        this.jest_result = (globalScreenHeight == this.screenHeightAtReady)
      }
    }
  })

export default __sfc__
function GenPagesAPIGetSystemInfoGetSystemInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
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
                createElementVNode("text", utsMapOf({ class: "uni-list-cell-db-text" }), toDisplayString(item.value == '' ? '未获取' : item.value), 1 /* TEXT */)
              ])
            ], 4 /* STYLE */)
          }), 256 /* UNKEYED_FRAGMENT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: _ctx.getSystemInfoSync
            }), " 同步获取设备系统信息 ", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: _ctx.getSystemInfo,
              style: normalizeStyle(utsMapOf({"margin-top":"20px"}))
            }), " 异步获取设备系统信息 ", 12 /* STYLE, PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIGetSystemInfoGetSystemInfoStyles = [utsMapOf([["uni-pd", padStyleMapOf(utsMapOf([["paddingLeft", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
