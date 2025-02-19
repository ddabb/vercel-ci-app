
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image-format',
        supportFormats: [
          {
            format: 'bmp',
            src: '/static/test-image/logo.bmp'
          },
          {
            format: 'gif',
            src: '/static/test-image/logo.gif'
          },
          {
            format: 'ico',
            src: '/static/test-image/logo.ico'
          },
          {
            format: 'jpg',
            src: '/static/test-image/logo.jpg'
          },
          {
            format: 'png',
            src: '/static/test-image/logo.png'
          },
          {
            format: 'webp',
            src: '/static/test-image/logo.webp'
          },
          {
            format: 'heic（App-Android10+支持）',
            src: '/static/test-image/logo.heic'
          },
          {
            format: 'avif（仅部分浏览器支持）',
            src: '/static/test-image/logo.avif'
          },
          {
            format: 'tif（仅部分浏览器支持）',
            src: '/static/test-image/logo.tif'
          }
        ] as Array<ImageFormat>
        /* notSupportFormats: [
          {
            format: 'avif',
            src: '/static/test-image/logo.avif'
          },
          {
            format: 'tif',
            src: '/static/test-image/logo.tif'
          }
        ] as Array<ImageFormat> */
      }
    },
    methods: {
      imageErrorEvent(index : number, e : ImageErrorEvent) {
        console.log("图片加载错误", e.detail);
        // 图片加载失败，加载本地占位图
        this.supportFormats[index].errorImage = '/static/template/drop-card/dislike.png'
      }
    },
  })

  type ImageFormat = {
    format : string
    src : string.ImageURIString
    errorImage ?: string.ImageURIString | null
  }

export default __sfc__
function GenPagesComponentImageImageFormatRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.supportFormats, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({ key: index }), [
          createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), toDisplayString(item.format), 1 /* TEXT */),
          createElementVNode("view", utsMapOf({
            class: "uni-center",
            style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
          }), [
            createElementVNode("image", utsMapOf({
              class: "image",
              mode: "widthFix",
              src: item.errorImage == null ? item.src : item.errorImage,
              onError: ($event: any) => {_ctx.imageErrorEvent(index, $event as ImageErrorEvent)}
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onError"])
          ], 4 /* STYLE */)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageFormatStyles = [utsMapOf([["image", padStyleMapOf(utsMapOf([["marginTop", 40], ["marginRight", "auto"], ["marginBottom", 40], ["marginLeft", "auto"], ["width", 100]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
