@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIFB90797;
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
import io.dcloud.uniapp.extapi.createInnerAudioContext as uni_createInnerAudioContext;
import io.dcloud.uniapp.extapi.env as uni_env;
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager;
open class GenPagesAPICreateInnerAudioContextInnerAudioPath : BasePage {
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
            this._audioContext = uni_createInnerAudioContext();
            this._audioContext!!.onPlay(fun(_result){
                console.log("开始播放");
            }
            );
            this._audioContext!!.onEnded(fun(_result){
                console.log("播放结束");
                this.isPlaying = false;
            }
            );
            this._audioContext!!.onError(fun(err){
                this.isPlaying = false;
                console.log("err", err);
            }
            );
            val fileManager = uni_getFileSystemManager();
            fileManager.mkdir(MkDirOptions(dirPath = uni_env.CACHE_PATH + "uni-audio/test", recursive = true, success = fun(res){
                fileManager.copyFile(CopyFileOptions(srcPath = "/static/test-audio/ForElise.mp3", destPath = this.nativePath, success = fun(_res){
                    console.log("copy成功： ", res);
                }
                ));
            }
            , fail = fun(err){
                console.log("创建路径失败： ", err.errMsg);
                if (err.errMsg.includes("file already exists")) {
                    console.log("已经包含该路径");
                    fileManager.copyFile(CopyFileOptions(srcPath = "/static/test-audio/ForElise.mp3", destPath = this.nativePath, success = fun(res){
                        console.log("copy成功： ", res);
                    }
                    , fail = fun(err){
                        console.log("copy失败： ", err);
                    }
                    ));
                }
            }
            ));
        }
        , __ins);
        onUnload(fun() {
            if (this._audioContext != null) {
                this.pause();
                this._audioContext!!.destroy();
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), "音频路径示例")
                )),
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.supportPaths, fun(item, index, __index, _cached): Any {
                    return createElementVNode("view", utsMapOf("class" to "formats", "key" to index), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), toDisplayString(item.description), 1),
                        createElementVNode("image", utsMapOf("class" to "icon-play", "src" to if ((_ctx.isPlaying && _ctx.playIndex == index)) {
                            "/static/pause.png";
                        } else {
                            "/static/play.png";
                        }
                        , "onClick" to fun(){
                            _ctx.play(item.src, index);
                        }
                        ), null, 8, utsArrayOf(
                            "src",
                            "onClick"
                        ))
                    ));
                }
                ), 128)
            ))
        ), 64);
    }
    open var title: String by `$data`;
    open var playIndex: Number by `$data`;
    open var isPlaying: Boolean by `$data`;
    open var nativePath: String by `$data`;
    open var sdcardPath: String by `$data`;
    open var _audioContext: InnerAudioContext? by `$data`;
    open var supportPaths: UTSArray<AudioPath> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "audio-path", "playIndex" to 0, "isPlaying" to false, "nativePath" to uni_env.CACHE_PATH + "uni-audio/test/test.mp3" as String, "sdcardPath" to "sdcard/uni-audio/test.mp3", "_audioContext" to null as InnerAudioContext?, "supportPaths" to utsArrayOf<AudioPath>(AudioPath(description = "本地路径：/static方式", src = "/static/test-audio/ForElise.mp3"), AudioPath(description = "本地路径：../static/", src = "../../../static/test-audio/ForElise.mp3"), AudioPath(description = "本地路径：env方式", src = "env"), AudioPath(description = "网络路径", src = "https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.mp3"), AudioPath(description = "不存在的音频", src = "https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/invalid_url.mp3"), AudioPath(description = "错误路径", src = "../static/test-audio/ForElise22.mp3")));
    }
    override fun `$initMethods`() {
        this.pause = fun() {
            this._audioContext!!.pause();
            this.isPlaying = false;
        }
        ;
        this.play = fun(reassignedAudioUrl: String, index: Number) {
            var audioUrl = reassignedAudioUrl;
            console.log(index, audioUrl);
            if (this.isPlaying && this.playIndex == index) {
                this.pause();
                return;
            }
            if (audioUrl == "env") {
                audioUrl = this.nativePath;
            }
            this.playIndex = index;
            this._audioContext!!.src = audioUrl;
            this._audioContext!!.play();
            this.isPlaying = true;
        }
        ;
    }
    open lateinit var pause: () -> Unit;
    open lateinit var play: (audioUrl: String, index: Number) -> Unit;
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
                return utsMapOf("formats" to padStyleMapOf(utsMapOf("alignItems" to "center")), "icon-play" to padStyleMapOf(utsMapOf("width" to 60, "height" to 60, "marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
