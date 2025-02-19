

  import { canWebViewGoBack, canWebViewGoForward, hasNativeView } from '@/uni_modules/uts-get-native-view';

  const __sfc__ = defineComponent({
    data() {
      return {
        src: 'https://www.dcloud.io',
        webview_styles: {
          progress: {
            color: '#FF3333'
          }
        },
        webviewContext: null as WebviewContext | null,
        webviewElement: null as UniWebViewElement | null,
        loadError: false,
        horizontalScrollBarAccess: true,
        verticalScrollBarAccess: true,
        canGoBack: false,
        canGoForward: false,
        // 自动化测试
        autoTest: false,
        eventLoading: null as UTSJSONObject | null,
        eventLoad: null as UTSJSONObject | null,
        eventError: null as UTSJSONObject | null,
        pointerEvents: 'auto',
        isTouchEnable: false
      }
    },
    onReady() {

      // TODO web 实现createWebviewContext
      this.webviewContext = uni.createWebviewContext('web-view', this)
      this.webviewElement = uni.getElementById('web-view') as UniWebViewElement //推荐使用element，功能更丰富
      // console.log('url: ',this.webviewElement?.getAttribute("src"));
      // this.webviewElement?.setAttribute("src","https://ext.dcloud.net.cn/")

    },
    methods: {
      getPackageName() : string {
        let packageName : string = ""






        return packageName
      },
      isProd() : boolean {
        if (this.getPackageName() == 'io.dcloud.hellouniappx') {
          return true
        }
        return false
      },
      back() {
        this.webviewContext?.back();
      },
      forward() {
        this.webviewContext?.forward();
      },
      reload() {
        this.webviewContext?.reload();
        // this.webviewElement?.reload();
      },
      stop() {
        this.webviewContext?.stop();
      },
      nativeToWeb() {
        this.webviewContext?.evalJS("alert('hello uni-app x')");
      },
      message(event : UniWebViewMessageEvent) {
        console.log(JSON.stringify(event.detail));
      },
      error(event : UniWebViewErrorEvent) {
        this.loadError = true
        console.log(JSON.stringify(event.detail));
        if (this.autoTest) {
          this.eventError = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "errCode": event.detail.errCode,
            "errMsg": event.detail.errMsg,
            "url": event.detail.url,
            "fullUrl": event.detail.fullUrl,
            "src": event.detail.src
          };
        }
      },
      loading(event : UniWebViewLoadingEvent) {
        console.log(JSON.stringify(event.detail));
        if (this.autoTest) {
          this.eventLoading = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "src": event.detail.src
          };
        }
      },
      load(event : UniWebViewLoadEvent) {
        console.log(JSON.stringify(event.detail));

        this.canGoBack = canWebViewGoBack('web-view');
        this.canGoForward = canWebViewGoForward('web-view');

        if (this.autoTest) {
          this.eventLoad = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "src": event.detail.src
          };
        }
      },
      download(event : UniWebViewDownloadEvent) {
        console.log(JSON.stringify(event.detail));
        uni.showModal({
          content: "下载链接: " + event.detail.url + "\n文件大小: " + event.detail.contentLength / 1024 + "KB",
          showCancel: false
        });
      },
      confirm(event : UniInputConfirmEvent) {
        let url = event.detail.value;
        if (!url.startsWith('https://') && !url.startsWith('http://')) {
          url = 'https://' + url;
        }
        this.src = url;
      },
      changeHorizontalScrollBarAccess(event : UniSwitchChangeEvent) {
        this.horizontalScrollBarAccess = event.detail.value;
      },
      changeVerticalScrollBarAccess(event : UniSwitchChangeEvent) {
        this.verticalScrollBarAccess = event.detail.value;
      },
      // 自动化测试
      touchstart(event : UniTouchEvent) {
        if (this.autoTest) {
          this.isTouchEnable = event.touches[0].clientX > 0 && event.touches[0].clientY > 0;
        }
      },
      tap(event : UniPointerEvent) {
        if (this.autoTest) {
          this.isTouchEnable = event.clientX > 0 && event.clientY > 0;
        }
      },
      getWindowInfo() : GetWindowInfoResult {
        return uni.getWindowInfo();
      },
      //自动化测试专用
      checkNativeWebView() : boolean {

        return hasNativeView('web-view')




      }
    }
  })

export default __sfc__
function GenPagesComponentWebViewWebViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch")

  return createElementVNode("scroll-view", utsMapOf({ class: "uni-flex-item" }), [
    createElementVNode("web-view", utsMapOf({
      id: "web-view",
      class: "uni-flex-item",
      style: normalizeStyle(utsMapOf({ 'pointer-events': _ctx.pointerEvents })),
      src: _ctx.src,
      "webview-styles": _ctx.webview_styles,
      horizontalScrollBarAccess: _ctx.horizontalScrollBarAccess,
      verticalScrollBarAccess: _ctx.verticalScrollBarAccess,
      onMessage: _ctx.message,
      onError: _ctx.error,
      onLoading: _ctx.loading,
      onLoad: _ctx.load,
      onDownload: _ctx.download,
      onTouchstart: _ctx.touchstart,
      onClick: _ctx.tap
    }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["src", "webview-styles", "horizontalScrollBarAccess", "verticalScrollBarAccess", "onMessage", "onError", "onLoading", "onLoad", "onDownload", "onTouchstart", "onClick"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("input", utsMapOf({
          class: "uni-input",
          confirmType: "go",
          placeholder: "输入网址跳转",
          onConfirm: _ctx.confirm,
          maxlength: "-1"
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-row uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          class: "uni-flex-item",
          type: "primary",
          disabled: !_ctx.canGoBack,
          onClick: _ctx.back
        }), "后退", 8 /* PROPS */, ["disabled", "onClick"]),
        createElementVNode("button", utsMapOf({
          class: "margin-left-5 uni-flex-item",
          type: "primary",
          disabled: !_ctx.canGoForward,
          onClick: _ctx.forward
        }), "前进", 8 /* PROPS */, ["disabled", "onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-row uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          class: "uni-flex-item",
          type: "primary",
          onClick: _ctx.reload
        }), "重新加载", 8 /* PROPS */, ["onClick"]),
        createElementVNode("button", utsMapOf({
          class: "margin-left-5 uni-flex-item",
          type: "primary",
          onClick: _ctx.stop
        }), "停止加载", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.nativeToWeb
        }), "原生和Web通信", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-row uni-btn-v" }), [
        createElementVNode("view", utsMapOf({ class: "uni-row uni-flex-item align-items-center" }), [
          createElementVNode("text", null, "显示横向滚动条"),
          createVNode(_component_switch, utsMapOf({
            checked: true,
            onChange: _ctx.changeHorizontalScrollBarAccess
          }), null, 8 /* PROPS */, ["onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-row uni-flex-item align-items-center" }), [
          createElementVNode("text", null, "显示竖向滚动条"),
          createVNode(_component_switch, utsMapOf({
            checked: true,
            onChange: _ctx.changeVerticalScrollBarAccess
          }), null, 8 /* PROPS */, ["onChange"])
        ])
      ])
    ])
  ])
}
const GenPagesComponentWebViewWebViewStyles = [utsMapOf([["margin-left-5", padStyleMapOf(utsMapOf([["marginLeft", 5]]))], ["align-items-center", padStyleMapOf(utsMapOf([["alignItems", "center"]]))]])]
