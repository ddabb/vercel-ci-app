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
import io.dcloud.uniapp.extapi.request as uni_request;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
import uts.sdk.modules.testInvokeNetworkApi.testInovkeRequest;
import uts.sdk.modules.testInvokeNetworkApi.CommonOptions;
open class GenPagesAPIRequestRequest : BasePage {
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
            uni_hideLoading();
            this.task?.abort();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-common-mt", "style" to normalizeStyle(utsMapOf("border-width" to "2px", "border-style" to "solid", "border-radius" to "4px"))), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("value" to _ctx.res, "class" to "uni-textarea", "style" to normalizeStyle(utsMapOf("width" to "100%"))), null, 12, utsArrayOf(
                        "value"
                    ))
                ), 4),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("text", null, "地址 : " + toDisplayString(_ctx.host + _ctx.url), 1),
                    createElementVNode("text", null, "请求方式 : " + toDisplayString(_ctx.method), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.sendRequest), "发起请求", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "show-scrollbar" to "true"), utsArrayOf(
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "20px"))), utsArrayOf(
                    createElementVNode("text", null, "设置请求方式"),
                    createElementVNode("view", utsMapOf("class" to "uni-common-pb")),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "flex-wrap" to "wrap"))), utsArrayOf(
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("GET");
                        }
                        ), "GET", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("POST");
                        }
                        ), "POST", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("PUT");
                        }
                        ), "PUT", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("DELETE");
                        }
                        ), "DELETE", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("PATCH");
                        }
                        ), "PATCH", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("OPTIONS");
                        }
                        ), "OPTIONS", 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("HEAD");
                        }
                        ), "HEAD", 12, utsArrayOf(
                            "onClick"
                        ))
                    ), 4)
                ), 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "20px"))), utsArrayOf(
                    createElementVNode("text", null, "请求返回错误码的接口（默认为GET）"),
                    createElementVNode("view", utsMapOf("class" to "uni-common-pb")),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "flex-wrap" to "wrap"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.errorCodeUrls, fun(item, index, __index, _cached): Any {
                            return createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item);
                            }
                            ), toDisplayString(item), 13, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 128)
                    ), 4)
                ), 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "20px"))), utsArrayOf(
                    createElementVNode("text", null, "请求不同header的接口（默认为GET）"),
                    createElementVNode("view", utsMapOf("class" to "uni-common-pb")),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "flex-wrap" to "wrap"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.headerUrls, fun(item, index, __index, _cached): Any {
                            return createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item);
                            }
                            ), toDisplayString(item), 13, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 128)
                    ), 4)
                ), 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "20px"))), utsArrayOf(
                    createElementVNode("text", null, "请求不同content-type的接口（默认为GET）"),
                    createElementVNode("view", utsMapOf("class" to "uni-common-pb")),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "flex-wrap" to "wrap"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.contentTypeUrls, fun(item, index, __index, _cached): Any {
                            return createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item);
                            }
                            ), toDisplayString(item), 13, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 128)
                    ), 4)
                ), 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "20px"))), utsArrayOf(
                    createElementVNode("text", null, "POST请求(有body)"),
                    createElementVNode("view", utsMapOf("class" to "uni-common-pb")),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "flex-wrap" to "wrap"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.postUrls, fun(item, index, __index, _cached): Any {
                            return createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrlFromPost(item);
                            }
                            ), toDisplayString(item), 13, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 128)
                    ), 4)
                ), 4)
            ), 4)
        ), 4);
    }
    open var title: String by `$data`;
    open var res: String by `$data`;
    open var task: RequestTask? by `$data`;
    open var host: String by `$data`;
    open var url: String by `$data`;
    open var method: RequestMethod? by `$data`;
    open var data: Any? by `$data`;
    open var header: UTSJSONObject? by `$data`;
    open var errorCodeUrls: UTSArray<String> by `$data`;
    open var headerUrls: UTSArray<String> by `$data`;
    open var contentTypeUrls: UTSArray<String> by `$data`;
    open var postUrls: UTSArray<String> by `$data`;
    open var jest_result: Boolean by `$data`;
    open var jest_result_data: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "request", "res" to "", "task" to null as RequestTask?, "host" to "https://request.dcloud.net.cn", "url" to "/api/http/method/get", "method" to "GET" as RequestMethod?, "data" to null as Any?, "header" to null as UTSJSONObject?, "errorCodeUrls" to utsArrayOf(
            "/api/http/statusCode/200",
            "/api/http/statusCode/204",
            "/api/http/statusCode/301",
            "/api/http/statusCode/302",
            "/api/http/statusCode/307",
            "/api/http/statusCode/400",
            "/api/http/statusCode/401",
            "/api/http/statusCode/403",
            "/api/http/statusCode/404",
            "/api/http/statusCode/405",
            "/api/http/statusCode/500",
            "/api/http/statusCode/502",
            "/api/http/statusCode/503",
            "/api/http/statusCode/504"
        ), "headerUrls" to utsArrayOf(
            "/api/http/header/ua",
            "/api/http/header/referer",
            "/api/http/header/requestCookie",
            "/api/http/header/setCookie",
            "/api/http/header/deleteCookie"
        ), "contentTypeUrls" to utsArrayOf(
            "/api/http/contentType/text/plain",
            "/api/http/contentType/text/html",
            "/api/http/contentType/text/xml",
            "/api/http/contentType/image/gif",
            "/api/http/contentType/image/jpeg",
            "/api/http/contentType/image/png",
            "/api/http/contentType/application/json",
            "/api/http/contentType/application/octetStream"
        ), "postUrls" to utsArrayOf(
            "/api/http/contentType/json",
            "/api/http/contentType/xWwwFormUrlencoded"
        ), "jest_result" to false, "jest_result_data" to "");
    }
    override fun `$initMethods`() {
        this.changeMethod = fun(e: RequestMethod) {
            this.method = e;
            this.url = methodMap[e] as String;
            this.data = null;
            this.header = null;
        }
        ;
        this.changeUrl = fun(e: String) {
            this.method = "GET";
            this.url = e;
            this.data = null;
            this.header = null;
        }
        ;
        this.changeUrlFromPost = fun(e: String) {
            this.method = "POST";
            this.url = e;
            when (e) {
                "/api/http/contentType/json" -> 
                    {
                        this.header = object : UTSJSONObject() {
                            var `Content-Type` = "application/json"
                        };
                        this.data = object : UTSJSONObject() {
                            var hello = "world"
                        };
                    }
                "/api/http/contentType/xWwwFormUrlencoded" -> 
                    {
                        this.header = object : UTSJSONObject() {
                            var `Content-Type` = "application/x-www-form-urlencoded"
                        };
                        this.data = "hello=world";
                    }
            }
        }
        ;
        this.sendRequest = fun() {
            uni_showLoading(ShowLoadingOptions(title = "请求中..."));
            this.task = uni_request<Any>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res){
                console.log("request success", JSON.stringify(res.data));
                console.log("request success header is :", JSON.stringify(res.header));
                uni_showToast(ShowToastOptions(title = "请求成功", icon = "success", mask = true, duration = duration));
                this.res = "请求结果 : " + JSON.stringify(res);
            }
            , fail = fun(err){
                console.log("request fail", err);
                uni_showModal(ShowModalOptions(content = err.errMsg, showCancel = false));
            }
            , complete = fun(_){
                uni_hideLoading();
                this.task = null;
            }
            ));
        }
        ;
        this.jest_request = fun() {
            uni_request<Any>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_set_cookie = fun() {
            uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/setCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_cookie_request(true);
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_set_cookie_expires = fun() {
            uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/setCookie?expires=5", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_cookie_request(true);
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_delete_cookie = fun() {
            uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/deleteCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_cookie_request(false);
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_cookie_request = fun(needCookie: Boolean) {
            uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/requestCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res){
                val requestCookie = (res.data as UTSJSONObject).getJSON("data")?.getAny("requestCookie");
                this.jest_result_data = JSON.stringify(requestCookie);
                if (requestCookie is UTSArray<*>) {
                    this.jest_result = if (needCookie) {
                        requestCookie.length > 0;
                    } else {
                        requestCookie.length == 0;
                    };
                } else {
                    this.jest_result = if (needCookie) {
                        (requestCookie as UTSJSONObject).toMap().size > 0;
                    } else {
                        (requestCookie as UTSJSONObject).toMap().size == 0;
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
        this.jest_timeout_null = fun() {
            uni_request<Any>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_get_with_data = fun() {
            uni_request<Any>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/banner/36kr", method = "GET", data = object : UTSJSONObject() {
                var column = "id,post_id,title,author_name,cover,published_at"
            }, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_get_with_generics = fun() {
            uni_request<GETDataType>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<GETDataType>){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_get_array = fun() {
            uni_request<UTSArray<UTSJSONObject>>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/news?column=title,author_name,cover,published_at", method = "GET", success = fun(res: RequestSuccess<UTSArray<UTSJSONObject>>){
                if (res.statusCode == 200 && UTSArray.isArray(res.data)) {
                    this.jest_result = true;
                } else {
                    this.jest_result = false;
                }
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_uts_module_invoked = fun() {
            testInovkeRequest(CommonOptions(success = fun(res: Any){
                this.jest_result = true;
            }
            , fail = fun(err: Any){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_respone_json_string = fun() {
            uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/contentType/text/json", success = fun(res: RequestSuccess<Any>){
                this.jest_result = UTSAndroid.`typeof`( res.data) == "object";
            }
            , fail = fun(e: RequestFail){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_respone_with_string_generics = fun() {
            uni_request<String>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<String>){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
        this.jest_respone_with_404_and_string_generics = fun() {
            uni_request<String>(RequestOptions(url = this.host + "/api/http/statusCode/404", method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<String>){
                this.jest_result = true;
            }
            , fail = fun(_){
                this.jest_result = false;
            }
            ));
        }
        ;
    }
    open lateinit var changeMethod: (e: RequestMethod) -> Unit;
    open lateinit var changeUrl: (e: String) -> Unit;
    open lateinit var changeUrlFromPost: (e: String) -> Unit;
    open lateinit var sendRequest: () -> Unit;
    open lateinit var jest_request: () -> Unit;
    open lateinit var jest_set_cookie: () -> Unit;
    open lateinit var jest_set_cookie_expires: () -> Unit;
    open lateinit var jest_delete_cookie: () -> Unit;
    open lateinit var jest_cookie_request: (needCookie: Boolean) -> Unit;
    open lateinit var jest_timeout_null: () -> Unit;
    open lateinit var jest_get_with_data: () -> Unit;
    open lateinit var jest_get_with_generics: () -> Unit;
    open lateinit var jest_get_array: () -> Unit;
    open lateinit var jest_uts_module_invoked: () -> Unit;
    open lateinit var jest_respone_json_string: () -> Unit;
    open lateinit var jest_respone_with_string_generics: () -> Unit;
    open lateinit var jest_respone_with_404_and_string_generics: () -> Unit;
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
