
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image',
        imageSrc: "/static/test-image/logo.png" as string.ImageURIString,
        loadError: false,
        // 自动化测试
        autoTest: false,
        setCookieImage: "",
        verifyCookieImage: "",
        eventLoad: null as UTSJSONObject | null,
        eventError: null as UTSJSONObject | null
      }
    },
    methods: {
      error(event : ImageErrorEvent) {
        this.loadError = true
        console.log(event.type, event.detail);
        if (this.autoTest) {
          this.eventError = {
            "tagName": event.target?.tagName,
            "type": event.type,
            // "errMsg": event.detail.errMsg
          };
        }
      },
      load(event : ImageLoadEvent) {
        console.log(event.type, event.detail);
        if (this.autoTest) {
          this.eventLoad = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "width": event.detail.width,
            "height": event.detail.height
          };
        }
      },
      imageFormat() {
        uni.navigateTo({
          url: '/pages/component/image/image-format'
        });
      },
      imageMode() {
        uni.navigateTo({
          url: '/pages/component/image/image-mode'
        });
      },
      imagePath() {
        uni.navigateTo({
          url: '/pages/component/image/image-path'
        });
      },
      imageLarge() {
        uni.navigateTo({
          url: '/pages/component/image/image-large'
        });
      }
    }
  })

export default __sfc__
function GenPagesComponentImageImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({
        class: "uni-center",
        style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
      }), [
        createElementVNode("image", utsMapOf({
          class: "image",
          "fade-show": true,
          mode: "widthFix",
          src: _ctx.imageSrc,
          onError: _ctx.error,
          onLoad: _ctx.load
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onError", "onLoad"])
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.imageFormat
        }), "图片格式示例", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.imageMode
        }), "图片缩放模式示例", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.imagePath
        }), "图片路径示例", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.imageLarge
        }), "大图示例", 8 /* PROPS */, ["onClick"])
      ])
    ]),
    isTrue(_ctx.autoTest)
      ? createElementVNode("view", utsMapOf({ key: 0 }), [
          createElementVNode("image", utsMapOf({ src: _ctx.setCookieImage }), null, 8 /* PROPS */, ["src"]),
          createElementVNode("image", utsMapOf({
            src: _ctx.verifyCookieImage,
            onError: _ctx.error
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onError"])
        ])
      : createCommentVNode("v-if", true)
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageStyles = [utsMapOf([["image", padStyleMapOf(utsMapOf([["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"], ["width", 100]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
