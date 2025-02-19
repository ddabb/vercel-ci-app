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
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.hideToast as uni_hideToast;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesAPIUnicloudUnicloudCloudFunction : BasePage {
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
            if (this.isUniTest) {
                uni_hideToast();
            }
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
                    createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                        createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.callFunction), "请求云函数", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.callFunctionWithGeneric), "请求云函数传入泛型", 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var callFunctionResult: UTSJSONObject by `$data`;
    open var callFunctionError: UTSJSONObject by `$data`;
    open var genericDemoShowMessage: String by `$data`;
    open var isUniTest: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "请求云函数", "callFunctionResult" to UTSJSONObject(), "callFunctionError" to UTSJSONObject(), "genericDemoShowMessage" to "", "isUniTest" to false);
    }
    override fun `$initMethods`() {
        this.notify = fun(content: String, title: String) {
            if (!this.isUniTest) {
                uni_showModal(ShowModalOptions(title = title, content = content, showCancel = false));
            } else {
                console.log(title, content);
            }
        }
        ;
        this.callFunctionWithGeneric = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    open class EchoCfResult (
                        @JsonNotNull
                        open var showMessage: String,
                    ) : UTSObject()
                    uni_showLoading(ShowLoadingOptions(title = "加载中..."));
                    await(uniCloud.callFunction<EchoCfResult>(UniCloudCallFunctionOptions(name = "echo-cf", data = object : UTSJSONObject() {
                        var num: Number = 1
                        var str = "ABC"
                    })).then(fun(res){
                        val result = res.result;
                        uni_hideLoading();
                        this.genericDemoShowMessage = result.showMessage;
                        this.notify(result.showMessage, "提示");
                    }
                    ).`catch`(fun(err: Any?){
                        val error = err as UniCloudError;
                        this.callFunctionError = object : UTSJSONObject() {
                            var errCode = error.errCode
                            var errMsg = error.errMsg
                        };
                        uni_hideLoading();
                        this.notify(error.errMsg, "错误");
                    }
                    ));
            });
        }
        ;
        this.callFunction = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    uni_showLoading(ShowLoadingOptions(title = "加载中..."));
                    await(uniCloud.callFunction(UniCloudCallFunctionOptions(name = "echo-cf", data = object : UTSJSONObject() {
                        var num: Number = 1
                        var str = "ABC"
                    })).then(fun(res){
                        val result = res.result;
                        this.callFunctionResult = result;
                        console.log(JSON.stringify(result));
                        uni_hideLoading();
                        this.notify(result["showMessage"] as String, "提示");
                    }
                    ).`catch`(fun(err: Any?){
                        val error = err as UniCloudError;
                        this.callFunctionError = object : UTSJSONObject() {
                            var errCode = error.errCode
                            var errMsg = error.errMsg
                        };
                        uni_hideLoading();
                        this.notify(error.errMsg, "错误");
                    }
                    ));
            });
        }
        ;
        this.jest_UniCloudError = fun(): Boolean {
            return UTSError() is UniCloudError;
        }
        ;
    }
    open lateinit var notify: (content: String, title: String) -> Unit;
    open lateinit var callFunctionWithGeneric: () -> UTSPromise<Unit>;
    open lateinit var callFunction: () -> UTSPromise<Unit>;
    open lateinit var jest_UniCloudError: () -> Boolean;
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
