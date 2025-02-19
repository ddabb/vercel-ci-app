
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image-mode',
        data: [
          {
            mode: 'scaleToFill',
            description: '不保持纵横比缩放图片，使图片的宽高完全拉伸至填满 image 元素'
          },
          {
            mode: 'aspectFit',
            description: '保持纵横比缩放图片，使图片的长边能完全显示出来。也就是说，可以完整地将图片显示出来'
          },
          {
            mode: 'aspectFill',
            description: '保持纵横比缩放图片，只保证图片的短边能完全显示出来。也就是说，图片通常只在水平或垂直方向是完整的，另一个方向将会发生截取'
          },
          {
            mode: 'top',
            description: '不缩放图片，只显示图片的顶部区域'
          },
          {
            mode: 'bottom',
            description: '不缩放图片，只显示图片的底部区域'
          },
          {
            mode: 'center',
            description: '不缩放图片，只显示图片的中间区域'
          },
          {
            mode: 'left',
            description: '不缩放图片，只显示图片的左边区域'
          },
          {
            mode: 'right',
            description: '不缩放图片，只显示图片的右边区域'
          },
          {
            mode: 'top left',
            description: '不缩放图片，只显示图片的左上边区域'
          },
          {
            mode: 'top right',
            description: '不缩放图片，只显示图片的右上边区域'
          },
          {
            mode: 'bottom left',
            description: '不缩放图片，只显示图片的左下边区域'
          },
          {
            mode: 'bottom right',
            description: '不缩放图片，只显示图片的右下边区域'
          },
          {
            mode: 'widthFix',
            description: '宽度不变，高度自动变化，保持原图宽高比不变'
          },
          {
            mode: 'heightFix',
            description: '高度不变，宽度自动变化，保持原图宽高比不变'
          }
        ] as Array<ImageMode>
      }
    }
  })

  type ImageMode = {
    mode : string
    description : string
  }

export default __sfc__
function GenPagesComponentImageImageModeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "支持的图片缩放模式示例")
      ]),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.data, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({ key: index }), [
          createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), toDisplayString(item.mode) + ": " + toDisplayString(item.description), 1 /* TEXT */),
          createElementVNode("view", utsMapOf({
            class: "uni-center",
            style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
          }), [
            createElementVNode("image", utsMapOf({
              class: "image",
              mode: item.mode,
              src: "/static/shuijiao.jpg"
            }), null, 8 /* PROPS */, ["mode"])
          ], 4 /* STYLE */)
        ])
      }), 128 /* KEYED_FRAGMENT */),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "其他示例")
      ]),
      createElementVNode("view", null, [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "同时设置mode和圆角"),
        createElementVNode("view", utsMapOf({
          class: "uni-center",
          style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
        }), [
          createElementVNode("image", utsMapOf({
            class: "image radius",
            mode: "heightFix",
            src: "/static/shuijiao.jpg"
          }))
        ], 4 /* STYLE */)
      ]),
      createElementVNode("view", null, [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "设置图片width='100%'与mode='widthFix'"),
        createElementVNode("view", utsMapOf({
          class: "uni-center",
          style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
        }), [
          createElementVNode("view", utsMapOf({
            class: "uni-center",
            style: normalizeStyle(utsMapOf({"background-color":"red","width":"150px","margin":"20px"}))
          }), [
            createElementVNode("image", utsMapOf({
              style: normalizeStyle(utsMapOf({"width":"100%"})),
              mode: "widthFix",
              src: "/static/shuijiao.jpg"
            }), null, 4 /* STYLE */)
          ], 4 /* STYLE */)
        ], 4 /* STYLE */)
      ]),
      createElementVNode("view", null, [
        createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "image默认mode"),
        createElementVNode("view", utsMapOf({
          class: "uni-center",
          style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
        }), [
          createElementVNode("view", utsMapOf({
            class: "uni-center",
            style: normalizeStyle(utsMapOf({"margin":"20px"}))
          }), [
            createElementVNode("image", utsMapOf({
              style: normalizeStyle(utsMapOf({"width":"100px","height":"100px"})),
              src: "/static/logo.png"
            }), null, 4 /* STYLE */)
          ], 4 /* STYLE */)
        ], 4 /* STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageModeStyles = [utsMapOf([["image", padStyleMapOf(utsMapOf([["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"], ["width", 100], ["height", 100], ["backgroundColor", "#eeeeee"]]))], ["radius", padStyleMapOf(utsMapOf([["borderRadius", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
