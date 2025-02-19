
/**
 * lifecycle 生命周期类型
 */
export class StatType {
	/**应用onLauch*/
	static LifeCycleLaunch : number = 1
	/**页面onLoad*/
	static LifeCycleLoad : number = 2
	/**应用 onShow */
	static LifeCycleAppShow : number = 3
	/**应用 onHide */
	static LifeCycleAppHide : number = 4
	/**页面 onShow*/
	static LifeCyclePageShow : number = 5
	/**页面 onHide */
	static LifeCyclePageHide : number = 6
	/**页面卸载*/
	static LifeCyclePageUnLoad : number = 7
	/**错误*/
	static LifeCycleError : number = 8
}

/**
 * lt 统计数据类型
 */
export class ReportType {
	/** 1: 应用启动，对应 `onLaunch` 事件 */
	static AppStart : string = "1"
	/** 2: 应用显示，对应 `onShow` 事件 */
	static AppShow : string = "2"
	/** 3: 应用进入后台，对应 `onHide` 事件 */
	static AppHide : string = "3"
	/** 4: 应用退出 */
	static AppExit : string = "4"

	/** 11: 页面跳转，对应 `onShow` 事件 */
	static PageShow : string = "11"
	/** 12: 页面关闭，对应 `onHide` 事件 */
	static PageHide : string = "12"

	/** 21: 事件 */
	static Event : string = "21"
	/** 31: 错误信息 */
	static Error : string = "31"
	/** 101: 推送 */
	static Push : string = "101"
}


/**
 * 平台类型
 */
export class PlatformType {
	// TODO 平台需要整理在这里
}

/**
 * cst 上报时机类型 
 */

export class ReprotCstType {
	/** 1: 正常进入上报 */
	static AppNormal : number = 1
	/** 2: 后台进前台超时上报 */
	static AppAwakenTimeout : number = 2
	/** 3: 页面停留超时上报 */
	static PageStayTimeout : number = 3
}

// 应用首次启动需要保留的keys 
export const AppShowParamsKeys = ["uuid", "ak", "lt", "ut", "mpsdk", "mpv", "mpn", "v", "p", "sv", "net", "brand", "md", "lang", "lat", "lng", "pr", "ww", "wh", "sw", "sh", "url", "tt", "ch", "fvts", "lvts", "cn", "pn", "ct", "sc", "tvc", "usv", "t", "odid", "cst"]
// 应用进入后台需要保留的keys
export const AppHideParamsKeys = ['ak', 'uuid','ttn','ttpj','ttc', 'lt', 'ut', 'p', 'urlref', 'urlref_ts', 'ch', 'usv', 't']
// 页面切换需要保留的keyss
export const PageShowParamsKeys = ['ak', 'uuid', 'lt', 'ut', 'p', 'url', 'ttpj', 'ttn', 'ttc', 'ttct', 'urlref', 'urlref_ts', 'ch', 'usv', 't']
// push 需要保留的keys
export const PushParamsKeys = ['lt', 'cid', 't', 'ut']
// 事件需要保留的keys
export const EventParamsKeys = ['ak', 'uuid', 'p', 'lt', 'ut', 'url', 'ch', 'e_n', 'e_v', 'usv', 't']
// 错误事件需要保留的keys
export const ErrorParamsKeys = ["ak", "uuid", "p", "lt", "url", "ut", "ch", "mpsdk", "mpv", "v", "em", "usv", "t"]