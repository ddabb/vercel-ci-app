
  import { generateMenu } from './generateMenu.uts'
  import { MenuItem } from './generateMenu.uts'
  const menu = generateMenu('pages/component')

  import checkUpdate from '@/uni_modules/uni-upgrade-center-app/utils/check-update'

  import { state } from '@/store/index.uts'
  const __sfc__ = defineComponent({
    data() {
      return {
        menu: menu as MenuItem[],
        arrowRightIcon: '/static/icons/arrow-right.png' as string.ImageURIString,
        pageHiden: false
      }
    },
    computed: {
      hasLeftWin() : boolean {
        return !state.noMatchLeftWindow
      },
      leftWinActive() : string {
        return state.leftWinActive.slice(1)
      }
    },
    methods: {
      goPage(url : string) {
        if (this.hasLeftWin) {
          uni.reLaunch({ url })
        } else {
          uni.navigateTo({ url })
        }
      }
    },

















    onReady() {

      uni.getPrivacySetting({
        success(res) {
          if (res.needAuthorization) {
            uni.onPrivacyAuthorizationChange((res) => {
              if (!res.needAuthorization) {
                checkUpdate()
              }
            })
          } else {
            checkUpdate()
          }
        }
      })

    },
    onShow() {
      this.pageHiden = false
    },
    onHide() {
      this.pageHiden = true
    },
    beforeUnmount() {
      uni.showTabBar()?.catch(_ => { })
    }
  })

export default __sfc__
function GenPagesTabBarComponentRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_u_link = resolveEasyComponent("u-link",_easycom_u_link)
const _component_uni_collapse_item = resolveEasyComponent("uni-collapse-item",_easycom_uni_collapse_item)
const _component_uni_collapse = resolveEasyComponent("uni-collapse",_easycom_uni_collapse)

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
              src: "/static/componentIndex.png"
            }))
          ])
        : createCommentVNode("v-if", true),
      isTrue(!_ctx.hasLeftWin)
        ? createElementVNode("view", utsMapOf({
            key: 1,
            class: "uni-text-box"
          }), [
            createElementVNode("text", utsMapOf({ class: "hello-text" }), "uni-app内置组件，展示样式仅供参考，文档详见："),
            createVNode(_component_u_link, utsMapOf({
              href: 'https://uniapp.dcloud.io/uni-app-x/component/',
              text: 'https://uniapp.dcloud.io/uni-app-x/component/',
              inWhiteList: true
            }), null, 8 /* PROPS */, ["href", "text"])
          ])
        : createCommentVNode("v-if", true),
      createVNode(_component_uni_collapse, null, utsMapOf({
        default: withSlotCtx((): any[] => [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.menu, (menuItem, __key, __index, _cached): any => {
            return createVNode(_component_uni_collapse_item, utsMapOf({
              ref_for: true,
              ref: "category",
              key: menuItem.id,
              title: menuItem.name,
              class: "item"
            }), utsMapOf({
              default: withSlotCtx((): any[] => [
                createElementVNode(Fragment, null, RenderHelpers.renderList(menuItem.items, (childMenuItem, __key, __index, _cached): any => {
                  return createElementVNode(Fragment, utsMapOf({
                    key: childMenuItem.id
                  }), [
                    childMenuItem.items.length==0
                      ? createElementVNode("view", utsMapOf({
                          key: 0,
                          style: normalizeStyle(utsMapOf({"padding-left":"18px"})),
                          class: "uni-navigate-item",
                          "hover-class": "is--active",
                          onClick: () => {_ctx.goPage(`/${childMenuItem.path}`)}
                        }), [
                          createElementVNode("text", utsMapOf({
                            class: normalizeClass(["uni-navigate-text", utsMapOf({
                  'left-win-active': _ctx.leftWinActive === childMenuItem.path && _ctx.hasLeftWin,
                })])
                          }), toDisplayString(childMenuItem.style["navigationBarTitleText"]), 3 /* TEXT, CLASS */),
                          createElementVNode("image", utsMapOf({
                            src: _ctx.arrowRightIcon,
                            class: "uni-icon-size"
                          }), null, 8 /* PROPS */, ["src"])
                        ], 12 /* STYLE, PROPS */, ["onClick"])
                      : createVNode(_component_uni_collapse, utsMapOf({
                          key: 1,
                          style: normalizeStyle(utsMapOf({"width":"100%"}))
                        }), utsMapOf({
                          default: withSlotCtx((): any[] => [
                            createVNode(_component_uni_collapse_item, utsMapOf({
                              title: childMenuItem.name,
                              class: "item",
                              style: normalizeStyle(utsMapOf({"margin-bottom":"0","padding-left":"5px","padding-right":"5px"}))
                            }), utsMapOf({
                              default: withSlotCtx((): any[] => [
                                createElementVNode(Fragment, null, RenderHelpers.renderList(childMenuItem.items, (grandChildMenuItem, __key, __index, _cached): any => {
                                  return createElementVNode("view", utsMapOf({
                                    style: normalizeStyle(utsMapOf({"padding-left":"18px"})),
                                    class: "uni-navigate-item",
                                    "hover-class": "is--active",
                                    key: grandChildMenuItem.path,
                                    onClick: () => {_ctx.goPage(`/${grandChildMenuItem.path}`)}
                                  }), [
                                    createElementVNode("text", utsMapOf({
                                      class: normalizeClass(["uni-navigate-text", utsMapOf({
                      'left-win-active':
                        _ctx.leftWinActive === grandChildMenuItem.path && _ctx.hasLeftWin,
                    })])
                                    }), toDisplayString(grandChildMenuItem.style["navigationBarTitleText"]), 3 /* TEXT, CLASS */),
                                    createElementVNode("image", utsMapOf({
                                      src: _ctx.arrowRightIcon,
                                      class: "uni-icon-size"
                                    }), null, 8 /* PROPS */, ["src"])
                                  ], 12 /* STYLE, PROPS */, ["onClick"])
                                }), 128 /* KEYED_FRAGMENT */)
                              ]),
                              _: 2 /* DYNAMIC */
                            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["title", "style"])
                          ]),
                          _: 2 /* DYNAMIC */
                        }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["style"])
                  ], 64 /* STABLE_FRAGMENT */)
                }), 128 /* KEYED_FRAGMENT */)
              ]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["title"])
          }), 128 /* KEYED_FRAGMENT */)
        ]),
        _: 1 /* STABLE */
      }))
    ])
  ], 4 /* STYLE */)
}
const GenPagesTabBarComponentStyles = [utsMapOf([["item", padStyleMapOf(utsMapOf([["marginBottom", 12]]))]])]

import _easycom_u_link from '@/components/u-link/u-link.vue'
import _easycom_uni_collapse_item from '@/components/uni-collapse-item/uni-collapse-item.vue'
import _easycom_uni_collapse from '@/components/uni-collapse/uni-collapse.vue'
