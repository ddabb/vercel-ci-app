
  const __sfc__ = defineComponent({
    data() {
      return {
        htmlNodes: "",
        title: '',
        cover: "",
        post_id: "",
      }
    },
    onLoad(event : OnLoadOptions) {
      this.post_id = event["post_id"] ?? "";
      this.cover = event["cover"] ?? "";
      this.title = event["title"] ?? "";
      this.getDetail();
    },
    methods: {
      getDetail() {
        uni.request({
          url: 'https://unidemo.dcloud.net.cn/api/news/36kr/' + this.post_id,
          success: (data) => {
            if (data.statusCode == 200) {
              const result = data.data as UTSJSONObject
              // console.log(result["content"]);
              this.htmlNodes = result["content"] as string;
            }
          },
          fail: () => {
            console.log('fail');
          }
        });
      },
    }
  })

export default __sfc__
function GenPagesTemplateListNewsDetailDetailRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "banner" }), [
      createElementVNode("image", utsMapOf({
        class: "banner-img",
        src: _ctx.cover
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "banner-title" }), toDisplayString(_ctx.title), 1 /* TEXT */)
    ]),
    createElementVNode("rich-text", utsMapOf({
      nodes: _ctx.htmlNodes,
      style: normalizeStyle(utsMapOf({"padding":"3px"}))
    }), null, 12 /* STYLE, PROPS */, ["nodes"])
  ], 4 /* STYLE */)
}
const GenPagesTemplateListNewsDetailDetailStyles = [utsMapOf([["banner", padStyleMapOf(utsMapOf([["height", 180], ["overflow", "hidden"], ["position", "relative"], ["backgroundColor", "#cccccc"]]))], ["banner-img", padStyleMapOf(utsMapOf([["width", "100%"]]))], ["banner-title", padStyleMapOf(utsMapOf([["maxHeight", 42], ["overflow", "hidden"], ["position", "absolute"], ["left", 15], ["bottom", 15], ["width", "90%"], ["fontSize", 16], ["fontWeight", "400"], ["lineHeight", "21px"], ["color", "#FFFFFF"]]))]])]
