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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.chooseVideo as uni_chooseVideo;
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import io.dcloud.uniapp.extapi.hideToast as uni_hideToast;
import io.dcloud.uniapp.extapi.shareWithSystem as uni_shareWithSystem;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIShareWithSystemShareWithSystem : BasePage {
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
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("scroll-view", utsMapOf("direction" to "vertical", "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("id" to "viewshot"), utsArrayOf(
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.shareText();
                }
                ), "分享文本", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.shareLink();
                }
                ), "分享链接", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateImg();
                }
                ), "分享单个本地图片", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateImgs();
                }
                ), "分享多个本地图片", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.shareAll();
                }
                ), "分享链接、文本、一张图片", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateVideo();
                }
                ), "分享video文件(单个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateVideos();
                }
                ), "分享video文件(多个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateAudio();
                }
                ), "分享Audio文件(单个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateAudios();
                }
                ), "分享Audio文件(多个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateFile();
                }
                ), "分享文件(单个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePrivateFiles();
                }
                ), "分享文件(多个)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePubImg();
                }
                ), "选择图片并分享", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.sharePubMedias();
                }
                ), "选择video并分享", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                    _ctx.shareSnapShot();
                }
                ), "指定view截图并分享", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "type" to "warn", "onClick" to fun(){
                    _ctx.sharePrivateErrorImg();
                }
                ), "分享单个本地图片(错误路径)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "type" to "warn", "onClick" to fun(){
                    _ctx.sharePrivateErrorImgs();
                }
                ), "分享多个本地图片(含有错误路径)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "type" to "warn", "onClick" to fun(){
                    _ctx.sharePrivateErrorVideos();
                }
                ), "分享Video文件(错误路径)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "type" to "warn", "onClick" to fun(){
                    _ctx.sharePrivateErrorAudios();
                }
                ), "分享Audio文件(错误路径)", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "type" to "warn", "onClick" to fun(){
                    _ctx.sharePrivateErrorFiles();
                }
                ), "分享文件(错误路径)", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 4);
    }
    open var summary: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("summary" to "欢迎使用hello uniapp-x");
    }
    override fun `$initMethods`() {
        this.sharePrivateErrorAudios = fun() {
            uni_hideToast();
            val path1: String = "/static/test-audio/ForElise.mp3";
            val path2: String = "/static/test-audio/ForElise.mp32";
            uni_shareWithSystem(ShareWithSystemOptions(audioPaths = utsArrayOf(
                path1,
                path2
            ), type = "audio", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateErrorFiles = fun() {
            uni_hideToast();
            val path1: String = "/static/filemanager1/to.zip";
            val path2: String = "/static/filemanager/11.txt.br";
            uni_shareWithSystem(ShareWithSystemOptions(filePaths = utsArrayOf(
                path1,
                path2
            ), type = "file", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateFile = fun() {
            uni_hideToast();
            val path1: String = "/static/filemanager/to.zip";
            uni_shareWithSystem(ShareWithSystemOptions(filePaths = utsArrayOf(
                path1
            ), type = "file", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateFiles = fun() {
            uni_hideToast();
            val path1: String = "/static/filemanager/to.zip";
            val path2: String = "/static/filemanager/1.txt.br";
            uni_shareWithSystem(ShareWithSystemOptions(filePaths = utsArrayOf(
                path1,
                path2
            ), type = "file", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateAudio = fun() {
            uni_hideToast();
            val path1: String = "/static/test-audio/ForElise.mp3";
            uni_shareWithSystem(ShareWithSystemOptions(audioPaths = utsArrayOf(
                path1
            ), type = "audio", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateAudios = fun() {
            uni_hideToast();
            val path1: String = "/static/test-audio/ForElise.mp3";
            val path2: String = "/static/test-audio/ForElise.mp3";
            uni_shareWithSystem(ShareWithSystemOptions(audioPaths = utsArrayOf(
                path1,
                path2
            ), type = "audio", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateErrorVideos = fun() {
            uni_hideToast();
            val path1: String = "/static/test-video/10second-demo.mp4";
            val path2: String = "/static/test-video/10second-demo1.mp4";
            uni_shareWithSystem(ShareWithSystemOptions(videoPaths = utsArrayOf(
                path1,
                path2
            ), type = "video", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateVideo = fun() {
            uni_hideToast();
            val path1: String = "/static/test-video/10second-demo.mp4";
            uni_shareWithSystem(ShareWithSystemOptions(videoPaths = utsArrayOf(
                path1
            ), type = "video", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateVideos = fun() {
            uni_hideToast();
            val path1: String = "/static/test-video/10second-demo.mp4";
            val path2: String = "/static/test-video/10second-demo.mp4";
            uni_shareWithSystem(ShareWithSystemOptions(videoPaths = utsArrayOf(
                path1,
                path2
            ), type = "video", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePubMedias = fun() {
            uni_hideToast();
            uni_chooseVideo(ChooseVideoOptions(success = fun(res) {
                uni_shareWithSystem(ShareWithSystemOptions(videoPaths = utsArrayOf(
                    res.tempFilePath
                ), type = "video", success = fun(_) {
                    console.log("Shared----------------------------success");
                }
                , fail = fun(res) {
                    console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                    uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
                }
                , complete = fun(_) {}));
            }
            ));
        }
        ;
        this.shareText = fun() {
            uni_hideToast();
            uni_shareWithSystem(ShareWithSystemOptions(summary = this.summary, type = "text", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.shareLink = fun() {
            uni_hideToast();
            uni_shareWithSystem(ShareWithSystemOptions(type = "text", href = "https://uniapp.dcloud.io", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateImg = fun() {
            uni_hideToast();
            val imageSrc: String = "/static/test-image/logo.gif";
            uni_shareWithSystem(ShareWithSystemOptions(type = "image", imageUrl = imageSrc, success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateErrorImg = fun() {
            uni_hideToast();
            val imageSrc: String = "/static/test-image/logo.jpg11";
            uni_shareWithSystem(ShareWithSystemOptions(imageUrl = imageSrc, type = "image", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateImgs = fun() {
            uni_hideToast();
            val errorImageSrc2: String = "/static/test-image/logo.png";
            val imageSrc: String = "/static/test-image/logo.jpg";
            var imageUrlList: UTSArray<String> = UTSArray();
            imageUrlList.push(errorImageSrc2);
            imageUrlList.push(imageSrc);
            uni_shareWithSystem(ShareWithSystemOptions(imagePaths = imageUrlList, type = "image", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePrivateErrorImgs = fun() {
            uni_hideToast();
            val errorImageSrc1: String = "/static/test-image/logo.jpg1";
            val errorImageSrc2: String = "/static/test-image/logo.jpg3";
            val imageSrc: String = "/static/test-image/logo.jpg";
            var imageUrlList: UTSArray<String> = UTSArray();
            imageUrlList.push(imageSrc);
            imageUrlList.push(errorImageSrc1);
            imageUrlList.push(errorImageSrc2);
            uni_shareWithSystem(ShareWithSystemOptions(imagePaths = imageUrlList, type = "image", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.shareAll = fun() {
            uni_hideToast();
            val imageSrc: String = "/static/test-video/fast-forward.png";
            var imageUrlList: UTSArray<String> = UTSArray();
            imageUrlList.push(imageSrc);
            uni_shareWithSystem(ShareWithSystemOptions(summary = this.summary, href = "https://uniapp.dcloud.io", imagePaths = imageUrlList, type = "image", success = fun(_) {
                console.log("Shared----------------------------success");
            }
            , fail = fun(res) {
                console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
            }
            , complete = fun(_) {}));
        }
        ;
        this.sharePubImg = fun() {
            uni_hideToast();
            uni_chooseImage(ChooseImageOptions(count = 3, sourceType = utsArrayOf(
                "camera",
                "album"
            ), success = fun(e) {
                console.log(e);
                console.log(JSON.stringify(e));
                uni_shareWithSystem(ShareWithSystemOptions(imagePaths = e.tempFilePaths, type = "image", success = fun(_) {
                    console.log("Shared----------------------------success");
                }
                , fail = fun(res) {
                    console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                    uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
                }
                , complete = fun(_) {}));
            }
            ));
        }
        ;
        this.shareSnapShot = fun() {
            uni_hideToast();
            uni_getElementById("viewshot")?.takeSnapshot(TakeSnapshotOptions(success = fun(res) {
                uni_shareWithSystem(ShareWithSystemOptions(imageUrl = res.tempFilePath, type = "image", success = fun(_) {
                    console.log("Shared----------------------------success");
                }
                , fail = fun(res) {
                    console.log("Share failed, res.errCode =" + res.errCode + "---res.errMsg= " + res.errMsg);
                    uni_showToast(ShowToastOptions(icon = "error", title = "errorCode=" + res.errCode));
                }
                , complete = fun(_) {}));
            }
            , fail = fun(res) {
                console.log(res);
                uni_showToast(ShowToastOptions(icon = "error", title = "截图失败"));
            }
            ));
        }
        ;
    }
    open lateinit var sharePrivateErrorAudios: () -> Unit;
    open lateinit var sharePrivateErrorFiles: () -> Unit;
    open lateinit var sharePrivateFile: () -> Unit;
    open lateinit var sharePrivateFiles: () -> Unit;
    open lateinit var sharePrivateAudio: () -> Unit;
    open lateinit var sharePrivateAudios: () -> Unit;
    open lateinit var sharePrivateErrorVideos: () -> Unit;
    open lateinit var sharePrivateVideo: () -> Unit;
    open lateinit var sharePrivateVideos: () -> Unit;
    open lateinit var sharePubMedias: () -> Unit;
    open lateinit var shareText: () -> Unit;
    open lateinit var shareLink: () -> Unit;
    open lateinit var sharePrivateImg: () -> Unit;
    open lateinit var sharePrivateErrorImg: () -> Unit;
    open lateinit var sharePrivateImgs: () -> Unit;
    open lateinit var sharePrivateErrorImgs: () -> Unit;
    open lateinit var shareAll: () -> Unit;
    open lateinit var sharePubImg: () -> Unit;
    open lateinit var shareSnapShot: () -> Unit;
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
                return utsMapOf("button" to padStyleMapOf(utsMapOf("marginLeft" to 30, "marginRight" to 30, "marginBottom" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
