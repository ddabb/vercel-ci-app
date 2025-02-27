
  import { ItemType } from '@/components/enum-data/enum-data-types';

  import ViewGroup from 'android.view.ViewGroup';

  const __sfc__ = defineComponent({
    onReady() {
      this.videoContext = uni.createVideoContext('video');
      // this.videoContext = uni.createVideoContext('video', this);
    },
    data() {
      return {
        videoContext: null as VideoContext | null,
        // 属性
        src: "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4",
        autoplay: false,
        loop: false,
        muted: false,
        initialTime: 0,
        duration: 0,
        controls: true,
        danmuList: [{
          text: '要显示的文本',
          color: '#FF0000',
          time: 3
        }, {
          text: '要显示的文本2',
          color: '#31ff23',
          time: 5
        }, {
          text: '要显示的文本3',
          color: '#f13ef8',
          time: 7
        }, {
          text: '要显示的文本4',
          color: '#4972f8',
          time: 9
        }, {
          text: '要显示的文本5',
          color: '#000000',
          time: 11
        }] as Array<Danmu>,
        danmuBtn: false,
        enableDanmu: true,
        pageGesture: false,
        direction: -1,
        directionItemTypes: [{ "value": 0, "name": "0(正常竖向)" }, { "value": 1, "name": "90(屏幕逆时针90度)" }, { "value": 2, "name": "-90(屏幕顺时针90度)" }] as ItemType[],
        directionItems: [0, 90, -90],
        showProgress: true,
        showFullscreenBtn: true,
        showPlayBtn: true,
        showCenterPlayBtn: true,
        showLoading: true,
        enableProgressGesture: true,
        objectFit: "contain",
        objectFitItemTypes: [{ "value": 0, "name": "contain(包含)" }, { "value": 1, "name": "fill(填充)" }, { "value": 2, "name": "cover(覆盖)" }] as ItemType[],
        objectFitItems: ["contain", "fill", "cover"],
        poster: "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-android.png",
        showMuteBtn: false,
        title: "video-component",
        enablePlayGesture: false,
        vslideGesture: false,
        vslideGestureInFullscreen: true,
        codec: "hardware",
        codecItemTypes: [{ "value": 0, "name": "hardware(硬解码)" }, { "value": 1, "name": "software(软解码)" }] as ItemType[],
        codecItems: ["hardware", "software"],
        httpCache: true,
        playStrategy: 0,
        playStrategyItemTypes: [{ "value": 0, "name": "0(普通模式)" }, { "value": 1, "name": "1(平滑播放模式)" }, { "value": 1, "name": "2(M3U8优化模式)" }] as ItemType[],
        playStrategyItems: [0, 1, 2],
        header: {
          'User-Agent': 'User-Agent test',
          'header': 'header test',
          'cookie': 'cookie test'
        } as UTSJSONObject,
        // API
        pos: 0,
        requestFullScreenOptions: null as RequestFullScreenOptions | null,
        danmu: {
          text: '要显示的文本',
          color: '#FF0000'
        } as Danmu,
        rate: 1,
        rateItemTypes: [{ "value": 0, "name": "0.5" }, { "value": 1, "name": "0.8" }, { "value": 2, "name": "1.0" }, { "value": 3, "name": "1.25" }, { "value": 4, "name": "1.5" }] as ItemType[],
        rateItems: [0.5, 0.8, 1.0, 1.25, 1.5],
        subCompEnable: false,
        subCompShow: false,
        curPos: 0,
        endPos: 0,
        // 自动化测试
        autoTest: false,
        isPlaying: false,
        isPause: false,
        isError: false,
        eventPlay: null as UTSJSONObject | null,
        eventPause: null as UTSJSONObject | null,
        eventEnded: null as UTSJSONObject | null,
        eventTimeupdate: null as UTSJSONObject | null,
        eventFullscreenchange: null as UTSJSONObject | null,
        eventWaiting: null as UTSJSONObject | null,
        eventError: null as UTSJSONObject | null,
        eventProgress: null as UTSJSONObject | null,
        eventFullscreenclick: null as UTSJSONObject | null,
        eventControlstoggle: null as UTSJSONObject | null
      }
    },
    onLoad() {
    },
    methods: {
      // API
      play: function () {
        console.log("play");
        this.videoContext?.play();
      },
      pause: function () {
        console.log("pause");




        (uni.getElementById("video") as UniVideoElement).pause(); //as写法测试。注意id不对时as会崩溃

      },
      seek: function (pos : number) {
        console.log("seek -> " + pos);
        this.videoContext?.seek(pos);
      },
      onSeekInput: function (event : UniInputEvent) {
        this.pos = parseInt(event.detail.value);
      },
      requestFullScreen: function () {
        console.log("requestFullScreen -> " + this.requestFullScreenOptions);
        this.videoContext?.requestFullScreen(this.requestFullScreenOptions);
      },
      exitFullScreen: function () {
        console.log("exitFullScreen");
        this.videoContext?.exitFullScreen();
      },
      stop: function () {
        console.log("stop");




        uni.getElementById<UniVideoElement>("video")?.stop(); //泛型写法测试

      },
      sendDanmu: function () {
        console.log("sendDanmu -> " + this.danmu);
        this.videoContext?.sendDanmu(this.danmu);
      },
      onSendDanmuInput: function (event : UniInputEvent) {
        let json = JSON.parse<Danmu>(event.detail.value)
        if (json == null) return;
        this.danmu = json as Danmu;
      },
      playbackRate: function () {
        console.log("playbackRate -> " + this.rate);
        this.videoContext?.playbackRate(this.rate);
      },
      onPlaybackRateChange: function (value : number) {
        this.rate = this.rateItems[value];
      },
      fastBackward: function () {
        let pos = this.curPos - 15;
        if (pos < 0) pos = 0;
        this.seek(pos);
      },
      fastForward: function () {
        let pos = this.curPos + 15;
        if (pos > this.endPos) pos = this.endPos;
        this.seek(pos);
      },
      onSendDanmuConfirm: function (event : UniInputConfirmEvent) {
        this.videoContext?.sendDanmu({
          text: event.detail.value,
          color: '#ff0000'
        } as Danmu);
      },
      onSendDanmuKeyboardHeightChange: function (event : UniInputKeyboardHeightChangeEvent) {
        const element = uni.getElementById('input-send-danmu') as UniElement;
        if (event.detail.height.toInt() == 0) {
          element.style.setProperty('bottom', '50px');
        } else {
          element.style.setProperty('bottom', event.detail.height + element.getBoundingClientRect().height);
        }
      },
      onSendDanmuBlur: function (_ : UniInputBlurEvent) {
        (uni.getElementById('input-send-danmu') as UniElement).style.setProperty('bottom', '50px');
      },
      // 属性
      onSrcComfirm: function (event : UniInputConfirmEvent) {
        let value = event.detail.value;
        if (value == '') return;
        this.src = value;
        console.log("src -> " + this.src)
      },
      onAutoplayChange: function (value : boolean) {
        this.autoplay = value;
        console.log("autoplay -> " + this.autoplay)
      },
      onLoopChange: function (value : boolean) {
        this.loop = value;
        console.log("loop -> " + this.loop)
      },
      onMutedChange: function (value : boolean) {
        this.muted = value;
        console.log("muted -> " + this.muted)
      },
      onInitialTimeComfirm: function (event : UniInputConfirmEvent) {
        let value = parseInt(event.detail.value)
        if (isNaN(value)) value = 0;
        this.initialTime = value;
        console.log("initialTime -> " + this.initialTime)
      },
      onDurationComfirm: function (event : UniInputConfirmEvent) {
        let value = parseInt(event.detail.value)
        if (isNaN(value)) value = 0;
        this.duration = value;
        console.log("duration -> " + this.duration)
      },
      onControlsChange: function (value : boolean) {
        this.controls = value;
        console.log("controls -> " + this.controls)
      },
      onEnableDanmuChange: function (value : boolean) {
        this.enableDanmu = value;
        console.log("enableDanmu -> " + this.enableDanmu)
      },
      onDanmuBtnChange: function (value : boolean) {
        this.danmuBtn = value;
        console.log("danmuBtn -> " + this.danmuBtn)
      },
      onPageGestureChange: function (value : boolean) {
        this.pageGesture = value;
        console.log("pageGesture -> " + this.pageGesture)
      },
      onRequestFullScreenDirectionChange: function (value : number) {
        let direction = this.directionItems[value];
        this.requestFullScreenOptions = {
          direction
        } as RequestFullScreenOptions;
      },
      onDirectionChange: function (value : number) {
        this.direction = this.directionItems[value];
        console.log("direction -> " + this.direction)
      },
      onShowProgressChange: function (value : boolean) {
        this.showProgress = value;
        console.log("showProgress -> " + this.showProgress)
      },
      onShowFullscreenBtnChange: function (value : boolean) {
        this.showFullscreenBtn = value;
        console.log("showFullscreenBtn -> " + this.showFullscreenBtn)
      },
      onShowPlayBtnChange: function (value : boolean) {
        this.showPlayBtn = value;
        console.log("showPlayBtn -> " + this.showPlayBtn)
      },
      onShowCenterPlayBtnChange: function (value : boolean) {
        this.showCenterPlayBtn = value;
        console.log("showCenterPlayBtn -> " + this.showCenterPlayBtn)
      },
      onShowLoadingChange: function (value : boolean) {
        this.showLoading = value;
        console.log("showLoading -> " + this.showLoading)
      },
      onEnableProgressGestureChange: function (value : boolean) {
        this.enableProgressGesture = value;
        console.log("enableProgressGesture -> " + this.enableProgressGesture)
      },
      onObjectFitChange: function (value : number) {
        this.objectFit = this.objectFitItems[value];
        console.log("objectFit -> " + this.objectFit)
      },
      onPosterComfirm: function (event : UniInputConfirmEvent) {
        let value = event.detail.value;
        if (value == '') return;
        this.poster = value;
        console.log("poster -> " + this.poster)
      },
      onShowMuteBtnChange: function (value : boolean) {
        this.showMuteBtn = value;
        console.log("showMuteBtn -> " + this.showMuteBtn)
      },
      onTitleComfirm: function (event : UniInputConfirmEvent) {
        let value = event.detail.value;
        if (value == '') return;
        this.title = value;
        console.log("title -> " + this.title)
      },
      onEnablePlayGestureChange: function (value : boolean) {
        this.enablePlayGesture = value;
        console.log("enablePlayGesture -> " + this.enablePlayGesture)
      },
      onVslideGestureChange: function (value : boolean) {
        this.vslideGesture = value;
        console.log("vslideGesture -> " + this.vslideGesture)
      },
      onVslideGestureInFullscreenChange: function (value : boolean) {
        this.vslideGestureInFullscreen = value;
        console.log("vslideGestureInFullscreen -> " + this.vslideGestureInFullscreen)
      },
      onCodecChange: function (value : number) {
        this.codec = this.codecItems[value];
        console.log("codec -> " + this.codec)
      },
      onHttpCacheChange: function (value : boolean) {
        this.httpCache = value;
        console.log("httpCache -> " + this.httpCache)
      },
      onPlayStrategyChange: function (value : number) {
        this.playStrategy = this.playStrategyItems[value];
        console.log("playStrategy -> " + this.playStrategy)
      },
      onHeaderComfirm: function (event : UniInputConfirmEvent) {
        let json = JSON.parse(event.detail.value)
        if (json == null) return;
        this.header = json as UTSJSONObject;
        console.log("header -> " + JSON.stringify(this.header))
      },
      onSubCompEnableChange: function (event : UniSwitchChangeEvent) {
        this.subCompEnable = event.detail.value;
      },
      // 事件
      onPlay: function (res : UniEvent) {
        console.log(res.type);
        this.isPlaying = true;
        this.isPause = false;
        if (this.autoTest) {
          this.eventPlay = {
            "tagName": res.target?.tagName,
            "type": res.type
          };
        }
      },
      onPause: function (res : UniEvent) {
        console.log(res.type);
        this.isPlaying = false;
        this.isPause = true;
        if (this.autoTest) {
          this.eventPause = {
            "tagName": res.target?.tagName,
            "type": res.type
          };
        }
      },
      onEnded: function (res : UniEvent) {
        console.log(res.type);
        if (this.autoTest) {
          this.eventEnded = {
            "tagName": res.target?.tagName,
            "type": res.type
          };
        }
      },
      onTimeUpdate: function (res : UniVideoTimeUpdateEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        this.curPos = res.detail.currentTime;
        this.endPos = res.detail.duration;
        if (this.autoTest) {
          this.eventTimeupdate = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "currentTime": Math.trunc(res.detail.currentTime),
            "duration": Math.trunc(res.detail.duration)
          };
        }
      },
      onFullScreenChange: function (res : UniVideoFullScreenChangeEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        this.subCompShow = res.detail.fullScreen;
        if (this.autoTest) {
          this.eventFullscreenchange = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "fullScreen": res.detail.fullScreen,
            "direction": res.detail.direction
          };
        }
      },
      onWaiting: function (res : UniEvent) {
        console.log(res.type);
        if (this.autoTest) {
          this.eventWaiting = {
            "tagName": res.target?.tagName,
            "type": res.type
          };
        }
      },
      onError: function (res : UniVideoErrorEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        this.isError = true;
        if (this.autoTest) {
          this.eventError = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "errCode": res.detail.errCode
          };
        }
      },
      onProgress: function (res : UniVideoProgressEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        if (this.autoTest) {
          this.eventProgress = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "isBufferedValid": res.detail.buffered >= 0
          };
        }
      },
      onFullScreenClick: function (res : UniVideoFullScreenClickEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        if (this.autoTest) {
          this.eventFullscreenclick = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "screenX": Math.trunc(res.detail.screenX),
            "screenY": Math.trunc(res.detail.screenY),
            "screenWidth": Math.trunc(res.detail.screenWidth),
            "screenHeight": Math.trunc(res.detail.screenHeight)
          };
        }
      },
      onControlsToggle: function (res : UniVideoControlsToggleEvent) {
        console.log(res.type + " -> " + JSON.stringify(res.detail));
        if (this.autoTest) {
          this.eventControlstoggle = {
            "tagName": res.target?.tagName,
            "type": res.type,
            "show": res.detail.show
          };
        }
      },
      // 自动化测试
      downloadSource() {
        uni.downloadFile({
          url: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4',
          success: (res) => {
            this.src = res.tempFilePath;
          },
          fail: (_) => {
            this.isError = true;
          }
        })
      },

      hasSubComponent() : boolean {
        const view = uni.getElementById('video')?.getAndroidView<ViewGroup>();
        return view == null ? false : view.getChildAt(0) instanceof ViewGroup;
      }

    }
  })

