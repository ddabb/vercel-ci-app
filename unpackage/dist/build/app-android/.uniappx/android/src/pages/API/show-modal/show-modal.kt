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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesAPIShowModalShowModal : BasePage {
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
            uni_showModal(ShowModalOptions(title = "onLoad 调用示例,请手动取消", showCancel = false));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                    "title"
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createVNode(_component_radio_group, utsMapOf("onChange" to _ctx.radioChange), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                                return createVNode(_component_radio, utsMapOf("class" to normalizeClass(utsArrayOf(
                                    "uni-list-cell uni-list-cell-pd",
                                    if (index < _ctx.items.length - 1) {
                                        "uni-list-cell-line";
                                    } else {
                                        "";
                                    }
                                )), "key" to item.value, "value" to item.value, "checked" to (index === _ctx.current)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        toDisplayString(item.name)
                                    );
                                }
                                ), "_" to 2), 1032, utsArrayOf(
                                    "class",
                                    "value",
                                    "checked"
                                ));
                            }
                            ), 128)
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否显示取消按钮"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.showCancelSelect, "onChange" to _ctx.showCancelChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "定制取消文案"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.cancelTextSelect, "onChange" to _ctx.cancelTextChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "定制确认文案"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.confirmTextSelect, "onChange" to _ctx.confirmTextChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否显示输入框"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.editableSelect, "onChange" to _ctx.editableChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否定制输入提示词"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.placeholderTextSelect, "onChange" to _ctx.placeholderTextChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                        createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "default", "onClick" to _ctx.modalTap, "id" to "btn-modal-show"), " modal测试 ", 8, utsArrayOf(
                            "onClick"
                        ))
                    )),
                    createElementVNode("text", null, toDisplayString(_ctx.exeRet), 1)
                ))
            ))
        ), 4);
    }
    open var title: String by `$data`;
    open var showCancelSelect: Boolean by `$data`;
    open var cancelTextSelect: Boolean by `$data`;
    open var confirmTextSelect: Boolean by `$data`;
    open var editableSelect: Boolean by `$data`;
    open var placeholderTextSelect: Boolean by `$data`;
    open var exeRet: String by `$data`;
    open var items: UTSArray<ItemType4> by `$data`;
    open var current: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "modal", "showCancelSelect" to false, "cancelTextSelect" to false, "confirmTextSelect" to false, "editableSelect" to false, "placeholderTextSelect" to false, "exeRet" to "", "items" to utsArrayOf<ItemType4>(ItemType4(value = "标题", name = "有标题"), ItemType4(value = "", name = "无标题"), ItemType4(value = "超长标题测试内容，测试超过显示最大范围之后的样式-超长标题测试内容，测试超过显示最大范围之后的样式", name = "超长标题")), "current" to 0);
    }
    override fun `$initMethods`() {
        this.jest_getWindowInfo = fun(): GetWindowInfoResult {
            return uni_getWindowInfo();
        }
        ;
        this.showCancelChange = fun(e: UniSwitchChangeEvent) {
            this.showCancelSelect = e.detail.value;
        }
        ;
        this.cancelTextChange = fun(e: UniSwitchChangeEvent) {
            this.cancelTextSelect = e.detail.value;
        }
        ;
        this.confirmTextChange = fun(e: UniSwitchChangeEvent) {
            this.confirmTextSelect = e.detail.value;
        }
        ;
        this.editableChange = fun(e: UniSwitchChangeEvent) {
            this.editableSelect = e.detail.value;
        }
        ;
        this.placeholderTextChange = fun(e: UniSwitchChangeEvent) {
            this.placeholderTextSelect = e.detail.value;
        }
        ;
        this.radioChange = fun(e: UniRadioGroupChangeEvent) {
            run {
                var i: Number = 0;
                while(i < this.items.length){
                    if (this.items[i].value === e.detail.value) {
                        this.current = i;
                        break;
                    }
                    i++;
                }
            }
        }
        ;
        this.modalTap = fun() {
            var cancelTextVal: String;
            var cancelColorVal = "";
            if (this.cancelTextSelect) {
                cancelTextVal = "修改后的取消文本";
                cancelColorVal = "#ff00ff";
            } else {
                cancelTextVal = "取消";
            }
            var confirmTextVal = "确定";
            var confirmColorVal = "";
            if (this.confirmTextSelect) {
                confirmTextVal = "修改后的确定文本";
                confirmColorVal = "#00ffff";
            }
            var placeholderTextVal = "";
            var contentVal = "弹窗内容，告知当前状态、信息和解决方法，描述文字尽量控制在三行内";
            if (this.placeholderTextSelect) {
                placeholderTextVal = "定制提示信息";
                contentVal = "";
            }
            uni_showModal(ShowModalOptions(title = this.items[this.current].value, editable = this.editableSelect, placeholderText = placeholderTextVal, content = contentVal, showCancel = this.showCancelSelect, cancelText = cancelTextVal, cancelColor = cancelColorVal, confirmText = confirmTextVal, confirmColor = confirmColorVal, success = fun(res){
                this.exeRet = JSON.stringify(res);
            }
            , fail = fun(res){
                this.exeRet = JSON.stringify(res);
            }
            ));
        }
        ;
    }
    open lateinit var jest_getWindowInfo: () -> GetWindowInfoResult;
    open lateinit var showCancelChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var cancelTextChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var confirmTextChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var editableChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var placeholderTextChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var radioChange: (e: UniRadioGroupChangeEvent) -> Unit;
    open lateinit var modalTap: () -> Unit;
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
