

  import {
    testInovkeDownloadFile,
    CommonOptions
  } from '@/uni_modules/test-invoke-network-api'


  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'downloadFile',
        imageSrc: '',
        task: null as DownloadTask | null,
        //自动化测试例专用
        jest_result: false,
        jest_callback_triggred: false
      }
    },
    onLoad() {
    },
    onUnload() {
      // this.imageSrc = '';
      uni.hideLoading();
      this.task?.abort();
    },
    methods: {
      downloadImage: function () {
        uni.showLoading({
          title: '下载中'
        })
        var self = this
        this.task = uni.downloadFile({
          url: "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png",
          success: (res) => {
            console.log('downloadFile success, res is', res.tempFilePath)
            self.imageSrc = res.tempFilePath;
          },
          fail: (err) => {
            console.log('downloadFile fail, err is:', err)
          },
          complete: (res) => {
            uni.hideLoading();
            this.task = null;
          }
        });
        this.task?.onProgressUpdate((update) => {
          console.log("progress : ", update.progress);
        })
      },
      downloadErrorFilename(){
        uni.downloadFile({
          url:"https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/file/test9.txt",
          success: (res) => {
            console.log('downloadFile success, res is', res.tempFilePath)
          },
          fail: (err) => {
            console.log('downloadFile fail, err is:', err)
          }
        })
      },
      //自动化测试例专用
      jest_downloadFile() {
        uni.downloadFile({
          url: "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png",
          success: () => {
            this.jest_result = true
            this.jest_callback_triggred = true
          },
          fail: () => {
            this.jest_result = false
            this.jest_callback_triggred = true
          }
        });
      },

      jest_downloadFile_with_uni_env() {
        uni.downloadFile({
          url: "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png",
          filePath: `${uni.env.CACHE_PATH}/a/b/`,
          success: () => {
            this.jest_result = true
            this.jest_callback_triggred = true
          },
          fail: () => {
            this.jest_result = false
            this.jest_callback_triggred = true
          }
        });
      },

      jest_set_cookie() {
        uni.request({
          url: "https://request.dcloud.net.cn/api/http/header/setCookie",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: true,
          firstIpv4: false,
          success: () => {
            this.jest_cookie_download(true)
          },
          fail: () => {
            this.jest_result = false;
            this.jest_callback_triggred = true
          },
        });
      },

      jest_delete_cookie() {
        uni.request({
          url: "https://request.dcloud.net.cn/api/http/header/deleteCookie",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: true,
          firstIpv4: false,
          success: () => {
            this.jest_cookie_download(false)
          },
          fail: () => {
            this.jest_result = false;
            this.jest_callback_triggred = true
          },
        });
      },
      jest_cookie_download(needCookie : boolean) {
        uni.downloadFile({
          url: "https://request.dcloud.net.cn/api/http/header/download",
          success: () => {
            this.jest_result = needCookie ? true : false;
            this.jest_callback_triggred = true
          },
          fail: () => {
            this.jest_result = needCookie ? false : true;
          }
        });
      },
      jest_uts_module_invoked() {

        testInovkeDownloadFile({
          success: (res : any) => {
            this.jest_result = true
            this.jest_callback_triggred = true
          },
          fail: (err : any) => {
            this.jest_result = false
            this.jest_callback_triggred = true
          }
        } as CommonOptions)

      },
      jest_special_characters_download() {
        uni.downloadFile({
          url: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/1789834995055525889-你好%23你好.png",
          success: (res : DownloadFileSuccess) => {
            this.jest_result = true;
            this.jest_callback_triggred = true
          },
          fail: () => {
            this.jest_result = false;
            this.jest_callback_triggred = true
          }
        });
      }
    }
  })

export default __sfc__
function GenPagesAPIDownloadFileDownloadFileRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", null, [
        isTrue(_ctx.imageSrc)
          ? createElementVNode("view", utsMapOf({ key: 0 }), [
              createElementVNode("image", utsMapOf({
                class: "img",
                src: _ctx.imageSrc,
                mode: "aspectFit"
              }), null, 8 /* PROPS */, ["src"])
            ])
          : createElementVNode("view", utsMapOf({
              key: 1,
              style: normalizeStyle(utsMapOf({"margin":"10px"}))
            }), [
              createElementVNode("text", utsMapOf({ class: "uni-hello-text" }), "点击按钮下载服务端示例图片（下载网络文件到本地临时目录）"),
              createElementVNode("button", utsMapOf({
                type: "primary",
                onClick: _ctx.downloadImage
              }), "下载", 8 /* PROPS */, ["onClick"])
            ], 4 /* STYLE */),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"}))
        }), [
          createElementVNode("text", utsMapOf({ class: "uni-hello-text" }), "下载接口的Content-Disposition中的filename非法值例子"),
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.downloadErrorFilename
          }), "下载", 8 /* PROPS */, ["onClick"])
        ], 4 /* STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIDownloadFileDownloadFileStyles = [utsMapOf([["img", padStyleMapOf(utsMapOf([["marginTop", 0], ["marginRight", "auto"], ["marginBottom", 0], ["marginLeft", "auto"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
