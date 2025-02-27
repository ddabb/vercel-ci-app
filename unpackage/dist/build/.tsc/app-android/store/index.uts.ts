export type SafeArea = {
  top : number,
  right : number,
  bottom : number,
  left : number,
  width : number,
  height : number,
}

type State = {
  lifeCycleNum : number,
  // 状态栏高度
  statusBarHeight : number,
  safeArea : SafeArea
  // 设备像素比
  devicePixelRatio : number
  // 事件判断回调
  eventCallbackNum: number
  // 是否匹配左侧窗口
  noMatchLeftWindow:boolean
  // 当前激活的tab页
  active: string
  leftWinActive:string
}

export const state = reactive({
  lifeCycleNum: 0,
  statusBarHeight: 0,
  devicePixelRatio: 1,
  eventCallbackNum: 0,
  noMatchLeftWindow: true,
  active: 'componentPage',
  leftWinActive: '/pages/component/view/view',
  safeArea: {
    top: 0,
    right: 0,
    bottom: 0,
    left: 0,
    width: 0,
    height: 0,
  }
} as State)

export const setLifeCycleNum = (num : number) => {
  state.lifeCycleNum = num
}

export const setEventCallbackNum = (num : number) => {
  state.eventCallbackNum = num
}

export const setStatusBarHeight = (height : number) => {
  state.statusBarHeight = height
}

export const setSafeArea = (value : SafeArea) => {
  state.safeArea = value
}

export const setDevicePixelRatio = (devicePixelRatio : number) => {
  state.devicePixelRatio = devicePixelRatio
}

export const setMatchLeftWindow = (matchLeftWindow:boolean) => {
  state.noMatchLeftWindow = !matchLeftWindow
}

export const setActive = (tabPage:string) => {
  state.active = tabPage
}

export const setLeftWinActive = (leftWinActive:string) => {
  state.leftWinActive = leftWinActive
}

