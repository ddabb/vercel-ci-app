
  export type sectionData = {
    name : string,
    list : sectionListItem[]
  }
  export type sectionListItem = {
    text : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        data: ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'],
        sectionPadding: [0, 10, 0, 10] as Array<number>,
        scrollIntoView: "",
        scrolling: false,
        sectionArray: [] as sectionData[],
        appendId: 0
      }
    },
    onLoad() {
      this.data.forEach(key => {
        const list = [] as sectionListItem[]
        for (let i = 1; i < 11; i++) {
          const item = { text: key + "--item--content----" + i } as sectionListItem
          list.push(item)
        }
        const data = { name: key, list: list } as sectionData
        this.sectionArray.push(data)
      }
      )
    },
    methods: {
      toTop() {
        this.scrollIntoView = ""
        uni.getElementById("list-view")!.scrollTop = 0
      },
      //用于自动化测试
      listViewScrollByY(y : number) {
        const listview = this.$refs["list-view"] as UniElement
        // listview.scrollBy(0, y)
        listview.scrollTop = y
      },
      gotoStickyHeader(id : string) {

        this.scrollIntoView = id




      },
      onScroll() {
        this.scrolling = true
      },
      onScrollEnd() {
        this.scrolling = false
        //滚动后重置scrollIntoView = ""
        if (this.scrollIntoView != "") {
          this.scrollIntoView = ""
        }
      },
      appendSectionItem(index : number) {
        const data = this.sectionArray[index]
        this.appendId++
        const list = [
          { text: data.name + "--item--content----new1--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new2--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new3--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new4--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new5--" + this.appendId } as sectionListItem
        ] as sectionListItem[]
        data.list.unshift(...list)
      },
      deleteSection() {
        this.sectionArray.shift()
      }
    }
  })

export default __sfc__
function GenPagesComponentStickySectionStickySectionRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "sticky-section" })),
    createElementVNode("list-view", utsMapOf({
      id: "list-view",
      ref: "list-view",
      "show-scrollbar": "false",
      class: "page",
      "scroll-into-view": _ctx.scrollIntoView,
      onScroll: _ctx.onScroll,
      onScrollend: _ctx.onScrollEnd,
      bounces: "false"
    }), [
      createElementVNode("list-item", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        createElementVNode("button", utsMapOf({
          onClick: () => {_ctx.gotoStickyHeader('C')},
          size: "mini"
        }), "跳转到id为C的sticky-header位置上", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      createElementVNode("list-item", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        createElementVNode("button", utsMapOf({
          onClick: () => {_ctx.appendSectionItem(0)},
          size: "mini"
        }), "第一组 section 新增5条内容", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      createElementVNode("list-item", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        createElementVNode("button", utsMapOf({
          onClick: () => {_ctx.deleteSection()},
          size: "mini"
        }), "删除第一组 section", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.sectionArray, (section, __key, __index, _cached): any => {
        return createElementVNode("sticky-section", utsMapOf({
          key: section.name,
          padding: _ctx.sectionPadding,
          "push-pinned-header": true
        }), [
          createElementVNode("sticky-header", utsMapOf({
            id: section.name
          }), [
            createElementVNode("text", utsMapOf({ class: "sticky-header-text" }), toDisplayString(section.name), 1 /* TEXT */)
          ], 8 /* PROPS */, ["id"]),
          createElementVNode(Fragment, null, RenderHelpers.renderList(section.list, (list, __key, __index, _cached): any => {
            return createElementVNode("list-item", utsMapOf({
              key: list.text,
              name: list.text,
              class: "content-item",
              type: 10
            }), [
              createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(list.text), 1 /* TEXT */)
            ], 8 /* PROPS */, ["name"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 8 /* PROPS */, ["padding"])
      }), 128 /* KEYED_FRAGMENT */),
      createElementVNode("list-item", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 30
      }), [
        createElementVNode("button", utsMapOf({
          onClick: _ctx.toTop,
          size: "mini"
        }), "回到顶部", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */)
    ], 40 /* PROPS, NEED_HYDRATION */, ["scroll-into-view", "onScroll", "onScrollend"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentStickySectionStickySectionStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1], ["backgroundColor", "#f5f5f5"]]))], ["sticky-header-text", padStyleMapOf(utsMapOf([["fontSize", 16], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8], ["color", "#959595"], ["backgroundColor", "#f5f5f5"]]))], ["content-item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginBottom", 10], ["backgroundColor", "#ffffff"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
