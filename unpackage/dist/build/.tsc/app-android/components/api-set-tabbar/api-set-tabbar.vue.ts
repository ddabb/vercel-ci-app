
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'tababr',
        hasSetTabBarBadge: false,
        hasShownTabBarRedDot: false,
        hasCustomedStyle: false,
        hasCustomedItem: false,
        hasHiddenTabBar: false,
        hasHiddenTabBarItem: false,
        hasSetLongTitle: false,
      }
    },
    destroyed() {
      if (this.hasSetTabBarBadge) {
        uni.removeTabBarBadge({
          index: 1
        })
      }
      if (this.hasShownTabBarRedDot) {
        uni.hideTabBarRedDot({
          index: 1
        })
      }
      if (this.hasHiddenTabBar) {
        uni.showTabBar()
      }
      if (this.hasCustomedStyle) {
        uni.setTabBarStyle({
          color: '#7A7E83',
          selectedColor: '#007AFF',
          backgroundColor: '#F8F8F8',
          borderStyle: 'black'
        })
      }

      if (this.hasCustomedItem) {
        let tabBarOptions = {
          index: 1,
          text: '接口',
          iconPath: '/static/api.png',
          selectedIconPath: '/static/apiHL.png'
        } as SetTabBarItemOptions
        uni.setTabBarItem(tabBarOptions)
      }

      if (this.hasHiddenTabBarItem || this.hasSetLongTitle) {
        let tabBarOptions = {
          visible: true,
          index: 1,
          text: '接口',
          iconPath: '/static/api.png',
          selectedIconPath: '/static/apiHL.png'
        } as SetTabBarItemOptions
        uni.setTabBarItem(tabBarOptions)
      }
    },
    methods: {
      setTabBarTitle(){
        let tabBarOptions = {
          visible: true,
          index: 1,
          text: '接口',
          iconPath: '/static/api.png',
          selectedIconPath: '/static/apiHL.png'
        } as SetTabBarItemOptions

        if (!this.hasSetLongTitle) {
          tabBarOptions.text = "超长标题内容超长标题内容超长标题内容超长标题测试";
          tabBarOptions.iconPath = "";
          tabBarOptions.selectedIconPath = "";
        } else {
          tabBarOptions.text = "接口";
          tabBarOptions.iconPath = "/static/api.png";
          tabBarOptions.selectedIconPath = "/static/apiHL.png";
        }
        uni.setTabBarItem(tabBarOptions)
        this.hasSetLongTitle = !this.hasSetLongTitle
      },
      hideTabBarItem(){

        let tabBarOptions = {
          visible: true,
          index: 1,
          text: '接口',
          iconPath: '/static/api.png',
          selectedIconPath: '/static/apiHL.png'
        } as SetTabBarItemOptions

        if (!this.hasHiddenTabBarItem) {
          tabBarOptions.visible = false;
        } else {
          tabBarOptions.visible = true;
        }
        uni.setTabBarItem(tabBarOptions)
        this.hasHiddenTabBarItem = !this.hasHiddenTabBarItem
      },
      navigateBack() {
        this.$emit('unmount')
      },
      setTabBarBadge() {
        if (this.hasShownTabBarRedDot) {
          uni.hideTabBarRedDot({
            index: 1
          })
          this.hasShownTabBarRedDot = !this.hasShownTabBarRedDot
        }
        if (!this.hasSetTabBarBadge) {
          uni.setTabBarBadge({
            index: 1,
            text: '1'
          })
        } else {
          uni.removeTabBarBadge({
            index: 1
          })
        }
        this.hasSetTabBarBadge = !this.hasSetTabBarBadge
      },
      showTabBarRedDot() {
        if (this.hasSetTabBarBadge) {
          uni.removeTabBarBadge({
            index: 1
          })
          this.hasSetTabBarBadge = !this.hasSetTabBarBadge
        }
        if (!this.hasShownTabBarRedDot) {
          uni.showTabBarRedDot({
            index: 1
          })
        } else {
          uni.hideTabBarRedDot({
            index: 1
          })
        }
        this.hasShownTabBarRedDot = !this.hasShownTabBarRedDot
      },
      hideTabBar() {
        if (!this.hasHiddenTabBar) {
          uni.hideTabBar()
        } else {
          uni.showTabBar()
        }
        this.hasHiddenTabBar = !this.hasHiddenTabBar
      },
      customStyle() {
        if (this.hasCustomedStyle) {
          uni.setTabBarStyle({
            color: '#7A7E83',
            selectedColor: '#007AFF',
            backgroundColor: '#F8F8F8',
            borderStyle: 'black',
            // 新增 borderColor，优先级高于 borderStyle
            // borderColor:'red'
          })
        } else {
          uni.setTabBarStyle({
            color: '#FFF',
            selectedColor: '#007AFF',
            backgroundColor: '#000000',
            borderStyle: 'black',
          })
        }
        this.hasCustomedStyle = !this.hasCustomedStyle
      },
      customItem() {
        let tabBarOptions = {
          index: 1,
          text: '接口',
          iconPath: '/static/api.png',
          selectedIconPath: '/static/apiHL.png'
        } as SetTabBarItemOptions
        if (this.hasCustomedItem) {
          uni.setTabBarItem(tabBarOptions)
        } else {
          tabBarOptions.text = 'API'
          uni.setTabBarItem(tabBarOptions)
        }
        this.hasCustomedItem = !this.hasCustomedItem
      }
    }
  })

export default __sfc__
function GenComponentsApiSetTabbarApiSetTabbarRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.setTabBarBadge
    }), toDisplayString(!_ctx.hasSetTabBarBadge ? '设置tab徽标' : '移除tab徽标'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.showTabBarRedDot
    }), toDisplayString(!_ctx.hasShownTabBarRedDot ?  '显示红点' : '移除红点'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.customStyle
    }), toDisplayString(!_ctx.hasCustomedStyle ? '自定义Tab样式' : '移除自定义样式'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.customItem
    }), toDisplayString(!_ctx.hasCustomedItem ? '自定义Tab信息' : '移除自定义信息'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.hideTabBar
    }), toDisplayString(!_ctx.hasHiddenTabBar ? '隐藏TabBar' : '显示TabBar'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.hideTabBarItem
    }), toDisplayString(!_ctx.hasHiddenTabBarItem ? '隐藏接口Item' : '显示接口Item'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: _ctx.setTabBarTitle
    }), toDisplayString(!_ctx.hasSetLongTitle ? '自定义超长标题' : '移除自定义信息'), 9 /* TEXT, PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({ class: "btn-area" }))
  ])
}
export type ApiSetTabbarComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsApiSetTabbarApiSetTabbarStyles = [utsMapOf([["button", padStyleMapOf(utsMapOf([["marginTop", 15], ["marginLeft", 0], ["marginRight", 0]]))], ["btn-area", padStyleMapOf(utsMapOf([["paddingTop", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
