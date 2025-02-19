
  const __sfc__ = defineComponent({
    data() {
      return {
        btnText: "",
        btnType: "primary",
        btnDisable: false,
        interstitialAd: null as InterstitialAd | null,
        isAdLoadSuccess: false
      }
    },
    onReady() {
      this.loadAd()
    },
    methods: {
      loadAd() {
        if (this.btnDisable)
          return
        this.btnDisable = true
        this.btnText = "正在加载广告"
        this.btnType = "primary"
        if (this.interstitialAd == null) {
          this.interstitialAd = uni.createInterstitialAd({
            adpid: "1111111113" //此处为测试广告位，实际开发中请在uni-ad后台申请自己的广告位后替换
          })
          this.interstitialAd!.onError((_) => {
            this.btnType = "warn"
            this.btnText = "广告加载失败，点击重试"
            this.btnDisable = false
          })
          this.interstitialAd!.onLoad((_) => {
            this.btnType = "primary"
            this.btnText = "广告加载成功，点击观看"
            this.btnDisable = false
            this.isAdLoadSuccess = true
          })
          this.interstitialAd!.onClose((_) => {
            this.isAdLoadSuccess = false
            this.loadAd()
          })
        }
        this.interstitialAd!.load()
      },
      showAd() {
        if (this.isAdLoadSuccess) {
          this.interstitialAd!.show()
        } else {
          this.loadAd()
        }
      }
    }
  })

export default __sfc__
function GenPagesAPICreateInterstitialAdCreateInterstitialAdRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "插屏广告" })),
    createElementVNode("button", utsMapOf({
      type: _ctx.btnType,
      style: normalizeStyle(utsMapOf({"margin":"10px"})),
      disabled: _ctx.btnDisable,
      onClick: () => {_ctx.showAd()}
    }), toDisplayString(_ctx.btnText), 13 /* TEXT, STYLE, PROPS */, ["type", "disabled", "onClick"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPICreateInterstitialAdCreateInterstitialAdStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
