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
import io.dcloud.uniapp.extapi.getUniverifyManager as uni_getUniverifyManager;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesAPIGetUniverifyManagerGetUniverifyManager : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            this.univerifyManager = uni_getUniverifyManager();
            this.preLogin(fun(){});
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("view", null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "default", "onClick" to fun(){
                        _ctx.verify(false);
                    }
                    ), "一键登录（半屏）", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "default", "onClick" to fun(){
                        _ctx.verify(true);
                    }
                    ), "一键登录（全屏）", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "default", "onClick" to fun(){
                        _ctx.customLoginIn();
                    }
                    ), "一键登录（自定义页面）", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var univerifyManager: UniverifyManager? by `$data`;
    open var phone: String by `$data`;
    open var slogan: String by `$data`;
    open var privacyName: String by `$data`;
    open var privacyUrl: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "一键登录", "univerifyManager" to null as UniverifyManager?, "phone" to "", "slogan" to "", "privacyName" to "", "privacyUrl" to "");
    }
    override fun `$initMethods`() {
        this.customLoginIn = fun() {
            val isPreLoginValid = this.univerifyManager?.isPreLoginValid() ?: false;
            if (isPreLoginValid) {
                this.pushCustomPage();
            } else {
                this.preLogin(fun(){
                    this.pushCustomPage();
                }
                );
            }
        }
        ;
        this.pushCustomPage = fun() {
            val url = "/pages/API/get-univerify-manager/univerify-custom-page?phone=" + this.phone + "&slogan=" + this.slogan + "&name=" + this.privacyName + "&link=" + this.privacyUrl;
            uni_openDialogPage(OpenDialogPageOptions(url = url, animationType = "slide-in-bottom", success = fun(res) {
                console.log("成功打开自定义登录页面");
            }
            , fail = fun(err) {
                console.log(err);
            }
            ));
        }
        ;
        this.verify = fun(fullScreen: Boolean) {
            val isPreLoginValid = this.univerifyManager?.isPreLoginValid() ?: false;
            if (isPreLoginValid) {
                this.login(fullScreen);
            } else {
                this.preLogin(fun(){
                    this.login(fullScreen);
                }
                );
            }
        }
        ;
        this.preLogin = fun(callback: (() -> Unit)) {
            this.univerifyManager?.preLogin(UniVerifyManagerPreLoginOptions(success = fun(res){
                this.phone = res.number;
                this.slogan = res.slogan;
                this.privacyName = res.privacyName;
                this.privacyUrl = res.privacyUrl;
                console.log("pre login success");
                callback();
            }
            , fail = fun(err){
                console.error("pre login fail => " + JSON.stringify(err));
                uni_showModal(ShowModalOptions(title = "预登录失败", content = JSON.parseObject(err.cause?.cause?.message ?: "")?.getString("errorDesc") ?: err.errMsg, showCancel = false));
            }
            ));
        }
        ;
        this.login = fun(fullScreen: Boolean) {
            this.univerifyManager?.login(UniVerifyManagerLoginOptions(univerifyStyle = UniVerifyManagerLoginStyle(fullScreen = fullScreen, backgroundColor = "#FFFFFF", loginBtnText = "一键登录", logoPath = "/static/logo.png"), success = fun(res){
                console.log("login success => " + JSON.stringify(res));
                this.takePhoneNumber(res.accessToken, res.openId);
            }
            , fail = fun(err){
                console.error("login fail => " + err);
                uni_showModal(ShowModalOptions(title = "登录失败", content = JSON.parseObject(err.cause?.cause?.message ?: "")?.getString("errorDesc") ?: err.errMsg, showCancel = false));
            }
            ));
        }
        ;
        this.takePhoneNumber = fun(accessToken: String, openId: String) {
            uniCloud.callFunction(UniCloudCallFunctionOptions(name = "univerify", data = object : UTSJSONObject() {
                var access_token = accessToken
                var openid = openId
            })).then(fun(res){
                this.univerifyManager?.close();
                setTimeout(fun(){
                    uni_showModal(ShowModalOptions(title = "取号成功", content = res.result.getJSON("res")?.getString("phoneNumber"), showCancel = false));
                }
                , 100);
            }
            ).`catch`(fun(err){
                console.error(JSON.stringify(err));
                this.univerifyManager?.close();
                setTimeout(fun(){
                    uni_showModal(ShowModalOptions(title = "取号失败", content = (err as UTSError).message, showCancel = false));
                }
                , 100);
            }
            );
        }
        ;
    }
    open lateinit var customLoginIn: () -> Unit;
    open lateinit var pushCustomPage: () -> Unit;
    open lateinit var verify: (fullScreen: Boolean) -> Unit;
    open lateinit var preLogin: (callback: (() -> Unit)) -> Unit;
    open lateinit var login: (fullScreen: Boolean) -> Unit;
    open lateinit var takePhoneNumber: (accessToken: String, openId: String) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(), utsArrayOf(
                GenApp.styles
            ))
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
