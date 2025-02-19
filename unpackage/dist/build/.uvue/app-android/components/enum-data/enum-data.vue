import { ItemType } from './enum-data-types';
const __sfc__ = defineComponent({
    emits: ['change'],
    props: {
        title: {
            type: String,
            default: ''
        },
        items: {
            type: Array as PropType<Array<ItemType>>,
            required: true
        }
    },
    data() {
        return {
            current: 0
        };
    },
    methods: {
        // @ts-ignore
        _change(e: RadioGroupChangeEvent) {
            const selected = this.items.find((item: ItemType): boolean => {
                return item.value.toString(10) == e.detail.value;
            });
            if (selected != null) {
                this.$emit('change', selected.value);
                uni.showToast({
                    icon: 'none',
                    title: '当前选中:' + selected.name,
                });
            }
        }
    }
});
export default __sfc__;
function GenComponentsEnumDataEnumDataRender(this: InstanceType<typeof __sfc__>): any | null {
    const _ctx = this;
    const _cache = this.$.renderCache;
    const _component_radio = resolveComponent("radio");
    const _component_radio_group = resolveComponent("radio-group");
    return createElementVNode(Fragment, null, [
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
            createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
                createElementVNode("text", utsMapOf({ class: "uni-title-text" }), toDisplayString(_ctx.title), 1 /* TEXT */)
            ])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list uni-common-pl" }), [
            createVNode(_component_radio_group, utsMapOf({ onChange: _ctx._change }), utsMapOf({
                default: withSlotCtx((): any[] => [
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
                        return createVNode(_component_radio, utsMapOf({
                            class: normalizeClass(["uni-list-cell uni-list-cell-pd radio", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
                            key: item.name,
                            value: item.value + ''
                        }), utsMapOf({
                            default: withSlotCtx((): any[] => [toDisplayString(item.name)]),
                            _: 2 /* DYNAMIC */
                        }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value"]);
                    }), 128 /* KEYED_FRAGMENT */)
                ]),
                _: 1 /* STABLE */
            }), 8 /* PROPS */, ["onChange"])
        ])
    ], 64 /* STABLE_FRAGMENT */);
}
export type EnumDataComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsEnumDataEnumDataStyles = [];
