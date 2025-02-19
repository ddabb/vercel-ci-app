const APPID = uni.getSystemInfoSync().appId
export function dbSet<T>(name : string, value : T) {
	let data = uni.getStorageSync('$$STAT__DBDATA:' + APPID)
	let newData = {} as UTSJSONObject
	if (data != null && typeof data == 'object') {
		newData = data as UTSJSONObject
	}
	newData[name] = value
	uni.setStorageSync('$$STAT__DBDATA:' + APPID, newData)
}

export function dbGet<T>(name : string) : T | null {
	let data = uni.getStorageSync('$$STAT__DBDATA:' + APPID)
	if (data == null) return null
	if (typeof data != 'object') return null
	const newData = data as UTSJSONObject
	return newData[name] as T
}

export function dbRemove(name : string) {
	let data = uni.getStorageSync('$$STAT__DBDATA:' + APPID)
	if (data == '') {
		data = {}
	}
	if (data != null) {
		let newData = data as UTSJSONObject
		if (newData[name] != null) {
			newData[name] = null
			uni.setStorageSync('$$STAT__DBDATA:' + APPID, newData)
		}
	}
}