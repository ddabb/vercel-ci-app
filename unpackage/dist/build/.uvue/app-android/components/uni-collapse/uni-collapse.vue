const __sfc__ = defineComponent({
    name: "UniCollapse",
    props: {
        // 是否开启手风琴效果
        accordion: {
            type: Boolean,
            default: true
        }
    },
    data() {
        return {
            child_nodes: [] as Array<ComponentPublicInstance>
        };
    },
    methods: {
        init(child: ComponentPublicInstance) {
            this.child_nodes.push(child);
        },
        // 关闭所有
        cloceAll() {
            // 开启手风琴效果才回关闭其他
            if (this.accordion && this.child_nodes.length > 0) {
                this.child_nodes.forEach((item) => {
                    const is_open = item.$data['is_open'] as boolean;
                    // TODO 暂时无法获取子组件上的属性和方法，暂时使用绕过方案
                    if (is_open) {
                        item.$data['is_open'] = false;
                        item.$callMethod('openOrClose', false);
                    }
                });
            }
        }
    }
});
export default __sfc__;
function GenComponentsUniCollapseUniCollapseRender(this: InstanceType<typeof __sfc__>): any | null {
    const _ctx = this;
    const _cache = this.$.renderCache;
    return createElementVNode("view", null, [
        renderSlot(_ctx.$slots, "default")
    ]);
}
export type UniCollapseComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsUniCollapseUniCollapseStyles = [];
