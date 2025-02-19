

  import FileInputStream from 'java.io.FileInputStream';

  const __sfc__ = defineComponent({
    data() {
      return {
        title: "compressImage",
        beforeCompressImageInfo: "",
        afterCompressImageInfo: "",
        beforeCompressPath: "",
        afterCompressPath: "",
        quality: 80,
        compressedWidth: null as number | null,
        compressedHeight: null as number | null,
        rotate: 0,
        // 自动化测试
        imageInfoForTest: null,
        imageSrcForTest: '/static/test-image/logo.png'
      }
    },
    methods: {
      compressImage() {
        if (this.beforeCompressPath == "") {
          uni.showToast({
            title: "请先选择图片",
            icon: "error"
          });
          return;
        }
        uni.showLoading({
          title: "图片压缩中"
        });
        uni.compressImage({
          src: this.beforeCompressPath,
          quality: this.quality,
          compressedWidth: this.compressedWidth,
          compressedHeight: this.compressedHeight,
          rotate: this.rotate,
          success: (res) => {
            console.log("compressImage success", JSON.stringify(res));
            this.afterCompressPath = res.tempFilePath;
            uni.showToast({
              title: "压缩成功",
              icon: null
            });
            uni.getImageInfo({
              src: res.tempFilePath,
              success: (_res) => {
                this.afterCompressImageInfo = `图片宽度: ${_res.width}\n图片高度: ${_res.height}\n`;

                const size = new FileInputStream(res.tempFilePath.substring("file://".length)).available() / 1024;
                this.afterCompressImageInfo = this.afterCompressImageInfo.concat(`图片大小: ${size}KB`);

              }
            });
          },
          fail: (err) => {
            uni.showModal({
              title: "压缩图片失败",
              content: JSON.stringify(err),
              showCancel: false
            });
          },
          complete: (_) => {
            uni.hideLoading();
          }
        });
      },
      chooseImage() {
        uni.chooseImage({
          count: 1,
          sizeType: ["original"],
          sourceType: ["album"],
          success: (res) => {
            this.beforeCompressPath = res.tempFilePaths[0];
            uni.getImageInfo({
              src: res.tempFilePaths[0],
              success: (_res) => {
                this.beforeCompressImageInfo = `图片宽度: ${_res.width}\n图片高度: ${_res.height}\n`;

                const size = new FileInputStream(res.tempFilePaths[0].substring("file://".length)).available() / 1024;
                this.beforeCompressImageInfo = this.beforeCompressImageInfo.concat(`图片大小: ${size}KB`);

              }
            });
          }
        });
      },
      onQualityConfirm(value : number) {
        this.quality = value;
      },
      onCompressedWidthConfirm(value : string) {
        this.compressedWidth = parseInt(value);
      },
      onCompressedHeightConfirm(value : string) {
        this.compressedHeight = parseInt(value);
      },
      onRotateConfirm(value : number) {
        this.rotate = value;
      },
      testCompressImage() {
        uni.compressImage({
          src: this.imageSrcForTest,
          quality: 50,
          compressedWidth: 100,
          compressedHeight: 100,
          success: (res) => {
            uni.getImageInfo({
              src: res.tempFilePath,
              success: (_res) => {
                let beforeCompressSize : number, afterComoressSize : number;

                beforeCompressSize = new FileInputStream(UTSAndroid.convert2AbsFullPath(this.imageSrcForTest)).available();
                afterComoressSize = new FileInputStream(res.tempFilePath.substring("file://".length)).available();

                this.imageInfoForTest = {
                  "width": _res.width,
                  "height": _res.height,
                  "isSizeReduce": afterComoressSize < beforeCompressSize
                };
              }
            });
          },
          fail: (_) => {
            this.imageInfoForTest = null;
          }
        });
      }
    }
  })

export default __sfc__
function GenPagesAPICompressImageCompressImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_input_data = resolveEasyComponent("input-data",_easycom_input_data)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
        createElementVNode("view", utsMapOf({ class: "image-container" }), [
          createElementVNode("image", utsMapOf({
            class: "image",
            src: _ctx.beforeCompressPath,
            mode: "aspectFit"
          }), null, 8 /* PROPS */, ["src"]),
          createElementVNode("image", utsMapOf({
            class: "image",
            src: _ctx.afterCompressPath,
            mode: "aspectFit"
          }), null, 8 /* PROPS */, ["src"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-title" }), [
          createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "压缩前图片信息")
        ]),
        createElementVNode("text", null, toDisplayString(_ctx.beforeCompressImageInfo), 1 /* TEXT */),
        createElementVNode("view", utsMapOf({ class: "uni-title" }), [
          createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), "压缩后图片信息")
        ]),
        createElementVNode("text", null, toDisplayString(_ctx.afterCompressImageInfo), 1 /* TEXT */),
        createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.chooseImage
          }), "从相册中选取待压缩的图片", 8 /* PROPS */, ["onClick"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.compressImage
          }), "压缩图片", 8 /* PROPS */, ["onClick"])
        ])
      ]),
      createVNode(_component_input_data, utsMapOf({
        defaultValue: "80",
        title: "压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）",
        type: "number",
        onConfirm: _ctx.onQualityConfirm
      }), null, 8 /* PROPS */, ["onConfirm"]),
      createVNode(_component_input_data, utsMapOf({
        title: "压缩后图片的宽度，单位px",
        type: "string",
        onConfirm: _ctx.onCompressedWidthConfirm
      }), null, 8 /* PROPS */, ["onConfirm"]),
      createVNode(_component_input_data, utsMapOf({
        title: "压缩后图片的高度，单位px",
        type: "string",
        onConfirm: _ctx.onCompressedHeightConfirm
      }), null, 8 /* PROPS */, ["onConfirm"]),
      createVNode(_component_input_data, utsMapOf({
        defaultValue: "0",
        title: "旋转度数，范围0～360",
        type: "number",
        onConfirm: _ctx.onRotateConfirm
      }), null, 8 /* PROPS */, ["onConfirm"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPICompressImageCompressImageStyles = [utsMapOf([["image", padStyleMapOf(utsMapOf([["flex", 1]]))], ["image-container", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_input_data from '@/components/input-data/input-data.vue'
