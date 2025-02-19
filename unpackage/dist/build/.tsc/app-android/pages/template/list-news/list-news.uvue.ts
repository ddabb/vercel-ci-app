
  type Banner = {
    cover : string | null,
    title : string | null,
    post_id : string | null
  }
  type Item = {
    author_name : string,
    cover : string,
    id : number,
    post_id : string,
    published_at : string,
    title : string
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        th_item: ["排序", "筛选"],
        refresherTriggered: false,
        banner: {} as Banner,
        listData: [] as Item[],
        last_id: '',
      };
    },
    onLoad() {
      this.getBanner();
      this.getList();
    },
    onUnload() {
    },
    methods: {
      getBanner() {
        let data = {
          column: 'id,post_id,title,author_name,cover,published_at' //需要的字段名
        };
        uni.request<Banner>({
          url: 'https://unidemo.dcloud.net.cn/api/banner/36kr',
          data: data,
          success: data => {
            this.refresherTriggered = false
            if (data.statusCode == 200) {
              const result = data.data
              if (result != null) {
                this.banner = result;
              }
            }
          },
          fail: (e) => {
            console.log('fail', e);
          }
        });
      },
      getList() {
        let url = "https://unidemo.dcloud.net.cn/api/news?column=id,post_id,title,author_name,cover,published_at";
        /* if (this.last_id != "") {
          const minId = parseInt((this.last_id))
          const time = new Date().getTime() + '';
          const pageSize = 10;
          url = url + "&minId=" + minId + "&time=" + time + "&pageSize=" + pageSize;
        } */

        uni.request<Item[]>({
          url: url,
          method: "GET",
          success: (res) => {
            if (res.statusCode == 200) {
              console.log(res);
              const result = res.data
              if (result != null) {
                this.listData = result //因本接口没有更多分页数据，所以重新赋值。正常有分页的列表应该如下面push方式增加数组项
                // this.listData.push(...result)
                // this.last_id = this.listData[0].id + "";
              }
              this.refresherTriggered = false;
            }
          },
          fail: (res) => {
            console.log('fail', res);
            this.refresherTriggered = false
          }
        });
      },
      goDetail(e : Item) {
        const detail = e;
        const post_id = detail.post_id;
        const cover = detail.cover;
        const title = detail.title;
        uni.navigateTo({
          url: '/pages/template/list-news/detail/detail?post_id=' + post_id + "&cover=" + cover + "&title=" + title
        });
      },
      bannerClick(e : Banner) {
        const detail = e;
        const post_id = detail.post_id;
        const cover = detail.cover;
        const title = detail.title;
        uni.navigateTo({
          url: '/pages/template/list-news/detail/detail?post_id=' + post_id + "&cover=" + cover + "&title=" + title
        });
      },
      clickTH(index : number) {
        uni.showModal({
          content: "点击表头项：" + index,
          showCancel: false
        });
      },
      onRefresherrefresh() {
        this.refresherTriggered = true
        this.getBanner();
        this.getList();
      }
    }
  });

export default __sfc__
function GenPagesTemplateListNewsListNewsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("list-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    "refresher-enabled": "true",
    onRefresherrefresh: _ctx.onRefresherrefresh,
    "refresher-triggered": _ctx.refresherTriggered,
    "enable-back-to-top": "true"
  }), [
    createElementVNode("list-item", utsMapOf({
      class: "banner",
      onClick: () => {_ctx.bannerClick(_ctx.banner)},
      type: "1"
    }), [
      createElementVNode("image", utsMapOf({
        class: "banner-img",
        src: _ctx.banner.cover
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "banner-title" }), toDisplayString(_ctx.banner.title), 1 /* TEXT */)
    ], 8 /* PROPS */, ["onClick"]),
    createElementVNode("sticky-header", null, [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"100%","height":"44px","background-color":"#f5f5f5","flex-direction":"row","justify-content":"center","align-items":"center"}))
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.th_item, (name, index, __index, _cached): any => {
          return createElementVNode("text", utsMapOf({
            key: index,
            onClick: () => {_ctx.clickTH(index)},
            style: normalizeStyle(utsMapOf({"margin-right":"20px"}))
          }), toDisplayString(name), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      ], 4 /* STYLE */)
    ]),
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.listData, (value, index, __index, _cached): any => {
      return createElementVNode("list-item", utsMapOf({
        key: index,
        type: "2"
      }), [
        createElementVNode("view", utsMapOf({
          class: "uni-list-cell",
          "hover-class": "uni-list-cell-hover",
          onClick: () => {_ctx.goDetail(value)}
        }), [
          createElementVNode("view", utsMapOf({ class: "uni-media-list" }), [
            createElementVNode("image", utsMapOf({
              class: "uni-media-list-logo",
              src: value.cover
            }), null, 8 /* PROPS */, ["src"]),
            createElementVNode("view", utsMapOf({ class: "uni-media-list-body" }), [
              createElementVNode("text", utsMapOf({ class: "uni-media-list-text-top" }), toDisplayString(value.title), 1 /* TEXT */),
              createElementVNode("view", utsMapOf({ class: "uni-media-list-text-bottom" }), [
                createElementVNode("text", utsMapOf({ class: "uni-media-list-text" }), toDisplayString(value.author_name), 1 /* TEXT */),
                createElementVNode("text", utsMapOf({ class: "uni-media-list-text" }), toDisplayString(value.published_at), 1 /* TEXT */)
              ])
            ])
          ])
        ], 8 /* PROPS */, ["onClick"])
      ])
    }), 128 /* KEYED_FRAGMENT */)
  ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onRefresherrefresh", "refresher-triggered"])
}
const GenPagesTemplateListNewsListNewsStyles = [utsMapOf([["banner", padStyleMapOf(utsMapOf([["height", 180], ["overflow", "hidden"], ["position", "relative"], ["backgroundColor", "#cccccc"]]))], ["banner-img", padStyleMapOf(utsMapOf([["width", "100%"]]))], ["banner-title", padStyleMapOf(utsMapOf([["maxHeight", 42], ["overflow", "hidden"], ["position", "absolute"], ["left", 15], ["bottom", 15], ["width", "90%"], ["fontSize", 16], ["fontWeight", "400"], ["lineHeight", "21px"], ["color", "#FFFFFF"]]))], ["uni-media-list", padStyleMapOf(utsMapOf([["paddingTop", 11], ["paddingRight", 15], ["paddingBottom", 11], ["paddingLeft", 15], ["boxSizing", "border-box"], ["display", "flex"], ["width", "100%"], ["flexDirection", "row"]]))], ["uni-media-list-logo", padStyleMapOf(utsMapOf([["width", 90], ["height", 70]]))], ["uni-media-list-body", padStyleMapOf(utsMapOf([["flex", 1], ["paddingLeft", 7], ["justifyContent", "space-around"]]))], ["uni-media-list-text-top", padStyleMapOf(utsMapOf([["fontSize", 14], ["lines", 2], ["overflow", "hidden"]]))], ["uni-media-list-text-bottom", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"]]))], ["uni-media-list-text", padStyleMapOf(utsMapOf([["color", "#9D9D9F"], ["fontSize", 13]]))]])]
