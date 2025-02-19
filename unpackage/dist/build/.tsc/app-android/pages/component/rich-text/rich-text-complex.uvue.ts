
  const __sfc__ = defineComponent({
    data() {
      return {
        imageClicked: false,
        fViewClicked: false,
        selfClicked: false,
        htmlString: '<p><a href="https://www.dcloud.io/hbuilderx.html">HBuilderX</a><br/><img src="https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png"></img><h1>HBuilderX，轻巧、极速，极客编辑器</h1><p style="color:red;"><small>HBuilderX，轻巧、极速，极客编辑器 </small><big>HBuilderX，轻巧、极速，极客编辑器</big><strong>HBuilderX，轻巧、极速，极客编辑器</strong><i>HBuilderX，轻巧、极速，极客编辑器 </i><u>HBuilderX，轻巧、极速，极客编辑器</u><del>HBuilderX，轻巧、极速，极客编辑器</del></p><h2>uni-app x，终极跨平台方案</h2>、<p style="background-color: yellow;"><small>uni-app x，终极跨平台方案 </small><big>uni-app x，终极跨平台方案</big><strong>uni-appx，终极跨平台方案 </strong><i>uni-app x，终极跨平台方案 </i><u>uni-app x，终极跨平台方案 </u><del>uni-appx，终极跨平台方案</del></p><h3>uniCloud，js serverless云服务</h3><p style="text-decoration: line-through;"><small>uniCloud，js serverless云服务 </small><big>uniCloud，jsserverless云服务</big><strong>uniCloud，js serverless云服务 </strong><i>uniCloud，js serverless云服务 </i><u>uniCloud，jsserverless云服务</u><del>uniCloud，js serverless云服务</del></p><h4>uts，大一统语言</h4><p style="text-align: center;"><small>uts，大一统语言 </small><big>uts，大一统语言 </big><strong>uts，大一统语言</strong><i>uts，大一统语言</i><u>uts，大一统语言 </u><del>uts，大一统语言</del></p><h5>uniMPSdk，让你的App具备小程序能力</h5><h6>uni-admin，开源、现成的全端管理后台</h6><ul><li style="color: red; text-align: left;">uni-app x，终极跨平台方案</li><li style="color: green; text-align: center;">uni-app x，终极跨平台方案</li><li style="color: blue; text-align: right;">uni-app x，终极跨平台方案</li></ul><a href="https://uniapp.dcloud.net.cn">uni-app</a><br/><img src="https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png"></img></p>'
      }
    },
    methods: {
      itemClick(e : RichTextItemClickEvent) {
        console.log(JSON.stringify(e.detail));
        let clicktext = '';
        if (e.detail.src != null) {
          clicktext = '点击了图片，src = ' + e.detail.src;
          this.imageClicked = true
        } else if (e.detail.href != null) {
          clicktext = '点击了链接，href = ' + e.detail.href;
        }
        uni.showModal({
          content: clicktext,
          showCancel: false
        });
      },
      fViewClick(e : string) {
        console.log(e)
        this.fViewClicked = true
      },
      selfClick(e : string) {
        console.log(e)
        this.selfClicked = true
      }
    }
  })

export default __sfc__
function GenPagesComponentRichTextRichTextComplexRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: "rich-text-complex" })),
      createElementVNode("view", utsMapOf({
        class: "uni-padding-wrap uni-common-mt",
        onClick: () => {_ctx.fViewClick('触发父 view click 事件')}
      }), [
        createElementVNode("rich-text", utsMapOf({
          nodes: _ctx.htmlString,
          selectable: true,
          onItemclick: _ctx.itemClick,
          onClick: () => {_ctx.selfClick('触发 richtext click 事件')}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["nodes", "onItemclick", "onClick"])
      ], 8 /* PROPS */, ["onClick"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentRichTextRichTextComplexStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
