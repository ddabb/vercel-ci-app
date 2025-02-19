
  type Indicator = "number" | "default" | "none"
  type ItemType = {
    value : Indicator,
    name : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        imageList: ["https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png", "/static/uni.png"],
        indicator: [{
          value: "default",
          name: "圆点"
        }, {
          value: "number",
          name: "数字"
        }, {
          value: "none",
          name: "不显示"
        }] as ItemType[],
        currentIndicator: "default" as Indicator,




        isWeb: false,

        isLoop: true
      }
    },
    methods: {
      previewImage(index : number) {
        uni.previewImage({
          urls: this.imageList,
          current: index,
          indicator: this.currentIndicator,
          loop: this.isLoop
        })
      },
      chooseImage() {
        uni.chooseImage({
          sourceType: ['album'],
          success: (e) => {
            this.imageList = this.imageList.concat(e.tempFilePaths)
          },
          fail(_) {
          }
        })
      },
      onIndicatorChanged(e : UniRadioGroupChangeEvent) {
        this.currentIndicator = e.detail.value as Indicator
      },
      onCheckboxChange(_ : UniCheckboxGroupChangeEvent) {
        this.isLoop = !this.isLoop
      }
    }
  })

export default __sfc__
function GenPagesAPIPreviewImagePreviewImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_checkbox = resolveComponent("checkbox")
const _component_checkbox_group = resolveComponent("checkbox-group")

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"padding-left":"8px","padding-right":"8px"}))
    }), [
      createElementVNode("view", null, [
        createElementVNode("text", utsMapOf({ class: "text-desc" }), "图片指示器样式"),
        createVNode(_component_radio_group, utsMapOf({
          class: "cell-ct",
          style: normalizeStyle(utsMapOf({"background-color":"white"})),
          onChange: _ctx.onIndicatorChanged
        }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.indicator, (item, index, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                class: "indicator-it",
                key: item.value
              }), [
                createVNode(_component_radio, utsMapOf({
                  disabled: _ctx.isWeb,
                  checked: index == 0,
                  value: item.value
                }), utsMapOf({
                  default: withSlotCtx((): any[] => [toDisplayString(item.name)]),
                  _: 2 /* DYNAMIC */
                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["disabled", "checked", "value"])
              ])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["style", "onChange"])
      ]),
      createElementVNode("view", null, [
        createVNode(_component_checkbox_group, utsMapOf({
          onChange: _ctx.onCheckboxChange,
          style: normalizeStyle(utsMapOf({"margin-top":"16px","margin-bottom":"16px","margin-left":"8px"}))
        }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createVNode(_component_checkbox, utsMapOf({
              disabled: _ctx.isWeb,
              checked: _ctx.isLoop,
              style: normalizeStyle(utsMapOf({"margin-right":"15px"}))
            }), utsMapOf({
              default: withSlotCtx((): any[] => ["循环播放"]),
              _: 1 /* STABLE */
            }), 8 /* PROPS */, ["disabled", "checked", "style"])
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["onChange", "style"])
      ]),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"background-color":"white"}))
      }), [
        createElementVNode("text", utsMapOf({ class: "text-desc" }), "点击图片开始预览"),
        createElementVNode("view", utsMapOf({
          class: "cell-ct",
          style: normalizeStyle(utsMapOf({"margin":"8px"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.imageList, (image, index, __index, _cached): any => {
            return createElementVNode("view", utsMapOf({
              class: "cell cell-choose-image",
              key: index
            }), [
              createElementVNode("image", utsMapOf({
                style: normalizeStyle(utsMapOf({"width":"100px","height":"100px"})),
                mode: "aspectFit",
                src: image,
                onClick: () => {_ctx.previewImage(index)}
              }), null, 12 /* STYLE, PROPS */, ["src", "onClick"])
            ])
          }), 128 /* KEYED_FRAGMENT */),
          createElementVNode("image", utsMapOf({
            class: "cell cell-choose-image",
            src: "/static/plus.png",
            onClick: _ctx.chooseImage
          }), [
            createElementVNode("view")
          ], 8 /* PROPS */, ["onClick"])
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"8px"}))
      }), [
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"color":"black","font-size":"18px","margin-bottom":"4px"}))
        }), "注意事项:", 4 /* STYLE */),
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"font-size":"17px","margin-left":"4px","color":"darkgray"}))
        }), "1、indicator属性仅App平台支持。", 4 /* STYLE */),
        createElementVNode("text", utsMapOf({
          style: normalizeStyle(utsMapOf({"font-size":"17px","margin-left":"4px","color":"darkgray"}))
        }), "2、Web平台不支持loop属性。", 4 /* STYLE */)
      ], 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesAPIPreviewImagePreviewImageStyles = [utsMapOf([["text-desc", padStyleMapOf(utsMapOf([["marginTop", 16], ["marginLeft", 8], ["marginBottom", 16], ["fontWeight", "bold"]]))], ["cell-ct", padStyleMapOf(utsMapOf([["display", "flex"], ["flexWrap", "wrap"], ["flexDirection", "row"]]))], ["cell", padStyleMapOf(utsMapOf([["marginLeft", 3], ["marginRight", 3], ["width", 100], ["height", 100]]))], ["cell-choose-image", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#D3D3D3"]]))], ["indicator-it", padStyleMapOf(utsMapOf([["marginTop", 8], ["marginRight", 8], ["marginBottom", 8], ["marginLeft", 8]]))]])]
