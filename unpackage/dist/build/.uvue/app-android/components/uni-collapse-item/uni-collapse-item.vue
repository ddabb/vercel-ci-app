import { $dispatch } from './util.uts';
const __sfc__ = defineComponent({
    name: "UniCollapseItem",
    props: {
        // 列表标题
        title: {
            type: String,
            default: ''
        },
        open: {
            type: Boolean,
            default: false
        },
        disabled: {
            type: Boolean,
            default: false
        }
    },
    data() {
        return {
            height: 0,
            is_open: this.open as boolean,
            box_is_open: this.open as boolean,
            boxNode: null as UniElement | null,
            contentNode: null as UniElement | null,
        };
    },
    watch: {
        open(value: boolean) {
            // this.is_open = value
            if (this.boxNode != null) {
                this.openCollapse(value);
            }
        }
    },
    created() {
        $dispatch(this, 'UniCollapse', 'init', this);
    },
    mounted() {
        this.boxNode = this.$refs['boxRef'] as UniElement;
        this.contentNode = this.$refs['contentRef'] as UniElement;
        // this.openCollapse(this.open)
    },
    methods: {
        // 开启或关闭折叠面板
        openCollapse(open: boolean) {
            if (this.disabled)
                return;
            // 关闭其他已打开
            $dispatch(this, 'UniCollapse', 'cloceAll');
            this.is_open = open;
            this.openOrClose(open);
        },
        openOrClose(open: boolean) {
            const boxNode = this.boxNode?.style!;
            const contentNode = this.contentNode?.style!;
            let hide = open ? 'flex' : 'none';
            const opacity = open ? "1" : "0";
            let ani_transform = open ? 'translateY(0)' : 'translateY(-100%)';
            boxNode.setProperty('display', hide);
            this.$nextTick(() => {
                setTimeout(() => {
                    contentNode.setProperty('transform', ani_transform);
                    contentNode.setProperty('opacity', opacity);
                }, 10);
            });
        }
    }
});
export default __sfc__;
function GenComponentsUniCollapseItemUniCollapseItemRender(this: InstanceType<typeof __sfc__>): any | null {
    const _ctx = this;
    const _cache = this.$.renderCache;
    return createElementVNode("view", utsMapOf({ class: "uni-collapse-item" }), [
        createElementVNode("view", utsMapOf({
            class: "uni-collapse-item__title",
            onClick: () => { _ctx.openCollapse(!_ctx.is_open); }
        }), [
            createElementVNode("text", utsMapOf({
                class: normalizeClass(["uni-collapse-item__title-text", utsMapOf({ 'is-disabled': _ctx.disabled, 'open--active': _ctx.is_open })])
            }), toDisplayString(_ctx.title), 3 /* TEXT, CLASS */),
            createElementVNode("view", utsMapOf({
                class: normalizeClass(["down_arrow", utsMapOf({ 'down_arrow--active': _ctx.is_open })])
            }), null, 2 /* CLASS */)
        ], 8 /* PROPS */, ["onClick"]),
        createElementVNode("view", utsMapOf({
            ref: "boxRef",
            class: normalizeClass(["uni-collapse-item__content", utsMapOf({ 'box-open--active': _ctx.is_open })])
        }), [
            createElementVNode("view", utsMapOf({
                ref: "contentRef",
                class: normalizeClass(["uni-collapse-item__content-box", utsMapOf({ 'content-open--active': _ctx.box_is_open })])
            }), [
                renderSlot(_ctx.$slots, "default")
            ], 2 /* CLASS */)
        ], 2 /* CLASS */)
    ]);
}
export type UniCollapseItemComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsUniCollapseItemUniCollapseItemStyles = [utsMapOf([["uni-collapse-item", padStyleMapOf(utsMapOf([["backgroundColor", "#ffffff"]]))], ["uni-collapse-item__title", utsMapOf([[".uni-collapse-item ", utsMapOf([["flexDirection", "row"], ["alignItems", "center"], ["paddingTop", 12], ["paddingRight", 12], ["paddingBottom", 12], ["paddingLeft", 12], ["backgroundColor", "#ffffff"]])]])], ["down_arrow", utsMapOf([[".uni-collapse-item ", utsMapOf([["width", 8], ["height", 8], ["transform", "rotate(45deg)"], ["borderRightWidth", 1], ["borderRightStyle", "solid"], ["borderRightColor", "#999999"], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#999999"], ["marginTop", -3], ["transitionProperty", "transform"], ["transitionDuration", "0.2s"]])]])], ["down_arrow--active", utsMapOf([[".uni-collapse-item ", utsMapOf([["transform", "rotate(-135deg)"], ["marginTop", 0]])]])], ["uni-collapse-item__title-text", utsMapOf([[".uni-collapse-item ", utsMapOf([["flex", 1], ["color", "#000000"], ["fontSize", 14], ["fontWeight", "400"]])]])], ["open--active", utsMapOf([[".uni-collapse-item ", utsMapOf([["color", "#bbbbbb"]])]])], ["is-disabled", utsMapOf([[".uni-collapse-item ", utsMapOf([["color", "#999999"]])]])], ["uni-collapse-item__content", utsMapOf([[".uni-collapse-item ", utsMapOf([["display", "none"], ["position", "relative"], ["overflow", "hidden"]])]])], ["box-open--active", utsMapOf([[".uni-collapse-item ", utsMapOf([["display", "flex"]])]])], ["uni-collapse-item__content-box", utsMapOf([[".uni-collapse-item ", utsMapOf([["width", "100%"], ["transitionProperty", "transform,opacity"], ["transitionDuration", "0.2s"], ["transform", "translateY(-100%)"], ["opacity", 0]])]])], ["@TRANSITION", utsMapOf([["down_arrow", utsMapOf([["property", "transform"], ["duration", "0.2s"]])], ["uni-collapse-item__content-box", utsMapOf([["property", "transform,opacity"], ["duration", "0.2s"]])]])]])];
