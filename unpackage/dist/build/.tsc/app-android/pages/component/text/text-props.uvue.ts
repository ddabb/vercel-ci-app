
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'text-props',
        multiLineText:
          'HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言；HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言',
        singleLineText: 'uni-app x，终极跨平台方案',
        // 自动化测试
        autoTest: false,
        nestedText: '三级节点文本',
        emptyText: '空文本',
        heightText: '设置高度文本'
      }
    },
    methods: {
      // 自动化测试
      setNestedText() {
        this.nestedText = "修改三级节点文本";
      },
      setEmptyText() {
        this.emptyText = "";
      },
      setHeightText() {
        this.heightText = "修改设置高度文本";
      }
    }
  })

export default __sfc__
function GenPagesComponentTextTextPropsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "text相关属性示例")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "根据宽度自动折行")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", null, toDisplayString(_ctx.multiLineText), 1 /* TEXT */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "\\n换行")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", null, "\n 换行"),
        createElementVNode("text", null, "\\n 换行"),
        createElementVNode("text", null, "\\\n 换行"),
        createElementVNode("text", null, "\n 换行 \\n 换行 \\\n 换行 \\\\n 换行 \\\\\n 换行"),
        createElementVNode("text", utsMapOf({ space: "nbsp" }), "HBuilderX，轻巧、极速，极客编辑器;\nuni-app x，终极跨平台方案;")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "截断（clip）")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({
          class: "uni-flex-item",
          style: normalizeStyle(utsMapOf({"width":"100%","text-overflow":"clip","white-space":"nowrap"}))
        }), toDisplayString(_ctx.multiLineText), 5 /* TEXT, STYLE */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "截断（ellipsis）")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({
          class: "uni-flex-item",
          style: normalizeStyle(utsMapOf({"width":"100%","text-overflow":"ellipsis","white-space":"nowrap"}))
        }), toDisplayString(_ctx.multiLineText), 5 /* TEXT, STYLE */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "selectable")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({ selectable: true }), toDisplayString(_ctx.singleLineText), 1 /* TEXT */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "space"),
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "依次为nbsp ensp emsp效果")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({ space: "nbsp" }), toDisplayString(_ctx.singleLineText), 1 /* TEXT */),
        createElementVNode("text", utsMapOf({ space: "ensp" }), toDisplayString(_ctx.singleLineText), 1 /* TEXT */),
        createElementVNode("text", utsMapOf({ space: "emsp" }), toDisplayString(_ctx.singleLineText), 1 /* TEXT */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "decode"),
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "依次为lt gt amp apos nbsp ensp emsp效果")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({ decode: true }), "< > & '"),
        createElementVNode("text", utsMapOf({ decode: true }), "uni-app x，终极跨平台方案"),
        createElementVNode("text", utsMapOf({ decode: true }), "uni-app x，终极跨平台方案"),
        createElementVNode("text", utsMapOf({ decode: true }), "uni-app x，终极跨平台方案")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "嵌套1")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", null, [
          "一级节点黑色 ",
          createElementVNode("text", utsMapOf({
            style: normalizeStyle(utsMapOf({"color":"red","background-color":"yellow"}))
          }), [
            "二级节点红色且背景色黄色 ",
            createElementVNode("text", null, "App三级节点不继承二级的颜色")
          ], 4 /* STYLE */),
          createElementVNode("text", utsMapOf({
            style: normalizeStyle(utsMapOf({"font-size":"50px"}))
          }), "二级节点大字体", 4 /* STYLE */)
        ])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "嵌套2")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", null, [
          createElementVNode("text", null, "文字应居中显示")
        ])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "padding和border")
      ]),
      createElementVNode("view", utsMapOf({ class: "text-box" }), [
        createElementVNode("text", utsMapOf({ class: "text-padding-border" }), "hello uni-app x"),
        createElementVNode("text", utsMapOf({
          class: "text-padding-border",
          style: normalizeStyle(utsMapOf({"width":"200px"}))
        }), "hello uni-app x", 4 /* STYLE */),
        createElementVNode("text", utsMapOf({
          class: "text-padding-border",
          style: normalizeStyle(utsMapOf({"height":"100px"}))
        }), "hello uni-app x", 4 /* STYLE */),
        createElementVNode("text", utsMapOf({
          class: "text-padding-border",
          style: normalizeStyle(utsMapOf({"width":"200px","height":"100px"}))
        }), "hello uni-app x", 4 /* STYLE */)
      ]),
      isTrue(_ctx.autoTest)
        ? createElementVNode("view", utsMapOf({ key: 0 }), [
            createElementVNode("view", utsMapOf({ class: "uni-row" }), [
              createElementVNode("text", utsMapOf({ id: "empty-text" }))
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-row" }), [
              createElementVNode("text", utsMapOf({ id: "empty-text2" }), toDisplayString(_ctx.emptyText), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-row" }), [
              createElementVNode("text", utsMapOf({
                id: "empty-text3",
                style: normalizeStyle(utsMapOf({"width":"100px","height":"100px"}))
              }), toDisplayString(_ctx.emptyText), 5 /* TEXT, STYLE */)
            ]),
            createElementVNode("text", null, [
              "一级节点文本 ",
              createElementVNode("text", null, [
                "二级节点文本 ",
                createElementVNode("text", utsMapOf({ id: "nested-text" }), toDisplayString(_ctx.nestedText), 1 /* TEXT */)
              ])
            ]),
            createElementVNode("text", utsMapOf({
              id: "height-text",
              style: normalizeStyle(utsMapOf({"height":"50px"}))
            }), toDisplayString(_ctx.heightText), 5 /* TEXT, STYLE */)
          ])
        : createCommentVNode("v-if", true)
    ])
  ])
}
const GenPagesComponentTextTextPropsStyles = [utsMapOf([["text-box", padStyleMapOf(utsMapOf([["marginBottom", 20], ["paddingTop", 20], ["paddingRight", 0], ["paddingBottom", 20], ["paddingLeft", 0], ["backgroundColor", "#ffffff"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["text", padStyleMapOf(utsMapOf([["fontSize", 15], ["color", "#353535"], ["lineHeight", "27px"], ["textAlign", "center"]]))], ["text-padding-border", padStyleMapOf(utsMapOf([["marginTop", 5], ["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["borderWidth", 5], ["borderStyle", "solid"], ["borderColor", "#FF0000"], ["textAlign", "center"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
