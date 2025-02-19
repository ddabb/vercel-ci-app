
  const __sfc__ = defineComponent({
    data() {
      return {
        loadError: false,
        loadFinish: false,
        // 自动化测试
        autoTest: false,
        eventMessage: null as UTSJSONObject | null,
        eventDownload: null as UTSJSONObject | null
      }
    },
    methods: {
      message(event : UniWebViewMessageEvent) {
        console.log(JSON.stringify(event.detail));
        let contentStr = JSON.stringify(event.detail);



        uni.showModal({
          content: contentStr,
          showCancel: false
        });
        if (this.autoTest) {
          this.eventMessage = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "data": event.detail.data
          };
        }
      },
      error(event : UniWebViewErrorEvent) {
        this.loadError = true
        console.log(JSON.stringify(event.detail));
      },
      loading(event : UniWebViewLoadingEvent) {
        console.log(JSON.stringify(event.detail));
      },
      load(event : UniWebViewLoadEvent) {
        this.loadFinish = true;
        console.log(JSON.stringify(event.detail));
      },
      download(event : UniWebViewDownloadEvent) {
        console.log(JSON.stringify(event.detail));
        if (this.autoTest) {
          const arr = event.detail.userAgent.split(' ');
          this.eventDownload = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "url": event.detail.url,
            "userAgent": arr[arr.length - 1],
            "contentDisposition": event.detail.contentDisposition,
            "mimetype": event.detail.mimetype,
            "isContentLengthValid": Math.trunc(event.detail.contentLength / 1024 / 1024) > 1
          };
        }
      },
      // 自动化测试
      testEventDownload() {
        uni.createWebviewContext('web-view')?.evalJS("document.getElementsByTagName('a')[0].click()");
      },
      testEventMessage() {
        uni.createWebviewContext('web-view')?.evalJS("document.getElementById('postMessage').click()");
      }
    }
  })

export default __sfc__
function GenPagesComponentWebViewWebViewWebViewLocalRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("web-view", utsMapOf({
    id: "web-view",
    ref: "web-view",
    class: "web-view",
    src: "/hybrid/html/local.html",
    onMessage: _ctx.message,
    onError: _ctx.error,
    onLoading: _ctx.loading,
    onLoad: _ctx.load,
    onDownload: _ctx.download
  }), null, 40 /* PROPS, NEED_HYDRATION */, ["onMessage", "onError", "onLoading", "onLoad", "onDownload"])
}
const GenPagesComponentWebViewWebViewWebViewLocalStyles = [utsMapOf([["web-view", padStyleMapOf(utsMapOf([["flex", 1]]))]])]