export default __sfc__
function GenPagesComponentVideoVideoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_navigator = resolveComponent("navigator")
const _component_switch = resolveComponent("switch")
const _component_enum_data = resolveEasyComponent("enum-data",_easycom_enum_data)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)

  return createElementVNode("view", utsMapOf({ class: "uni-flex-item" }), [
    createElementVNode("video", utsMapOf({
      class: "video",
      ref: "video",
      id: "video",
      header: _ctx.header,
      src: _ctx.src,
      autoplay: _ctx.autoplay,
      loop: _ctx.loop,
      muted: _ctx.muted,
      "initial-time": _ctx.initialTime,
      duration: _ctx.duration,
      controls: _ctx.controls,
      "danmu-btn": _ctx.danmuBtn,
      "enable-danmu": _ctx.enableDanmu,
      "page-gesture": _ctx.pageGesture,
      direction: _ctx.direction,
      "show-progress": _ctx.showProgress,
      "show-fullscreen-btn": _ctx.showFullscreenBtn,
      "show-play-btn": _ctx.showPlayBtn,
      "show-center-play-btn": _ctx.showCenterPlayBtn,
      "show-loading": _ctx.showLoading,
      "enable-progress-gesture": _ctx.enableProgressGesture,
      "object-fit": _ctx.objectFit,
      poster: _ctx.poster,
      "show-mute-btn": _ctx.showMuteBtn,
      title: _ctx.title,
      "enable-play-gesture": _ctx.enablePlayGesture,
      "vslide-gesture": _ctx.vslideGesture,
      "vslide-gesture-in-fullscreen": _ctx.vslideGestureInFullscreen,
      codec: _ctx.codec,
      "http-cache": _ctx.httpCache,
      "play-strategy": _ctx.playStrategy,
      "danmu-list": _ctx.danmuList,
      onPlay: _ctx.onPlay,
      onPause: _ctx.onPause,
      onEnded: _ctx.onEnded,
      onTimeupdate: _ctx.onTimeUpdate,
      onWaiting: _ctx.onWaiting,
      onError: _ctx.onError,
      onProgress: _ctx.onProgress,
      onFullscreenclick: _ctx.onFullScreenClick,
      onControlstoggle: _ctx.onControlsToggle,
      onFullscreenchange: _ctx.onFullScreenChange
    }), [
      isTrue(_ctx.subCompEnable && _ctx.subCompShow)
        ? createElementVNode("image", utsMapOf({
            key: 0,
            class: "img-fast-backward",
            src: "/static/test-video/fast-backward.png",
            onClick: _ctx.fastBackward
          }), null, 8 /* PROPS */, ["onClick"])
        : createCommentVNode("v-if", true),
      isTrue(_ctx.subCompEnable && _ctx.subCompShow)
        ? createElementVNode("image", utsMapOf({
            key: 1,
            class: "img-fast-forward",
            src: "/static/test-video/fast-forward.png",
            onClick: _ctx.fastForward
          }), null, 8 /* PROPS */, ["onClick"])
        : createCommentVNode("v-if", true),
      isTrue(_ctx.subCompEnable && _ctx.subCompShow)
        ? createElementVNode("input", utsMapOf({
            key: 2,
            id: "input-send-danmu",
            class: "input-send-danmu",
            placeholder: "请输入弹幕内容",
            "placeholder-style": "color: white;",
            "confirm-type": "send",
            onConfirm: _ctx.onSendDanmuConfirm,
            onKeyboardheightchange: _ctx.onSendDanmuKeyboardHeightChange,
            onBlur: _ctx.onSendDanmuBlur
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm", "onKeyboardheightchange", "onBlur"])
        : createCommentVNode("v-if", true)
    ], 40 /* PROPS, NEED_HYDRATION */, ["header", "src", "autoplay", "loop", "muted", "initial-time", "duration", "controls", "danmu-btn", "enable-danmu", "page-gesture", "direction", "show-progress", "show-fullscreen-btn", "show-play-btn", "show-center-play-btn", "show-loading", "enable-progress-gesture", "object-fit", "poster", "show-mute-btn", "title", "enable-play-gesture", "vslide-gesture", "vslide-gesture-in-fullscreen", "codec", "http-cache", "play-strategy", "danmu-list", "onPlay", "onPause", "onEnded", "onTimeupdate", "onWaiting", "onError", "onProgress", "onFullscreenclick", "onControlstoggle", "onFullscreenchange"]),
    createElementVNode("scroll-view", utsMapOf({ class: "uni-padding-wrap uni-common-mt uni-flex-item" }), [
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createVNode(_component_navigator, utsMapOf({ url: "/pages/component/video/video-format" }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: _ctx.pause
            }), "视频格式示例", 8 /* PROPS */, ["onClick"])
          ]),
          _: 1 /* STABLE */
        }))
      ]),
      createElementVNode("view", utsMapOf({
        class: "uni-flex uni-btn-v",
        style: normalizeStyle(utsMapOf({"justify-content":"space-between","align-items":"center"}))
      }), [
        createElementVNode("text", utsMapOf({
          class: "uni-title",
          style: normalizeStyle(utsMapOf({"width":"80%"}))
        }), "子组件实现快进、快退、发送弹幕功能（全屏后显示）", 4 /* STYLE */),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.subCompEnable,
          onChange: _ctx.onSubCompEnableChange
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "API示例")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.play
        }), "播放", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.pause
        }), "暂停", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("input", utsMapOf({
          class: "input",
          placeholder: "输入要跳转的位置,单位s",
          type: "number",
          onInput: _ctx.onSeekInput
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["onInput"]),
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: () => {_ctx.seek(this.pos)}
        }), "跳转到指定位置", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createVNode(_component_enum_data, utsMapOf({
          title: "选择进入全屏时的视频方向",
          items: _ctx.directionItemTypes,
          onChange: _ctx.onRequestFullScreenDirectionChange
        }), null, 8 /* PROPS */, ["items", "onChange"]),
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.requestFullScreen
        }), "进入全屏", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.exitFullScreen
        }), "退出全屏", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.stop
        }), "停止", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("input", utsMapOf({
          class: "input",
          placeholder: "输入弹幕",
          value: "{ 'text': '要显示的文本', 'color': '#FF0000' }",
          type: "string",
          onInput: _ctx.onSendDanmuInput
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["onInput"]),
        createElementVNode("button", utsMapOf({
          type: "primary",
          disabled: !_ctx.enableDanmu,
          onClick: _ctx.sendDanmu
        }), "发送弹幕", 8 /* PROPS */, ["disabled", "onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createVNode(_component_enum_data, utsMapOf({
          title: "选择倍速",
          items: _ctx.rateItemTypes,
          onChange: _ctx.onPlaybackRateChange
        }), null, 8 /* PROPS */, ["items", "onChange"]),
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.playbackRate
        }), "设置倍速", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "属性示例")
      ]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "string",
        placeholder: "设置播放资源",
        onConfirm: _ctx.onSrcComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "number",
        placeholder: "设置初始播放位置（播放前设置有效）",
        onConfirm: _ctx.onInitialTimeComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "number",
        placeholder: "设置视频时长（播放前设置有效）",
        onConfirm: _ctx.onDurationComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "string",
        placeholder: "设置视频封面",
        onConfirm: _ctx.onPosterComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "string",
        placeholder: "设置视频标题（仅限非 Web 平台）",
        onConfirm: _ctx.onTitleComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createElementVNode("input", utsMapOf({
        class: "input margin-10",
        type: "string",
        placeholder: "设置header(json格式)",
        onConfirm: _ctx.onHeaderComfirm
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onConfirm"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否展示弹幕（播放前设置有效）",
        defaultValue: _ctx.enableDanmu,
        onChange: _ctx.onEnableDanmuChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否自动播放（播放前设置有效）",
        defaultValue: _ctx.autoplay,
        onChange: _ctx.onAutoplayChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否循环播放（播放完成后生效）",
        defaultValue: _ctx.loop,
        onChange: _ctx.onLoopChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否静音播放",
        defaultValue: _ctx.muted,
        onChange: _ctx.onMutedChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示默认播放控件",
        defaultValue: _ctx.controls,
        onChange: _ctx.onControlsChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示弹幕按钮",
        defaultValue: _ctx.danmuBtn,
        onChange: _ctx.onDanmuBtnChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示进度条",
        defaultValue: _ctx.showProgress,
        onChange: _ctx.onShowProgressChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示全屏按钮",
        defaultValue: _ctx.showFullscreenBtn,
        onChange: _ctx.onShowFullscreenBtnChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示视频底部控制栏的播放按钮",
        defaultValue: _ctx.showPlayBtn,
        onChange: _ctx.onShowPlayBtnChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示静音按钮（仅限非 Web 平台）",
        defaultValue: _ctx.showMuteBtn,
        onChange: _ctx.onShowMuteBtnChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_enum_data, utsMapOf({
        title: "设置全屏时视频的方向",
        items: _ctx.directionItemTypes,
        onChange: _ctx.onDirectionChange
      }), null, 8 /* PROPS */, ["items", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示视频中间的播放按钮",
        defaultValue: _ctx.showCenterPlayBtn,
        onChange: _ctx.onShowCenterPlayBtnChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否显示loading控件",
        defaultValue: _ctx.showLoading,
        onChange: _ctx.onShowLoadingChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否开启控制进度的手势",
        defaultValue: _ctx.enableProgressGesture,
        onChange: _ctx.onEnableProgressGestureChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否开启播放手势（仅限非 Web 平台）",
        defaultValue: _ctx.enablePlayGesture,
        onChange: _ctx.onEnablePlayGestureChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "非全屏模式下，设置是否开启亮度与音量调节手势",
        defaultValue: _ctx.pageGesture,
        onChange: _ctx.onPageGestureChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "非全屏模式下，设置是否开启亮度与音量调节手势（仅限非 Web 平台）",
        defaultValue: _ctx.vslideGesture,
        onChange: _ctx.onVslideGestureChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "全屏模式下，设置是否开启亮度与音量调节手势（仅限非 Web 平台）",
        defaultValue: _ctx.vslideGestureInFullscreen,
        onChange: _ctx.onVslideGestureInFullscreenChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_boolean_data, utsMapOf({
        title: "设置是否对http、https视频源开启本地缓存（仅 App 平台，播放前设置有效）",
        defaultValue: _ctx.httpCache,
        onChange: _ctx.onHttpCacheChange
      }), null, 8 /* PROPS */, ["defaultValue", "onChange"]),
      createVNode(_component_enum_data, utsMapOf({
        title: "设置视频大小与video容器大小不一致时，视频的表现形式",
        items: _ctx.objectFitItemTypes,
        onChange: _ctx.onObjectFitChange
      }), null, 8 /* PROPS */, ["items", "onChange"]),
      createVNode(_component_enum_data, utsMapOf({
        title: "设置解码器（仅 App 平台，播放前设置有效）",
        items: _ctx.codecItemTypes,
        onChange: _ctx.onCodecChange
      }), null, 8 /* PROPS */, ["items", "onChange"]),
      createVNode(_component_enum_data, utsMapOf({
        title: "设置播放策略（仅 App 平台，播放前设置有效）",
        items: _ctx.playStrategyItemTypes,
        onChange: _ctx.onPlayStrategyChange
      }), null, 8 /* PROPS */, ["items", "onChange"])
    ])
  ])
}
const GenPagesComponentVideoVideoStyles = [utsMapOf([["video", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 200]]))], ["input", padStyleMapOf(utsMapOf([["height", 40], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"], ["paddingTop", 8], ["paddingRight", 13], ["paddingBottom", 8], ["paddingLeft", 13]]))], ["margin-10", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]]))], ["img-fast-backward", padStyleMapOf(utsMapOf([["width", 40], ["height", 40], ["top", "50%"], ["left", "12%"], ["transform", "translate(-50%, -50%)"], ["position", "absolute"]]))], ["img-fast-forward", padStyleMapOf(utsMapOf([["width", 40], ["height", 40], ["top", "50%"], ["right", "12%"], ["transform", "translate(50%, -50%)"], ["position", "absolute"]]))], ["input-send-danmu", padStyleMapOf(utsMapOf([["height", 40], ["paddingTop", 8], ["paddingRight", 13], ["paddingBottom", 8], ["paddingLeft", 13], ["marginTop", 0], ["marginRight", CSS_VAR_STATUS_BAR_HEIGHT], ["marginBottom", 0], ["marginLeft", CSS_VAR_STATUS_BAR_HEIGHT], ["bottom", 50], ["position", "absolute"], ["backgroundColor", "rgba(0,0,0,0.5)"], ["color", "#FFFFFF"]]))]])]

import _easycom_enum_data from '@/components/enum-data/enum-data.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
