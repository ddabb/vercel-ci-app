
  var sourceTypeArray = [
    ['camera'],
    ['album'],
    ['camera', 'album']
  ]
  var sizeTypeArray = [
    ['compressed'],
    ['original'],
    ['compressed', 'original']
  ]
  var orientationTypeArray = [
    'portrait',
    'landscape',
    'auto'
  ]
  var albumModeTypeArray = [
    "custom",
    "system"
  ]
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'chooseImage',
        imageList: [] as Array<string>,
        sourceTypeIndex: 2,
        sourceType: ['拍照', '相册', '拍照或相册'],
        sizeTypeIndex: 2,
        sizeType: ['压缩', '原图', '压缩或原图'],
        orientationTypeIndex: 0,
        orientationType: ['竖屏', '横屏', '自动'],
        albumModeTypeIndex:0,
        albumModeType:["自定义相册","系统相册"],
        countIndex: 8,
        count: [1, 2, 3, 4, 5, 6, 7, 8, 9],
        isCrop: false,
        cropPercent: 80,
        cropWidth: 100,
        cropHeight: 100,
        cropResize: false
      }
    },
    onHide() {
      console.log("Page Hide");
    },
    onUnload() {
      this.imageList = [];
      this.sourceTypeIndex = 2
      this.sourceType = ['拍照', '相册', '拍照或相册']
      this.sizeTypeIndex = 2
      this.sizeType = ['压缩', '原图', '压缩或原图']
      this.countIndex = 8
      this.orientationTypeIndex = 0
      this.orientationType = ['竖屏', '横屏', '自动']
    },
    methods: {
      cropHeightConfim(e : InputConfirmEvent) {
        let value = parseInt(e.detail.value)
        if (value > 0) {
          this.cropHeight = value
        } else {
          uni.showToast({
            position: "bottom",
            title: "裁剪高度需要大于0"
          })
        }
      },
      cropWidthConfim(e : InputConfirmEvent) {
        let value = parseInt(e.detail.value)
        if (value > 0) {
          this.cropWidth = value
        } else {
          uni.showToast({
            position: "bottom",
            title: "裁剪宽度需要大于0"
          })
        }
      },
      cropPercentConfim(e : InputConfirmEvent) {
        let value = parseInt(e.detail.value)
        if (value > 0 && value <= 100) {
          this.cropPercent = value
        } else {
          uni.showToast({
            position: "bottom",
            title: "请输入0~100之间的值"
          })
        }
      },
      albumModeChange(){
        uni.showActionSheet({
          itemList: this.albumModeType,
          success: (e) => {
            this.albumModeTypeIndex = e.tapIndex!
          }
        })
      },
      cropResizeChange(e : UniSwitchChangeEvent) {
        this.cropResize = e.detail.value
      },
      switchCrop(e : UniSwitchChangeEvent) {
        this.isCrop = e.detail.value
      },
      removeImage(index : number) {
        this.imageList.splice(index, 1)
      },
      chooseImageSource() {
        uni.showActionSheet({
          itemList: ['拍照', '相册', '拍照或相册'],
          success: (e) => {
            this.sourceTypeIndex = e.tapIndex!
          }
        })
      },
      chooseImageType() {
        uni.showActionSheet({
          itemList: ['压缩', '原图', '压缩或原图'],
          success: (e) => {
            this.sizeTypeIndex = e.tapIndex!
          }
        })
      },
      chooseOrientationType(){
        uni.showActionSheet({
          itemList: ['竖屏', '横屏', '自动'],
          success: (e) => {
            this.orientationTypeIndex = e.tapIndex!
          }
        })
      },
      chooseImageCount(event : InputConfirmEvent) {
        let count = parseInt(event.detail.value) - 1
        if (count < 0) {
          uni.showToast({
            position: "bottom",
            title: "图片数量应该大于0"
          })
          return
        }
        this.countIndex = count
      },
      chooseImage: function () {
        // var cropOption:ChooseImageCropOptions|null = this.isCrop ? null : new ChooseImageCropOptions(  )
        if (this.imageList.length >= 9) {
          uni.showToast({
            position: "bottom",
            title: "已经有9张图片了，请删除部分图片之后重新选择"
          })
          return
        }
        uni.chooseImage({
          sourceType: sourceTypeArray[this.sourceTypeIndex],
          sizeType: sizeTypeArray[this.sizeTypeIndex],
          crop: this.isCrop ? { "quality": this.cropPercent, "width": this.cropWidth, "height": this.cropHeight, "resize": this.cropResize } as ChooseImageCropOptions : null,
          count: this.imageList.length + this.count[this.countIndex] > 9 ? 9 - this.imageList.length : this.count[this.countIndex],

          pageOrientation: orientationTypeArray[this.orientationTypeIndex],


          albumMode: albumModeTypeArray[this.albumModeTypeIndex],

          success: (res) => {
            this.imageList = this.imageList.concat(res.tempFilePaths);
          },
          fail: (err) => {
            console.log("err: ", JSON.stringify(err));
          }
        })
      },
      previewImage: function (index : number) {
        uni.previewImage({
          current: index,
          urls: this.imageList
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIChooseImageChooseImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 图片来源 "),
            createElementVNode("view", utsMapOf({
              class: "uni-list-cell-right",
              onClick: _ctx.chooseImageSource
            }), [
              createElementVNode("text", utsMapOf({ class: "click-t" }), toDisplayString(_ctx.sourceType[_ctx.sourceTypeIndex]), 1 /* TEXT */)
            ], 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 图片质量 "),
            createElementVNode("view", utsMapOf({
              class: "uni-list-cell-right",
              onClick: _ctx.chooseImageType
            }), [
              createElementVNode("text", utsMapOf({ class: "click-t" }), toDisplayString(_ctx.sizeType[_ctx.sizeTypeIndex]), 1 /* TEXT */)
            ], 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 数量限制 "),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
              createElementVNode("input", utsMapOf({
                class: "click-t",
                value: _ctx.countIndex+1,
                type: "number",
                maxlength: 1,
                onConfirm: _ctx.chooseImageCount,
                "confirm-type": "done"
              }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onConfirm"])
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 屏幕方向 "),
            createElementVNode("view", utsMapOf({
              class: "uni-list-cell-right",
              onClick: _ctx.chooseOrientationType
            }), [
              createElementVNode("text", utsMapOf({ class: "click-t" }), toDisplayString(_ctx.orientationType[_ctx.orientationTypeIndex]), 1 /* TEXT */)
            ], 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 相册模式 "),
            createElementVNode("view", utsMapOf({
              class: "uni-list-cell-right",
              onClick: _ctx.albumModeChange
            }), [
              createElementVNode("text", utsMapOf({ class: "click-t" }), toDisplayString(_ctx.albumModeType[_ctx.albumModeTypeIndex]), 1 /* TEXT */)
            ], 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left uni-label" }), " 图像裁剪 "),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
              createVNode(_component_switch, utsMapOf({
                checked: _ctx.isCrop,
                onChange: _ctx.switchCrop
              }), null, 8 /* PROPS */, ["checked", "onChange"])
            ])
          ]),
          createElementVNode("view", utsMapOf({
            ref: "cropOptionNode",
            class: "crop-option",
            style: normalizeStyle(utsMapOf({'height':_ctx.isCrop?'200px':'0px','margin-bottom':_ctx.isCrop?'11px':'0px'}))
          }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left item_width" }), " 图片质量(%) "),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
                createElementVNode("input", utsMapOf({
                  value: _ctx.cropPercent,
                  onConfirm: _ctx.cropPercentConfim,
                  type: "number",
                  maxlength: "-1"
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onConfirm"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left item_width" }), " 裁剪宽度(px) "),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
                createElementVNode("input", utsMapOf({
                  value: _ctx.cropWidth,
                  onConfirm: _ctx.cropWidthConfim,
                  type: "number",
                  maxlength: "-1"
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onConfirm"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left item_width" }), " 裁剪高度(px) "),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
                createElementVNode("input", utsMapOf({
                  value: _ctx.cropHeight,
                  onConfirm: _ctx.cropHeightConfim,
                  type: "number",
                  maxlength: "-1"
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onConfirm"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell cell-pd" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left item_width" }), " 保留原宽高 "),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-right" }), [
                createVNode(_component_switch, utsMapOf({
                  checked: _ctx.cropResize,
                  onChange: _ctx.cropResizeChange
                }), null, 8 /* PROPS */, ["checked", "onChange"])
              ])
            ])
          ], 4 /* STYLE */)
        ]),
        createElementVNode("view", utsMapOf({
          class: "uni-list list-pd",
          style: normalizeStyle(utsMapOf({"padding":"15px"}))
        }), [
          createElementVNode("view", utsMapOf({
            class: "uni-flex",
            style: normalizeStyle(utsMapOf({"margin-bottom":"10px"}))
          }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), "点击可预览选好的图片"),
            createElementVNode("view", utsMapOf({
              style: normalizeStyle(utsMapOf({"margin-left":"auto"}))
            }), [
              createElementVNode("text", utsMapOf({ class: "click-t" }), toDisplayString(_ctx.imageList.length) + "/" + toDisplayString(_ctx.countIndex+1), 1 /* TEXT */)
            ], 4 /* STYLE */)
          ], 4 /* STYLE */),
          createElementVNode("view", utsMapOf({
            class: "uni-flex",
            style: normalizeStyle(utsMapOf({"flex-wrap":"wrap"}))
          }), [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.imageList, (image, index, __index, _cached): any => {
              return createElementVNode("view", utsMapOf({
                key: index,
                class: "uni-uploader__input-box",
                style: normalizeStyle(utsMapOf({"border":"0"}))
              }), [
                createElementVNode("image", utsMapOf({
                  style: normalizeStyle(utsMapOf({"width":"104px","height":"104px"})),
                  src: image,
                  "data-src": image,
                  onClick: () => {_ctx.previewImage(index)}
                }), null, 12 /* STYLE, PROPS */, ["src", "data-src", "onClick"]),
                createElementVNode("image", utsMapOf({
                  src: "/static/plus.png",
                  class: "image-remove",
                  onClick: () => {_ctx.removeImage(index)}
                }), null, 8 /* PROPS */, ["onClick"])
              ], 4 /* STYLE */)
            }), 128 /* KEYED_FRAGMENT */),
            createElementVNode("image", utsMapOf({
              class: "uni-uploader__input-box",
              onClick: _ctx.chooseImage,
              src: "/static/plus.png"
            }), null, 8 /* PROPS */, ["onClick"])
          ], 4 /* STYLE */)
        ], 4 /* STYLE */)
      ])
    ])
  ])
}
const GenPagesAPIChooseImageChooseImageStyles = [utsMapOf([["cell-pd", padStyleMapOf(utsMapOf([["paddingTop", 11], ["paddingRight", 15], ["paddingBottom", 11], ["paddingLeft", 15]]))], ["click-t", padStyleMapOf(utsMapOf([["color", "#A9A9A9"]]))], ["list-pd", padStyleMapOf(utsMapOf([["marginTop", 25]]))], ["uni-uploader__input-box", padStyleMapOf(utsMapOf([["marginTop", 5], ["marginRight", 5], ["marginBottom", 5], ["marginLeft", 5], ["width", 104], ["height", 104], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#D9D9D9"]]))], ["uni-uploader__input", padStyleMapOf(utsMapOf([["position", "absolute"], ["zIndex", 1], ["top", 0], ["left", 0], ["width", "100%"], ["height", "100%"], ["opacity", 0]]))], ["image-remove", padStyleMapOf(utsMapOf([["transform", "rotate(45deg)"], ["width", 25], ["height", 25], ["position", "absolute"], ["top", 0], ["right", 0], ["borderRadius", 13], ["backgroundColor", "rgba(200,200,200,0.8)"]]))], ["item_width", padStyleMapOf(utsMapOf([["width", 130]]))], ["crop-option", padStyleMapOf(utsMapOf([["marginLeft", 11], ["marginRight", 11], ["borderRadius", 11], ["backgroundColor", "#eeeeee"], ["transitionProperty", "height,marginBottom"], ["transitionDuration", "200ms"]]))], ["@TRANSITION", utsMapOf([["crop-option", utsMapOf([["property", "height,marginBottom"], ["duration", "200ms"]])]])]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
