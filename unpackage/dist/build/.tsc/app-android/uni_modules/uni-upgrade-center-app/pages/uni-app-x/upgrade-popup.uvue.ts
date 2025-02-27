
	import { openSchema as utsOpenSchema } from '@/uni_modules/uts-openSchema'
	import { createNotificationProgress, cancelNotificationProgress, finishNotificationProgress } from '@/uni_modules/uts-progressNotification'
	import { type CreateNotificationProgressOptions, type FinishNotificationProgressOptions } from '@/uni_modules/uts-progressNotification/utssdk/interface.uts'
	import { UniUpgradeCenterResult, StoreListItem } from '../../utils/call-check-version'
  	import { platform_iOS, platform_Android } from '../../utils/utils'
	const requiredKey = ['version', 'url', 'type']
	let downloadTask : DownloadTask | null = null;
	let openSchemePromise : Promise<boolean> | null = null;

	const openSchema = (url : string) : Promise<boolean> => new Promise<boolean>((resolve, reject) => {
		try {
			utsOpenSchema(url)
			resolve(true)
		} catch (e) {
			reject(false)
		}
	})

	const __sfc__ = defineComponent({
		data() {
			return {
				// 从之前下载安装
				installForBeforeFilePath: '',

				// 安装
				installed: false,
				installing: false,

				// 下载
				downloadSuccess: false,
				downloading: false,

				downLoadPercent: 0,
				downloadedSize: 0,
				packageFileSize: 0,

				tempFilePath: '', // 要安装的本地包地址

				// 默认安装包信息
				title: '更新日志',
				contents: '',
				version: '',
				is_mandatory: false,
				url: "",
				platform: [] as string[],
				store_list: null as StoreListItem[] | null,

				// 可自定义属性
				subTitle: '发现新版本',
				downLoadBtnTextiOS: '立即跳转更新',
				downLoadBtnText: '立即下载更新',
				downLoadingText: '安装包下载中，请稍后'
			}
		},
		computed: {
			isiOS() : boolean {
				return this.platform.includes(platform_iOS);
			},
			isAndroid() : boolean {
				return this.platform.includes(platform_Android);
			},
			needNotificationProgress() : boolean {
				return this.isAndroid && !this.is_mandatory
			}
		},
		onUnload() {
			if (this.needNotificationProgress) {
				cancelNotificationProgress()
			}
		},
		onLoad(onLoadOptions: OnLoadOptions) {
			const local_storage_key: string | null = onLoadOptions['local_storage_key']
			if (local_storage_key == null) {
				console.error('local_storage_key为空，请检查后重试')
				this.closePopup()
				return;
			};

			const localPackageInfo = uni.getStorageSync(local_storage_key);
			if (localPackageInfo == null) {
				console.error('安装包信息为空，请检查后重试')
				this.closePopup()
				return;
			};

			this.show(JSON.parse<UniUpgradeCenterResult>(JSON.stringify(localPackageInfo)) as UniUpgradeCenterResult)
		},
		onBackPress(options : OnBackPressOptions) : boolean | null {
			if (this.is_mandatory) return true
			if (!this.needNotificationProgress) {
				if (downloadTask !== null) {
					downloadTask!.abort()
				}
			}
			return false
		},
		methods: {
			jumpToAppStore() {
				openSchema(this.url)
			},
			show(localPackageInfo : UniUpgradeCenterResult | null) {
				if (localPackageInfo === null) return;

				for (let key in localPackageInfo) {
					if (requiredKey.indexOf(key) != -1 && localPackageInfo[key] === null) {
						console.error(`参数 ${key} 必填，请检查后重试`)
						this.closePopup()
						return;
					}
				}

				this.title = localPackageInfo.title
				this.url = localPackageInfo.url
				this.contents = localPackageInfo.contents
				this.is_mandatory = localPackageInfo.is_mandatory
				this.platform = localPackageInfo.platform
				this.version = localPackageInfo.version
				this.store_list = localPackageInfo.store_list
			},
			askAbortDownload() {
				uni.showModal({
					title: '是否取消下载？',
					cancelText: '否',
					confirmText: '是',
					success: res => {
						if (res.confirm) {
							if (downloadTask !== null) downloadTask!.abort()
							this.closePopup()
						}
					}
				});
			},
			closeUpdate() {
				if (this.downloading && !this.needNotificationProgress) {
					this.askAbortDownload()
					return;
				}

				this.closePopup()
			},
			closePopup() {
				this.downloadSuccess = false
				this.downloading = false
				this.downLoadPercent = 0
				this.downloadedSize = 0
				this.packageFileSize = 0
				this.tempFilePath = ''

				this.installing = false
				this.installed = false

				uni.closeDialogPage({
					dialogPage: this.$page
				})
			},
			updateApp() {
				const checkStoreScheme = this.checkStoreScheme()
				if (checkStoreScheme !== null) {
					checkStoreScheme
						.then(_ => { })
						.catch(() => { this.downloadPackage() })
						.finally(() => {
							openSchemePromise = null
						})
				} else { this.downloadPackage() }
			},
			// 跳转应用商店
			checkStoreScheme() : Promise<boolean> | null {
				if (this.store_list !== null) {
					const storeList : StoreListItem[] = this.store_list!.filter((item : StoreListItem) : boolean => item.enable)
					if (storeList.length > 0) {
						if (openSchemePromise === null) {
							openSchemePromise = Promise.reject() as Promise<boolean>
						}
						storeList
							.sort((cur : StoreListItem, next : StoreListItem) : number => next.priority - cur.priority)
							.map((item : StoreListItem) : string => item.scheme)
							.reduce((promise : Promise<boolean>, cur : string) : Promise<boolean> => {
								openSchemePromise = promise.catch<boolean>(() : Promise<boolean> => openSchema(cur))
								return openSchemePromise!
							}, openSchemePromise!)
						return openSchemePromise!
					}
				}

				return null
			},
			downloadPackage() {
				//下载包
				downloadTask = uni.downloadFile({
					url: this.url,
					success: res => {
						if (res.statusCode == 200) {
							this.tempFilePath = res.tempFilePath
							this.downLoadComplete()
						}
					},
					fail: err => {
						console.log('downloadFile err: ', err);
					}
				});
				if (downloadTask !== null) {
					this.downloading = true;
					if (this.needNotificationProgress) {
						this.closePopup()
					}
					downloadTask!.onProgressUpdate(res => {
						this.downLoadPercent = parseFloat(res.progress.toFixed(0));
						this.downloadedSize = parseFloat((res.totalBytesWritten / Math.pow(1024, 2)).toFixed(2));
						this.packageFileSize = parseFloat((res.totalBytesExpectedToWrite / Math.pow(1024, 2)).toFixed(2));

						if (this.needNotificationProgress) {
							createNotificationProgress({
								title: "升级中心正在下载安装包……",
								content: `${this.downLoadPercent}%`,
								progress: this.downLoadPercent,
								onClick: () => {
									if (!this.downloadSuccess) {
										this.askAbortDownload()
									}
								}
							} as CreateNotificationProgressOptions)
						}
					});
				}
			},
			downLoadComplete() {
				this.downloadSuccess = true;
				this.downloading = false;

				this.downLoadPercent = 0
				this.downloadedSize = 0
				this.packageFileSize = 0

				downloadTask = null;

				if (this.needNotificationProgress) {
					finishNotificationProgress({
						title: "安装升级包",
						content: "下载完成",
						onClick() { }
					} as FinishNotificationProgressOptions)

					this.installPackage();
					return
				}

				// 强制更新，直接安装
				if (this.is_mandatory) {
					this.installPackage();
				}
			},
			installPackage() {
				this.installing = true;

				uni.installApk({
					filePath: this.tempFilePath,
					success: _ => {
						this.installing = false;
						this.installed = true;
					},
					fail: err => {
						console.error('installApk fail', err);
						// 安装失败需要重新下载安装包
						this.installing = false;
						this.installed = false;

						uni.showModal({
							title: '更新失败，请重新下载',
							content: `uni.installApk 错误码 ${err.errCode}`,
							showCancel: false
						});
					}
				});

				// 安装跳出覆盖安装，此处直接返回上一页
				if (!this.is_mandatory) {
					uni.navigateBack()
				}

			}
		}
	})

