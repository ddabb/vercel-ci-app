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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
open class GenPagesComponentSwiperSwiper : BasePage {
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
            var ele = uni_getElementById("swiper-view");
            var eleRect = ele?.getBoundingClientRect();
            if (eleRect != null) {
                this.swipeX = eleRect.width - 10;
                this.swipeY += eleRect.y + uni_getSystemInfoSync().safeArea.top + 44 + 35;
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_switch = resolveComponent("switch");
        val _component_slider = resolveComponent("slider");
        val _component_navigator = resolveComponent("navigator");
        return createElementVNode("scroll-view", utsMapOf("class" to "page-scroll-view"), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to "swiper,可滑动视图")),
                createElementVNode("view", utsMapOf("class" to "uni-margin-wrap"), utsArrayOf(
                    createElementVNode("swiper", utsMapOf("id" to "swiper-view", "class" to "swiper", "vertical" to _ctx.verticalSelect, "indicator-dots" to _ctx.dotsSelect, "autoplay" to _ctx.autoplaySelect, "rebound" to _ctx.reboundSelect, "interval" to _ctx.intervalSelect, "circular" to _ctx.circularSelect, "indicator-color" to _ctx.indicatorColor, "indicator-active-color" to _ctx.indicatorColorActive, "disable-touch" to _ctx.disableTouchSelect, "current" to _ctx.currentVal, "current-item-id" to _ctx.currentItemIdVal, "onChange" to _ctx.swiperChange, "onTransition" to _ctx.swiperTransition, "onAnimationfinish" to _ctx.swiperAnimationfinish, "onTouchstart" to _ctx.swipertouchStart), utsArrayOf(
                        createElementVNode("swiper-item", utsMapOf("item-id" to "A"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "swiper-item uni-bg-red"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "swiper-item-Text", "onTouchstart" to _ctx.viewtouchStart), "A", 40, utsArrayOf(
                                    "onTouchstart"
                                ))
                            ))
                        )),
                        createElementVNode("swiper-item", utsMapOf("item-id" to "B"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "swiper-item uni-bg-green"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "swiper-item-Text"), "B")
                            ))
                        )),
                        createElementVNode("swiper-item", utsMapOf("item-id" to "C"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "swiper-item uni-bg-blue"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "swiper-item-Text"), "C")
                            ))
                        ))
                    ), 40, utsArrayOf(
                        "vertical",
                        "indicator-dots",
                        "autoplay",
                        "rebound",
                        "interval",
                        "circular",
                        "indicator-color",
                        "indicator-active-color",
                        "disable-touch",
                        "current",
                        "current-item-id",
                        "onChange",
                        "onTransition",
                        "onAnimationfinish",
                        "onTouchstart"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否显示面板指示点"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.dotsSelect, "onChange" to _ctx.dotsChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否自动切换"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.autoplaySelect, "onChange" to _ctx.autoplayChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否循环"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.circularSelect, "onChange" to _ctx.circularChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "是否显示rebound效果"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.reboundSelect, "onChange" to _ctx.reboundSelectChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title uni-list-cell-padding"), "间隔时间(毫秒)"),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell-padding"), utsArrayOf(
                        createVNode(_component_slider, utsMapOf("onChange" to _ctx.sliderChange, "value" to 1000, "min" to 500, "max" to 5000, "show-value" to true), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "定制指示器颜色"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.indicatorColorSelect, "onChange" to _ctx.indicatorColorChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "纵向"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.verticalSelect, "onChange" to _ctx.verticalChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "指定current为最后一个元素"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.currentSelect, "onChange" to _ctx.currentChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "指定current-item-id为最后一个元素"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.currentItemIdSelect, "onChange" to _ctx.currentItemIdChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "禁止用户 touch 操作"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.disableTouchSelect, "onChange" to _ctx.disableTouchChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "swiperTransition 是否打印"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.swiperTransitionSelect, "onChange" to _ctx.swiperTransitionChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "swiperAnimationfinish 是否打印"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.swiperAnimationfinishSelect, "onChange" to _ctx.swiperAnimationfinishChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "swiperChange 是否打印"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.swiperChangeSelect, "onChange" to _ctx.swiperChangeChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/swiper/swiper-list-view"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary"), " swiper 嵌套 list-view 测试 ")
                        );
                    }
                    ), "_" to 1))
                ))
            ))
        ));
    }
    open var background: UTSArray<String> by `$data`;
    open var dotsSelect: Boolean by `$data`;
    open var reboundSelect: Boolean by `$data`;
    open var autoplaySelect: Boolean by `$data`;
    open var circularSelect: Boolean by `$data`;
    open var indicatorColorSelect: Boolean by `$data`;
    open var verticalSelect: Boolean by `$data`;
    open var currentSelect: Boolean by `$data`;
    open var currentItemIdSelect: Boolean by `$data`;
    open var intervalSelect: Number by `$data`;
    open var indicatorColor: String by `$data`;
    open var indicatorColorActive: String by `$data`;
    open var currentVal: Number by `$data`;
    open var currentItemIdVal: String by `$data`;
    open var disableTouchSelect: Boolean by `$data`;
    open var swiperTransitionSelect: Boolean by `$data`;
    open var swiperAnimationfinishSelect: Boolean by `$data`;
    open var swiperChangeSelect: Boolean by `$data`;
    open var currentValChange: Number by `$data`;
    open var changeDetailTest: UniSwiperChangeEventDetail? by `$data`;
    open var transitionDetailTest: UniSwiperTransitionEventDetail? by `$data`;
    open var animationfinishDetailTest: UniSwiperAnimationFinishEventDetail? by `$data`;
    open var isChangeTest: String by `$data`;
    open var isTransitionTest: String by `$data`;
    open var isAnimationfinishTest: String by `$data`;
    open var swipeX: Number by `$data`;
    open var swipeY: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("background" to utsArrayOf(
            "color1",
            "color2",
            "color3"
        ), "dotsSelect" to false, "reboundSelect" to false, "autoplaySelect" to false, "circularSelect" to false, "indicatorColorSelect" to false, "verticalSelect" to false, "currentSelect" to false, "currentItemIdSelect" to false, "intervalSelect" to 2000, "indicatorColor" to "", "indicatorColorActive" to "", "currentVal" to 0, "currentItemIdVal" to "", "disableTouchSelect" to false, "swiperTransitionSelect" to false, "swiperAnimationfinishSelect" to false, "swiperChangeSelect" to false, "currentValChange" to 0, "changeDetailTest" to null as UniSwiperChangeEventDetail?, "transitionDetailTest" to null as UniSwiperTransitionEventDetail?, "animationfinishDetailTest" to null as UniSwiperAnimationFinishEventDetail?, "isChangeTest" to "", "isTransitionTest" to "", "isAnimationfinishTest" to "", "swipeX" to 0, "swipeY" to 0);
    }
    override fun `$initMethods`() {
        this.swipertouchStart = fun(e: UniTouchEvent) {
            console.log("swiper touchstart");
        }
        ;
        this.viewtouchStart = fun(e: UniTouchEvent) {
            console.log("view touchstart:");
        }
        ;
        this.swiperChange = fun(e: UniSwiperChangeEvent) {
            this.changeDetailTest = e.detail;
            this.checkEventTest(SwiperEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget), "change");
            this.currentValChange = e.detail.current;
            console.log(this.currentValChange);
            if (this.swiperChangeSelect) {
                console.log("swiperChange");
                console.log(e);
            }
        }
        ;
        this.swiperTransition = fun(e: UniSwiperTransitionEvent) {
            this.transitionDetailTest = e.detail;
            this.checkEventTest(SwiperEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget), "transition");
            if (this.swiperTransitionSelect) {
                console.log("swiperTransition");
                console.log(e);
            }
        }
        ;
        this.swiperAnimationfinish = fun(e: UniSwiperAnimationFinishEvent) {
            this.animationfinishDetailTest = e.detail;
            this.checkEventTest(SwiperEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget), "animationfinish");
            if (this.swiperAnimationfinishSelect) {
                console.log("swiperAnimationfinish");
                console.log(e);
            }
        }
        ;
        this.checkEventTest = fun(e: SwiperEventTest, eventName: String) {
            val isPass = e.type === eventName && e.target is UniElement && e.currentTarget is UniElement;
            val result = if (isPass) {
                "" + eventName + ":Success";
            } else {
                "" + eventName + ":Fail";
            }
            ;
            when (eventName) {
                "change" -> 
                    this.isChangeTest = result;
                "transition" -> 
                    this.isTransitionTest = result;
                "animationfinish" -> 
                    this.isAnimationfinishTest = result;
                else -> 
                    {}
            }
        }
        ;
        this.dotsChange = fun(e: UniSwitchChangeEvent) {
            this.dotsSelect = e.detail.value;
        }
        ;
        this.swiperTransitionChange = fun(e: UniSwitchChangeEvent) {
            this.swiperTransitionSelect = e.detail.value;
        }
        ;
        this.swiperChangeChange = fun(e: UniSwitchChangeEvent) {
            this.swiperChangeSelect = e.detail.value;
        }
        ;
        this.swiperAnimationfinishChange = fun(e: UniSwitchChangeEvent) {
            this.swiperAnimationfinishSelect = e.detail.value;
        }
        ;
        this.autoplayChange = fun(e: UniSwitchChangeEvent) {
            this.autoplaySelect = e.detail.value;
        }
        ;
        this.verticalChange = fun(e: UniSwitchChangeEvent) {
            this.verticalSelect = e.detail.value;
        }
        ;
        this.disableTouchChange = fun(e: UniSwitchChangeEvent) {
            this.disableTouchSelect = e.detail.value;
        }
        ;
        this.currentItemIdChange = fun(e: UniSwitchChangeEvent) {
            this.currentItemIdSelect = e.detail.value;
            if (this.currentItemIdSelect) {
                this.currentItemIdVal = "C";
            } else {
                this.currentItemIdVal = "A";
            }
        }
        ;
        this.currentChange = fun(e: UniSwitchChangeEvent) {
            this.currentSelect = e.detail.value;
            if (this.currentSelect) {
                this.currentVal = 2;
            } else {
                this.currentVal = 0;
            }
        }
        ;
        this.circularChange = fun(e: UniSwitchChangeEvent) {
            this.circularSelect = e.detail.value;
            console.log(this.circularSelect);
        }
        ;
        this.reboundSelectChange = fun(e: UniSwitchChangeEvent) {
            this.reboundSelect = e.detail.value;
            console.log(this.reboundSelect);
        }
        ;
        this.sliderChange = fun(e: UniSliderChangeEvent) {
            this.intervalSelect = e.detail.value;
        }
        ;
        this.indicatorColorChange = fun(e: UniSwitchChangeEvent) {
            this.indicatorColorSelect = e.detail.value;
            if (this.indicatorColorSelect) {
                this.indicatorColor = "#ff00ff";
                this.indicatorColorActive = "#0000ff";
            } else {
                this.indicatorColor = "";
                this.indicatorColorActive = "";
            }
        }
        ;
    }
    open lateinit var swipertouchStart: (e: UniTouchEvent) -> Unit;
    open lateinit var viewtouchStart: (e: UniTouchEvent) -> Unit;
    open lateinit var swiperChange: (e: UniSwiperChangeEvent) -> Unit;
    open lateinit var swiperTransition: (e: UniSwiperTransitionEvent) -> Unit;
    open lateinit var swiperAnimationfinish: (e: UniSwiperAnimationFinishEvent) -> Unit;
    open lateinit var checkEventTest: (e: SwiperEventTest, eventName: String) -> Unit;
    open lateinit var dotsChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var swiperTransitionChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var swiperChangeChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var swiperAnimationfinishChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var autoplayChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var verticalChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var disableTouchChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var currentItemIdChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var currentChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var circularChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var reboundSelectChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var sliderChange: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var indicatorColorChange: (e: UniSwitchChangeEvent) -> Unit;
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
                return utsMapOf("swiper" to padStyleMapOf(utsMapOf("height" to 150)), "swiper-item" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 150)), "swiper-item-Text" to padStyleMapOf(utsMapOf("width" to "100%", "textAlign" to "center", "lineHeight" to "150px")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
