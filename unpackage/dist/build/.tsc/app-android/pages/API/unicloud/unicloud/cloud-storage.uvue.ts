
  const __sfc__ = defineComponent({
    data() {
      return {
        title: '云存储'
      }
    },
    onLoad() {
    },
    onUnload() {
    },
    methods: {
      uploadFile: function () {
        uni.chooseImage({
          count: 1,
          success(res) : void {
            uni.showLoading({
              title: '上传中...'
            })
            const tempFilePath = res.tempFilePaths[0]
            uniCloud.uploadFile({
              filePath: tempFilePath,
              cloudPath: 'test.jpg'
            })
              .then(function (res) {
                uni.hideLoading()
                console.log(res)
                uni.showModal({
                  content: '上传成功',
                  showCancel: false
                });
              })
              .catch(function (err : any | null) {
                uni.hideLoading()
                const error = err as UniCloudError
                uni.showModal({
                  content: '上传失败，' + error.errMsg,
                  showCancel: false
                });
              })
            // .finally((_: number) : void => {
            //   uni.hideLoading()
            // })
          },
          fail(err) : void {
            console.error('chooseImage fail: ', err)
          }
        })
      },
      chooseAndUploadFile() {
        uniCloud.chooseAndUploadFile({
          type: 'image'
        }).then(function (res) {
          uni.hideLoading()
          console.log(res)
          uni.showModal({
            content: '上传成功',
            showCancel: false
          });
        })
          .catch(function (err : any | null) {
            uni.hideLoading()
            const error = err as UniCloudError
            uni.showModal({
              content: '上传失败，' + error.errMsg,
              showCancel: false
            });
          })
      }
    }
  })

export default __sfc__
function GenPagesAPIUnicloudUnicloudCloudStorageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.uploadFile
          }), "选择文件上传", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.chooseAndUploadFile
          }), "一个接口选择文件并上传", 8 /* PROPS */, ["onClick"])
        ])
      ])
    ])
  ])
}
const GenPagesAPIUnicloudUnicloudCloudStorageStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
