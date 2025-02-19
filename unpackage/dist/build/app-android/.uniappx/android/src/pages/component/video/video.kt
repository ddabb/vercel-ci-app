@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIFB90797;
import android.view.ViewGroup;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.createVideoContext as uni_createVideoContext;
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile;
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
open class GenPagesComponentVideoVideo : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLoad(fun(_: OnLoadOptions) {
            stat_instance.onLoad(this);
        }
        , __ins);
        onPageShow(fun() {
            stat_instance.onShow(this);
        }
        , __ins);
        onPageHide(fun() {
            stat_instance.onHide(this);
        }
        , __ins);
        onUnload(fun() {
            stat_instance.onUnload(this);
        }
        , __ins);
        onReady(fun() {
            this.videoContext = uni_createVideoContext("video", null);
        }
        , __ins);
        onLoad(fun(_: OnLoadOptions) {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_navigator = resolveComponent("navigator");
        val _component_switch = resolveComponent("switch");
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass);
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        return createElementVNode("view", utsMapOf("class" to "uni-flex-item"), utsArrayOf(
            createElementVNode("video", utsMapOf("class" to "video", "ref" to "video", "id" to "video", "header" to _ctx.header, "src" to _ctx.src, "autoplay" to _ctx.autoplay, "loop" to _ctx.loop, "muted" to _ctx.muted, "initial-time" to _ctx.initialTime, "duration" to _ctx.duration, "controls" to _ctx.controls, "danmu-btn" to _ctx.danmuBtn, "enable-danmu" to _ctx.enableDanmu, "page-gesture" to _ctx.pageGesture, "direction" to _ctx.direction, "show-progress" to _ctx.showProgress, "show-fullscreen-btn" to _ctx.showFullscreenBtn, "show-play-btn" to _ctx.showPlayBtn, "show-center-play-btn" to _ctx.showCenterPlayBtn, "show-loading" to _ctx.showLoading, "enable-progress-gesture" to _ctx.enableProgressGesture, "object-fit" to _ctx.objectFit, "poster" to _ctx.poster, "show-mute-btn" to _ctx.showMuteBtn, "title" to _ctx.title, "enable-play-gesture" to _ctx.enablePlayGesture, "vslide-gesture" to _ctx.vslideGesture, "vslide-gesture-in-fullscreen" to _ctx.vslideGestureInFullscreen, "codec" to _ctx.codec, "http-cache" to _ctx.httpCache, "play-strategy" to _ctx.playStrategy, "danmu-list" to _ctx.danmuList, "onPlay" to _ctx.onPlay, "onPause" to _ctx.onPause, "onEnded" to _ctx.onEnded, "onTimeupdate" to _ctx.onTimeUpdate, "onWaiting" to _ctx.onWaiting, "onError" to _ctx.onError, "onProgress" to _ctx.onProgress, "onFullscreenclick" to _ctx.onFullScreenClick, "onControlstoggle" to _ctx.onControlsToggle, "onFullscreenchange" to _ctx.onFullScreenChange), utsArrayOf(
                if (isTrue(_ctx.subCompEnable && _ctx.subCompShow)) {
                    createElementVNode("image", utsMapOf("key" to 0, "class" to "img-fast-backward", "src" to "/static/test-video/fast-backward.png", "onClick" to _ctx.fastBackward), null, 8, utsArrayOf(
                        "onClick"
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
                ,
                if (isTrue(_ctx.subCompEnable && _ctx.subCompShow)) {
                    createElementVNode("image", utsMapOf("key" to 1, "class" to "img-fast-forward", "src" to "/static/test-video/fast-forward.png", "onClick" to _ctx.fastForward), null, 8, utsArrayOf(
                        "onClick"
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
                ,
                if (isTrue(_ctx.subCompEnable && _ctx.subCompShow)) {
                    createElementVNode("input", utsMapOf("key" to 2, "id" to "input-send-danmu", "class" to "input-send-danmu", "placeholder" to "请输入弹幕内容", "placeholder-style" to "color: white;", "confirm-type" to "send", "onConfirm" to _ctx.onSendDanmuConfirm, "onKeyboardheightchange" to _ctx.onSendDanmuKeyboardHeightChange, "onBlur" to _ctx.onSendDanmuBlur), null, 40, utsArrayOf(
                        "onConfirm",
                        "onKeyboardheightchange",
                        "onBlur"
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
            ), 40, utsArrayOf(
                "header",
                "src",
                "autoplay",
                "loop",
                "muted",
                "initial-time",
                "duration",
                "controls",
                "danmu-btn",
                "enable-danmu",
                "page-gesture",
                "direction",
                "show-progress",
                "show-fullscreen-btn",
                "show-play-btn",
                "show-center-play-btn",
                "show-loading",
                "enable-progress-gesture",
                "object-fit",
                "poster",
                "show-mute-btn",
                "title",
                "enable-play-gesture",
                "vslide-gesture",
                "vslide-gesture-in-fullscreen",
                "codec",
                "http-cache",
                "play-strategy",
                "danmu-list",
                "onPlay",
                "onPause",
                "onEnded",
                "onTimeupdate",
                "onWaiting",
                "onError",
                "onProgress",
                "onFullscreenclick",
                "onControlstoggle",
                "onFullscreenchange"
            )),
            createElementVNode("scroll-view", utsMapOf("class" to "uni-padding-wrap uni-common-mt uni-flex-item"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/video/video-format"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.pause), "视频格式示例", 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-flex uni-btn-v", "style" to normalizeStyle(utsMapOf("justify-content" to "space-between", "align-items" to "center"))), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title", "style" to normalizeStyle(utsMapOf("width" to "80%"))), "子组件实现快进、快退、发送弹幕功能（全屏后显示）", 4),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.subCompEnable, "onChange" to _ctx.onSubCompEnableChange), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                ), 4),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), "API示例")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.play), "播放", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.pause), "暂停", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("input", utsMapOf("class" to "input", "placeholder" to "输入要跳转的位置,单位s", "type" to "number", "onInput" to _ctx.onSeekInput), null, 40, utsArrayOf(
                        "onInput"
                    )),
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to fun(){
                        _ctx.seek(this.pos);
                    }
                    ), "跳转到指定位置", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createVNode(_component_enum_data, utsMapOf("title" to "选择进入全屏时的视频方向", "items" to _ctx.directionItemTypes, "onChange" to _ctx.onRequestFullScreenDirectionChange), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    )),
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.requestFullScreen), "进入全屏", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.exitFullScreen), "退出全屏", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.stop), "停止", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("input", utsMapOf("class" to "input", "placeholder" to "输入弹幕", "value" to "{ 'text': '要显示的文本', 'color': '#FF0000' }", "type" to "string", "onInput" to _ctx.onSendDanmuInput), null, 40, utsArrayOf(
                        "onInput"
                    )),
                    createElementVNode("button", utsMapOf("type" to "primary", "disabled" to !_ctx.enableDanmu, "onClick" to _ctx.sendDanmu), "发送弹幕", 8, utsArrayOf(
                        "disabled",
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createVNode(_component_enum_data, utsMapOf("title" to "选择倍速", "items" to _ctx.rateItemTypes, "onChange" to _ctx.onPlaybackRateChange), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    )),
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.playbackRate), "设置倍速", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), "属性示例")
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "string", "placeholder" to "设置播放资源", "onConfirm" to _ctx.onSrcComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "number", "placeholder" to "设置初始播放位置（播放前设置有效）", "onConfirm" to _ctx.onInitialTimeComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "number", "placeholder" to "设置视频时长（播放前设置有效）", "onConfirm" to _ctx.onDurationComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "string", "placeholder" to "设置视频封面", "onConfirm" to _ctx.onPosterComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "string", "placeholder" to "设置视频标题（仅限非 Web 平台）", "onConfirm" to _ctx.onTitleComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createElementVNode("input", utsMapOf("class" to "input margin-10", "type" to "string", "placeholder" to "设置header(json格式)", "onConfirm" to _ctx.onHeaderComfirm), null, 40, utsArrayOf(
                    "onConfirm"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否展示弹幕（播放前设置有效）", "defaultValue" to _ctx.enableDanmu, "onChange" to _ctx.onEnableDanmuChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否自动播放（播放前设置有效）", "defaultValue" to _ctx.autoplay, "onChange" to _ctx.onAutoplayChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否循环播放（播放完成后生效）", "defaultValue" to _ctx.loop, "onChange" to _ctx.onLoopChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否静音播放", "defaultValue" to _ctx.muted, "onChange" to _ctx.onMutedChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示默认播放控件", "defaultValue" to _ctx.controls, "onChange" to _ctx.onControlsChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示弹幕按钮", "defaultValue" to _ctx.danmuBtn, "onChange" to _ctx.onDanmuBtnChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示进度条", "defaultValue" to _ctx.showProgress, "onChange" to _ctx.onShowProgressChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示全屏按钮", "defaultValue" to _ctx.showFullscreenBtn, "onChange" to _ctx.onShowFullscreenBtnChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示视频底部控制栏的播放按钮", "defaultValue" to _ctx.showPlayBtn, "onChange" to _ctx.onShowPlayBtnChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示静音按钮（仅限非 Web 平台）", "defaultValue" to _ctx.showMuteBtn, "onChange" to _ctx.onShowMuteBtnChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("title" to "设置全屏时视频的方向", "items" to _ctx.directionItemTypes, "onChange" to _ctx.onDirectionChange), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示视频中间的播放按钮", "defaultValue" to _ctx.showCenterPlayBtn, "onChange" to _ctx.onShowCenterPlayBtnChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否显示loading控件", "defaultValue" to _ctx.showLoading, "onChange" to _ctx.onShowLoadingChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否开启控制进度的手势", "defaultValue" to _ctx.enableProgressGesture, "onChange" to _ctx.onEnableProgressGestureChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否开启播放手势（仅限非 Web 平台）", "defaultValue" to _ctx.enablePlayGesture, "onChange" to _ctx.onEnablePlayGestureChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "非全屏模式下，设置是否开启亮度与音量调节手势", "defaultValue" to _ctx.pageGesture, "onChange" to _ctx.onPageGestureChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "非全屏模式下，设置是否开启亮度与音量调节手势（仅限非 Web 平台）", "defaultValue" to _ctx.vslideGesture, "onChange" to _ctx.onVslideGestureChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "全屏模式下，设置是否开启亮度与音量调节手势（仅限非 Web 平台）", "defaultValue" to _ctx.vslideGestureInFullscreen, "onChange" to _ctx.onVslideGestureInFullscreenChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("title" to "设置是否对http、https视频源开启本地缓存（仅 App 平台，播放前设置有效）", "defaultValue" to _ctx.httpCache, "onChange" to _ctx.onHttpCacheChange), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("title" to "设置视频大小与video容器大小不一致时，视频的表现形式", "items" to _ctx.objectFitItemTypes, "onChange" to _ctx.onObjectFitChange), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("title" to "设置解码器（仅 App 平台，播放前设置有效）", "items" to _ctx.codecItemTypes, "onChange" to _ctx.onCodecChange), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("title" to "设置播放策略（仅 App 平台，播放前设置有效）", "items" to _ctx.playStrategyItemTypes, "onChange" to _ctx.onPlayStrategyChange), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                ))
            ))
        ));
    }
    open var videoContext: VideoContext? by `$data`;
    open var src: String by `$data`;
    open var autoplay: Boolean by `$data`;
    open var loop: Boolean by `$data`;
    open var muted: Boolean by `$data`;
    open var initialTime: Number by `$data`;
    open var duration: Number by `$data`;
    open var controls: Boolean by `$data`;
    open var danmuList: UTSArray<Danmu> by `$data`;
    open var danmuBtn: Boolean by `$data`;
    open var enableDanmu: Boolean by `$data`;
    open var pageGesture: Boolean by `$data`;
    open var direction: Number by `$data`;
    open var directionItemTypes: UTSArray<ItemType> by `$data`;
    open var directionItems: UTSArray<Number> by `$data`;
    open var showProgress: Boolean by `$data`;
    open var showFullscreenBtn: Boolean by `$data`;
    open var showPlayBtn: Boolean by `$data`;
    open var showCenterPlayBtn: Boolean by `$data`;
    open var showLoading: Boolean by `$data`;
    open var enableProgressGesture: Boolean by `$data`;
    open var objectFit: String by `$data`;
    open var objectFitItemTypes: UTSArray<ItemType> by `$data`;
    open var objectFitItems: UTSArray<String> by `$data`;
    open var poster: String by `$data`;
    open var showMuteBtn: Boolean by `$data`;
    open var title: String by `$data`;
    open var enablePlayGesture: Boolean by `$data`;
    open var vslideGesture: Boolean by `$data`;
    open var vslideGestureInFullscreen: Boolean by `$data`;
    open var codec: String by `$data`;
    open var codecItemTypes: UTSArray<ItemType> by `$data`;
    open var codecItems: UTSArray<String> by `$data`;
    open var httpCache: Boolean by `$data`;
    open var playStrategy: Number by `$data`;
    open var playStrategyItemTypes: UTSArray<ItemType> by `$data`;
    open var playStrategyItems: UTSArray<Number> by `$data`;
    open var header: UTSJSONObject by `$data`;
    open var pos: Number by `$data`;
    open var requestFullScreenOptions: RequestFullScreenOptions? by `$data`;
    open var danmu: Danmu by `$data`;
    open var rate: Number by `$data`;
    open var rateItemTypes: UTSArray<ItemType> by `$data`;
    open var rateItems: UTSArray<Number> by `$data`;
    open var subCompEnable: Boolean by `$data`;
    open var subCompShow: Boolean by `$data`;
    open var curPos: Number by `$data`;
    open var endPos: Number by `$data`;
    open var autoTest: Boolean by `$data`;
    open var isPlaying: Boolean by `$data`;
    open var isPause: Boolean by `$data`;
    open var isError: Boolean by `$data`;
    open var eventPlay: UTSJSONObject? by `$data`;
    open var eventPause: UTSJSONObject? by `$data`;
    open var eventEnded: UTSJSONObject? by `$data`;
    open var eventTimeupdate: UTSJSONObject? by `$data`;
    open var eventFullscreenchange: UTSJSONObject? by `$data`;
    open var eventWaiting: UTSJSONObject? by `$data`;
    open var eventError: UTSJSONObject? by `$data`;
    open var eventProgress: UTSJSONObject? by `$data`;
    open var eventFullscreenclick: UTSJSONObject? by `$data`;
    open var eventControlstoggle: UTSJSONObject? by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("videoContext" to null as VideoContext?, "src" to "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4", "autoplay" to false, "loop" to false, "muted" to false, "initialTime" to 0, "duration" to 0, "controls" to true, "danmuList" to utsArrayOf<Danmu>(Danmu(text = "要显示的文本", color = "#FF0000", time = 3), Danmu(text = "要显示的文本2", color = "#31ff23", time = 5), Danmu(text = "要显示的文本3", color = "#f13ef8", time = 7), Danmu(text = "要显示的文本4", color = "#4972f8", time = 9), Danmu(text = "要显示的文本5", color = "#000000", time = 11)), "danmuBtn" to false, "enableDanmu" to true, "pageGesture" to false, "direction" to -1, "directionItemTypes" to utsArrayOf<ItemType>(ItemType(value = 0, name = "0(正常竖向)"), ItemType(value = 1, name = "90(屏幕逆时针90度)"), ItemType(value = 2, name = "-90(屏幕顺时针90度)")), "directionItems" to utsArrayOf(
            0,
            90,
            -90
        ), "showProgress" to true, "showFullscreenBtn" to true, "showPlayBtn" to true, "showCenterPlayBtn" to true, "showLoading" to true, "enableProgressGesture" to true, "objectFit" to "contain", "objectFitItemTypes" to utsArrayOf<ItemType>(ItemType(value = 0, name = "contain(包含)"), ItemType(value = 1, name = "fill(填充)"), ItemType(value = 2, name = "cover(覆盖)")), "objectFitItems" to utsArrayOf(
            "contain",
            "fill",
            "cover"
        ), "poster" to "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-android.png", "showMuteBtn" to false, "title" to "video-component", "enablePlayGesture" to false, "vslideGesture" to false, "vslideGestureInFullscreen" to true, "codec" to "hardware", "codecItemTypes" to utsArrayOf<ItemType>(ItemType(value = 0, name = "hardware(硬解码)"), ItemType(value = 1, name = "software(软解码)")), "codecItems" to utsArrayOf(
            "hardware",
            "software"
        ), "httpCache" to true, "playStrategy" to 0, "playStrategyItemTypes" to utsArrayOf<ItemType>(ItemType(value = 0, name = "0(普通模式)"), ItemType(value = 1, name = "1(平滑播放模式)"), ItemType(value = 1, name = "2(M3U8优化模式)")), "playStrategyItems" to utsArrayOf(
            0,
            1,
            2
        ), "header" to object : UTSJSONObject() {
            var `User-Agent` = "User-Agent test"
            var header = "header test"
            var cookie = "cookie test"
        }, "pos" to 0, "requestFullScreenOptions" to null as RequestFullScreenOptions?, "danmu" to Danmu(text = "要显示的文本", color = "#FF0000"), "rate" to 1, "rateItemTypes" to utsArrayOf<ItemType>(ItemType(value = 0, name = "0.5"), ItemType(value = 1, name = "0.8"), ItemType(value = 2, name = "1.0"), ItemType(value = 3, name = "1.25"), ItemType(value = 4, name = "1.5")), "rateItems" to utsArrayOf(
            0.5,
            0.8,
            1.0,
            1.25,
            1.5
        ), "subCompEnable" to false, "subCompShow" to false, "curPos" to 0, "endPos" to 0, "autoTest" to false, "isPlaying" to false, "isPause" to false, "isError" to false, "eventPlay" to null as UTSJSONObject?, "eventPause" to null as UTSJSONObject?, "eventEnded" to null as UTSJSONObject?, "eventTimeupdate" to null as UTSJSONObject?, "eventFullscreenchange" to null as UTSJSONObject?, "eventWaiting" to null as UTSJSONObject?, "eventError" to null as UTSJSONObject?, "eventProgress" to null as UTSJSONObject?, "eventFullscreenclick" to null as UTSJSONObject?, "eventControlstoggle" to null as UTSJSONObject?);
    }
    override fun `$initMethods`() {
        this.play = fun() {
            console.log("play");
            this.videoContext?.play();
        }
        ;
        this.pause = fun() {
            console.log("pause");
            (uni_getElementById("video") as UniVideoElement).pause();
        }
        ;
        this.seek = fun(pos: Number) {
            console.log("seek -> " + pos);
            this.videoContext?.seek(pos);
        }
        ;
        this.onSeekInput = fun(event: UniInputEvent) {
            this.pos = parseInt(event.detail.value);
        }
        ;
        this.requestFullScreen = fun() {
            console.log("requestFullScreen -> " + this.requestFullScreenOptions);
            this.videoContext?.requestFullScreen(this.requestFullScreenOptions);
        }
        ;
        this.exitFullScreen = fun() {
            console.log("exitFullScreen");
            this.videoContext?.exitFullScreen();
        }
        ;
        this.stop = fun() {
            console.log("stop");
            uni_getElementById<UniVideoElement>("video")?.stop();
        }
        ;
        this.sendDanmu = fun() {
            console.log("sendDanmu -> " + this.danmu);
            this.videoContext?.sendDanmu(this.danmu);
        }
        ;
        this.onSendDanmuInput = fun(event: UniInputEvent) {
            var json = JSON.parse<Danmu>(event.detail.value);
            if (json == null) {
                return;
            }
            this.danmu = json as Danmu;
        }
        ;
        this.playbackRate = fun() {
            console.log("playbackRate -> " + this.rate);
            this.videoContext?.playbackRate(this.rate);
        }
        ;
        this.onPlaybackRateChange = fun(value: Number) {
            this.rate = this.rateItems[value];
        }
        ;
        this.fastBackward = fun() {
            var pos = this.curPos - 15;
            if (pos < 0) {
                pos = 0;
            }
            this.seek(pos);
        }
        ;
        this.fastForward = fun() {
            var pos = this.curPos + 15;
            if (pos > this.endPos) {
                pos = this.endPos;
            }
            this.seek(pos);
        }
        ;
        this.onSendDanmuConfirm = fun(event: UniInputConfirmEvent) {
            this.videoContext?.sendDanmu(Danmu(text = event.detail.value, color = "#ff0000"));
        }
        ;
        this.onSendDanmuKeyboardHeightChange = fun(event: UniInputKeyboardHeightChangeEvent) {
            val element = uni_getElementById("input-send-danmu") as UniElement;
            if (event.detail.height.toInt() == 0) {
                element.style.setProperty("bottom", "50px");
            } else {
                element.style.setProperty("bottom", event.detail.height + element.getBoundingClientRect().height);
            }
        }
        ;
        this.onSendDanmuBlur = fun(_: UniInputBlurEvent) {
            (uni_getElementById("input-send-danmu") as UniElement).style.setProperty("bottom", "50px");
        }
        ;
        this.onSrcComfirm = fun(event: UniInputConfirmEvent) {
            var value = event.detail.value;
            if (value == "") {
                return;
            }
            this.src = value;
            console.log("src -> " + this.src);
        }
        ;
        this.onAutoplayChange = fun(value: Boolean) {
            this.autoplay = value;
            console.log("autoplay -> " + this.autoplay);
        }
        ;
        this.onLoopChange = fun(value: Boolean) {
            this.loop = value;
            console.log("loop -> " + this.loop);
        }
        ;
        this.onMutedChange = fun(value: Boolean) {
            this.muted = value;
            console.log("muted -> " + this.muted);
        }
        ;
        this.onInitialTimeComfirm = fun(event: UniInputConfirmEvent) {
            var value = parseInt(event.detail.value);
            if (isNaN(value)) {
                value = 0;
            }
            this.initialTime = value;
            console.log("initialTime -> " + this.initialTime);
        }
        ;
        this.onDurationComfirm = fun(event: UniInputConfirmEvent) {
            var value = parseInt(event.detail.value);
            if (isNaN(value)) {
                value = 0;
            }
            this.duration = value;
            console.log("duration -> " + this.duration);
        }
        ;
        this.onControlsChange = fun(value: Boolean) {
            this.controls = value;
            console.log("controls -> " + this.controls);
        }
        ;
        this.onEnableDanmuChange = fun(value: Boolean) {
            this.enableDanmu = value;
            console.log("enableDanmu -> " + this.enableDanmu);
        }
        ;
        this.onDanmuBtnChange = fun(value: Boolean) {
            this.danmuBtn = value;
            console.log("danmuBtn -> " + this.danmuBtn);
        }
        ;
        this.onPageGestureChange = fun(value: Boolean) {
            this.pageGesture = value;
            console.log("pageGesture -> " + this.pageGesture);
        }
        ;
        this.onRequestFullScreenDirectionChange = fun(value: Number) {
            var direction = this.directionItems[value];
            this.requestFullScreenOptions = RequestFullScreenOptions(direction = direction);
        }
        ;
        this.onDirectionChange = fun(value: Number) {
            this.direction = this.directionItems[value];
            console.log("direction -> " + this.direction);
        }
        ;
        this.onShowProgressChange = fun(value: Boolean) {
            this.showProgress = value;
            console.log("showProgress -> " + this.showProgress);
        }
        ;
        this.onShowFullscreenBtnChange = fun(value: Boolean) {
            this.showFullscreenBtn = value;
            console.log("showFullscreenBtn -> " + this.showFullscreenBtn);
        }
        ;
        this.onShowPlayBtnChange = fun(value: Boolean) {
            this.showPlayBtn = value;
            console.log("showPlayBtn -> " + this.showPlayBtn);
        }
        ;
        this.onShowCenterPlayBtnChange = fun(value: Boolean) {
            this.showCenterPlayBtn = value;
            console.log("showCenterPlayBtn -> " + this.showCenterPlayBtn);
        }
        ;
        this.onShowLoadingChange = fun(value: Boolean) {
            this.showLoading = value;
            console.log("showLoading -> " + this.showLoading);
        }
        ;
        this.onEnableProgressGestureChange = fun(value: Boolean) {
            this.enableProgressGesture = value;
            console.log("enableProgressGesture -> " + this.enableProgressGesture);
        }
        ;
        this.onObjectFitChange = fun(value: Number) {
            this.objectFit = this.objectFitItems[value];
            console.log("objectFit -> " + this.objectFit);
        }
        ;
        this.onPosterComfirm = fun(event: UniInputConfirmEvent) {
            var value = event.detail.value;
            if (value == "") {
                return;
            }
            this.poster = value;
            console.log("poster -> " + this.poster);
        }
        ;
        this.onShowMuteBtnChange = fun(value: Boolean) {
            this.showMuteBtn = value;
            console.log("showMuteBtn -> " + this.showMuteBtn);
        }
        ;
        this.onTitleComfirm = fun(event: UniInputConfirmEvent) {
            var value = event.detail.value;
            if (value == "") {
                return;
            }
            this.title = value;
            console.log("title -> " + this.title);
        }
        ;
        this.onEnablePlayGestureChange = fun(value: Boolean) {
            this.enablePlayGesture = value;
            console.log("enablePlayGesture -> " + this.enablePlayGesture);
        }
        ;
        this.onVslideGestureChange = fun(value: Boolean) {
            this.vslideGesture = value;
            console.log("vslideGesture -> " + this.vslideGesture);
        }
        ;
        this.onVslideGestureInFullscreenChange = fun(value: Boolean) {
            this.vslideGestureInFullscreen = value;
            console.log("vslideGestureInFullscreen -> " + this.vslideGestureInFullscreen);
        }
        ;
        this.onCodecChange = fun(value: Number) {
            this.codec = this.codecItems[value];
            console.log("codec -> " + this.codec);
        }
        ;
        this.onHttpCacheChange = fun(value: Boolean) {
            this.httpCache = value;
            console.log("httpCache -> " + this.httpCache);
        }
        ;
        this.onPlayStrategyChange = fun(value: Number) {
            this.playStrategy = this.playStrategyItems[value];
            console.log("playStrategy -> " + this.playStrategy);
        }
        ;
        this.onHeaderComfirm = fun(event: UniInputConfirmEvent) {
            var json = JSON.parse(event.detail.value);
            if (json == null) {
                return;
            }
            this.header = json as UTSJSONObject;
            console.log("header -> " + JSON.stringify(this.header));
        }
        ;
        this.onSubCompEnableChange = fun(event: UniSwitchChangeEvent) {
            this.subCompEnable = event.detail.value;
        }
        ;
        this.onPlay = fun(res: UniEvent) {
            console.log(res.type);
            this.isPlaying = true;
            this.isPause = false;
            if (this.autoTest) {
                this.eventPlay = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                };
            }
        }
        ;
        this.onPause = fun(res: UniEvent) {
            console.log(res.type);
            this.isPlaying = false;
            this.isPause = true;
            if (this.autoTest) {
                this.eventPause = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                };
            }
        }
        ;
        this.onEnded = fun(res: UniEvent) {
            console.log(res.type);
            if (this.autoTest) {
                this.eventEnded = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                };
            }
        }
        ;
        this.onTimeUpdate = fun(res: UniVideoTimeUpdateEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            this.curPos = res.detail.currentTime;
            this.endPos = res.detail.duration;
            if (this.autoTest) {
                this.eventTimeupdate = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var currentTime = Math.trunc(res.detail.currentTime)
                    var duration = Math.trunc(res.detail.duration)
                };
            }
        }
        ;
        this.onFullScreenChange = fun(res: UniVideoFullScreenChangeEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            this.subCompShow = res.detail.fullScreen;
            if (this.autoTest) {
                this.eventFullscreenchange = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var fullScreen = res.detail.fullScreen
                    var direction = res.detail.direction
                };
            }
        }
        ;
        this.onWaiting = fun(res: UniEvent) {
            console.log(res.type);
            if (this.autoTest) {
                this.eventWaiting = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                };
            }
        }
        ;
        this.onError = fun(res: UniVideoErrorEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            this.isError = true;
            if (this.autoTest) {
                this.eventError = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var errCode = res.detail.errCode
                };
            }
        }
        ;
        this.onProgress = fun(res: UniVideoProgressEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            if (this.autoTest) {
                this.eventProgress = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var isBufferedValid = res.detail.buffered >= 0
                };
            }
        }
        ;
        this.onFullScreenClick = fun(res: UniVideoFullScreenClickEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            if (this.autoTest) {
                this.eventFullscreenclick = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var screenX = Math.trunc(res.detail.screenX)
                    var screenY = Math.trunc(res.detail.screenY)
                    var screenWidth = Math.trunc(res.detail.screenWidth)
                    var screenHeight = Math.trunc(res.detail.screenHeight)
                };
            }
        }
        ;
        this.onControlsToggle = fun(res: UniVideoControlsToggleEvent) {
            console.log(res.type + " -> " + JSON.stringify(res.detail));
            if (this.autoTest) {
                this.eventControlstoggle = object : UTSJSONObject() {
                    var tagName = res.target?.tagName
                    var type = res.type
                    var show = res.detail.show
                };
            }
        }
        ;
        this.downloadSource = fun() {
            uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4", success = fun(res){
                this.src = res.tempFilePath;
            }
            , fail = fun(_){
                this.isError = true;
            }
            ));
        }
        ;
        this.hasSubComponent = fun(): Boolean {
            val view = uni_getElementById("video")?.getAndroidView<ViewGroup>();
            return if (view == null) {
                false;
            } else {
                view.getChildAt(0) is ViewGroup;
            }
            ;
        }
        ;
    }
    open lateinit var play: () -> Unit;
    open lateinit var pause: () -> Unit;
    open lateinit var seek: (pos: Number) -> Unit;
    open lateinit var onSeekInput: (event: UniInputEvent) -> Unit;
    open lateinit var requestFullScreen: () -> Unit;
    open lateinit var exitFullScreen: () -> Unit;
    open lateinit var stop: () -> Unit;
    open lateinit var sendDanmu: () -> Unit;
    open lateinit var onSendDanmuInput: (event: UniInputEvent) -> Unit;
    open lateinit var playbackRate: () -> Unit;
    open lateinit var onPlaybackRateChange: (value: Number) -> Unit;
    open lateinit var fastBackward: () -> Unit;
    open lateinit var fastForward: () -> Unit;
    open lateinit var onSendDanmuConfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onSendDanmuKeyboardHeightChange: (event: UniInputKeyboardHeightChangeEvent) -> Unit;
    open lateinit var onSendDanmuBlur: (_: UniInputBlurEvent) -> Unit;
    open lateinit var onSrcComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onAutoplayChange: (value: Boolean) -> Unit;
    open lateinit var onLoopChange: (value: Boolean) -> Unit;
    open lateinit var onMutedChange: (value: Boolean) -> Unit;
    open lateinit var onInitialTimeComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onDurationComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onControlsChange: (value: Boolean) -> Unit;
    open lateinit var onEnableDanmuChange: (value: Boolean) -> Unit;
    open lateinit var onDanmuBtnChange: (value: Boolean) -> Unit;
    open lateinit var onPageGestureChange: (value: Boolean) -> Unit;
    open lateinit var onRequestFullScreenDirectionChange: (value: Number) -> Unit;
    open lateinit var onDirectionChange: (value: Number) -> Unit;
    open lateinit var onShowProgressChange: (value: Boolean) -> Unit;
    open lateinit var onShowFullscreenBtnChange: (value: Boolean) -> Unit;
    open lateinit var onShowPlayBtnChange: (value: Boolean) -> Unit;
    open lateinit var onShowCenterPlayBtnChange: (value: Boolean) -> Unit;
    open lateinit var onShowLoadingChange: (value: Boolean) -> Unit;
    open lateinit var onEnableProgressGestureChange: (value: Boolean) -> Unit;
    open lateinit var onObjectFitChange: (value: Number) -> Unit;
    open lateinit var onPosterComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onShowMuteBtnChange: (value: Boolean) -> Unit;
    open lateinit var onTitleComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onEnablePlayGestureChange: (value: Boolean) -> Unit;
    open lateinit var onVslideGestureChange: (value: Boolean) -> Unit;
    open lateinit var onVslideGestureInFullscreenChange: (value: Boolean) -> Unit;
    open lateinit var onCodecChange: (value: Number) -> Unit;
    open lateinit var onHttpCacheChange: (value: Boolean) -> Unit;
    open lateinit var onPlayStrategyChange: (value: Number) -> Unit;
    open lateinit var onHeaderComfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onSubCompEnableChange: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var onPlay: (res: UniEvent) -> Unit;
    open lateinit var onPause: (res: UniEvent) -> Unit;
    open lateinit var onEnded: (res: UniEvent) -> Unit;
    open lateinit var onTimeUpdate: (res: UniVideoTimeUpdateEvent) -> Unit;
    open lateinit var onFullScreenChange: (res: UniVideoFullScreenChangeEvent) -> Unit;
    open lateinit var onWaiting: (res: UniEvent) -> Unit;
    open lateinit var onError: (res: UniVideoErrorEvent) -> Unit;
    open lateinit var onProgress: (res: UniVideoProgressEvent) -> Unit;
    open lateinit var onFullScreenClick: (res: UniVideoFullScreenClickEvent) -> Unit;
    open lateinit var onControlsToggle: (res: UniVideoControlsToggleEvent) -> Unit;
    open lateinit var downloadSource: () -> Unit;
    open lateinit var hasSubComponent: () -> Boolean;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ), utsArrayOf(
                GenApp.styles
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("video" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 200)), "input" to padStyleMapOf(utsMapOf("height" to 40, "backgroundImage" to "none", "backgroundColor" to "#FFFFFF", "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13)), "margin-10" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "img-fast-backward" to padStyleMapOf(utsMapOf("width" to 40, "height" to 40, "top" to "50%", "left" to "12%", "transform" to "translate(-50%, -50%)", "position" to "absolute")), "img-fast-forward" to padStyleMapOf(utsMapOf("width" to 40, "height" to 40, "top" to "50%", "right" to "12%", "transform" to "translate(50%, -50%)", "position" to "absolute")), "input-send-danmu" to padStyleMapOf(utsMapOf("height" to 40, "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13, "marginTop" to 0, "marginRight" to CSS_VAR_STATUS_BAR_HEIGHT, "marginBottom" to 0, "marginLeft" to CSS_VAR_STATUS_BAR_HEIGHT, "bottom" to 50, "position" to "absolute", "backgroundColor" to "rgba(0,0,0,0.5)", "color" to "#FFFFFF")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
