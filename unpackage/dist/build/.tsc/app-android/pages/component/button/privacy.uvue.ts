
  import { openSchema } from '@/uni_modules/uts-openSchema'

  const __sfc__ = defineComponent({
    data() {
      return {
        number: 0,
        htmlString: '<span style="color:grey">欢迎使用Hello uni-app x，我们将通过<a href="https://hx.dcloud.net.cn/license" >《用户服务协议》</a></strong>及相关个人信息处理规则帮助你了解我们如何收集、处理个人信息。根据《常见类型移动互联网应用程序必要个人信息范围规定》。同意《基本功能数据处理规则》仅代表你同意使用浏览、搜索、下载等主要功能收集、处理相关必要个人信息及数据。此外，为了向你提供更多丰富、优质的服务，我们可能在你使用本产品的过程中提供电商购物、财经支付等扩展功能，如果你拒绝提供，你可能无法使用相应的扩展服务，但不影响你使用我们的基础服务。我们通过<a href="https://doc.dcloud.net.cn/markdown-share-docs/2e766f9cf1f8ca009c11875e447de5c8/">《隐私政策》</a></strong>帮助你全面了解我们的服务及收集、处理个人信息的详细情况。</span>'
      }
    },
    unmounted() {
      uni.offPrivacyAuthorizationChange(this.number)
    },
    onLoad() {
      this.number = uni.onPrivacyAuthorizationChange((callback) => {
        uni.showToast({
          title: 'isPrivacyAgree:' + !callback.needAuthorization
        })
      })
    },
    methods: {
      agree() {
        uni.closeDialogPage({
          dialogPage: this.$page
        })
      },
      reject() {
        uni.resetPrivacyAuthorization()
        uni.closeDialogPage({
          dialogPage: this.$page
        })
      },
      itemClick(e : RichTextItemClickEvent) {
        let ref = e.detail.href
        if (ref != null) {
          openSchema(ref)
        }
      },
    }
  })

export default __sfc__
function GenPagesComponentButtonPrivacyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "dialog-container" }), [
    createElementVNode("view", utsMapOf({ class: "dialog-content" }), [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"100%","justify-content":"center","align-items":"center","background-color":"#fff"}))
      }), [
        createElementVNode("image", utsMapOf({
          src: _imports_0,
          style: normalizeStyle(utsMapOf({"margin-top":"25px","width":"60px","height":"60px"}))
        }), null, 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"text-align":"center","padding-top":"20px","font-size":"20px","color":"black","background-color":"#fff"}))
      }), " 个人信息保护指引", 4 /* STYLE */),
      createElementVNode("scroll-view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex":"1","align-content":"center","padding-top":"10px","padding-left":"25px","padding-right":"25px","background-color":"#fff"})),
        "show-scrollbar": "false"
      }), [
        createElementVNode("rich-text", utsMapOf({
          style: normalizeStyle(utsMapOf({"font-size":"14px","color":"red"})),
          nodes: _ctx.htmlString,
          onItemclick: _ctx.itemClick
        }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["nodes", "onItemclick"])
      ], 4 /* STYLE */),
      createElementVNode("button", utsMapOf({
        class: "button",
        style: normalizeStyle(utsMapOf({"background-color":"#fff"})),
        onClick: _ctx.reject,
        "hover-class": "button-hover1"
      }), "不同意", 12 /* STYLE, PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        style: normalizeStyle(utsMapOf({"background-color":"royalblue"})),
        "hover-class": "button-hover2",
        "open-type": "agreePrivacyAuthorization",
        onClick: _ctx.agree
      }), "同意", 12 /* STYLE, PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesComponentButtonPrivacyStyles = [utsMapOf([["dialog-container", padStyleMapOf(utsMapOf([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", padStyleMapOf(utsMapOf([["height", "60%"], ["width", "80%"], ["borderRadius", 12]]))], ["button", padStyleMapOf(utsMapOf([["borderWidth", 0], ["borderStyle", "none"], ["borderColor", "#000000"], ["borderRadius", 0], ["fontSize", 15], ["color", "#D3D3D3"], ["textAlign", "center"], ["lineHeight", "40px"]]))], ["button-hover1", padStyleMapOf(utsMapOf([["color", "#000000"], ["backgroundColor", "#ffffff"]]))], ["button-hover2", padStyleMapOf(utsMapOf([["color", "#000000"], ["backgroundColor", "#4169E1"]]))]])]

import _imports_0 from '../image/logo.png'
