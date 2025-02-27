
  type Page = {
    name : string
    enable ?: boolean
    url : string
  }

  type ListItem = {
    id : string
    name : string
    open : boolean
    pages : Page[]
    url ?: string
    enable ?: boolean
  }
  import { state } from '@/store/index.uts'
  const __sfc__ = defineComponent({
    data() {
      return {
        list: [
          {
            id: 'slider-100',
            url: 'slider-100',
            name: 'slider-100',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'long-list',
            url: 'long-list',
            name: '左右滑动长列表',
            open: false,
            enable: true,
            pages: [







              {
                name: '顶部banner长列表（嵌套滚动）',
                url: 'long-list-nested'
              },
              {
                name: '顶部banner瀑布流长列表（嵌套滚动）',
                url: 'long-waterflow-nested'
              },

              {
                name: 'Android顶部搜索框随时下移长列表',
                url: 'long-list'
              }
            ] as Page[],
          },
          {
            id: 'list-news',
            url: 'list-news',
            name: '列表到详情（吸顶）',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'swiper-list',
            url: 'swiper-list',
            name: 'swiper-list',
            open: false,
            pages: [
              {
                name: '下划线样式',
                url: 'swiper-list'
              },
              {
                name: '字体放大样式',
                url: 'swiper-list2'
              },
            ] as Page[],
          },
          {
            id: 'custom-long-list',
            url: 'custom-long-list',
            name: '自定义虚拟长列表uni-recycle-view',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'scroll-fold-nav',
            url: 'scroll-fold-nav',
            name: '随滚动折叠的导航栏',
            open: false,
            pages: [] as Page[],
          },

          {
            id: 'custom-refresher',
            url: 'custom-refresher',
            name: '自定义下拉刷新',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'pull-zoom-image',
            url: 'pull-zoom-image',
            name: '下拉缩放顶部封面图',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'scroll-sticky',
            url: 'scroll-sticky',
            name: 'scroll-view自定义滚动吸顶',
            open: false,
            pages: [] as Page[],
          },

          {
            id: 'swiper-vertical-video',
            url: 'swiper-vertical-video',
            name: '竖滑视频',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'half-screen',
            url: 'half-screen',
            name: '半屏弹窗',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'drop-card',
            url: 'drop-card',
            name: '划走式卡片',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'navbar-lite',
            url: 'navbar-lite',
            name: '自定义导航栏',
            open: false,
            pages: [] as Page[],
          },
          {
            id: 'custom-tab-bar',
            url: 'custom-tab-bar',
            name: '自定义TabBar',
            open: false,
            enable: true,
            pages: [] as Page[],
          },

          {
            id: 'calendar',
            url: 'calendar',
            name: '日历',
            open: false,
            pages: [] as Page[],
          },


          {
            id: 'schema',
            url: 'schema',
            name: '打开外部链接',
            open: false,
            pages: [] as Page[],
          },


























        ] as ListItem[],
        arrowUpIcon: '/static/icons/arrow-up.png',
        arrowDownIcon: '/static/icons/arrow-down.png',
        arrowRightIcon: '/static/icons/arrow-right.png',
      }
    },
    computed: {
      hasLeftWin() : boolean {
        return !state.noMatchLeftWindow
      },
      leftWinActive() : string {
        return state.leftWinActive.split('/')[3]
      }
    },
    methods: {
      triggerCollapse(index : number, item : ListItem) {
        if (item.pages.length == 0) {
          const page : Page = {
            name: item.name,
            enable: item.enable,
            url: item.url!,
          }
          this.goDetailPage(page)
          return
        }
        for (var i = 0; i < this.list.length; ++i) {
          if (index == i) {
            this.list[i].open = !this.list[i].open
          } else {
            this.list[i].open = false
          }
        }
      },
      goDetailPage(e : Page) {
        if (e.enable == false) {
          uni.showToast({
            icon: 'none',
            title: '暂不支持',
          })
          return
        }
        const url =
          e.url.indexOf('platform') > -1
            ? e.url
            : `/pages/template/${e.url}/${e.url}`
        if (this.hasLeftWin) {
          uni.reLaunch({ url })
        } else {
          uni.navigateTo({ url })
        }
      },
    },





















  })

export default __sfc__
function GenPagesTabBarTemplateRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_u_link = resolveEasyComponent("u-link",_easycom_u_link)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    "enable-back-to-top": "true"
  }), [
    createElementVNode("view", utsMapOf({ class: "uni-container" }), [
      isTrue(!_ctx.hasLeftWin)
        ? createElementVNode("view", utsMapOf({
            key: 0,
            class: "uni-header-logo"
          }), [
            createElementVNode("image", utsMapOf({
              class: "uni-header-image",
              src: "/static/templateIndex.png"
            }))
          ])
        : createCommentVNode("v-if", true),
      isTrue(!_ctx.hasLeftWin)
        ? createElementVNode("view", utsMapOf({
            key: 1,
            class: "uni-text-box"
          }), [
            createElementVNode("text", utsMapOf({ class: "hello-text" }), "以下是部分模板示例，更多模板见插件市场："),
            createVNode(_component_u_link, utsMapOf({
              href: "https://ext.dcloud.net.cn",
              text: 'https://ext.dcloud.net.cn',
              inWhiteList: true
            }), null, 8 /* PROPS */, ["text"])
          ])
        : createCommentVNode("v-if", true),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          class: "uni-panel",
          key: item.id
        }), [
          createElementVNode("view", utsMapOf({
            class: "uni-panel-h",
            onClick: () => {_ctx.triggerCollapse(index, item)}
          }), [
            createElementVNode("text", utsMapOf({
              class: normalizeClass(["uni-panel-text", item.enable == false || item.open == true ? 'text-disabled' : '',item.url == _ctx.leftWinActive && item.pages.length == 0 ? 'left-win-active' : ''])
            }), toDisplayString(item.name), 3 /* TEXT, CLASS */),
            createElementVNode("image", utsMapOf({
              src: 
              item.pages.length > 0
                ? item.open
                  ? _ctx.arrowUpIcon
                  : _ctx.arrowDownIcon
                : _ctx.arrowRightIcon
            ,
              class: "uni-icon-size"
            }), null, 8 /* PROPS */, ["src"])
          ], 8 /* PROPS */, ["onClick"]),
          isTrue(item.open)
            ? createElementVNode("view", utsMapOf({ key: 0 }), [
                createElementVNode(Fragment, null, RenderHelpers.renderList(item.pages, (page, key, __index, _cached): any => {
                  return createElementVNode("view", utsMapOf({
                    style: normalizeStyle(utsMapOf({"padding-left":"18px"})),
                    class: "uni-navigate-item",
                    "hover-class": page.enable == false ? '' : 'is--active',
                    key: key,
                    onClick: () => {_ctx.goDetailPage(page)}
                  }), [
                    createElementVNode("text", utsMapOf({
                      class: normalizeClass(["uni-navigate-text", utsMapOf({'left-win-active': _ctx.leftWinActive === page.url  && _ctx.hasLeftWin,'text-disabled' : page.enable == false})])
                    }), toDisplayString(page.name), 3 /* TEXT, CLASS */),
                    createElementVNode("image", utsMapOf({
                      src: _ctx.arrowRightIcon,
                      class: "uni-icon-size"
                    }), null, 8 /* PROPS */, ["src"])
                  ], 12 /* STYLE, PROPS */, ["hover-class", "onClick"])
                }), 128 /* KEYED_FRAGMENT */)
              ])
            : createCommentVNode("v-if", true)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesTabBarTemplateStyles = []

import _easycom_u_link from '@/components/u-link/u-link.vue'
