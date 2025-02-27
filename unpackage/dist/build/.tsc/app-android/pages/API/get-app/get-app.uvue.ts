
  import { state, setLifeCycleNum } from '@/store/index.uts'

  type MyGlobalData = {
    str : string,
    num : number,
    bool : boolean,
    obj : UTSJSONObject,
    null : string | null,
    arr : number[],
    mySet : string[],
    myMap : UTSJSONObject,
    func : () => string
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        originGlobalData: {
          str: '',
          num: 0,
          bool: false,
          obj: {
            str: '',
            num: 0,
            bool: false
          } as UTSJSONObject,
          null: null,
          arr: [] as number[],
          mySet: [] as string[],
          myMap: {},
          func: () : string => ''
        } as MyGlobalData,
        originGlobalDataFuncRes: '',
        newGlobalData: {
          str: '',
          num: 0,
          bool: false,
          obj: {
            str: '',
            num: 0,
            bool: false
          } as UTSJSONObject,
          null: null,
          arr: [] as number[],
          mySet: [] as string[],
          myMap: {},
          func: () : string => ''
        } as MyGlobalData,
        newGlobalDataFuncRes: '',
        lifeCycleNum: 0,
        androidApplication: null as any | null
      }
    },
    onReady() {
      this.lifeCycleNum = state.lifeCycleNum
    },
    methods: {
      getGlobalData() {
        const app = getApp()

        this.originGlobalData.str = app.globalData.str
        this.originGlobalData.num = app.globalData.num
        this.originGlobalData.bool = app.globalData.bool
        this.originGlobalData.obj = app.globalData.obj
        this.originGlobalData.null = app.globalData.null
        this.originGlobalData.arr = app.globalData.arr
        app.globalData.mySet.forEach((value : string) => {
          this.originGlobalData.mySet.push(value)
        })
        app.globalData.myMap.forEach((value : any, key : string) => {
          this.originGlobalData.myMap[key] = value
        })
        this.originGlobalData.func = app.globalData.func
        this.originGlobalDataFuncRes = this.originGlobalData.func()
      },
      setGlobalData() {
        const app = getApp()

        app.globalData.str = 'new globalData str'
        app.globalData.num = 100
        app.globalData.bool = true
        app.globalData.obj = {
          str: 'new globalData obj str',
          num: 200,
          bool: true
        }
        app.globalData.null = 'not null'
        app.globalData.arr = [1, 2, 3]
        app.globalData.mySet = new Set(['a', 'b', 'c'])
        app.globalData.myMap = new Map([
          ['a', 1],
          ['b', 2],
          ['c', 3]
        ])
        app.globalData.func = () : string => {
          return 'new globalData func'
        }

        this.newGlobalData.str = app.globalData.str
        this.newGlobalData.num = app.globalData.num
        this.newGlobalData.bool = app.globalData.bool
        this.newGlobalData.obj = app.globalData.obj
        this.newGlobalData.null = app.globalData.null
        this.newGlobalData.arr = app.globalData.arr
        app.globalData.mySet.forEach((value : string) => {
          this.newGlobalData.mySet.push(value)
        })
        app.globalData.myMap.forEach((value : any, key : string) => {
          this.newGlobalData.myMap[key] = value
        })
        this.newGlobalData.func = app.globalData.func
        this.newGlobalDataFuncRes = this.newGlobalData.func()
      },
      _increasetLifeCycleNum: function () {
        const app = getApp()
        app.vm!.increasetLifeCycleNum()
        this.lifeCycleNum = state.lifeCycleNum
      },
      // 自动化测试
      setLifeCycleNum(num : number) {
        setLifeCycleNum(num)
      },

      getAndroidApplication() : boolean {
        const app = getApp()
        this.androidApplication = app.getAndroidApplication()
        return this.androidApplication !== null
      }

    },
  })

export default __sfc__
function GenPagesAPIGetAppGetAppRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1","padding-bottom":"20px"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: "getApp" })),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
        createElementVNode("button", utsMapOf({ onClick: _ctx.getGlobalData }), "get globalData", 8 /* PROPS */, ["onClick"]),
        isTrue(_ctx.originGlobalData.str.length)
          ? createElementVNode(Fragment, utsMapOf({ key: 0 }), [
              createElementVNode("text", utsMapOf({ class: "uni-common-mt bold" }), "初始的 globalData:"),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData string: " + toDisplayString(_ctx.originGlobalData.str), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData number: " + toDisplayString(_ctx.originGlobalData.num), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData boolean: " + toDisplayString(_ctx.originGlobalData.bool), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData object: " + toDisplayString(_ctx.originGlobalData.obj), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData null: " + toDisplayString(_ctx.originGlobalData.null), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData array: " + toDisplayString(_ctx.originGlobalData.arr), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData Set: " + toDisplayString(_ctx.originGlobalData.mySet), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData Map: " + toDisplayString(_ctx.originGlobalData.myMap), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData func 返回值: " + toDisplayString(_ctx.originGlobalDataFuncRes), 1 /* TEXT */)
            ], 64 /* STABLE_FRAGMENT */)
          : createCommentVNode("v-if", true),
        createElementVNode("button", utsMapOf({
          onClick: _ctx.setGlobalData,
          class: "uni-common-mt"
        }), " set globalData ", 8 /* PROPS */, ["onClick"]),
        isTrue(_ctx.newGlobalData.bool)
          ? createElementVNode(Fragment, utsMapOf({ key: 1 }), [
              createElementVNode("text", utsMapOf({ class: "uni-common-mt bold" }), "更新后的 globalData:"),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData string: " + toDisplayString(_ctx.newGlobalData.str), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData number: " + toDisplayString(_ctx.newGlobalData.num), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData boolean: " + toDisplayString(_ctx.newGlobalData.bool), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData object: " + toDisplayString(_ctx.newGlobalData.obj), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData null: " + toDisplayString(_ctx.newGlobalData.null), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData array: " + toDisplayString(_ctx.newGlobalData.arr), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData Set: " + toDisplayString(_ctx.newGlobalData.mySet), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData Map: " + toDisplayString(_ctx.newGlobalData.myMap), 1 /* TEXT */),
              createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "globalData func 返回值: " + toDisplayString(_ctx.newGlobalDataFuncRes), 1 /* TEXT */)
            ], 64 /* STABLE_FRAGMENT */)
          : createCommentVNode("v-if", true),
        createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "点击按钮调用 App.uvue methods"),
        createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "increasetLifeCycleNum 方法"),
        createElementVNode("button", utsMapOf({
          class: "uni-common-mt",
          onClick: _ctx._increasetLifeCycleNum
        }), " increase lifeCycleNum ", 8 /* PROPS */, ["onClick"]),
        createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "lifeCycleNum: " + toDisplayString(_ctx.lifeCycleNum), 1 /* TEXT */),
        createElementVNode("button", utsMapOf({
          class: "uni-common-mt",
          onClick: _ctx.getAndroidApplication
        }), " getAndroidApplication ", 8 /* PROPS */, ["onClick"]),
        createElementVNode("text", utsMapOf({ class: "uni-common-mt" }), "androidApplication is null: " + toDisplayString(_ctx.androidApplication == null), 1 /* TEXT */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIGetAppGetAppStyles = [utsMapOf([["bold", padStyleMapOf(utsMapOf([["fontWeight", "bold"]]))], ["hr", padStyleMapOf(utsMapOf([["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#cccccc"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
