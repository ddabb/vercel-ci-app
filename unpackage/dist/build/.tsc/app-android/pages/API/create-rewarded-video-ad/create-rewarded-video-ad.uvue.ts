
  const __sfc__ = defineComponent({
    data() {
      return {
        btnText: "",
        btnType: "primary",
        btnDisable: false,
        rewardAd: null as RewardedVideoAd | null,
        isAdLoadSuccess: false
      }
    },
    onReady() {
      this.loadAd()
    },
    onHide() {
      console.log("Page Hide");
    },
    methods: {
      loadAd() {
        if (this.btnDisable)
          return
        this.btnDisable = true
        this.btnText = "正在加载广告"
        this.btnType = "primary"
        if (this.rewardAd == null) {
          this.rewardAd = uni.createRewardedVideoAd({
            adpid: "1507000689" //此处为测试广告位，实际开发中请在uni-ad后台申请自己的广告位后替换
          })
          this.rewardAd!.onError((_) => {
            this.btnType = "warn"
            this.btnText = "广告加载失败，点击重试"
            this.btnDisable = false
          })
          this.rewardAd!.onLoad((_) => {
            this.btnType = "primary"
            this.btnText = "广告加载成功，点击观看"
            this.btnDisable = false
            this.isAdLoadSuccess = true
          })
          this.rewardAd!.onClose((e) => {
            // 测试广告位无法通过服务器回调。实际开发中，使用自己的广告位后，需参考uni-ad文档编写服务器回调的代码，在服务端发放奖励
            this.isAdLoadSuccess = false
            uni.showToast({
              title: "激励视频" + (e.isEnded ? "" : "未") + "播放完毕",
              position: "bottom"
            })
            this.loadAd()
          })
        }
        this.rewardAd!.load()
      },
      showAd() {
        if (this.isAdLoadSuccess) {
          this.rewardAd!.show()
        } else {
          this.loadAd()
        }
      }
    }
  })

export default __sfc__
function GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "激励视频广告" })),
    createElementVNode("button", utsMapOf({
      type: _ctx.btnType,
      style: normalizeStyle(utsMapOf({"margin":"10px"})),
      disabled: _ctx.btnDisable,
      onClick: () => {_ctx.showAd()}
    }), toDisplayString(_ctx.btnText), 13 /* TEXT, STYLE, PROPS */, ["type", "disabled", "onClick"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
