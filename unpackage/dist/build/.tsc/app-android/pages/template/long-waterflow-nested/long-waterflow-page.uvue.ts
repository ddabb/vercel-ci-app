
  const SERVER_URL = "https://unidemo.dcloud.net.cn/plugin/uniappx-plugin-list"
  const PAGE_SIZE = 10; // 最大值 10

  type flowItem = {
    plugin_id : number,
    plugin_img_link : string,
    plugin_name : string,
    plugin_intro : string,
    score : number,
    tags : Array<string>,
    update_date : string,
    author_name : string,
  }

  type ResponseDataType = {
    code : number,
    data : flowItem[]
  }

  const __sfc__ = defineComponent({
    props: {
      type: {
        type: String,
        default: ''
      },
      preload: {
        type: Boolean,
        default: false
      },
      id: {
        type: String,
        default: ''
      }
    },
    data() {
      return {
        loading: false,
        datagrid: [] as flowItem[],
        isEnded: false,
        loadingError: '',
        currentPage: 1
      }
    },
    computed: {
      loadingText() : string {
        if (this.loading) {
          return "加载中..."
        } else if (this.isEnded) {
          return "没有更多了"
        } else if (this.loadingError.length > 0) {
          return this.loadingError
        } else {
          return ""
        }
      }
    },
    created() {
      if (this.preload) {
        this.loadData(null)
      }
    },
    methods: {
      refreshData(loadComplete : (() => void) | null) {
        this.datagrid.length = 0
        this.currentPage = 1
        this.loadData(loadComplete)
      },
      loadData(loadComplete : (() => void) | null) {
        if (this.loading || this.isEnded) {
          return
        }
        this.loading = true

        uni.request<ResponseDataType>({
          url: SERVER_URL,
          data: {
            type: this.type,
            page: this.currentPage,
            page_size: PAGE_SIZE
          },
          success: (res) => {
            const responseData = res.data
            if (responseData == null) {
              return
            }

            this.datagrid.push(...responseData.data)

            if (responseData.data.length == 0) {
              this.isEnded = true
            } else {
              this.currentPage++
            }
          },
          fail: (err) => {
            this.loadingError = err.errMsg
          },
          complete: () => {
            this.loading = false
            if (loadComplete != null) {
              loadComplete()
            }
          }
        })
      },
      // score 0 ~ 50
      convertToStarUnicode(score : number) : string {
        const fill_code = '\ue879'
        const half_code = '\ue87a'
        const null_code = '\ue87b'

        const fillStarCount = parseInt(score / 10 % 10 + '')
        const halfStarCount = score % 10 >= 5 ? 1 : 0
        const nullStarCount = 5 - fillStarCount - halfStarCount

        let result = ''
        if (fillStarCount > 0) { result += fill_code.repeat(fillStarCount) }
        if (halfStarCount > 0) { result += half_code.repeat(halfStarCount) }
        if (nullStarCount > 0) { result += null_code.repeat(nullStarCount) }

        return result
      }
    }
  })

