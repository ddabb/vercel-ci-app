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
import io.dcloud.uniapp.extapi.`$emit` as uni__emit;
import io.dcloud.uniapp.extapi.`$off` as uni__off;
import io.dcloud.uniapp.extapi.`$on` as uni__on;
import io.dcloud.uniapp.extapi.`$once` as uni__once;
open class GenPagesAPIEventBusEventBus : BasePage {
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
        return createElementVNode("scroll-view", utsMapOf("class" to "page-scroll-view"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "box"), utsArrayOf(
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.on), "开始监听", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.once), "监听一次", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.off), "取消监听", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.emit), "触发监听", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.clear), "清空消息", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-btn"), "收到的消息："),
                    createElementVNode("view", utsMapOf("class" to "uni-btn"), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.log, fun(item, index, __index, _cached): Any {
                            return createElementVNode("view", utsMapOf("key" to index), toDisplayString(item), 1);
                        }
                        ), 128)
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.onObj), "开始监听 obj 参数", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.emitWithObj), "触发监听 obj 参数", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-btn"), utsArrayOf(
                        createElementVNode("text", null, "接收到的 obj 参数："),
                        createElementVNode("text", null, toDisplayString(JSON.stringify(_ctx.objArg)), 1)
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.testReturnId), "测试返回 id", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.testEmitNoArgs), "测试 \$emit 无参", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.testEmitMultipleArgs), "测试 \$emit 多个参数", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            ))
        ));
    }
    open var log: UTSArray<String> by `$data`;
    open var objArg: UTSJSONObject by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("log" to utsArrayOf<String>(), "objArg" to UTSJSONObject());
    }
    override fun `$initMethods`() {
        this.fn = fun(res: String) {
            this.log.push(res);
        }
        ;
        this.fn2 = fun(res: String) {
            this.log.push(res);
        }
        ;
        this.on = fun() {
            uni__on("test", this.fn);
        }
        ;
        this.on2 = fun() {
            uni__on("test", this.fn2);
        }
        ;
        this.onObj = fun() {
            uni__on("test-obj", fun(res: UTSJSONObject){
                this.objArg = res;
            }
            );
        }
        ;
        this.once = fun() {
            uni__once("test", this.fn);
        }
        ;
        this.off = fun() {
            uni__off("test", this.fn);
        }
        ;
        this.offAll = fun() {
            uni__off("test", null);
        }
        ;
        this.emit = fun() {
            uni__emit("test", "msg:" + Date.now());
        }
        ;
        this.emitWithObj = fun() {
            uni__emit("test-obj", object : UTSJSONObject() {
                var a: Number = 1
                var b: Number = 2
            });
        }
        ;
        this.clear = fun() {
            this.log.length = 0;
        }
        ;
        this.testReturnId = fun() {
            val id1 = uni__on("test-return-id", this.fn);
            uni__emit("test-return-id", "触发 test-return-id \$on fn");
            uni__off("test-return-id", id1);
            uni__emit("test-return-id", "触发 test-return-id \$on fn");
            uni__once("test-return-id", this.fn);
            uni__emit("test-return-id", "触发 test-return-id \$once fn");
            uni__emit("test-return-id", "触发 test-return-id \$once fn");
            val id2 = uni__once("test-id", this.fn);
            uni__off("test-return-id", id2);
            uni__emit("test-return-id", "触发 test-return-id \$once fn");
        }
        ;
        this.testEmitNoArgs = fun() {
            uni__on("test-emit-no-args", fun(){
                this.log.push("test-emit-no-args");
            }
            );
            uni__emit("test-emit-no-args", null);
            uni__off("test-emit-no-args", null);
        }
        ;
        this.testEmitMultipleArgs = fun() {
            uni__on("test-emit-multiple-args", fun(arg1: String, arg2: Number){
                this.log.push("" + arg1 + "_" + arg2);
            }
            );
            uni__emit("test-emit-multiple-args", "arg1", 2);
            uni__off("test-emit-multiple-args", null);
        }
        ;
    }
    open lateinit var fn: (res: String) -> Unit;
    open lateinit var fn2: (res: String) -> Unit;
    open lateinit var on: () -> Unit;
    open lateinit var on2: () -> Unit;
    open lateinit var onObj: () -> Unit;
    open lateinit var once: () -> Unit;
    open lateinit var off: () -> Unit;
    open lateinit var offAll: () -> Unit;
    open lateinit var emit: () -> Unit;
    open lateinit var emitWithObj: () -> Unit;
    open lateinit var clear: () -> Unit;
    open lateinit var testReturnId: () -> Unit;
    open lateinit var testEmitNoArgs: () -> Unit;
    open lateinit var testEmitMultipleArgs: () -> Unit;
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
                return utsMapOf("box" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