export default __sfc__
function GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_progress = resolveComponent("progress")

  return createElementVNode("view", utsMapOf({ class: "mask flex-center" }), [
    createElementVNode("view", utsMapOf({ class: "content" }), [
      createElementVNode("view", utsMapOf({ class: "content-top" }), [
        createElementVNode("text", utsMapOf({ class: "content-top-text" }), toDisplayString(_ctx.title), 1 /* TEXT */),
        createElementVNode("image", utsMapOf({
          class: "content-top-image",
          mode: "widthFix",
          src: "/uni_modules/uni-upgrade-center-app/static/app/bg_top.png"
        }))
      ]),
      createElementVNode("view", utsMapOf({ class: "content-space" })),
      createElementVNode("view", utsMapOf({ class: "content-body" }), [
        createElementVNode("view", utsMapOf({ class: "content-body-title" }), [
          createElementVNode("text", utsMapOf({ class: "text title" }), toDisplayString(_ctx.subTitle), 1 /* TEXT */),
          createElementVNode("text", utsMapOf({ class: "text version" }), "v" + toDisplayString(_ctx.version), 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "body" }), [
          createElementVNode("scroll-view", utsMapOf({
            class: "box-des-scroll",
            "scroll-y": "true"
          }), [
            createElementVNode("text", utsMapOf({ class: "text box-des" }), toDisplayString(_ctx.contents), 1 /* TEXT */)
          ])
        ]),
        createElementVNode("view", utsMapOf({ class: "footer flex-center" }), [
          isTrue(_ctx.isiOS)
            ? createElementVNode("button", utsMapOf({
                key: 0,
                class: "content-button",
                style: normalizeStyle(utsMapOf({"border":"none","color":"#fff"})),
                plain: "",
                onClick: _ctx.jumpToAppStore
              }), toDisplayString(_ctx.downLoadBtnTextiOS), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
            : createElementVNode(Fragment, utsMapOf({ key: 1 }), [
                isTrue(!_ctx.downloadSuccess)
                  ? createElementVNode(Fragment, utsMapOf({ key: 0 }), [
                      isTrue(_ctx.downloading)
                        ? createElementVNode("view", utsMapOf({
                            key: 0,
                            class: "progress-box flex-column"
                          }), [
                            createVNode(_component_progress, utsMapOf({
                              class: "progress",
                              percent: _ctx.downLoadPercent,
                              activeColor: "#3DA7FF",
                              "show-info": true,
                              "stroke-width": 10
                            }), null, 8 /* PROPS */, ["percent"]),
                            createElementVNode("view", utsMapOf({
                              style: normalizeStyle(utsMapOf({"width":"100%","display":"flex","justify-content":"space-around","flex-direction":"row"}))
                            }), [
                              createElementVNode("text", utsMapOf({
                                class: "text",
                                style: normalizeStyle(utsMapOf({"font-size":"14px"}))
                              }), toDisplayString(_ctx.downLoadingText), 5 /* TEXT, STYLE */),
                              createElementVNode("text", utsMapOf({
                                class: "text",
                                style: normalizeStyle(utsMapOf({"font-size":"14px"}))
                              }), "(" + toDisplayString(_ctx.downloadedSize) + "/" + toDisplayString(_ctx.packageFileSize) + "M)", 5 /* TEXT, STYLE */)
                            ], 4 /* STYLE */)
                          ])
                        : createElementVNode("button", utsMapOf({
                            key: 1,
                            class: "content-button",
                            onClick: _ctx.updateApp
                          }), toDisplayString(_ctx.downLoadBtnText), 9 /* TEXT, PROPS */, ["onClick"])
                    ], 64 /* STABLE_FRAGMENT */)
                  : isTrue(_ctx.downloadSuccess && !_ctx.installed)
                    ? createElementVNode("button", utsMapOf({
                        key: 1,
                        class: "content-button",
                        loading: _ctx.installing,
                        disabled: _ctx.installing,
                        onClick: _ctx.installPackage
                      }), toDisplayString(_ctx.installing ? '正在安装……' : '下载完成，立即安装'), 9 /* TEXT, PROPS */, ["loading", "disabled", "onClick"])
                    : isTrue(_ctx.installed)
                      ? createElementVNode("button", utsMapOf({
                          key: 2,
                          class: "content-button",
                          onClick: _ctx.installPackage
                        }), " 安装未完成，点击安装 ", 8 /* PROPS */, ["onClick"])
                      : createCommentVNode("v-if", true)
              ], 64 /* STABLE_FRAGMENT */)
        ])
      ]),
      createElementVNode("view", utsMapOf({ class: "content-bottom" }), [
        isTrue(!_ctx.is_mandatory)
          ? createElementVNode("image", utsMapOf({
              key: 0,
              class: "close-img",
              mode: "widthFix",
              src: "/uni_modules/uni-upgrade-center-app/static/app/app_update_close.png",
              onClick: _ctx.closeUpdate
            }), null, 8 /* PROPS */, ["onClick"])
          : createCommentVNode("v-if", true)
      ])
    ])
  ])
}
const GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupStyles = [utsMapOf([["flex-center", padStyleMapOf(utsMapOf([["justifyContent", "center"], ["alignItems", "center"]]))], ["mask", padStyleMapOf(utsMapOf([["position", "fixed"], ["left", 0], ["top", 0], ["right", 0], ["bottom", 0], ["backgroundColor", "rgba(0,0,0,0.65)"]]))], ["content", padStyleMapOf(utsMapOf([["position", "relative"], ["top", 0], ["width", "600rpx"], ["backgroundColor", "rgba(0,0,0,0)"]]))], ["text", padStyleMapOf(utsMapOf([["fontFamily", "Source Han Sans CN"]]))], ["content-top", padStyleMapOf(utsMapOf([["width", "100%"], ["borderBottomColor", "#ffffff"], ["borderBottomWidth", 15], ["borderBottomStyle", "solid"]]))], ["content-space", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 120], ["backgroundColor", "#ffffff"], ["position", "absolute"], ["top", "30%"], ["zIndex", -1]]))], ["content-top-image", padStyleMapOf(utsMapOf([["width", "100%"], ["position", "relative"], ["bottom", "-10%"]]))], ["content-top-text", padStyleMapOf(utsMapOf([["fontSize", 22], ["fontWeight", "bold"], ["color", "#F8F8FA"], ["position", "absolute"], ["width", "65%"], ["top", "50%"], ["left", 25], ["zIndex", 1]]))], ["content-body", padStyleMapOf(utsMapOf([["boxSizing", "border-box"], ["paddingTop", 0], ["paddingRight", 25], ["paddingBottom", 0], ["paddingLeft", 25], ["width", "100%"], ["backgroundColor", "#ffffff"], ["borderBottomLeftRadius", 15], ["borderBottomRightRadius", 15]]))], ["content-body-title", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["alignItems", "center"]]))], ["version", utsMapOf([[".content-body-title ", utsMapOf([["paddingLeft", 4], ["color", "#ffffff"], ["fontSize", 10], ["marginLeft", 5], ["paddingTop", 2], ["paddingRight", 4], ["paddingBottom", 2], ["borderRadius", 10], ["backgroundImage", "none"], ["backgroundColor", "#50aefd"]])]])], ["title", padStyleMapOf(utsMapOf([["fontSize", 16], ["fontWeight", "bold"], ["color", "#3DA7FF"], ["lineHeight", "38px"]]))], ["footer", padStyleMapOf(utsMapOf([["height", 75], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "space-around"]]))], ["box-des-scroll", padStyleMapOf(utsMapOf([["boxSizing", "border-box"], ["paddingTop", 0], ["paddingRight", 15], ["paddingBottom", 0], ["paddingLeft", 15], ["height", 100]]))], ["box-des", padStyleMapOf(utsMapOf([["fontSize", 13], ["color", "#000000"], ["lineHeight", "25px"]]))], ["progress-box", padStyleMapOf(utsMapOf([["width", "100%"]]))], ["progress", padStyleMapOf(utsMapOf([["width", "90%"], ["height", 20]]))], ["content-bottom", padStyleMapOf(utsMapOf([["height", 75]]))], ["close-img", padStyleMapOf(utsMapOf([["width", 35], ["height", 35], ["zIndex", 1000], ["position", "relative"], ["bottom", "-30%"], ["left", "50%"], ["marginLeft", -17]]))], ["content-button", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 40], ["lineHeight", "40px"], ["fontSize", 15], ["fontWeight", "400"], ["borderRadius", 20], ["borderWidth", "medium"], ["borderStyle", "none"], ["borderColor", "#000000"], ["color", "#ffffff"], ["textAlign", "center"], ["backgroundColor", "#1785ff"]]))], ["flex-column", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"]]))]])]
