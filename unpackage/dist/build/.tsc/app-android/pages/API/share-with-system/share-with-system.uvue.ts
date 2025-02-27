
	const __sfc__ = defineComponent({
		data() {
			return {
				summary: '欢迎使用hello uniapp-x'
			}
		},
		methods: {
			sharePrivateErrorAudios() {
				uni.hideToast()
				const path1 : string = "/static/test-audio/ForElise.mp3";
				const path2 : string = "/static/test-audio/ForElise.mp32";

				uni.shareWithSystem({
					audioPaths: [path1, path2],
					type:'audio',
					success() {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})

			},
			sharePrivateErrorFiles() {
				uni.hideToast()
				const path1 : string = "/static/filemanager1/to.zip";
				const path2 : string = "/static/filemanager/11.txt.br";

				uni.shareWithSystem({
					filePaths: [path1, path2],
					type:'file',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateFile() {
				uni.hideToast()
				const path1 : string = "/static/filemanager/to.zip";

				uni.shareWithSystem({
					filePaths: [path1],
					type:'file',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateFiles() {
				uni.hideToast()
				const path1 : string = "/static/filemanager/to.zip";
				const path2 : string = "/static/filemanager/1.txt.br";

				uni.shareWithSystem({
					filePaths: [path1, path2],
					type:'file',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateAudio() {
				uni.hideToast()
				const path1 : string = "/static/test-audio/ForElise.mp3";

				uni.shareWithSystem({
					audioPaths: [path1],
					type:'audio',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateAudios() {
				uni.hideToast()
				const path1 : string = "/static/test-audio/ForElise.mp3";
				const path2 : string = "/static/test-audio/ForElise.mp3";

				uni.shareWithSystem({
					audioPaths: [path1, path2],
					type:'audio',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateErrorVideos() {
				uni.hideToast()
				const path1 : string = "/static/test-video/10second-demo.mp4";
				const path2 : string = "/static/test-video/10second-demo1.mp4";

				uni.shareWithSystem({
					videoPaths: [path1, path2],
					type:'video',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})

			},
			sharePrivateVideo() {
				uni.hideToast()
				const path1 : string = "/static/test-video/10second-demo.mp4";
				uni.shareWithSystem({
					videoPaths: [path1],
					type:'video',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})

			},
			sharePrivateVideos() {
				uni.hideToast()
				const path1 : string = "/static/test-video/10second-demo.mp4";
				const path2 : string = "/static/test-video/10second-demo.mp4";

				uni.shareWithSystem({
					videoPaths: [path1, path2],
					type:'video',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})

			},
			sharePubMedias() {
				uni.hideToast()

				uni.chooseVideo({
					success(res) {
						uni.shareWithSystem({
							videoPaths: [res.tempFilePath],
							type:'video',
							success(_) {
								console.log('Shared----------------------------success')
							},
							fail(res) {
								console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
								uni.showToast({
									icon: "error",
									title: "errorCode=" + res.errCode
								})
							},
							complete(_) {

							}
						})
					}

				})
			},
			shareText() {
				uni.hideToast()
				uni.shareWithSystem({
					summary: this.summary,
					type:'text',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			shareLink() {
				uni.hideToast()
				uni.shareWithSystem({
					type:'text',
					href: 'https://uniapp.dcloud.io',
					success(_) {
						console.log('Shared----------------------------success')
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateImg() {
				uni.hideToast()
				const imageSrc : string = "/static/test-image/logo.gif";
				uni.shareWithSystem({
					type:'image',
					imageUrl: imageSrc,
					success(_) {
						console.log('Shared----------------------------success')
						// 分享完成，请注意此时不一定是成功分享
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
						// 分享失败
					},
					complete(_) {

					}
				})
			},
			sharePrivateErrorImg() {
				uni.hideToast()
				const imageSrc : string = "/static/test-image/logo.jpg11";
				uni.shareWithSystem({
					imageUrl: imageSrc,
					type:'image',
					success(_) {
						console.log('Shared----------------------------success')
						// 分享完成，请注意此时不一定是成功分享
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
						// 分享失败
					},
					complete(_) {

					}
				})
			},
			sharePrivateImgs() {
				uni.hideToast()
				const errorImageSrc1 : string = "/static/test-image/logo.gif";
				const errorImageSrc2 : string = "/static/test-image/logo.png";
				const imageSrc : string = "/static/test-image/logo.jpg";
				let imageUrlList : string[] = new Array()
				imageUrlList.push(errorImageSrc2)
				imageUrlList.push(imageSrc)
				// imageUrlList.push(errorImageSrc1)

				uni.shareWithSystem({
					imagePaths: imageUrlList,
					type:'image',
					success(_) {
						console.log('Shared----------------------------success')
						// 分享完成，请注意此时不一定是成功分享
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePrivateErrorImgs() {
				uni.hideToast()
				const errorImageSrc1 : string = "/static/test-image/logo.jpg1";
				const errorImageSrc2 : string = "/static/test-image/logo.jpg3";
				const imageSrc : string = "/static/test-image/logo.jpg";
				let imageUrlList : string[] =new Array()
				imageUrlList.push(imageSrc)
				imageUrlList.push(errorImageSrc1)
				imageUrlList.push(errorImageSrc2)
				uni.shareWithSystem({
					imagePaths: imageUrlList,
					type:'image',
					success(_) {
						console.log('Shared----------------------------success')
						// 分享完成，请注意此时不一定是成功分享
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			shareAll() {
				uni.hideToast()
				const imageSrc : string = "/static/test-video/fast-forward.png";
				let imageUrlList : string[] = new Array()
				imageUrlList.push(imageSrc)
				uni.shareWithSystem({
					summary: this.summary,
					href: 'https://uniapp.dcloud.io',
					imagePaths: imageUrlList,
					type:'image',
					success(_) {
						console.log('Shared----------------------------success')
						// 分享完成，请注意此时不一定是成功分享
					},
					fail(res) {
						console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)
						uni.showToast({
							icon: "error",
							title: "errorCode=" + res.errCode
						})
					},
					complete(_) {

					}
				})
			},
			sharePubImg() {
				uni.hideToast()
				uni.chooseImage({
					count: 3,
					sourceType: ['camera', 'album'],
					success(e) {
						console.log(e)
						console.log(JSON.stringify(e))
						uni.shareWithSystem({
							// summary: "aa",
							// href: 'https://uniapp.dcloud.io',
							imagePaths: e.tempFilePaths,
							type:'image',
							success(_) {
								console.log('Shared----------------------------success')
								// 分享完成，请注意此时不一定是成功分享
							},
							fail(res) {
								console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)

								uni.showToast({
									icon: "error",
									title: "errorCode=" + res.errCode
								})
							},
							complete(_) {

							}
						})
					}
				})
			},
			shareSnapShot() {
				uni.hideToast()
				uni.getElementById("viewshot")?.takeSnapshot(
					{
						success: function (res) {
							uni.shareWithSystem({
								imageUrl: res.tempFilePath,
								type:'image',
								success(_) {
									console.log('Shared----------------------------success')
									// 分享完成，请注意此时不一定是成功分享
								},
								fail(res) {
									console.log('Share failed, ' + "res.errCode =" + res.errCode + '---res.errMsg= ' + res.errMsg)

									uni.showToast({
										icon: "error",
										title: "errorCode=" + res.errCode
									})
								},
								complete(_) {

								}
							})

						},
						fail: function (res) {
							console.log(res)
							uni.showToast({
								icon: 'error',
								title: '截图失败'
							})
						}
					}
				)
			},

		}
	})

export default __sfc__
function GenPagesAPIShareWithSystemShareWithSystemRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    direction: "vertical",
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ id: "viewshot" }), [
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.shareText()}
      }), "分享文本", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.shareLink()}
      }), "分享链接", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateImg()}
      }), "分享单个本地图片", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateImgs()}
      }), "分享多个本地图片", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.shareAll()}
      }), "分享链接、文本、一张图片", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateVideo()}
      }), "分享video文件(单个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateVideos()}
      }), "分享video文件(多个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateAudio()}
      }), "分享Audio文件(单个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateAudios()}
      }), "分享Audio文件(多个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateFile()}
      }), "分享文件(单个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePrivateFiles()}
      }), "分享文件(多个)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePubImg()}
      }), "选择图片并分享", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.sharePubMedias()}
      }), "选择video并分享", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: () => {_ctx.shareSnapShot()}
      }), "指定view截图并分享", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        type: "warn",
        onClick: () => {_ctx.sharePrivateErrorImg()}
      }), "分享单个本地图片(错误路径)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        type: "warn",
        onClick: () => {_ctx.sharePrivateErrorImgs()}
      }), "分享多个本地图片(含有错误路径)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        type: "warn",
        onClick: () => {_ctx.sharePrivateErrorVideos()}
      }), "分享Video文件(错误路径)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        type: "warn",
        onClick: () => {_ctx.sharePrivateErrorAudios()}
      }), "分享Audio文件(错误路径)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        type: "warn",
        onClick: () => {_ctx.sharePrivateErrorFiles()}
      }), "分享文件(错误路径)", 8 /* PROPS */, ["onClick"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIShareWithSystemShareWithSystemStyles = [utsMapOf([["button", padStyleMapOf(utsMapOf([["marginLeft", 30], ["marginRight", 30], ["marginBottom", 15]]))]])]
