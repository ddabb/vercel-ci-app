
  const __sfc__ = defineComponent({
    data() {
      return {
        uniIcon1: '\ue100',
        uniIcon2: '\ue101',
        uniIcon3: '\ue102'
      }
    },
    onLoad() {
      uni.loadFontFace({
        global: true,
        family: 'UniFontFamily',
        source: "url('/static/font/uni.ttf')",
        success() {
          console.log('global loadFontFace uni.ttf success')
        },
        fail(error) {
          console.warn('global loadFontFace uni.ttf fail', error.errMsg)
        },
      })
      uni.loadFontFace({
        family: 'UniFontFamily2',
        source: "url(data:font/ttf;charset=utf-8;base64,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)",
        success() {
          console.log('loadFontFace uni.ttf(base64 format) success')
        },
        fail(error) {
          console.warn('loadFontFace uni.ttf(base64 format) fail', error.errMsg)
        },
      })
      uni.loadFontFace({
        family: 'AlimamaDaoLiTiTTF',
        source:
          "url('https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/font/AlimamaDaoLiTi.ttf')",
        success() {
          console.log('loadFontFace Remote AlimamaDaoLiTi.ttf success')
        },
        fail(error) {
          console.warn('loadFontFace Remote AlimamaDaoLiTi.ttf fail', error.errMsg)
        },
      })
      uni.loadFontFace({
        family: 'AlimamaDaoLiTiOTF',
        source: "url('/static/font/AlimamaDaoLiTi.otf')",
        success() {
          console.log('loadFontFace AlimamaDaoLiTi.otf success')
        },
        fail(error) {
          console.warn('loadFontFace AlimamaDaoLiTi.otf fail', error.errMsg)
        },
      })
      uni.loadFontFace({
        family: 'AlimamaDaoLiTiWOFF',
        source: "url('/static/font/AlimamaDaoLiTi.woff')",
        success() {
          console.log('loadFontFace AlimamaDaoLiTi.woff success')
        },
        fail(error) {
          console.warn('loadFontFace AlimamaDaoLiTi.woff fail', error.errMsg)
        },
      })
      uni.loadFontFace({
        family: 'AlimamaDaoLiTiWOFF2',
        source: "url('/static/font/AlimamaDaoLiTi.woff2')",
        success() {
          console.log('loadFontFace AlimamaDaoLiTi.woff2 success')
        },
        fail(error) {
          console.warn('loadFontFace AlimamaDaoLiTi.woff2 fail', error.errMsg)
        },
      })
    },
    methods: {
      navigateToChild() {
        uni.navigateTo({
          url: '/pages/API/load-font-face/load-font-face-child',
        })
      },
    },
  })

export default __sfc__
function GenPagesAPILoadFontFaceLoadFontFaceRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "loadFontFace" })),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("text", utsMapOf({ class: "font-size-20" }), "全局加载字体："),
      createElementVNode("text", utsMapOf({
        class: "font-size-20 line-height-40",
        style: normalizeStyle(utsMapOf({"font-family":"UniFontFamily"}))
      }), "font-family: uni.ttf", 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex-direction":"row"}))
      }), [
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"font-family":"UniFontFamily"}))
        }), toDisplayString(_ctx.uniIcon1), 5 /* TEXT, STYLE */),
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin-left":"5px","margin-right":"20px","line-height":"22px"}))
        }), "\\ue100", 4 /* STYLE */),
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"font-family":"UniFontFamily"}))
        }), toDisplayString(_ctx.uniIcon2), 5 /* TEXT, STYLE */),
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin-left":"5px","line-height":"22px"}))
        }), "\\ue101", 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("text", utsMapOf({ class: "uni-common-mt font-size-20" }), "非全局加载字体："),
      createElementVNode("text", utsMapOf({ class: "font-size-20 line-height-40" }), "font-family: uni.ttf(base64格式)"),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex-direction":"row"}))
      }), [
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"font-family":"UniFontFamily2"}))
        }), toDisplayString(_ctx.uniIcon3), 5 /* TEXT, STYLE */),
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin-left":"5px","margin-right":"20px","line-height":"22px"}))
        }), "\\ue102", 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        class: "font-size-20 line-height-40",
        style: normalizeStyle(utsMapOf({"font-family":"AlimamaDaoLiTiTTF"}))
      }), "font-family: 阿里妈妈刀隶体-ttf (网络字体下载后生效)", 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        class: "font-size-20 line-height-40",
        style: normalizeStyle(utsMapOf({"font-family":"AlimamaDaoLiTiOTF"}))
      }), "font-family: 阿里妈妈刀隶体-otf", 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        class: "item",
        style: normalizeStyle(utsMapOf({"font-family":"AlimamaDaoLiTiWOFF"}))
      }), "font-family: 阿里妈妈刀隶体-woff", 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        class: "item",
        style: normalizeStyle(utsMapOf({"font-family":"AlimamaDaoLiTiWOFF2"}))
      }), "font-family: 阿里妈妈刀隶体-woff2", 4 /* STYLE */),
      createElementVNode("button", utsMapOf({
        class: "uni-btn",
        onClick: _ctx.navigateToChild
      }), "跳转子页面测试字体生效范围", 8 /* PROPS */, ["onClick"])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPILoadFontFaceLoadFontFaceStyles = [utsMapOf([["font-size-20", padStyleMapOf(utsMapOf([["fontSize", 20]]))], ["line-height-40", padStyleMapOf(utsMapOf([["lineHeight", "40px"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
