const __sfc__ = defineComponent({
    name: "page-head",
    props: {
        title: {
            type: String,
            default: ""
        }
    }
});
export default __sfc__;
function GenComponentsPageHeadPageHeadRender(this: InstanceType<typeof __sfc__>): any | null {
    const _ctx = this;
    const _cache = this.$.renderCache;
    return createElementVNode("view", utsMapOf({ class: "common-page-head" }), [
        createElementVNode("view", utsMapOf({ class: "common-page-head-title-box" }), [
            createElementVNode("text", utsMapOf({ class: "common-page-head-title" }), toDisplayString(_ctx.title), 1 /* TEXT */)
        ])
    ]);
}
export type PageHeadComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsPageHeadPageHeadStyles = [utsMapOf([["common-page-head", padStyleMapOf(utsMapOf([["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["alignItems", "center"]]))], ["common-page-head-title-box", padStyleMapOf(utsMapOf([["paddingTop", 0], ["paddingRight", 20], ["paddingBottom", 0], ["paddingLeft", 20], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#D8D8D8"]]))], ["common-page-head-title", padStyleMapOf(utsMapOf([["lineHeight", "40px"], ["color", "#BEBEBE"]]))]])];