export default __sfc__
function GenPagesTemplateLongWaterflowNestedLongWaterflowPageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_loading = resolveEasyComponent("uni-loading",_easycom_uni_loading)

  return createElementVNode("waterflow", utsMapOf({
    id: _ctx.id,
    class: "grid",
    rebound: false,
    "scroll-y": true,
    "custom-nested-scroll": true,
    "main-axis-gap": "8px",
    "cross-axis-gap": "8px",
    "cross-axis-count": "2",
    onScrolltolower: () => {_ctx.loadData(null)},
    "associative-container": "nested-scroll-view"
  }), [
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.datagrid, (item, _, __index, _cached): any => {
      return createElementVNode("flow-item", utsMapOf({
        class: "flow-item",
        key: item.plugin_id,
        type: "1"
      }), [
        createElementVNode("view", utsMapOf({ class: "flow-item-icon" }), [
          createElementVNode("image", utsMapOf({
            class: "flow-item-icon-image",
            src: item.plugin_img_link,
            mode: "aspectFit"
          }), null, 8 /* PROPS */, ["src"])
        ]),
        createElementVNode("view", utsMapOf({ class: "flow-item-fill" }), [
          createElementVNode("view", utsMapOf({ class: "flex-row" }), [
            createElementVNode("text", utsMapOf({ class: "title" }), toDisplayString(item.plugin_name), 1 /* TEXT */)
          ]),
          createElementVNode("view", null, [
            createElementVNode("text", utsMapOf({ class: "description-text" }), toDisplayString(item.plugin_intro), 1 /* TEXT */)
          ]),
          createElementVNode("text", utsMapOf({ class: "icon-star" }), toDisplayString(_ctx.convertToStarUnicode(item.score)), 1 /* TEXT */),
          createElementVNode("view", utsMapOf({ class: "tag-grid" }), [
            createElementVNode(Fragment, null, RenderHelpers.renderList(item.tags.slice(0,1), (item2, index2, __index, _cached): any => {
              return createElementVNode("text", utsMapOf({
                class: "tag-item",
                key: index2
              }), toDisplayString(item2), 1 /* TEXT */)
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          createElementVNode("view", utsMapOf({ class: "flex-row update-date" }), [
            createElementVNode("text", utsMapOf({ class: "author" }), toDisplayString(item.author_name), 1 /* TEXT */)
          ]),
          createElementVNode("view", utsMapOf({ class: "flex-row update-date" }), [
            createElementVNode("text", utsMapOf({ class: "update-date-text" }), "更新日期"),
            createElementVNode("text", utsMapOf({ class: "update-date-value" }), toDisplayString(item.update_date), 1 /* TEXT */)
          ])
        ])
      ])
    }), 128 /* KEYED_FRAGMENT */),
    createElementVNode("flow-item", utsMapOf({
      slot: "load-more",
      class: "loading",
      type: "6"
    }), [
      createVNode(_component_uni_loading, utsMapOf({
        loading: _ctx.loading,
        color: "#999",
        text: _ctx.loadingText
      }), null, 8 /* PROPS */, ["loading", "text"])
    ])
  ], 40 /* PROPS, NEED_HYDRATION */, ["id", "onScrolltolower"])
}
const GenPagesTemplateLongWaterflowNestedLongWaterflowPageStyles = [utsMapOf([["grid", padStyleMapOf(utsMapOf([["flex", 1], ["backgroundColor", "#f7f7f7"]]))], ["flow-item", padStyleMapOf(utsMapOf([["flexDirection", "column"], ["borderRadius", 5], ["backgroundColor", "#ffffff"]]))], ["flow-item-icon", padStyleMapOf(utsMapOf([["position", "relative"]]))], ["flow-item-icon-image", padStyleMapOf(utsMapOf([["width", "100%"]]))], ["flow-item-fill", padStyleMapOf(utsMapOf([["flex", 1], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5]]))], ["description-text", padStyleMapOf(utsMapOf([["fontSize", 13], ["color", "#666666"], ["lineHeight", "19px"]]))], ["icon-star", padStyleMapOf(utsMapOf([["fontFamily", "UtsStarIcons"], ["fontSize", 16], ["fontStyle", "normal"], ["color", "#ffca3e"], ["letterSpacing", 3]]))], ["tag-grid", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["marginTop", 5]]))], ["tag-item", padStyleMapOf(utsMapOf([["fontSize", 12], ["backgroundColor", "#EFF9F0"], ["color", "#639069"], ["borderRadius", 20], ["marginRight", 5], ["paddingTop", 2], ["paddingRight", 5], ["paddingBottom", 2], ["paddingLeft", 5]]))], ["update-date", padStyleMapOf(utsMapOf([["marginTop", 10]]))], ["update-date-text", padStyleMapOf(utsMapOf([["fontSize", 12], ["color", "#888888"]]))], ["update-date-value", padStyleMapOf(utsMapOf([["fontSize", 12], ["color", "#777777"], ["marginLeft", 5]]))], ["author", padStyleMapOf(utsMapOf([["fontSize", 12], ["color", "#008000"]]))], ["loading", padStyleMapOf(utsMapOf([["paddingTop", 30], ["paddingRight", 30], ["paddingBottom", 30], ["paddingLeft", 30], ["alignItems", "center"], ["height", 80]]))], ["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["@FONT-FACE", utsMapOf([["0", utsMapOf([["fontFamily", "UtsStarIcons"], ["src", "url('/static/fonts/icon-star.ttf')"]])]])]])]

import _easycom_uni_loading from '@/uni_modules/uni-loading/components/uni-loading/uni-loading.uvue'
