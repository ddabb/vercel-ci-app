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
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile;
import io.dcloud.uniapp.extapi.env as uni_env;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.request as uni_request;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
import uts.sdk.modules.testInvokeNetworkApi.testInovkeRequest;
import uts.sdk.modules.testInvokeNetworkApi.CommonOptions;
import uts.sdk.modules.testInvokeNetworkApi.testInovkeUploadFile;
import io.dcloud.uniapp.extapi.uploadFile as uni_uploadFile;
open class GenPagesAPIUploadFileUploadFile : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins);
        onUnload(fun() {
            this.imageSrc = "";
            uni_hideLoading();
            this.task?.abort();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("scroll-view", utsMapOf("class" to "page-scroll-view"), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                    "title"
                )),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "demo"), utsArrayOf(
                        if (isTrue(_ctx.imageSrc)) {
                            createElementVNode("image", utsMapOf("key" to 0, "src" to _ctx.imageSrc, "class" to "image", "mode" to "widthFix"), null, 8, utsArrayOf(
                                "src"
                            ));
                        } else {
                            createElementVNode("text", utsMapOf("key" to 1, "class" to "uni-hello-addfile", "onClick" to _ctx.chooseImage), "+ 选择图片", 8, utsArrayOf(
                                "onClick"
                            ));
                        }
                    ))
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var imageSrc: String by `$data`;
    open var task: UploadTask? by `$data`;
    open var jest_result: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "uploadFile", "imageSrc" to "", "task" to null as UploadTask?, "jest_result" to false);
    }
    override fun `$initMethods`() {
        this.chooseImage = fun() {
            uni_chooseImage(ChooseImageOptions(count = 1, sizeType = utsArrayOf(
                "compressed"
            ), sourceType = utsArrayOf(
                "album"
            ), success = fun(res){
                console.log("chooseImage success, temp path is", res.tempFilePaths[0]);
                var imageSrc = res.tempFilePaths[0];
                uni_showLoading(ShowLoadingOptions(title = "上传中"));
                this.task = uni_uploadFile(UploadFileOptions(url = "https://unidemo.dcloud.net.cn/upload", filePath = imageSrc, name = "file", formData = object : UTSJSONObject() {
                    var user = "test"
                }, success = fun(res){
                    console.log("uploadImage success, res is:", res);
                    uni_showToast(ShowToastOptions(title = "上传成功", icon = "success", duration = 1000));
                    this.imageSrc = imageSrc;
                }
                , fail = fun(err){
                    console.log("uploadImage fail", err);
                    uni_showModal(ShowModalOptions(content = err.errMsg, showCancel = false));
                }
                , complete = fun(res){
                    uni_hideLoading();
                    this.task = null;
                }
                ));
            }
            , fail = fun(err){
                console.log("chooseImage fail", err);
            }
            ));
        }
        ;
        this.jest_uploadFile = fun() {
            val imageSrc = "/static/uni.png";
            uni_uploadFile(UploadFileOptions(url = "https://unidemo.dcloud.net.cn/upload", filePath = imageSrc, name = "file", formData = object : UTSJSONObject() {
                var user = "test"
            }, success = fun(_){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_uploadFile_with_uni_env = fun() {
            val filePath = "" + uni_env.USER_DATA_PATH + "/uni-app.png";
            uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png", filePath = filePath, success = fun(_){
                uni_uploadFile(UploadFileOptions(url = "https://unidemo.dcloud.net.cn/upload", filePath = filePath, name = "file", success = fun(_){
                    this.jest_result = true;
                }
                , fail = fun(_){
                    this.jest_result = false;
                }
                ));
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_set_cookie = fun() {
            uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/header/setCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_cookie_upload(true);
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_delete_cookie = fun() {
            uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/header/deleteCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_cookie_upload(false);
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_cookie_upload = fun(needCookie: Boolean) {
            val imageSrc = "/static/uni.png";
            uni_uploadFile(UploadFileOptions(url = "https://request.dcloud.net.cn/api/http/header/upload", filePath = imageSrc, name = "file", success = fun(res: UploadFileSuccess){
                val data = JSON.parseObject(res.data);
                val errCode = data?.getNumber("errCode");
                if (errCode != null && errCode == 1000) {
                    this.jest_result = if (needCookie) {
                        false;
                    } else {
                        true;
                    };
                } else {
                    this.jest_result = if (needCookie) {
                        true;
                    } else {
                        false;
                    }
                    ;
                }
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_files_upload = fun() {
            val imageSrc = "/static/uni.png";
            uni_uploadFile(UploadFileOptions(url = "https://unidemo.dcloud.net.cn/upload", files = utsArrayOf(
                UploadFileOptionFiles(name = "file1", uri = imageSrc),
                UploadFileOptionFiles(name = "file2", uri = imageSrc)
            ), success = fun(res: UploadFileSuccess){
                if (res.statusCode == 200) {
                    this.jest_result = true;
                }
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_uts_module_invoked = fun() {
            testInovkeUploadFile(CommonOptions(success = fun(res: Any){
                this.jest_result = true;
            }
            , fail = fun(err: Any){
                this.jest_result = false;
            }
            ));
        }
        ;
    }
    open lateinit var chooseImage: () -> Unit;
    open lateinit var jest_uploadFile: () -> Unit;
    open lateinit var jest_uploadFile_with_uni_env: () -> Unit;
    open lateinit var jest_set_cookie: () -> Unit;
    open lateinit var jest_delete_cookie: () -> Unit;
    open lateinit var jest_cookie_upload: (needCookie: Boolean) -> Unit;
    open lateinit var jest_files_upload: () -> Unit;
    open lateinit var jest_uts_module_invoked: () -> Unit;
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
                return utsMapOf("image" to padStyleMapOf(utsMapOf("width" to "100%")), "demo" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#ffffff", "paddingTop" to 25, "paddingRight" to 25, "paddingBottom" to 25, "paddingLeft" to 25, "justifyContent" to "center", "alignItems" to "center")), "uni-hello-addfile" to padStyleMapOf(utsMapOf("textAlign" to "center", "backgroundImage" to "none", "backgroundColor" to "#ffffff", "paddingTop" to 25, "paddingRight" to 25, "paddingBottom" to 25, "paddingLeft" to 25, "marginTop" to 10, "fontSize" to 19, "color" to "#808080")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
