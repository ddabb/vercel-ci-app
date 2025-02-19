export const leftWindow = {
	path: "windows/left-window.uvue",
	style: {
		width: "350px"
	}
};
export const topWindow = {
	path: "windows/top-window.uvue",
	style: {
		height: "60px"
	}
};
export const pages = [
	{
		path: "pages/tabBar/component",
		style: {
			navigationBarTitleText: "内置组件",
			backgroundColorContent: "#f8f8f8"
		}
	},
	{
		path: "pages/component/view/view",
		group: "0,1,0",
		style: {
			navigationBarTitleText: "view | 基本视图容器"
		}
	},
	{
		path: "pages/component/scroll-view/scroll-view",
		group: "0,1,1",
		style: {
			navigationBarTitleText: "scroll-view | 可滚动视图容器"
		}
	},
	{
		path: "pages/component/scroll-view/scroll-view-refresher",
		style: {
			navigationBarTitleText: "scroll-view-refresher"
		}
	},
	{
		path: "pages/component/scroll-view/scroll-view-props",
		style: {
			navigationBarTitleText: "非下拉刷新的scroll-view属性示例"
		}
	},
	{
		path: "pages/component/scroll-view/scroll-view-refresher-props",
		style: {
			navigationBarTitleText: "下拉刷新的scroll-view属性示例"
		}
	},
	{
		path: "pages/component/scroll-view/scroll-view-custom-refresher-props",
		style: {
			navigationBarTitleText: "自定义下拉刷新的scroll-view属性示例"
		}
	},
	{
		path: "pages/component/swiper/swiper",
		group: "0,1,2",
		style: {
			navigationBarTitleText: "swiper | 滑块视图容器"
		}
	},
	{
		path: "pages/component/list-view/list-view",
		group: "0,1,6",
		style: {
			navigationBarTitleText: "list-view | 列表容器"
		}
	},
	{
		path: "pages/component/list-view/list-view-refresh",
		style: {
			navigationBarTitleText: "list-view-refresh",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/list-view/list-view-multiplex",
		style: {
			navigationBarTitleText: "list-view-multiplex"
		}
	},
	{
		path: "pages/component/list-view/list-view-multiplex-input",
		style: {
			navigationBarTitleText: "list-view复用input",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/list-view/list-view-multiplex-video",
		style: {
			navigationBarTitleText: "list-view-multiplex-video"
		}
	},
	{
		path: "pages/component/list-view/list-view-children-in-slot",
		style: {
			navigationBarTitleText: "list-view-children-in-slot"
		}
	},
	{
		path: "pages/component/sticky-section/sticky-section",
		group: "0,1,8,1",
		style: {
			navigationBarTitleText: "sticky-section | 吸顶布局容器"
		}
	},
	{
		path: "pages/component/sticky-header/sticky-header",
		group: "0,1,8,0",
		style: {
			navigationBarTitleText: "sticky-header | 吸顶布局容器",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/text/text",
		group: "0,2,1",
		style: {
			navigationBarTitleText: "text | 文本"
		}
	},
	{
		path: "pages/component/text/text-props",
		style: {
			navigationBarTitleText: "text-props"
		}
	},
	{
		path: "pages/component/rich-text/rich-text",
		group: "0,2,2",
		style: {
			navigationBarTitleText: "rich-text | 富文本"
		}
	},
	{
		path: "pages/component/rich-text/rich-text-tags",
		style: {
			navigationBarTitleText: "rich-text-tags"
		}
	},
	{
		path: "pages/component/rich-text/rich-text-complex",
		style: {
			navigationBarTitleText: "rich-text-complex"
		}
	},
	{
		path: "pages/component/progress/progress",
		group: "0,2,3",
		style: {
			navigationBarTitleText: "progress | 进度条"
		}
	},
	{
		path: "pages/component/form/form",
		group: "0,3,2",
		style: {
			navigationBarTitleText: "form | 表单"
		}
	},
	{
		path: "pages/component/button/button",
		group: "0,3,0",
		style: {
			navigationBarTitleText: "button | 按钮"
		}
	},
	{
		path: "pages/component/button/buttonstatus",
		style: {
			navigationBarTitleText: "buttonstatus"
		}
	},
	{
		path: "pages/component/radio/radio",
		group: "0,3,8",
		style: {
			navigationBarTitleText: "radio | 单选框"
		}
	},
	{
		path: "pages/component/checkbox/checkbox",
		group: "0,3,1",
		style: {
			navigationBarTitleText: "checkbox | 多选框"
		}
	},
	{
		path: "pages/component/input/input",
		group: "0,3,3",
		style: {
			navigationBarTitleText: "input | 输入框"
		}
	},
	{
		path: "pages/component/textarea/textarea",
		group: "0,3,11",
		style: {
			navigationBarTitleText: "textarea | 多行输入框"
		}
	},
	{
		path: "pages/component/slider/slider",
		group: "0,3,9",
		style: {
			navigationBarTitleText: "slider | 滑动选择器"
		}
	},
	{
		path: "pages/component/slider/slider-in-swiper",
		style: {
			navigationBarTitleText: "slider-in-swiper"
		}
	},
	{
		path: "pages/component/slider/slider-maxValue",
		style: {
			navigationBarTitleText: "slider-maxValue-test"
		}
	},
	{
		path: "pages/component/picker-view/picker-view",
		group: "0,3,7",
		style: {
			navigationBarTitleText: "picker-view | 嵌入页面的滚动选择器"
		}
	},
	{
		path: "pages/component/switch/switch",
		group: "0,3,10",
		style: {
			navigationBarTitleText: "switch | 开关选择器"
		}
	},
	{
		path: "pages/component/image/image",
		group: "0,5,0",
		style: {
			navigationBarTitleText: "image | 图片"
		}
	},
	{
		path: "pages/component/image/image-format",
		style: {
			navigationBarTitleText: "image-format"
		}
	},
	{
		path: "pages/component/image/image-mode",
		style: {
			navigationBarTitleText: "image-mode"
		}
	},
	{
		path: "pages/component/image/image-path",
		style: {
			navigationBarTitleText: "image-path"
		}
	},
	{
		path: "pages/component/image/image-large",
		style: {
			navigationBarTitleText: "大图测试"
		}
	},
	{
		path: "pages/component/video/video",
		group: "0,5,1",
		style: {
			navigationBarTitleText: "video | 视频"
		}
	},
	{
		path: "pages/component/video/video-format",
		style: {
			navigationBarTitleText: "video-format"
		}
	},
	{
		path: "pages/component/navigator/navigator",
		group: "0,4,0",
		style: {
			navigationBarTitleText: "navigator | 页面链接"
		}
	},
	{
		path: "pages/component/navigator/navigate",
		style: {
			navigationBarTitleText: "navigatePage"
		}
	},
	{
		path: "pages/component/navigator/redirect",
		style: {
			navigationBarTitleText: "redirectPage"
		}
	},
	{
		path: "pages/component/web-view/web-view",
		group: "0,9",
		style: {
			navigationBarTitleText: "web-view"
		}
	},
	{
		path: "pages/component/web-view/web-view/web-view-local",
		group: "0,9",
		style: {
			navigationBarTitleText: "本地网页"
		}
	},
	{
		path: "pages/component/unicloud-db/unicloud-db/contacts/list",
		group: "0,11",
		style: {
			navigationBarTitleText: "联系人",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/component/unicloud-db/unicloud-db/contacts/add",
		style: {
			navigationBarTitleText: "新增联系人"
		}
	},
	{
		path: "pages/component/unicloud-db/unicloud-db/contacts/edit",
		style: {
			navigationBarTitleText: "编辑联系人"
		}
	},
	{
		path: "pages/component/unicloud-db/unicloud-db/contacts/detail",
		style: {
			navigationBarTitleText: ""
		}
	},
	{
		path: "pages/component/unicloud-db/unicloud-db/mixin-datacom/mixin-datacom",
		group: "0,11",
		style: {
			navigationBarTitleText: "mixinDatacom"
		}
	},
	{
		path: "pages/component/global-properties/global-properties",
		group: "0,0",
		style: {
			navigationBarTitleText: "全局属性"
		}
	},
	{
		path: "pages/component/global-events/global-events",
		group: "0,0",
		style: {
			navigationBarTitleText: "全局事件"
		}
	},
	{
		path: "pages/component/global-events/transition-events",
		group: "0,0",
		style: {
			navigationBarTitleText: "Transition Events"
		}
	},
	{
		path: "pages/component/global-events/touch-events",
		group: "0,0",
		style: {
			navigationBarTitleText: "Touch Events"
		}
	},
	{
		path: "pages/component/global-events/touch-events-bubbles",
		style: {
			navigationBarTitleText: "Touch Events bubbles"
		}
	},
	{
		path: "pages/component/nested-scroll-header/nested-scroll-header",
		group: "0,1,9,0",
		style: {
			navigationBarTitleText: "nested-scroll-header"
		}
	},
	{
		path: "pages/component/nested-scroll-body/nested-scroll-body",
		group: "0,1,9,1",
		style: {
			navigationBarTitleText: "nested-scroll-body"
		}
	},
	{
		path: "pages/component/swiper/swiper-list-view",
		style: {
			navigationBarTitleText: "swiper嵌套list-view",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/map/map",
		group: "0,6",
		style: {
			navigationBarTitleText: "map | 地图"
		}
	},
	{
		path: "pages/component/list-view/issue-2199",
		style: {
			navigationBarTitleText: "issue-2199",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/canvas/canvas",
		group: "0,7",
		style: {
			navigationBarTitleText: "canvas | 画布"
		}
	},
	{
		path: "pages/component/canvas/canvas-context",
		style: {
			navigationBarTitleText: "createCanvasContextAsync"
		}
	},
	{
		path: "pages/component/canvas/canvas/ball",
		group: "0,7",
		style: {
			navigationBarTitleText: "ball"
		}
	},
	{
		path: "pages/component/canvas/canvas/doodle",
		group: "0,7",
		style: {
			navigationBarTitleText: "涂鸦"
		}
	},
	{
		path: "pages/component/native-view/native-view",
		group: "0,2,4",
		style: {
			navigationBarTitleText: "native-view"
		}
	},
	{
		path: "pages/component/ad/ad",
		group: "0,8",
		style: {
			navigationBarTitleText: "ad | 信息流广告",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/component/waterflow/waterflow",
		group: "0,1,7",
		style: {
			navigationBarTitleText: "waterflow | 瀑布流容器"
		}
	},
	{
		path: "pages/component/ad/list-view-ad",
		style: {
			navigationBarTitleText: "ad | 信息流广告",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/tabBar/API",
		style: {
			navigationBarTitleText: "接口",
			backgroundColorContent: "#f8f8f8"
		}
	},
	{
		path: "pages/API/get-app/get-app",
		group: "1,0,0",
		style: {
			navigationBarTitleText: "getApp | 获取当前应用实例"
		}
	},
	{
		path: "pages/API/exit/exit",
		group: "1,1,5",
		style: {
			navigationBarTitleText: "exit | 退出应用"
		}
	},
	{
		path: "pages/API/install-apk/install-apk",
		group: "1,6,6",
		style: {
			navigationBarTitleText: "installApk | 安装 APK",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-current-pages/get-current-pages",
		group: "1,0,1",
		style: {
			navigationBarTitleText: "getCurrentPages | 获取当前页面栈",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/API/get-current-pages/set-page-style-disable-pull-down-refresh",
		style: {
			navigationBarTitleText: "setPageStyle pull default false",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-launch-options-sync/get-launch-options-sync",
		group: "1,1,4,0",
		style: {
			navigationBarTitleText: "getLaunchOptionsSync | 获取启动参数"
		}
	},
	{
		path: "pages/API/get-enter-options-sync/get-enter-options-sync",
		group: "1,1,4,1",
		style: {
			navigationBarTitleText: "getEnterOptionsSync | 获取本次启动时的参数"
		}
	},
	{
		path: "pages/API/animation-frame/animation-frame",
		group: "1,0,2",
		style: {
			navigationBarTitleText: "animationFrame | 动画帧"
		}
	},
	{
		path: "pages/API/navigator/navigator",
		group: "1,2,0",
		style: {
			navigationBarTitleText: "navigator | 页面跳转"
		}
	},
	{
		path: "pages/API/set-navigation-bar-color/set-navigation-bar-color",
		group: "1,2,2",
		style: {
			navigationBarTitleText: "setNavigationBarColor | 设置导航条颜色"
		}
	},
	{
		path: "pages/API/set-navigation-bar-title/set-navigation-bar-title",
		group: "1,2,3",
		style: {
			navigationBarTitleText: "setNavigationBarTitle | 设置导航条标题"
		}
	},
	{
		path: "pages/API/set-page-backgroundColorContent/set-page-backgroundColorContent",
		group: "1,2",
		style: {
			navigationBarTitleText: "设置页面容器背景色"
		}
	},
	{
		path: "pages/API/navigator/new-page/new-page-1",
		style: {
			navigationBarTitleText: "新页面-1"
		}
	},
	{
		path: "pages/API/navigator/new-page/new-page-3",
		style: {
			navigationBarTitleText: "新页面-3"
		}
	},
	{
		path: "pages/API/navigator/new-page/onLoad",
		style: {
			navigationBarTitleText: "onLoad 生命周期测试"
		}
	},
	{
		path: "pages/API/pull-down-refresh/pull-down-refresh",
		group: "1,2,5",
		style: {
			navigationBarTitleText: "pullDownRefresh | 页面下拉刷新",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/API/storage/storage",
		group: "1,10",
		style: {
			navigationBarTitleText: "storage | key-value本地数据存储"
		}
	},
	{
		path: "pages/API/get-file-system-manager/get-file-system-manager",
		group: "1,11,0",
		style: {
			navigationBarTitleText: "getFileSystemManager | 获取文件管理器"
		}
	},
	{
		path: "pages/API/env/env",
		group: "1,1,0",
		style: {
			navigationBarTitleText: "env | 环境变量"
		}
	},
	{
		path: "pages/API/show-action-sheet/show-action-sheet",
		group: "1,4,1",
		style: {
			navigationBarTitleText: "showActionSheet | 弹出操作菜单"
		}
	},
	{
		path: "pages/API/show-modal/show-modal",
		group: "1,4,2",
		style: {
			navigationBarTitleText: "showModal | 显示模态弹窗"
		}
	},
	{
		path: "pages/API/show-loading/show-loading",
		group: "1,4,3",
		style: {
			navigationBarTitleText: "showLoading | 显示 loading 提示框"
		}
	},
	{
		path: "pages/API/show-toast/show-toast",
		group: "1,4,4",
		style: {
			navigationBarTitleText: "showToast | 显示消息提示框"
		}
	},
	{
		path: "pages/API/load-font-face/load-font-face",
		group: "1,4,5",
		style: {
			navigationBarTitleText: "loadFontFace | 动态加载字体"
		}
	},
	{
		path: "pages/API/load-font-face/load-font-face-child",
		style: {
			navigationBarTitleText: "动态加载字体-子页面"
		}
	},
	{
		path: "pages/API/get-location/get-location",
		group: "1,9,0",
		style: {
			navigationBarTitleText: "getLocation | 获取当前位置"
		}
	},
	{
		path: "pages/API/open-location/open-location",
		group: "1,9,1",
		style: {
			navigationBarTitleText: "openLocation | 使用地图查看位置"
		}
	},
	{
		path: "pages/API/choose-location/choose-location",
		group: "1,9,2",
		style: {
			navigationBarTitleText: "chooseLocation | 使用地图选择位置"
		}
	},
	{
		path: "pages/API/interceptor/interceptor",
		group: "1,1,3",
		style: {
			navigationBarTitleText: "interceptor | 拦截器"
		}
	},
	{
		path: "pages/API/interceptor/page1",
		style: {
			navigationBarTitleText: "拦截器测试页面 1"
		}
	},
	{
		path: "pages/API/interceptor/page2",
		style: {
			navigationBarTitleText: "拦截器测试页面 2"
		}
	},
	{
		path: "pages/API/request/request",
		group: "1,5,0",
		style: {
			navigationBarTitleText: "request | 发起网络请求"
		}
	},
	{
		path: "pages/API/upload-file/upload-file",
		group: "1,5,1",
		style: {
			navigationBarTitleText: "uploadFile | 上传文件"
		}
	},
	{
		path: "pages/API/download-file/download-file",
		group: "1,5,2",
		style: {
			navigationBarTitleText: "downloadFile | 下载文件"
		}
	},
	{
		path: "pages/API/websocket/socketTask",
		style: {
			navigationBarTitleText: "socketTask"
		}
	},
	{
		path: "pages/API/websocket/websocket",
		group: "1,5,4",
		style: {
			navigationBarTitleText: "websocket"
		}
	},
	{
		path: "pages/API/unicloud/unicloud/cloud-function",
		group: "1,19,0",
		style: {
			navigationBarTitleText: "cloud function | 云函数"
		}
	},
	{
		path: "pages/API/unicloud/unicloud/cloud-object",
		group: "1,19,1",
		style: {
			navigationBarTitleText: "cloud object | 云对象"
		}
	},
	{
		path: "pages/API/get-system-info/get-system-info",
		group: "1,6,0",
		style: {
			navigationBarTitleText: "getSystemInfo | 获取系统信息"
		}
	},
	{
		path: "pages/API/get-device-info/get-device-info",
		group: "1,6,1",
		style: {
			navigationBarTitleText: "getDeviceInfo | 获取设备信息"
		}
	},
	{
		path: "pages/API/get-app-base-info/get-app-base-info",
		group: "1,6,3",
		style: {
			navigationBarTitleText: "getAppBaseInfo | 获取APP基础信息"
		}
	},
	{
		path: "pages/API/get-system-setting/get-system-setting",
		group: "1,6,5",
		style: {
			navigationBarTitleText: "getSystemSetting | 获取系统设置"
		}
	},
	{
		path: "pages/API/element-takesnapshot/element-takesnapshot",
		group: "1,30",
		style: {
			navigationBarTitleText: "takeSnapshot | 截图",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/element-get-bounding-client-rect-async/element-get-bounding-client-rect-async",
		group: "1,30",
		style: {
			navigationBarTitleText: "getBoundingClientRectAsync | 异步获取元素信息"
		}
	},
	{
		path: "pages/API/element-get-attribute/element-get-attribute",
		group: "1,30",
		style: {
			navigationBarTitleText: "getAttribute | 获取元素的属性值"
		}
	},
	{
		path: "pages/API/get-app-authorize-setting/get-app-authorize-setting",
		group: "1,6,4",
		style: {
			navigationBarTitleText: "getAppAuthorizeSetting | 获取APP授权设置"
		}
	},
	{
		path: "pages/API/preview-image/preview-image",
		group: "1,7,1",
		style: {
			navigationBarTitleText: "previewImage | 图片预览"
		}
	},
	{
		path: "pages/API/choose-image/choose-image",
		group: "1,7,0",
		style: {
			navigationBarTitleText: "chooseImage | 拍照或从相册选择图片"
		}
	},
	{
		path: "pages/API/get-image-info/get-image-info",
		group: "1,7,3",
		style: {
			navigationBarTitleText: "getImageInfo | 获取图片信息"
		}
	},
	{
		path: "pages/API/compress-image/compress-image",
		group: "1,7,4",
		style: {
			navigationBarTitleText: "compressImage | 压缩图片"
		}
	},
	{
		path: "pages/API/choose-video/choose-video",
		group: "1,7,5",
		style: {
			navigationBarTitleText: "chooseVideo | 拍摄视频或从相册中选择视频"
		}
	},
	{
		path: "pages/API/compress-video/compress-video",
		group: "1,7,8",
		style: {
			navigationBarTitleText: "compressVideo | 压缩视频"
		}
	},
	{
		path: "pages/API/get-network-type/get-network-type",
		group: "1,5,3",
		style: {
			navigationBarTitleText: "getNetworkType | 获取网络类型"
		}
	},
	{
		path: "pages/API/page-scroll-to/page-scroll-to",
		group: "1,2,6",
		style: {
			navigationBarTitleText: "pageScrollTo | 将页面滚动到指定位置"
		}
	},
	{
		path: "pages/API/event-bus/event-bus",
		group: "1,1,1",
		style: {
			navigationBarTitleText: "eventBus | 事件总线"
		}
	},
	{
		path: "pages/API/unicloud/unicloud/cloud-storage",
		group: "1,19,2",
		style: {
			navigationBarTitleText: "cloud storage | 云存储"
		}
	},
	{
		path: "pages/API/unicloud/unicloud/database",
		group: "1,19,3",
		style: {
			navigationBarTitleText: "database | 数据库"
		}
	},
	{
		path: "pages/API/get-battery-info/get-battery-info",
		group: "1,6,7",
		style: {
			navigationBarTitleText: "getBatteryInfo | 获取电池电量信息"
		}
	},
	{
		path: "pages/API/get-window-info/get-window-info",
		group: "1,6,2",
		style: {
			navigationBarTitleText: "getWindowInfo | 获取窗口信息"
		}
	},
	{
		path: "pages/API/get-window-info/window-area",
		style: {
			navigationBarTitleText: "window area",
			navigationStyle: "custom"
		}
	},
	{
		path: "pages/API/element-draw/element-draw",
		group: "1,30",
		style: {
			navigationBarTitleText: "getDrawableContext | 获取绘制对象",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/facial-recognition-meta-info/facial-recognition-meta-info",
		group: "1,12,1",
		style: {
			navigationBarTitleText: "facialRecognitionMetaInfo | 金融级实人认证",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-univerify-manager/get-univerify-manager",
		group: "1,12,0",
		style: {
			navigationBarTitleText: "getUniverifyManager | App一键登录",
			navigationBarTextStyle: "white",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-univerify-manager/univerify-custom-page",
		style: {
			navigationBarTextStyle: "black",
			navigationStyle: "custom"
		}
	},
	{
		path: "pages/API/get-univerify-manager/full-webview-page",
		style: {
			navigationBarTextStyle: "white",
			navigationStyle: "custom"
		}
	},
	{
		path: "pages/API/rpx2px/rpx2px",
		group: "1,4,6",
		style: {
			navigationBarTitleText: "rpx2px | 将rpx单位值转换成px",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/create-request-permission-listener/create-request-permission-listener",
		group: "1,6,15",
		style: {
			navigationBarTitleText: "createRequestPermissionListener | 监听权限申请",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/request-payment/request-payment",
		group: "1,14,0",
		style: {
			navigationBarTitleText: "requestPayment | 支付（requestPayment）",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/create-rewarded-video-ad/create-rewarded-video-ad",
		group: "1,13,0",
		style: {
			navigationBarTitleText: "createRewardedVideoAd | 激励视频广告",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/request-payment/request-payment/request-payment-uni-pay",
		group: "1,14",
		style: {
			navigationBarTitleText: "uni-pay示例",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/request-payment/request-payment/order-detail",
		style: {
			navigationBarTitleText: "订单详情示例",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/create-inner-audio-context/create-inner-audio-context",
		group: "1,7,9",
		style: {
			navigationBarTitleText: "createInnerAudioContext | 音频"
		}
	},
	{
		path: "pages/API/create-inner-audio-context/inner-audio-format",
		style: {
			navigationBarTitleText: "inner-audio-format"
		}
	},
	{
		path: "pages/API/create-inner-audio-context/inner-audio-path",
		style: {
			navigationBarTitleText: "inner-audio-path"
		}
	},
	{
		path: "pages/API/create-inner-audio-context/inner-audio-mult",
		style: {
			navigationBarTitleText: "inner-audio-mult"
		}
	},
	{
		path: "pages/API/theme-change/theme-change",
		group: "1,4,7",
		style: {
			navigationBarTitleText: "themeChange | 主题切换",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-element-by-id/get-element-by-id",
		group: "1,3,0",
		style: {
			navigationBarTitleText: "getElementById | 通过 id 获取 element"
		}
	},
	{
		path: "pages/API/get-element-by-id/get-element-by-id-multiple-root-node",
		style: {
			navigationBarTitleText: "获取节点-多根节点"
		}
	},
	{
		path: "pages/API/create-selector-query/create-selector-query",
		group: "1,3,2",
		style: {
			navigationBarTitleText: "createSelectorQuery | 创建 SelectorQuery 实例"
		}
	},
	{
		path: "pages/API/create-selector-query/create-selector-query-onScroll",
		style: {
			navigationBarTitleText: "createSelectorQuery"
		}
	},
	{
		path: "pages/API/get-native-view/element-getnativeview",
		group: "1,30",
		style: {
			navigationBarTitleText: "getNativeView | 获取原生 View",
			backgroundColor: "#F8F8F8"
		}
	},
	{
		path: "pages/API/resize-observer/resize-observer",
		group: "1,30",
		style: {
			navigationBarTitleText: "UniResizeObserver"
		}
	},
	{
		path: "pages/API/provider/provider",
		group: "1,1,6",
		style: {
			navigationBarTitleText: "provider | 服务提供商"
		}
	},
	{
		path: "pages/API/privacy/privacy",
		group: "1,1,8",
		style: {
			navigationBarTitleText: "privacy | 隐私信息授权"
		}
	},
	{
		path: "pages/API/uni-push/uni-push",
		group: "1,16,0",
		style: {
			navigationBarTitleText: "推送"
		}
	},
	{
		path: "pages/API/report/report",
		group: "1,17,0",
		style: {
			navigationBarTitleText: "report | 统计采集上报"
		}
	},
	{
		path: "pages/API/dialog-page/dialog-page",
		group: "1,2,1",
		style: {
			navigationBarTitleText: "dialogPage"
		}
	},
	{
		path: "pages/API/dialog-page/next-page",
		style: {
			navigationBarTitleText: "dialogNextPage"
		}
	},
	{
		path: "pages/API/dialog-page/dialog-1",
		style: {
			navigationBarTitleText: "dialogPage1"
		}
	},
	{
		path: "pages/API/dialog-page/dialog-2",
		style: {
			navigationBarTitleText: "dialogPage2"
		}
	},
	{
		path: "pages/API/dialog-page/dialog-3",
		style: {
			navigationBarTitleText: "dialogPage3"
		}
	},
	{
		path: "pages/API/dialog-page/dialog-4",
		style: {
			navigationBarTitleText: "dialogPage4",
			navigationBarTextStyle: "black"
		}
	},
	{
		path: "pages/API/create-interstitial-ad/create-interstitial-ad",
		group: "1,13,1",
		style: {
			navigationBarTitleText: "createInterstitialAd | 插屏广告",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/get-background-audio-manager/get-background-audio-manager",
		group: "1,7,10",
		style: {
			navigationBarTitleText: "getBackgroundAudioManager | 背景音频",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/API/share-with-system/share-with-system",
		group: "1,15,0",
		style: {
			navigationBarTitleText: "shareWithSystem",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/tabBar/CSS",
		style: {
			navigationBarTitleText: "CSS",
			backgroundColorContent: "#f8f8f8"
		}
	},
	{
		path: "pages/tabBar/template",
		style: {
			navigationBarTitleText: "模板",
			backgroundColorContent: "#f8f8f8"
		}
	},
	{
		path: "pages/template/list-news/list-news",
		style: {
			navigationBarTitleText: "列表到详情示例（吸顶）"
		}
	},
	{
		path: "pages/template/list-news/detail/detail",
		style: {
			navigationBarTitleText: "详情示例"
		}
	},
	{
		path: "pages/template/drop-card/drop-card",
		style: {
			navigationBarTitleText: "drop-card"
		}
	},
	{
		path: "pages/template/swiper-list/swiper-list",
		style: {
			navigationBarTitleText: "swiper-list"
		}
	},
	{
		path: "pages/template/swiper-list2/swiper-list2",
		style: {
			navigationBarTitleText: "swiper-list2"
		}
	},
	{
		path: "pages/template/slider-100/slider-100",
		style: {
			navigationBarTitleText: "slider x 100"
		}
	},
	{
		path: "pages/template/swiper-vertical-video/swiper-vertical-video",
		style: {
			navigationStyle: "custom",
			backgroundColorContent: "#000000"
		}
	},
	{
		path: "pages/template/scroll-sticky/scroll-sticky",
		style: {
			navigationBarTitleText: "scroll-view自定义滚动吸顶"
		}
	},
	{
		path: "pages/template/scroll-fold-nav/scroll-fold-nav",
		style: {
			navigationStyle: "custom",
			navigationBarTextStyle: "black"
		}
	},
	{
		path: "pages/template/custom-refresher/custom-refresher",
		style: {
			navigationBarTitleText: "自定义下拉刷新"
		}
	},
	{
		path: "pages/template/half-screen/half-screen",
		style: {
			navigationBarTitleText: "半屏弹窗"
		}
	},
	{
		path: "pages/template/long-list/long-list",
		style: {
			navigationBarTitleText: "Android顶部搜索框随时下移长列表",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/template/long-list2/long-list2",
		style: {
			navigationBarTitleText: "顶部banner长列表嵌套滚动示例",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/template/long-list-nested/long-list-nested",
		style: {
			navigationBarTitleText: "顶部banner长列表嵌套滚动示例",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/template/long-waterflow-nested/long-waterflow-nested",
		style: {
			navigationBarTitleText: "顶部banner瀑布流长列表嵌套滚动示例",
			enablePullDownRefresh: true
		}
	},
	{
		path: "pages/template/pull-zoom-image/pull-zoom-image",
		style: {
			navigationStyle: "custom"
		}
	},
	{
		path: "pages/template/navbar-lite/navbar-lite",
		style: {
			navigationBarTitleText: "自定义导航栏",
			navigationStyle: "custom"
		}
	},
	{
		path: "pages/template/custom-tab-bar/custom-tab-bar",
		style: {
			navigationBarTitleText: "自定义TabBar"
		}
	},
	{
		path: "pages/template/calendar/calendar",
		style: {
			navigationBarTitleText: "日历"
		}
	},
	{
		path: "pages/template/schema/schema",
		style: {
			navigationBarTitleText: "打开schema示例"
		}
	},
	{
		path: "uni_modules/uni-pay-x/pages/success/success",
		style: {
			navigationBarTitleText: "",
			backgroundColor: "#F8F8F8",
			navigationBarBackgroundColor: "#007aff",
			navigationBarTextStyle: "white"
		}
	},
	{
		path: "uni_modules/uni-pay-x/pages/ad-interactive-webview/ad-interactive-webview",
		style: {
			navigationBarTitleText: "ad",
			backgroundColor: "#F8F8F8"
		}
	},
	{
		path: "uni_modules/uni-pay-x/pages/pay-desk/pay-desk",
		style: {
			navigationBarTitleText: "收银台",
			backgroundColor: "#F8F8F8"
		}
	},
	{
		path: "pages/template/custom-long-list/custom-long-list",
		style: {
			navigationBarTitleText: "自定义虚拟长列表",
			enablePullDownRefresh: false
		}
	},
	{
		path: "pages/template/test-background-color-content/test-background-color-content",
		style: {
			navigationBarTitleText: "",
			backgroundColorContent: "#fffae8"
		}
	},
	{
		path: "uni_modules/uni-openLocation/pages/openLocation/openLocation",
		style: {
			navigationBarTitleText: " ",
			navigationStyle: "custom",
			disableSwipeBack: false
		}
	},
	{
		path: "pages/component/button/privacy",
		style: {
			navigationBarTitleText: ""
		}
	},
	{
		path: "uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup",
		style: {
			navigationBarTitleText: ""
		}
	}
];
export const subPackages = [
	{
		root: "pages/API/save-image-to-photos-album",
		pages: [
			{
				path: "save-image-to-photos-album",
				group: "1,7,2",
				style: {
					navigationBarTitleText: "saveImageToPhotosAlbum | 保存图片到相册"
				}
			}
		]
	},
	{
		root: "pages/API/save-video-to-photos-album",
		pages: [
			{
				path: "save-video-to-photos-album",
				group: "1,7,6",
				style: {
					navigationBarTitleText: "saveVideoToPhotosAlbum | 保存视频到相册"
				}
			}
		]
	},
	{
		root: "pages/API/get-video-info",
		pages: [
			{
				path: "get-video-info",
				group: "1,7,7",
				style: {
					navigationBarTitleText: "getVideoInfo | 获取视频信息"
				}
			}
		]
	},
	{
		root: "pages/CSS",
		pages: [
			{
				path: "background/background-color",
				group: "2,8,1",
				style: {
					navigationBarTitleText: "background-color"
				}
			},
			{
				path: "background/background-image",
				group: "2,8,2",
				style: {
					navigationBarTitleText: "background-image"
				}
			},
			{
				path: "border/border-bottom",
				group: "2,13,22",
				style: {
					navigationBarTitleText: "border-bottom"
				}
			},
			{
				path: "border/border-color",
				group: "2,13,11",
				style: {
					navigationBarTitleText: "border-color"
				}
			},
			{
				path: "border/border-left",
				group: "2,13,23",
				style: {
					navigationBarTitleText: "border-left"
				}
			},
			{
				path: "border/border-radius",
				group: "2,13,16",
				style: {
					navigationBarTitleText: "border-radius"
				}
			},
			{
				path: "border/border-right",
				group: "2,13,24",
				style: {
					navigationBarTitleText: "border-right"
				}
			},
			{
				path: "border/border-style",
				group: "2,13,1",
				style: {
					navigationBarTitleText: "border-style"
				}
			},
			{
				path: "border/border-top",
				group: "2,13,21",
				style: {
					navigationBarTitleText: "border-top"
				}
			},
			{
				path: "border/border-width",
				group: "2,13,6",
				style: {
					navigationBarTitleText: "border-width"
				}
			},
			{
				path: "border/border",
				group: "2,13,0",
				style: {
					navigationBarTitleText: "border"
				}
			},
			{
				path: "border/complex-border/complex-border",
				group: "2,13",
				style: {
					navigationBarTitleText: "border属性组合示例"
				}
			},
			{
				path: "border/dynamic-border",
				group: "2,13",
				style: {
					navigationBarTitleText: "border动态修改"
				}
			},
			{
				path: "border/border-update",
				group: "2,13",
				style: {
					navigationBarTitleText: "border更新样式"
				}
			},
			{
				path: "box-shadow/box-shadow",
				group: "2,15",
				style: {
					navigationBarTitleText: "box-shadow"
				}
			},
			{
				path: "display/flex",
				group: "2,5",
				style: {
					navigationBarTitleText: "flex"
				}
			},
			{
				path: "display/none",
				group: "2,5",
				style: {
					navigationBarTitleText: "none"
				}
			},
			{
				path: "flex/align-content",
				group: "2,7,6",
				style: {
					navigationBarTitleText: "align-content"
				}
			},
			{
				path: "flex/align-items",
				group: "2,7,4",
				style: {
					navigationBarTitleText: "align-items"
				}
			},
			{
				path: "flex/flex-basis",
				group: "2,7,9",
				style: {
					navigationBarTitleText: "flex-basis"
				}
			},
			{
				path: "flex/flex-direction",
				group: "2,7,1",
				style: {
					navigationBarTitleText: "flex-direction"
				}
			},
			{
				path: "flex/flex-flow",
				group: "2,7,10",
				style: {
					navigationBarTitleText: "flex-flow"
				}
			},
			{
				path: "flex/flex-grow",
				group: "2,7,7",
				style: {
					navigationBarTitleText: "flex-grow"
				}
			},
			{
				path: "flex/flex-shrink",
				group: "2,7,8",
				style: {
					navigationBarTitleText: "flex-shrink"
				}
			},
			{
				path: "flex/flex",
				group: "2,7,0",
				style: {
					navigationBarTitleText: "flex"
				}
			},
			{
				path: "flex/justify-content",
				group: "2,7,2",
				style: {
					navigationBarTitleText: "justify-content"
				}
			},
			{
				path: "layout/height",
				group: "2,1,0",
				style: {
					navigationBarTitleText: "height"
				}
			},
			{
				path: "layout/max-height",
				group: "2,1,2",
				style: {
					navigationBarTitleText: "max-height"
				}
			},
			{
				path: "layout/max-width",
				group: "2,0,2",
				style: {
					navigationBarTitleText: "max-width"
				}
			},
			{
				path: "layout/min-height",
				group: "2,1,1",
				style: {
					navigationBarTitleText: "min-height"
				}
			},
			{
				path: "layout/min-width",
				group: "2,0,1",
				style: {
					navigationBarTitleText: "min-width"
				}
			},
			{
				path: "layout/position",
				group: "2,9,0",
				style: {
					navigationBarTitleText: "position"
				}
			},
			{
				path: "layout/width",
				group: "2,0,0",
				style: {
					navigationBarTitleText: "width"
				}
			},
			{
				path: "layout/z-index",
				group: "2,10",
				style: {
					navigationBarTitleText: "z-index"
				}
			},
			{
				path: "layout/visibility",
				group: "2,6",
				style: {
					navigationBarTitleText: "visibility"
				}
			},
			{
				path: "margin/margin-bottom",
				group: "2,2,2",
				style: {
					navigationBarTitleText: "margin-bottom"
				}
			},
			{
				path: "margin/margin-left",
				group: "2,2,3",
				style: {
					navigationBarTitleText: "margin-left"
				}
			},
			{
				path: "margin/margin-right",
				group: "2,2,4",
				style: {
					navigationBarTitleText: "margin-right"
				}
			},
			{
				path: "margin/margin-top",
				group: "2,2,1",
				style: {
					navigationBarTitleText: "margin-top"
				}
			},
			{
				path: "margin/margin",
				group: "2,2,0",
				style: {
					navigationBarTitleText: "margin"
				}
			},
			{
				path: "overflow/overflow",
				group: "2,11",
				style: {
					navigationBarTitleText: "overflow"
				}
			},
			{
				path: "padding/padding-bottom",
				group: "2,3,2",
				style: {
					navigationBarTitleText: "padding-bottom"
				}
			},
			{
				path: "padding/padding-left",
				group: "2,3,3",
				style: {
					navigationBarTitleText: "padding-left"
				}
			},
			{
				path: "padding/padding-right",
				group: "2,3,4",
				style: {
					navigationBarTitleText: "padding-right"
				}
			},
			{
				path: "padding/padding-top",
				group: "2,3,1",
				style: {
					navigationBarTitleText: "padding-top"
				}
			},
			{
				path: "padding/padding",
				group: "2,3,0",
				style: {
					navigationBarTitleText: "padding"
				}
			},
			{
				path: "text/color",
				group: "2,14,0",
				style: {
					navigationBarTitleText: "color"
				}
			},
			{
				path: "text/font-family",
				group: "2,14,2",
				style: {
					navigationBarTitleText: "font-family"
				}
			},
			{
				path: "text/font-size",
				group: "2,14,1",
				style: {
					navigationBarTitleText: "font-size"
				}
			},
			{
				path: "text/font-style",
				group: "2,14,3",
				style: {
					navigationBarTitleText: "font-style"
				}
			},
			{
				path: "text/font-weight",
				group: "2,14,4",
				style: {
					navigationBarTitleText: "font-weight"
				}
			},
			{
				path: "text/letter-spacing",
				group: "2,14,14",
				style: {
					navigationBarTitleText: "letter-spacing"
				}
			},
			{
				path: "text/font-family-icon",
				style: {
					navigationBarTitleText: "font-family: uni-icon"
				}
			},
			{
				path: "text/line-height",
				group: "2,14,12",
				style: {
					navigationBarTitleText: "line-height"
				}
			},
			{
				path: "text/text-align",
				group: "2,14,10",
				style: {
					navigationBarTitleText: "text-align"
				}
			},
			{
				path: "text/text-overflow",
				group: "2,14,11",
				style: {
					navigationBarTitleText: "text-overflow"
				}
			},
			{
				path: "text/text-decoration-line",
				group: "2,14,6",
				style: {
					navigationBarTitleText: "text-decoration-line"
				}
			},
			{
				path: "transition/transition",
				group: "2,16",
				style: {
					navigationBarTitleText: "transition"
				}
			},
			{
				path: "pointer-events/pointer-events",
				group: "2,18",
				style: {
					navigationBarTitleText: "pointer-events"
				}
			},
			{
				path: "transform/translate",
				group: "2,17",
				style: {
					navigationBarTitleText: "translate"
				}
			},
			{
				path: "transform/scale",
				group: "2,17",
				style: {
					navigationBarTitleText: "scale"
				}
			},
			{
				path: "transform/rotate",
				group: "2,17",
				style: {
					navigationBarTitleText: "rotate"
				}
			},
			{
				path: "variable/variable",
				group: "2,20",
				style: {
					navigationBarTitleText: "css 变量"
				}
			},
			{
				path: "overflow/overflow-visible-event",
				group: "2,11",
				style: {
					navigationBarTitleText: "overflow-visible-event"
				}
			}
		]
	}
];
export const globalStyle = {
	pageOrientation: "portrait",
	navigationBarTitleText: "Hello uniapp x",
	navigationBarTextStyle: "@navigationBarTextStyle",
	navigationBarBackgroundColor: "@navigationBarBackgroundColor",
	backgroundColorContent: "@backgroundColorContent",
	backgroundColor: "@backgroundColor",
	backgroundTextStyle: "@backgroundTextStyle"
};
export const tabBar = {
	color: "@tabBarColor",
	selectedColor: "@tabBarSelectedColor",
	borderStyle: "@tabBarBorderStyle",
	backgroundColor: "@tabBarBackgroundColor",
	list: [
		{
			pagePath: "pages/tabBar/component",
			iconPath: "@tabBarComponentIconPath",
			selectedIconPath: "@tabBarComponentSelectedIconPath",
			text: "组件"
		},
		{
			pagePath: "pages/tabBar/API",
			iconPath: "@tabBarAPIIconPath",
			selectedIconPath: "@tabBarAPISelectedIconPath",
			text: "接口"
		},
		{
			pagePath: "pages/tabBar/CSS",
			iconPath: "@tabBarCSSIconPath",
			selectedIconPath: "@tabBarCSSSelectedIconPath",
			text: "CSS"
		},
		{
			pagePath: "pages/tabBar/template",
			iconPath: "@tabBarTemplateIconPath",
			selectedIconPath: "@tabBarTemplateSelectedIconPath",
			text: "模板"
		}
	]
};
export const condition = {
	current: 0,
	list: [
		{
			name: "",
			path: "",
			query: ""
		}
	]
};
export const groups = [
	{
		id: "component",
		name: "组件",
		children: [
			{
				id: "component.global-properties-events",
				name: "全局属性和事件"
			},
			{
				id: "component.view-container",
				name: "视图容器",
				children: [
					{
						id: "component.view-container.view",
						name: "view"
					},
					{
						id: "component.view-container.scroll-view",
						name: "scroll-view"
					},
					{
						id: "component.view-container.swiper",
						name: "swiper"
					},
					null,
					{
						id: "component.view-container.movable",
						name: "movable",
						children: [
							null,
							{
								id: "component.view-container.movable.movable-view",
								name: "movable-view"
							}
						]
					},
					{
						id: "component.view-container.cover",
						name: "cover",
						children: [
							{
								id: "component.view-container.cover.cover-view",
								name: "cover-view"
							}
						]
					},
					{
						id: "component.view-container.list-view",
						name: "list-view"
					},
					{
						id: "component.view-container.waterflow",
						name: "waterflow"
					},
					{
						id: "component.view-container.sticky",
						name: "sticky",
						children: [
							{
								id: "component.view-container.sticky.sticky-header",
								name: "sticky-header"
							},
							{
								id: "component.view-container.sticky.sticky-section",
								name: "sticky-section"
							}
						]
					},
					{
						id: "component.view-container.nested-scroll",
						name: "nested-scroll",
						children: [
							{
								id: "component.view-container.nested-scroll.nested-scroll-header",
								name: "nested-scroll-header"
							},
							{
								id: "component.view-container.nested-scroll.nested-scroll-body",
								name: "nested-scroll-body"
							}
						]
					}
				]
			},
			{
				id: "component.basic-content",
				name: "基础内容",
				children: [
					null,
					{
						id: "component.basic-content.text",
						name: "text"
					},
					{
						id: "component.basic-content.rich-text",
						name: "rich-text"
					},
					{
						id: "component.basic-content.progress",
						name: "progress"
					},
					{
						id: "component.basic-content.native-view",
						name: "native-view"
					}
				]
			},
			{
				id: "component.form-component",
				name: "表单组件",
				children: [
					{
						id: "component.form-component.button",
						name: "button"
					},
					{
						id: "component.form-component.checkbox",
						name: "checkbox"
					},
					{
						id: "component.form-component.form",
						name: "form"
					},
					{
						id: "component.form-component.input",
						name: "input"
					},
					{
						id: "component.form-component.editor",
						name: "editor"
					},
					{
						id: "component.form-component.label",
						name: "label"
					},
					{
						id: "component.form-component.picker",
						name: "picker"
					},
					{
						id: "component.form-component.picker-view",
						name: "picker-view"
					},
					{
						id: "component.form-component.radio",
						name: "radio"
					},
					{
						id: "component.form-component.slider",
						name: "slider"
					},
					{
						id: "component.form-component.switch",
						name: "switch"
					},
					{
						id: "component.form-component.textarea",
						name: "textarea"
					}
				]
			},
			{
				id: "component.navigation",
				name: "导航",
				children: [
					{
						id: "component.navigation.navigator",
						name: "navigator"
					}
				]
			},
			{
				id: "component.media",
				name: "媒体组件",
				children: [
					{
						id: "component.media.image",
						name: "image"
					},
					{
						id: "component.media.video",
						name: "video"
					}
				]
			},
			{
				id: "component.map",
				name: "地图"
			},
			{
				id: "component.canvas",
				name: "画布"
			},
			{
				id: "component.ad",
				name: "广告"
			},
			{
				id: "component.web-view",
				name: "网页"
			},
			{
				id: "component.page-meta",
				name: "page-meta"
			},
			{
				id: "component.unicloud",
				name: "unicloud"
			}
		]
	},
	{
		id: "API",
		name: "API",
		children: [
			{
				id: "api.global",
				name: "全局",
				children: [
					{
						id: "api.global.getApp",
						name: "getApp"
					},
					{
						id: "api.global.getCurrentPages",
						name: "getCurrentPages"
					},
					{
						id: "api.global.animationFrame",
						name: "animationFrame"
					}
				]
			},
			{
				id: "api.base",
				name: "基础",
				children: [
					{
						id: "api.base.env",
						name: "env"
					},
					{
						id: "api.base.eventBus",
						name: "eventBus"
					},
					null,
					{
						id: "api.base.interceptor",
						name: "interceptor"
					},
					{
						id: "api.base.launch",
						name: "启动",
						children: [
							{
								id: "api.base.launch.getLaunchOptionsSync",
								name: "getLaunchOptionsSync"
							},
							{
								id: "api.base.launch.getEnterOptionsSync",
								name: "getEnterOptionsSync"
							}
						]
					},
					{
						id: "api.base.exit",
						name: "exit"
					},
					{
						id: "api.base.provider",
						name: "provider"
					},
					null,
					{
						id: "api.base.privacy",
						name: "privacy"
					}
				]
			},
			{
				id: "api.page",
				name: "页面和路由",
				children: [
					{
						id: "api.page.navigator",
						name: "navigator"
					},
					{
						id: "api.page.dialogPage",
						name: "dialogPage"
					},
					{
						id: "api.page.setNavigationBarColor",
						name: "setNavigationBarColor"
					},
					{
						id: "api.page.setNavigationBarTitle",
						name: "setNavigationBarTitle"
					},
					null,
					{
						id: "api.page.pullDownRefresh",
						name: "pullDownRefresh"
					},
					{
						id: "api.page.pageScrollTo",
						name: "pageScrollTo"
					}
				]
			},
			{
				id: "api.dom",
				name: "element 和 node",
				children: [
					{
						id: "api.dom.getElementById",
						name: "getElementById"
					},
					null,
					{
						id: "api.dom.createSelectorQuery",
						name: "createSelectorQuery"
					}
				]
			},
			{
				id: "api.ui",
				name: "界面",
				children: [
					null,
					{
						id: "api.ui.showActionSheet",
						name: "showActionSheet"
					},
					{
						id: "api.ui.showModal",
						name: "showModal"
					},
					{
						id: "api.ui.showLoading",
						name: "showLoading"
					},
					{
						id: "api.ui.showToast",
						name: "showToast"
					},
					{
						id: "api.ui.loadFontFace",
						name: "loadFontFace"
					},
					{
						id: "api.ui.rpx2px",
						name: "rpx2px"
					},
					{
						id: "api.ui.themeChange",
						name: "themeChange"
					}
				]
			},
			{
				id: "api.network",
				name: "网络",
				children: [
					{
						id: "api.network.request",
						name: "request"
					},
					{
						id: "api.network.uploadFile",
						name: "uploadFile"
					},
					{
						id: "api.network.downloadFile",
						name: "downloadFile"
					},
					{
						id: "api.network.getNetworkType",
						name: "getNetworkType"
					},
					{
						id: "api.network.websocket",
						name: "websocket"
					}
				]
			},
			{
				id: "api.device",
				name: "设备",
				children: [
					{
						id: "api.device.getSystemInfo",
						name: "getSystemInfo"
					},
					{
						id: "api.device.getDeviceInfo",
						name: "getDeviceInfo"
					},
					{
						id: "api.device.getWindowInfo",
						name: "getWindowInfo"
					},
					{
						id: "api.device.getAppBaseInfo",
						name: "getAppBaseInfo"
					},
					{
						id: "api.device.getAppAuthorizeSetting",
						name: "getAppAuthorizeSetting"
					},
					{
						id: "api.device.getSystemSetting",
						name: "getSystemSetting"
					},
					{
						id: "api.device.installApk",
						name: "installApk"
					},
					{
						id: "api.device.getBatteryInfo",
						name: "getBatteryInfo"
					},
					{
						id: "api.device.makePhoneCall",
						name: "makePhoneCall"
					},
					{
						id: "api.device.clipboard",
						name: "clipboard"
					},
					{
						id: "api.device.compass",
						name: "compass"
					},
					null,
					null,
					null,
					null,
					{
						id: "api.device.createRequestPermissionListener",
						name: "createRequestPermissionListener"
					}
				]
			},
			{
				id: "api.media",
				name: "媒体",
				children: [
					{
						id: "api.media.chooseImage",
						name: "chooseImage"
					},
					{
						id: "api.media.previewImage",
						name: "previewImage"
					},
					{
						id: "api.media.saveImageToPhotosAlbum",
						name: "saveImageToPhotosAlbum"
					},
					{
						id: "api.media.getImageInfo",
						name: "getImageInfo"
					},
					{
						id: "api.media.compressImage",
						name: "compressImage"
					},
					{
						id: "api.media.chooseVideo",
						name: "chooseVideo"
					},
					{
						id: "api.media.saveVideoToPhotosAlbum",
						name: "saveVideoToPhotosAlbum"
					},
					{
						id: "api.media.getVideoInfo",
						name: "getVideoInfo"
					},
					{
						id: "api.media.compressVideo",
						name: "compressVideo"
					},
					{
						id: "api.media.createInnerAudioContext",
						name: "createInnerAudioContext"
					},
					{
						id: "api.media.getBackgroundAudioManager",
						name: "getBackgroundAudioManager"
					}
				]
			},
			null,
			{
				id: "api.location",
				name: "位置",
				children: [
					{
						id: "api.location.getLocation",
						name: "getLocation"
					},
					{
						id: "api.location.openLocation",
						name: "openLocation"
					},
					{
						id: "api.location.chooseLocation",
						name: "chooseLocation"
					}
				]
			},
			{
				id: "api.storage",
				name: "数据存储"
			},
			{
				id: "api.file",
				name: "文件",
				children: [
					{
						id: "api.file.getFileSystemManager",
						name: "getFileSystemManager"
					}
				]
			},
			{
				id: "api.loginVerify",
				name: "登录与认证",
				children: [
					{
						id: "api.loginVerify.getUniverifyManager",
						name: "getUniverifyManager"
					},
					{
						id: "api.loginVerify.facialRecognitionMetaInfo",
						name: "facialRecognitionMetaInfo"
					}
				]
			},
			{
				id: "api.ad",
				name: "广告",
				children: [
					{
						id: "api.ad.createRewardedVideoAd",
						name: "createRewardedVideoAd"
					},
					{
						id: "api.ad.createInterstitialAd",
						name: "createInterstitialAd"
					}
				]
			},
			{
				id: "api.payment",
				name: "支付",
				children: [
					{
						id: "api.payment.requestPayment",
						name: "requestPayment"
					},
					{
						id: "api.payment.virtualPayment",
						name: "virtualPayment"
					}
				]
			},
			{
				id: "api.share",
				name: "分享",
				children: [
					{
						id: "api.share.shareWithSystem",
						name: "shareWithSystem"
					}
				]
			},
			{
				id: "api.push",
				name: "推送",
				children: [
					{
						id: "api.push.uni-push",
						name: "push"
					}
				]
			},
			{
				id: "api.stat",
				name: "统计",
				children: [
					{
						id: "api.stat.report",
						name: "report"
					}
				]
			},
			null,
			{
				id: "api.unicloud",
				name: "uniCloud客户端API",
				children: [
					{
						id: "api.unicloud.cloudFunction",
						name: "cloudFunction"
					},
					{
						id: "api.unicloud.cloudObject",
						name: "cloudObject"
					},
					{
						id: "api.unicloud.cloudStorage",
						name: "cloudStorage"
					},
					{
						id: "api.unicloud.database",
						name: "database"
					}
				]
			},
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			{
				id: "api.elementInstance",
				name: "UniElement 实例"
			}
		]
	},
	{
		id: "CSS",
		name: "组件",
		children: [
			{
				id: "css.properties.width",
				name: "width",
				children: [
					{
						id: "css.properties.width.width",
						name: "width"
					},
					{
						id: "css.properties.width.min-width",
						name: "min-width"
					},
					{
						id: "css.properties.width.max-width",
						name: "max-width"
					}
				]
			},
			{
				id: "css.properties.height",
				name: "height",
				children: [
					{
						id: "css.properties.height.height",
						name: "height"
					},
					{
						id: "css.properties.height.min-height",
						name: "min-height"
					},
					{
						id: "css.properties.height.max-height",
						name: "max-height"
					}
				]
			},
			{
				id: "css.properties.margin",
				name: "margin",
				children: [
					{
						id: "css.properties.margin.margin",
						name: "margin"
					},
					{
						id: "css.properties.margin.margin-top",
						name: "margin-top"
					},
					{
						id: "css.properties.margin.margin-bottom",
						name: "margin-bottom"
					},
					{
						id: "css.properties.margin.margin-left",
						name: "margin-left"
					},
					{
						id: "css.properties.margin.margin-right",
						name: "margin-right"
					}
				]
			},
			{
				id: "css.properties.padding",
				name: "padding",
				children: [
					{
						id: "css.properties.padding.padding",
						name: "padding"
					},
					{
						id: "css.properties.padding.padding-top",
						name: "padding-top"
					},
					{
						id: "css.properties.padding.padding-bottom",
						name: "padding-bottom"
					},
					{
						id: "css.properties.padding.padding-left",
						name: "padding-left"
					},
					{
						id: "css.properties.padding.padding-right",
						name: "padding-right"
					}
				]
			},
			null,
			{
				id: "display",
				name: "display"
			},
			{
				id: "css.properties.visibility",
				name: "visibility"
			},
			{
				id: "css.properties.flex",
				name: "flex",
				children: [
					{
						id: "css.properties.flex.flex",
						name: "flex"
					},
					{
						id: "css.properties.flex.flex-direction",
						name: "flex-direction"
					},
					{
						id: "css.properties.flex.justify-content",
						name: "justify-content"
					},
					null,
					{
						id: "css.properties.flex.align-items",
						name: "align-items"
					},
					null,
					{
						id: "css.properties.flex.align-content",
						name: "align-content"
					},
					{
						id: "css.properties.flex.flex-grow",
						name: "flex-grow"
					},
					{
						id: "css.properties.flex.flex-shrink",
						name: "flex-shrink"
					},
					{
						id: "css.properties.flex.flex-basis",
						name: "flex-basis"
					},
					{
						id: "css.properties.flex.flex-flow",
						name: "flex-flow"
					}
				]
			},
			{
				id: "css.properties.background",
				name: "background",
				children: [
					null,
					{
						id: "css.properties.background.background-color",
						name: "background-color"
					},
					{
						id: "css.properties.background.background-image",
						name: "background-image"
					}
				]
			},
			{
				id: "css.properties.position",
				name: "position",
				children: [
					{
						id: "css.properties.position.position",
						name: "position"
					}
				]
			},
			{
				id: "css.properties.z-index",
				name: "z-index"
			},
			{
				id: "overflow",
				name: "overflow"
			},
			null,
			{
				id: "css.properties.border",
				name: "border",
				children: [
					{
						id: "css.properties.border.border",
						name: "border"
					},
					{
						id: "css.properties.border.border-style",
						name: "border-style"
					},
					null,
					null,
					null,
					null,
					{
						id: "css.properties.border.border-width",
						name: "border-width"
					},
					null,
					null,
					null,
					null,
					{
						id: "css.properties.border.border-color",
						name: "border-color"
					},
					null,
					null,
					null,
					null,
					{
						id: "css.properties.border.border-radius",
						name: "border-radius"
					},
					null,
					null,
					null,
					null,
					{
						id: "css.properties.border.border-top",
						name: "border-top"
					},
					{
						id: "css.properties.border.border-bottom",
						name: "border-bottom"
					},
					{
						id: "css.properties.border.border-left",
						name: "border-left"
					},
					{
						id: "css.properties.border.border-right",
						name: "border-right"
					}
				]
			},
			{
				id: "css.properties.text",
				name: "text",
				children: [
					{
						id: "css.properties.text.color",
						name: "color"
					},
					{
						id: "css.properties.text.font-size",
						name: "font-size"
					},
					{
						id: "css.properties.text.font-family",
						name: "font-family"
					},
					{
						id: "css.properties.text.font-style",
						name: "font-style"
					},
					{
						id: "css.properties.text.font-weight",
						name: "font-weight"
					},
					null,
					{
						id: "css.properties.text.text-decoration-line",
						name: "text-decoration-line"
					},
					null,
					null,
					null,
					{
						id: "css.properties.text.text-align",
						name: "text-align"
					},
					{
						id: "css.properties.text.text-overflow",
						name: "text-overflow"
					},
					{
						id: "css.properties.text.line-height",
						name: "line-height"
					},
					null,
					{
						id: "css.properties.text.letter-spacing",
						name: "letter-spacing"
					}
				]
			},
			{
				id: "css.properties.box-shadow",
				name: "box-shadow"
			},
			{
				id: "css.properties.transition",
				name: "transition"
			},
			{
				id: "css.properties.transform",
				name: "transform"
			},
			{
				id: "css.properties.pointer-events",
				name: "pointer-events"
			},
			null,
			{
				id: "variable",
				name: "variable"
			}
		]
	}
];
export default {
	leftWindow: leftWindow,
	topWindow: topWindow,
	pages: pages,
	subPackages: subPackages,
	globalStyle: globalStyle,
	tabBar: tabBar,
	condition: condition,
	groups: groups
};
