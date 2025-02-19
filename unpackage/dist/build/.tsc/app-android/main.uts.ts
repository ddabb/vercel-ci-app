// 仅测试 console.log 时机问题
import './test-main-console.uts'

import { uniStat } from '@/uni_modules/uni-stat/plugin.uts'

import App from './App.uvue'

import { createSSRApp } from 'vue'

// 统计配置
const uniStatcollectItems = {
	uniStatPageLog: true
}

const uniStatOptions = {
	debug: false,
	collectItems: uniStatcollectItems,
}

export function createApp() {
  const app = createSSRApp(App)

  app.use(uniStat, uniStatOptions)

  // app.mixin({
  //   onReady() {
  //     setTimeout(() => {
  //       console.log((this as BasePage).$nativePage!.getDomJson())
  //     }, 100)
  //   }
  // })
  return {
    app
  }
}

export function main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    
    (createApp()['app'] as VueApp).mount(app, GenUniApp());
}

export class UniAppConfig extends io.dcloud.uniapp.appframe.AppConfig {
    override name: string = "vercel-ci-app"
    override appid: string = "__UNI__FB90797"
    override versionName: string = "1.7.2"
    override versionCode: string = "10702"
    override uniCompilerVersion: string = "4.45"
    
    constructor() { super() }
}

import GenPagesTabBarComponentClass from './pages/tabBar/component.uvue?type=page'
import GenPagesComponentViewViewClass from './pages/component/view/view.uvue?type=page'
import GenPagesComponentScrollViewScrollViewClass from './pages/component/scroll-view/scroll-view.uvue?type=page'
import GenPagesComponentScrollViewScrollViewRefresherClass from './pages/component/scroll-view/scroll-view-refresher.uvue?type=page'
import GenPagesComponentScrollViewScrollViewPropsClass from './pages/component/scroll-view/scroll-view-props.uvue?type=page'
import GenPagesComponentScrollViewScrollViewRefresherPropsClass from './pages/component/scroll-view/scroll-view-refresher-props.uvue?type=page'
import GenPagesComponentScrollViewScrollViewCustomRefresherPropsClass from './pages/component/scroll-view/scroll-view-custom-refresher-props.uvue?type=page'
import GenPagesComponentSwiperSwiperClass from './pages/component/swiper/swiper.uvue?type=page'
import GenPagesComponentListViewListViewClass from './pages/component/list-view/list-view.uvue?type=page'
import GenPagesComponentListViewListViewRefreshClass from './pages/component/list-view/list-view-refresh.uvue?type=page'
import GenPagesComponentListViewListViewMultiplexClass from './pages/component/list-view/list-view-multiplex.uvue?type=page'
import GenPagesComponentListViewListViewMultiplexInputClass from './pages/component/list-view/list-view-multiplex-input.uvue?type=page'
import GenPagesComponentListViewListViewMultiplexVideoClass from './pages/component/list-view/list-view-multiplex-video.uvue?type=page'
import GenPagesComponentListViewListViewChildrenInSlotClass from './pages/component/list-view/list-view-children-in-slot.uvue?type=page'
import GenPagesComponentStickySectionStickySectionClass from './pages/component/sticky-section/sticky-section.uvue?type=page'
import GenPagesComponentStickyHeaderStickyHeaderClass from './pages/component/sticky-header/sticky-header.uvue?type=page'
import GenPagesComponentTextTextClass from './pages/component/text/text.uvue?type=page'
import GenPagesComponentTextTextPropsClass from './pages/component/text/text-props.uvue?type=page'
import GenPagesComponentRichTextRichTextClass from './pages/component/rich-text/rich-text.uvue?type=page'
import GenPagesComponentRichTextRichTextTagsClass from './pages/component/rich-text/rich-text-tags.uvue?type=page'
import GenPagesComponentRichTextRichTextComplexClass from './pages/component/rich-text/rich-text-complex.uvue?type=page'
import GenPagesComponentProgressProgressClass from './pages/component/progress/progress.uvue?type=page'
import GenPagesComponentFormFormClass from './pages/component/form/form.uvue?type=page'
import GenPagesComponentButtonButtonClass from './pages/component/button/button.uvue?type=page'
import GenPagesComponentButtonButtonstatusClass from './pages/component/button/buttonstatus.uvue?type=page'
import GenPagesComponentRadioRadioClass from './pages/component/radio/radio.uvue?type=page'
import GenPagesComponentCheckboxCheckboxClass from './pages/component/checkbox/checkbox.uvue?type=page'
import GenPagesComponentInputInputClass from './pages/component/input/input.uvue?type=page'
import GenPagesComponentTextareaTextareaClass from './pages/component/textarea/textarea.uvue?type=page'
import GenPagesComponentSliderSliderClass from './pages/component/slider/slider.uvue?type=page'
import GenPagesComponentSliderSliderInSwiperClass from './pages/component/slider/slider-in-swiper.uvue?type=page'
import GenPagesComponentSliderSliderMaxValueClass from './pages/component/slider/slider-maxValue.uvue?type=page'
import GenPagesComponentPickerViewPickerViewClass from './pages/component/picker-view/picker-view.uvue?type=page'
import GenPagesComponentSwitchSwitchClass from './pages/component/switch/switch.uvue?type=page'
import GenPagesComponentImageImageClass from './pages/component/image/image.uvue?type=page'
import GenPagesComponentImageImageFormatClass from './pages/component/image/image-format.uvue?type=page'
import GenPagesComponentImageImageModeClass from './pages/component/image/image-mode.uvue?type=page'
import GenPagesComponentImageImagePathClass from './pages/component/image/image-path.uvue?type=page'
import GenPagesComponentImageImageLargeClass from './pages/component/image/image-large.uvue?type=page'
import GenPagesComponentVideoVideoClass from './pages/component/video/video.uvue?type=page'
import GenPagesComponentVideoVideoFormatClass from './pages/component/video/video-format.uvue?type=page'
import GenPagesComponentNavigatorNavigatorClass from './pages/component/navigator/navigator.uvue?type=page'
import GenPagesComponentNavigatorNavigateClass from './pages/component/navigator/navigate.uvue?type=page'
import GenPagesComponentNavigatorRedirectClass from './pages/component/navigator/redirect.uvue?type=page'
import GenPagesComponentWebViewWebViewClass from './pages/component/web-view/web-view.uvue?type=page'
import GenPagesComponentWebViewWebViewWebViewLocalClass from './pages/component/web-view/web-view/web-view-local.uvue?type=page'
import GenPagesComponentUnicloudDbUnicloudDbContactsListClass from './pages/component/unicloud-db/unicloud-db/contacts/list.uvue?type=page'
import GenPagesComponentUnicloudDbUnicloudDbContactsAddClass from './pages/component/unicloud-db/unicloud-db/contacts/add.uvue?type=page'
import GenPagesComponentUnicloudDbUnicloudDbContactsEditClass from './pages/component/unicloud-db/unicloud-db/contacts/edit.uvue?type=page'
import GenPagesComponentUnicloudDbUnicloudDbContactsDetailClass from './pages/component/unicloud-db/unicloud-db/contacts/detail.uvue?type=page'
import GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacomClass from './pages/component/unicloud-db/unicloud-db/mixin-datacom/mixin-datacom.uvue?type=page'
import GenPagesComponentGlobalPropertiesGlobalPropertiesClass from './pages/component/global-properties/global-properties.uvue?type=page'
import GenPagesComponentGlobalEventsGlobalEventsClass from './pages/component/global-events/global-events.uvue?type=page'
import GenPagesComponentGlobalEventsTransitionEventsClass from './pages/component/global-events/transition-events.uvue?type=page'
import GenPagesComponentGlobalEventsTouchEventsClass from './pages/component/global-events/touch-events.uvue?type=page'
import GenPagesComponentGlobalEventsTouchEventsBubblesClass from './pages/component/global-events/touch-events-bubbles.uvue?type=page'
import GenPagesComponentNestedScrollHeaderNestedScrollHeaderClass from './pages/component/nested-scroll-header/nested-scroll-header.uvue?type=page'
import GenPagesComponentNestedScrollBodyNestedScrollBodyClass from './pages/component/nested-scroll-body/nested-scroll-body.uvue?type=page'
import GenPagesComponentSwiperSwiperListViewClass from './pages/component/swiper/swiper-list-view.uvue?type=page'
import GenPagesComponentMapMapClass from './pages/component/map/map.uvue?type=page'
import GenPagesComponentListViewIssue2199Class from './pages/component/list-view/issue-2199.uvue?type=page'
import GenPagesComponentCanvasCanvasClass from './pages/component/canvas/canvas.uvue?type=page'
import GenPagesComponentCanvasCanvasContextClass from './pages/component/canvas/canvas-context.uvue?type=page'
import GenPagesComponentCanvasCanvasBallClass from './pages/component/canvas/canvas/ball.uvue?type=page'
import GenPagesComponentCanvasCanvasDoodleClass from './pages/component/canvas/canvas/doodle.uvue?type=page'
import GenPagesComponentNativeViewNativeViewClass from './pages/component/native-view/native-view.uvue?type=page'
import GenPagesComponentAdAdClass from './pages/component/ad/ad.uvue?type=page'
import GenPagesComponentWaterflowWaterflowClass from './pages/component/waterflow/waterflow.uvue?type=page'
import GenPagesComponentAdListViewAdClass from './pages/component/ad/list-view-ad.uvue?type=page'
import GenPagesTabBarAPIClass from './pages/tabBar/API.uvue?type=page'
import GenPagesAPIGetAppGetAppClass from './pages/API/get-app/get-app.uvue?type=page'
import GenPagesAPIExitExitClass from './pages/API/exit/exit.uvue?type=page'
import GenPagesAPIInstallApkInstallApkClass from './pages/API/install-apk/install-apk.uvue?type=page'
import GenPagesAPIGetCurrentPagesGetCurrentPagesClass from './pages/API/get-current-pages/get-current-pages.uvue?type=page'
import GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshClass from './pages/API/get-current-pages/set-page-style-disable-pull-down-refresh.uvue?type=page'
import GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncClass from './pages/API/get-launch-options-sync/get-launch-options-sync.uvue?type=page'
import GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSyncClass from './pages/API/get-enter-options-sync/get-enter-options-sync.uvue?type=page'
import GenPagesAPIAnimationFrameAnimationFrameClass from './pages/API/animation-frame/animation-frame.uvue?type=page'
import GenPagesAPINavigatorNavigatorClass from './pages/API/navigator/navigator.uvue?type=page'
import GenPagesAPISetNavigationBarColorSetNavigationBarColorClass from './pages/API/set-navigation-bar-color/set-navigation-bar-color.uvue?type=page'
import GenPagesAPISetNavigationBarTitleSetNavigationBarTitleClass from './pages/API/set-navigation-bar-title/set-navigation-bar-title.uvue?type=page'
import GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContentClass from './pages/API/set-page-backgroundColorContent/set-page-backgroundColorContent.uvue?type=page'
import GenPagesAPINavigatorNewPageNewPage1Class from './pages/API/navigator/new-page/new-page-1.uvue?type=page'
import GenPagesAPINavigatorNewPageNewPage3Class from './pages/API/navigator/new-page/new-page-3.uvue?type=page'
import GenPagesAPINavigatorNewPageOnLoadClass from './pages/API/navigator/new-page/onLoad.uvue?type=page'
import GenPagesAPIPullDownRefreshPullDownRefreshClass from './pages/API/pull-down-refresh/pull-down-refresh.uvue?type=page'
import GenPagesAPIStorageStorageClass from './pages/API/storage/storage.uvue?type=page'
import GenPagesAPIGetFileSystemManagerGetFileSystemManagerClass from './pages/API/get-file-system-manager/get-file-system-manager.uvue?type=page'
import GenPagesAPIEnvEnvClass from './pages/API/env/env.uvue?type=page'
import GenPagesAPIShowActionSheetShowActionSheetClass from './pages/API/show-action-sheet/show-action-sheet.uvue?type=page'
import GenPagesAPIShowModalShowModalClass from './pages/API/show-modal/show-modal.uvue?type=page'
import GenPagesAPIShowLoadingShowLoadingClass from './pages/API/show-loading/show-loading.uvue?type=page'
import GenPagesAPIShowToastShowToastClass from './pages/API/show-toast/show-toast.uvue?type=page'
import GenPagesAPILoadFontFaceLoadFontFaceClass from './pages/API/load-font-face/load-font-face.uvue?type=page'
import GenPagesAPILoadFontFaceLoadFontFaceChildClass from './pages/API/load-font-face/load-font-face-child.uvue?type=page'
import GenPagesAPIGetLocationGetLocationClass from './pages/API/get-location/get-location.uvue?type=page'
import GenPagesAPIOpenLocationOpenLocationClass from './pages/API/open-location/open-location.uvue?type=page'
import GenPagesAPIChooseLocationChooseLocationClass from './pages/API/choose-location/choose-location.uvue?type=page'
import GenPagesAPIInterceptorInterceptorClass from './pages/API/interceptor/interceptor.uvue?type=page'
import GenPagesAPIInterceptorPage1Class from './pages/API/interceptor/page1.uvue?type=page'
import GenPagesAPIInterceptorPage2Class from './pages/API/interceptor/page2.uvue?type=page'
import GenPagesAPIRequestRequestClass from './pages/API/request/request.uvue?type=page'
import GenPagesAPIUploadFileUploadFileClass from './pages/API/upload-file/upload-file.uvue?type=page'
import GenPagesAPIDownloadFileDownloadFileClass from './pages/API/download-file/download-file.uvue?type=page'
import GenPagesAPIWebsocketSocketTaskClass from './pages/API/websocket/socketTask.uvue?type=page'
import GenPagesAPIWebsocketWebsocketClass from './pages/API/websocket/websocket.uvue?type=page'
import GenPagesAPIUnicloudUnicloudCloudFunctionClass from './pages/API/unicloud/unicloud/cloud-function.uvue?type=page'
import GenPagesAPIUnicloudUnicloudCloudObjectClass from './pages/API/unicloud/unicloud/cloud-object.uvue?type=page'
import GenPagesAPIGetSystemInfoGetSystemInfoClass from './pages/API/get-system-info/get-system-info.uvue?type=page'
import GenPagesAPIGetDeviceInfoGetDeviceInfoClass from './pages/API/get-device-info/get-device-info.uvue?type=page'
import GenPagesAPIGetAppBaseInfoGetAppBaseInfoClass from './pages/API/get-app-base-info/get-app-base-info.uvue?type=page'
import GenPagesAPIGetSystemSettingGetSystemSettingClass from './pages/API/get-system-setting/get-system-setting.uvue?type=page'
import GenPagesAPIElementTakesnapshotElementTakesnapshotClass from './pages/API/element-takesnapshot/element-takesnapshot.uvue?type=page'
import GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncClass from './pages/API/element-get-bounding-client-rect-async/element-get-bounding-client-rect-async.uvue?type=page'
import GenPagesAPIElementGetAttributeElementGetAttributeClass from './pages/API/element-get-attribute/element-get-attribute.uvue?type=page'
import GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSettingClass from './pages/API/get-app-authorize-setting/get-app-authorize-setting.uvue?type=page'
import GenPagesAPIPreviewImagePreviewImageClass from './pages/API/preview-image/preview-image.uvue?type=page'
import GenPagesAPIChooseImageChooseImageClass from './pages/API/choose-image/choose-image.uvue?type=page'
import GenPagesAPIGetImageInfoGetImageInfoClass from './pages/API/get-image-info/get-image-info.uvue?type=page'
import GenPagesAPICompressImageCompressImageClass from './pages/API/compress-image/compress-image.uvue?type=page'
import GenPagesAPIChooseVideoChooseVideoClass from './pages/API/choose-video/choose-video.uvue?type=page'
import GenPagesAPICompressVideoCompressVideoClass from './pages/API/compress-video/compress-video.uvue?type=page'
import GenPagesAPIGetNetworkTypeGetNetworkTypeClass from './pages/API/get-network-type/get-network-type.uvue?type=page'
import GenPagesAPIPageScrollToPageScrollToClass from './pages/API/page-scroll-to/page-scroll-to.uvue?type=page'
import GenPagesAPIEventBusEventBusClass from './pages/API/event-bus/event-bus.uvue?type=page'
import GenPagesAPIUnicloudUnicloudCloudStorageClass from './pages/API/unicloud/unicloud/cloud-storage.uvue?type=page'
import GenPagesAPIUnicloudUnicloudDatabaseClass from './pages/API/unicloud/unicloud/database.uvue?type=page'
import GenPagesAPIGetBatteryInfoGetBatteryInfoClass from './pages/API/get-battery-info/get-battery-info.uvue?type=page'
import GenPagesAPIGetWindowInfoGetWindowInfoClass from './pages/API/get-window-info/get-window-info.uvue?type=page'
import GenPagesAPIGetWindowInfoWindowAreaClass from './pages/API/get-window-info/window-area.uvue?type=page'
import GenPagesAPIElementDrawElementDrawClass from './pages/API/element-draw/element-draw.uvue?type=page'
import GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoClass from './pages/API/facial-recognition-meta-info/facial-recognition-meta-info.uvue?type=page'
import GenPagesAPIGetUniverifyManagerGetUniverifyManagerClass from './pages/API/get-univerify-manager/get-univerify-manager.uvue?type=page'
import GenPagesAPIGetUniverifyManagerUniverifyCustomPageClass from './pages/API/get-univerify-manager/univerify-custom-page.uvue?type=page'
import GenPagesAPIGetUniverifyManagerFullWebviewPageClass from './pages/API/get-univerify-manager/full-webview-page.uvue?type=page'
import GenPagesAPIRpx2pxRpx2pxClass from './pages/API/rpx2px/rpx2px.uvue?type=page'
import GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListenerClass from './pages/API/create-request-permission-listener/create-request-permission-listener.uvue?type=page'
import GenPagesAPIRequestPaymentRequestPaymentClass from './pages/API/request-payment/request-payment.uvue?type=page'
import GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdClass from './pages/API/create-rewarded-video-ad/create-rewarded-video-ad.uvue?type=page'
import GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayClass from './pages/API/request-payment/request-payment/request-payment-uni-pay.uvue?type=page'
import GenPagesAPIRequestPaymentRequestPaymentOrderDetailClass from './pages/API/request-payment/request-payment/order-detail.uvue?type=page'
import GenPagesAPICreateInnerAudioContextCreateInnerAudioContextClass from './pages/API/create-inner-audio-context/create-inner-audio-context.uvue?type=page'
import GenPagesAPICreateInnerAudioContextInnerAudioFormatClass from './pages/API/create-inner-audio-context/inner-audio-format.uvue?type=page'
import GenPagesAPICreateInnerAudioContextInnerAudioPathClass from './pages/API/create-inner-audio-context/inner-audio-path.uvue?type=page'
import GenPagesAPICreateInnerAudioContextInnerAudioMultClass from './pages/API/create-inner-audio-context/inner-audio-mult.uvue?type=page'
import GenPagesAPIThemeChangeThemeChangeClass from './pages/API/theme-change/theme-change.uvue?type=page'
import GenPagesAPIGetElementByIdGetElementByIdClass from './pages/API/get-element-by-id/get-element-by-id.uvue?type=page'
import GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeClass from './pages/API/get-element-by-id/get-element-by-id-multiple-root-node.uvue?type=page'
import GenPagesAPICreateSelectorQueryCreateSelectorQueryClass from './pages/API/create-selector-query/create-selector-query.uvue?type=page'
import GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollClass from './pages/API/create-selector-query/create-selector-query-onScroll.uvue?type=page'
import GenPagesAPIGetNativeViewElementGetnativeviewClass from './pages/API/get-native-view/element-getnativeview.uvue?type=page'
import GenPagesAPIResizeObserverResizeObserverClass from './pages/API/resize-observer/resize-observer.uvue?type=page'
import GenPagesAPIProviderProviderClass from './pages/API/provider/provider.uvue?type=page'
import GenPagesAPIPrivacyPrivacyClass from './pages/API/privacy/privacy.uvue?type=page'
import GenPagesAPIUniPushUniPushClass from './pages/API/uni-push/uni-push.uvue?type=page'
import GenPagesAPIReportReportClass from './pages/API/report/report.uvue?type=page'
import GenPagesAPIDialogPageDialogPageClass from './pages/API/dialog-page/dialog-page.uvue?type=page'
import GenPagesAPIDialogPageNextPageClass from './pages/API/dialog-page/next-page.uvue?type=page'
import GenPagesAPIDialogPageDialog1Class from './pages/API/dialog-page/dialog-1.uvue?type=page'
import GenPagesAPIDialogPageDialog2Class from './pages/API/dialog-page/dialog-2.uvue?type=page'
import GenPagesAPIDialogPageDialog3Class from './pages/API/dialog-page/dialog-3.uvue?type=page'
import GenPagesAPIDialogPageDialog4Class from './pages/API/dialog-page/dialog-4.uvue?type=page'
import GenPagesAPICreateInterstitialAdCreateInterstitialAdClass from './pages/API/create-interstitial-ad/create-interstitial-ad.uvue?type=page'
import GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerClass from './pages/API/get-background-audio-manager/get-background-audio-manager.uvue?type=page'
import GenPagesAPIShareWithSystemShareWithSystemClass from './pages/API/share-with-system/share-with-system.uvue?type=page'
import GenPagesTabBarCSSClass from './pages/tabBar/CSS.uvue?type=page'
import GenPagesTabBarTemplateClass from './pages/tabBar/template.uvue?type=page'
import GenPagesTemplateListNewsListNewsClass from './pages/template/list-news/list-news.uvue?type=page'
import GenPagesTemplateListNewsDetailDetailClass from './pages/template/list-news/detail/detail.uvue?type=page'
import GenPagesTemplateDropCardDropCardClass from './pages/template/drop-card/drop-card.uvue?type=page'
import GenPagesTemplateSwiperListSwiperListClass from './pages/template/swiper-list/swiper-list.uvue?type=page'
import GenPagesTemplateSwiperList2SwiperList2Class from './pages/template/swiper-list2/swiper-list2.uvue?type=page'
import GenPagesTemplateSlider100Slider100Class from './pages/template/slider-100/slider-100.uvue?type=page'
import GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoClass from './pages/template/swiper-vertical-video/swiper-vertical-video.uvue?type=page'
import GenPagesTemplateScrollStickyScrollStickyClass from './pages/template/scroll-sticky/scroll-sticky.uvue?type=page'
import GenPagesTemplateScrollFoldNavScrollFoldNavClass from './pages/template/scroll-fold-nav/scroll-fold-nav.uvue?type=page'
import GenPagesTemplateCustomRefresherCustomRefresherClass from './pages/template/custom-refresher/custom-refresher.uvue?type=page'
import GenPagesTemplateHalfScreenHalfScreenClass from './pages/template/half-screen/half-screen.uvue?type=page'
import GenPagesTemplateLongListLongListClass from './pages/template/long-list/long-list.uvue?type=page'
import GenPagesTemplateLongList2LongList2Class from './pages/template/long-list2/long-list2.uvue?type=page'
import GenPagesTemplateLongListNestedLongListNestedClass from './pages/template/long-list-nested/long-list-nested.uvue?type=page'
import GenPagesTemplateLongWaterflowNestedLongWaterflowNestedClass from './pages/template/long-waterflow-nested/long-waterflow-nested.uvue?type=page'
import GenPagesTemplatePullZoomImagePullZoomImageClass from './pages/template/pull-zoom-image/pull-zoom-image.uvue?type=page'
import GenPagesTemplateNavbarLiteNavbarLiteClass from './pages/template/navbar-lite/navbar-lite.uvue?type=page'
import GenPagesTemplateCustomTabBarCustomTabBarClass from './pages/template/custom-tab-bar/custom-tab-bar.uvue?type=page'
import GenPagesTemplateCalendarCalendarClass from './pages/template/calendar/calendar.uvue?type=page'
import GenPagesTemplateSchemaSchemaClass from './pages/template/schema/schema.uvue?type=page'
import GenUniModulesUniPayXPagesSuccessSuccessClass from './uni_modules/uni-pay-x/pages/success/success.uvue?type=page'
import GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebviewClass from './uni_modules/uni-pay-x/pages/ad-interactive-webview/ad-interactive-webview.uvue?type=page'
import GenUniModulesUniPayXPagesPayDeskPayDeskClass from './uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue?type=page'
import GenPagesTemplateCustomLongListCustomLongListClass from './pages/template/custom-long-list/custom-long-list.uvue?type=page'
import GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContentClass from './pages/template/test-background-color-content/test-background-color-content.uvue?type=page'
import GenUniModulesUniOpenLocationPagesOpenLocationOpenLocationClass from './uni_modules/uni-openLocation/pages/openLocation/openLocation.uvue?type=page'
import GenPagesComponentButtonPrivacyClass from './pages/component/button/privacy.uvue?type=page'
import GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupClass from './uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup.uvue?type=page'
import GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumClass from './pages/API/save-image-to-photos-album/save-image-to-photos-album.uvue?type=page'
import GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumClass from './pages/API/save-video-to-photos-album/save-video-to-photos-album.uvue?type=page'
import GenPagesAPIGetVideoInfoGetVideoInfoClass from './pages/API/get-video-info/get-video-info.uvue?type=page'
import GenPagesCSSBackgroundBackgroundColorClass from './pages/CSS/background/background-color.uvue?type=page'
import GenPagesCSSBackgroundBackgroundImageClass from './pages/CSS/background/background-image.uvue?type=page'
import GenPagesCSSBorderBorderBottomClass from './pages/CSS/border/border-bottom.uvue?type=page'
import GenPagesCSSBorderBorderColorClass from './pages/CSS/border/border-color.uvue?type=page'
import GenPagesCSSBorderBorderLeftClass from './pages/CSS/border/border-left.uvue?type=page'
import GenPagesCSSBorderBorderRadiusClass from './pages/CSS/border/border-radius.uvue?type=page'
import GenPagesCSSBorderBorderRightClass from './pages/CSS/border/border-right.uvue?type=page'
import GenPagesCSSBorderBorderStyleClass from './pages/CSS/border/border-style.uvue?type=page'
import GenPagesCSSBorderBorderTopClass from './pages/CSS/border/border-top.uvue?type=page'
import GenPagesCSSBorderBorderWidthClass from './pages/CSS/border/border-width.uvue?type=page'
import GenPagesCSSBorderBorderClass from './pages/CSS/border/border.uvue?type=page'
import GenPagesCSSBorderComplexBorderComplexBorderClass from './pages/CSS/border/complex-border/complex-border.uvue?type=page'
import GenPagesCSSBorderDynamicBorderClass from './pages/CSS/border/dynamic-border.uvue?type=page'
import GenPagesCSSBorderBorderUpdateClass from './pages/CSS/border/border-update.uvue?type=page'
import GenPagesCSSBoxShadowBoxShadowClass from './pages/CSS/box-shadow/box-shadow.uvue?type=page'
import GenPagesCSSDisplayFlexClass from './pages/CSS/display/flex.uvue?type=page'
import GenPagesCSSDisplayNoneClass from './pages/CSS/display/none.uvue?type=page'
import GenPagesCSSFlexAlignContentClass from './pages/CSS/flex/align-content.uvue?type=page'
import GenPagesCSSFlexAlignItemsClass from './pages/CSS/flex/align-items.uvue?type=page'
import GenPagesCSSFlexFlexBasisClass from './pages/CSS/flex/flex-basis.uvue?type=page'
import GenPagesCSSFlexFlexDirectionClass from './pages/CSS/flex/flex-direction.uvue?type=page'
import GenPagesCSSFlexFlexFlowClass from './pages/CSS/flex/flex-flow.uvue?type=page'
import GenPagesCSSFlexFlexGrowClass from './pages/CSS/flex/flex-grow.uvue?type=page'
import GenPagesCSSFlexFlexShrinkClass from './pages/CSS/flex/flex-shrink.uvue?type=page'
import GenPagesCSSFlexFlexClass from './pages/CSS/flex/flex.uvue?type=page'
import GenPagesCSSFlexJustifyContentClass from './pages/CSS/flex/justify-content.uvue?type=page'
import GenPagesCSSLayoutHeightClass from './pages/CSS/layout/height.uvue?type=page'
import GenPagesCSSLayoutMaxHeightClass from './pages/CSS/layout/max-height.uvue?type=page'
import GenPagesCSSLayoutMaxWidthClass from './pages/CSS/layout/max-width.uvue?type=page'
import GenPagesCSSLayoutMinHeightClass from './pages/CSS/layout/min-height.uvue?type=page'
import GenPagesCSSLayoutMinWidthClass from './pages/CSS/layout/min-width.uvue?type=page'
import GenPagesCSSLayoutPositionClass from './pages/CSS/layout/position.uvue?type=page'
import GenPagesCSSLayoutWidthClass from './pages/CSS/layout/width.uvue?type=page'
import GenPagesCSSLayoutZIndexClass from './pages/CSS/layout/z-index.uvue?type=page'
import GenPagesCSSLayoutVisibilityClass from './pages/CSS/layout/visibility.uvue?type=page'
import GenPagesCSSMarginMarginBottomClass from './pages/CSS/margin/margin-bottom.uvue?type=page'
import GenPagesCSSMarginMarginLeftClass from './pages/CSS/margin/margin-left.uvue?type=page'
import GenPagesCSSMarginMarginRightClass from './pages/CSS/margin/margin-right.uvue?type=page'
import GenPagesCSSMarginMarginTopClass from './pages/CSS/margin/margin-top.uvue?type=page'
import GenPagesCSSMarginMarginClass from './pages/CSS/margin/margin.uvue?type=page'
import GenPagesCSSOverflowOverflowClass from './pages/CSS/overflow/overflow.uvue?type=page'
import GenPagesCSSPaddingPaddingBottomClass from './pages/CSS/padding/padding-bottom.uvue?type=page'
import GenPagesCSSPaddingPaddingLeftClass from './pages/CSS/padding/padding-left.uvue?type=page'
import GenPagesCSSPaddingPaddingRightClass from './pages/CSS/padding/padding-right.uvue?type=page'
import GenPagesCSSPaddingPaddingTopClass from './pages/CSS/padding/padding-top.uvue?type=page'
import GenPagesCSSPaddingPaddingClass from './pages/CSS/padding/padding.uvue?type=page'
import GenPagesCSSTextColorClass from './pages/CSS/text/color.uvue?type=page'
import GenPagesCSSTextFontFamilyClass from './pages/CSS/text/font-family.uvue?type=page'
import GenPagesCSSTextFontSizeClass from './pages/CSS/text/font-size.uvue?type=page'
import GenPagesCSSTextFontStyleClass from './pages/CSS/text/font-style.uvue?type=page'
import GenPagesCSSTextFontWeightClass from './pages/CSS/text/font-weight.uvue?type=page'
import GenPagesCSSTextLetterSpacingClass from './pages/CSS/text/letter-spacing.uvue?type=page'
import GenPagesCSSTextFontFamilyIconClass from './pages/CSS/text/font-family-icon.uvue?type=page'
import GenPagesCSSTextLineHeightClass from './pages/CSS/text/line-height.uvue?type=page'
import GenPagesCSSTextTextAlignClass from './pages/CSS/text/text-align.uvue?type=page'
import GenPagesCSSTextTextOverflowClass from './pages/CSS/text/text-overflow.uvue?type=page'
import GenPagesCSSTextTextDecorationLineClass from './pages/CSS/text/text-decoration-line.uvue?type=page'
import GenPagesCSSTransitionTransitionClass from './pages/CSS/transition/transition.uvue?type=page'
import GenPagesCSSPointerEventsPointerEventsClass from './pages/CSS/pointer-events/pointer-events.uvue?type=page'
import GenPagesCSSTransformTranslateClass from './pages/CSS/transform/translate.uvue?type=page'
import GenPagesCSSTransformScaleClass from './pages/CSS/transform/scale.uvue?type=page'
import GenPagesCSSTransformRotateClass from './pages/CSS/transform/rotate.uvue?type=page'
import GenPagesCSSVariableVariableClass from './pages/CSS/variable/variable.uvue?type=page'
import GenPagesCSSOverflowOverflowVisibleEventClass from './pages/CSS/overflow/overflow-visible-event.uvue?type=page'
function definePageRoutes() {
__uniRoutes.push({ path: "pages/tabBar/component", component: GenPagesTabBarComponentClass, meta: { isQuit: true } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","内置组件"],["backgroundColorContent","#f8f8f8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/view/view", component: GenPagesComponentViewViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","view | 基本视图容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/scroll-view/scroll-view", component: GenPagesComponentScrollViewScrollViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","scroll-view | 可滚动视图容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/scroll-view/scroll-view-refresher", component: GenPagesComponentScrollViewScrollViewRefresherClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","scroll-view-refresher"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/scroll-view/scroll-view-props", component: GenPagesComponentScrollViewScrollViewPropsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","非下拉刷新的scroll-view属性示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/scroll-view/scroll-view-refresher-props", component: GenPagesComponentScrollViewScrollViewRefresherPropsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","下拉刷新的scroll-view属性示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/scroll-view/scroll-view-custom-refresher-props", component: GenPagesComponentScrollViewScrollViewCustomRefresherPropsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","自定义下拉刷新的scroll-view属性示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/swiper/swiper", component: GenPagesComponentSwiperSwiperClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","swiper | 滑块视图容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view", component: GenPagesComponentListViewListViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view | 列表容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view-refresh", component: GenPagesComponentListViewListViewRefreshClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view-refresh"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view-multiplex", component: GenPagesComponentListViewListViewMultiplexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view-multiplex"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view-multiplex-input", component: GenPagesComponentListViewListViewMultiplexInputClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view复用input"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view-multiplex-video", component: GenPagesComponentListViewListViewMultiplexVideoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view-multiplex-video"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/list-view-children-in-slot", component: GenPagesComponentListViewListViewChildrenInSlotClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","list-view-children-in-slot"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/sticky-section/sticky-section", component: GenPagesComponentStickySectionStickySectionClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","sticky-section | 吸顶布局容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/sticky-header/sticky-header", component: GenPagesComponentStickyHeaderStickyHeaderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","sticky-header | 吸顶布局容器"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/text/text", component: GenPagesComponentTextTextClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","text | 文本"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/text/text-props", component: GenPagesComponentTextTextPropsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","text-props"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/rich-text/rich-text", component: GenPagesComponentRichTextRichTextClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","rich-text | 富文本"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/rich-text/rich-text-tags", component: GenPagesComponentRichTextRichTextTagsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","rich-text-tags"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/rich-text/rich-text-complex", component: GenPagesComponentRichTextRichTextComplexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","rich-text-complex"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/progress/progress", component: GenPagesComponentProgressProgressClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","progress | 进度条"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/form/form", component: GenPagesComponentFormFormClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","form | 表单"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/button/button", component: GenPagesComponentButtonButtonClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","button | 按钮"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/button/buttonstatus", component: GenPagesComponentButtonButtonstatusClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","buttonstatus"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/radio/radio", component: GenPagesComponentRadioRadioClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","radio | 单选框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/checkbox/checkbox", component: GenPagesComponentCheckboxCheckboxClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","checkbox | 多选框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/input/input", component: GenPagesComponentInputInputClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","input | 输入框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/textarea/textarea", component: GenPagesComponentTextareaTextareaClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","textarea | 多行输入框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/slider/slider", component: GenPagesComponentSliderSliderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","slider | 滑动选择器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/slider/slider-in-swiper", component: GenPagesComponentSliderSliderInSwiperClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","slider-in-swiper"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/slider/slider-maxValue", component: GenPagesComponentSliderSliderMaxValueClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","slider-maxValue-test"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/picker-view/picker-view", component: GenPagesComponentPickerViewPickerViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","picker-view | 嵌入页面的滚动选择器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/switch/switch", component: GenPagesComponentSwitchSwitchClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","switch | 开关选择器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/image/image", component: GenPagesComponentImageImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","image | 图片"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/image/image-format", component: GenPagesComponentImageImageFormatClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","image-format"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/image/image-mode", component: GenPagesComponentImageImageModeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","image-mode"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/image/image-path", component: GenPagesComponentImageImagePathClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","image-path"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/image/image-large", component: GenPagesComponentImageImageLargeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","大图测试"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/video/video", component: GenPagesComponentVideoVideoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","video | 视频"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/video/video-format", component: GenPagesComponentVideoVideoFormatClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","video-format"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/navigator/navigator", component: GenPagesComponentNavigatorNavigatorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","navigator | 页面链接"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/navigator/navigate", component: GenPagesComponentNavigatorNavigateClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","navigatePage"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/navigator/redirect", component: GenPagesComponentNavigatorRedirectClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","redirectPage"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/web-view/web-view", component: GenPagesComponentWebViewWebViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","web-view"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/web-view/web-view/web-view-local", component: GenPagesComponentWebViewWebViewWebViewLocalClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","本地网页"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/unicloud-db/unicloud-db/contacts/list", component: GenPagesComponentUnicloudDbUnicloudDbContactsListClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","联系人"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/unicloud-db/unicloud-db/contacts/add", component: GenPagesComponentUnicloudDbUnicloudDbContactsAddClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","新增联系人"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/unicloud-db/unicloud-db/contacts/edit", component: GenPagesComponentUnicloudDbUnicloudDbContactsEditClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","编辑联系人"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/unicloud-db/unicloud-db/contacts/detail", component: GenPagesComponentUnicloudDbUnicloudDbContactsDetailClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/unicloud-db/unicloud-db/mixin-datacom/mixin-datacom", component: GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacomClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","mixinDatacom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/global-properties/global-properties", component: GenPagesComponentGlobalPropertiesGlobalPropertiesClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","全局属性"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/global-events/global-events", component: GenPagesComponentGlobalEventsGlobalEventsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","全局事件"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/global-events/transition-events", component: GenPagesComponentGlobalEventsTransitionEventsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","Transition Events"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/global-events/touch-events", component: GenPagesComponentGlobalEventsTouchEventsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","Touch Events"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/global-events/touch-events-bubbles", component: GenPagesComponentGlobalEventsTouchEventsBubblesClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","Touch Events bubbles"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/nested-scroll-header/nested-scroll-header", component: GenPagesComponentNestedScrollHeaderNestedScrollHeaderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","nested-scroll-header"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/nested-scroll-body/nested-scroll-body", component: GenPagesComponentNestedScrollBodyNestedScrollBodyClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","nested-scroll-body"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/swiper/swiper-list-view", component: GenPagesComponentSwiperSwiperListViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","swiper嵌套list-view"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/map/map", component: GenPagesComponentMapMapClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","map | 地图"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/list-view/issue-2199", component: GenPagesComponentListViewIssue2199Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","issue-2199"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/canvas/canvas", component: GenPagesComponentCanvasCanvasClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","canvas | 画布"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/canvas/canvas-context", component: GenPagesComponentCanvasCanvasContextClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createCanvasContextAsync"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/canvas/canvas/ball", component: GenPagesComponentCanvasCanvasBallClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","ball"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/canvas/canvas/doodle", component: GenPagesComponentCanvasCanvasDoodleClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","涂鸦"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/native-view/native-view", component: GenPagesComponentNativeViewNativeViewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","native-view"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/ad/ad", component: GenPagesComponentAdAdClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","ad | 信息流广告"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/waterflow/waterflow", component: GenPagesComponentWaterflowWaterflowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","waterflow | 瀑布流容器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/ad/list-view-ad", component: GenPagesComponentAdListViewAdClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","ad | 信息流广告"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/tabBar/API", component: GenPagesTabBarAPIClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","接口"],["backgroundColorContent","#f8f8f8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-app/get-app", component: GenPagesAPIGetAppGetAppClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getApp | 获取当前应用实例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/exit/exit", component: GenPagesAPIExitExitClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","exit | 退出应用"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/install-apk/install-apk", component: GenPagesAPIInstallApkInstallApkClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","installApk | 安装 APK"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-current-pages/get-current-pages", component: GenPagesAPIGetCurrentPagesGetCurrentPagesClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getCurrentPages | 获取当前页面栈"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-current-pages/set-page-style-disable-pull-down-refresh", component: GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","setPageStyle pull default false"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-launch-options-sync/get-launch-options-sync", component: GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getLaunchOptionsSync | 获取启动参数"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-enter-options-sync/get-enter-options-sync", component: GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSyncClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getEnterOptionsSync | 获取本次启动时的参数"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/animation-frame/animation-frame", component: GenPagesAPIAnimationFrameAnimationFrameClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","animationFrame | 动画帧"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/navigator/navigator", component: GenPagesAPINavigatorNavigatorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","navigator | 页面跳转"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/set-navigation-bar-color/set-navigation-bar-color", component: GenPagesAPISetNavigationBarColorSetNavigationBarColorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","setNavigationBarColor | 设置导航条颜色"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/set-navigation-bar-title/set-navigation-bar-title", component: GenPagesAPISetNavigationBarTitleSetNavigationBarTitleClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","setNavigationBarTitle | 设置导航条标题"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/set-page-backgroundColorContent/set-page-backgroundColorContent", component: GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContentClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","设置页面容器背景色"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/navigator/new-page/new-page-1", component: GenPagesAPINavigatorNewPageNewPage1Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","新页面-1"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/navigator/new-page/new-page-3", component: GenPagesAPINavigatorNewPageNewPage3Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","新页面-3"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/navigator/new-page/onLoad", component: GenPagesAPINavigatorNewPageOnLoadClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","onLoad 生命周期测试"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/pull-down-refresh/pull-down-refresh", component: GenPagesAPIPullDownRefreshPullDownRefreshClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","pullDownRefresh | 页面下拉刷新"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/storage/storage", component: GenPagesAPIStorageStorageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","storage | key-value本地数据存储"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-file-system-manager/get-file-system-manager", component: GenPagesAPIGetFileSystemManagerGetFileSystemManagerClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getFileSystemManager | 获取文件管理器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/env/env", component: GenPagesAPIEnvEnvClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","env | 环境变量"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/show-action-sheet/show-action-sheet", component: GenPagesAPIShowActionSheetShowActionSheetClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","showActionSheet | 弹出操作菜单"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/show-modal/show-modal", component: GenPagesAPIShowModalShowModalClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","showModal | 显示模态弹窗"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/show-loading/show-loading", component: GenPagesAPIShowLoadingShowLoadingClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","showLoading | 显示 loading 提示框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/show-toast/show-toast", component: GenPagesAPIShowToastShowToastClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","showToast | 显示消息提示框"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/load-font-face/load-font-face", component: GenPagesAPILoadFontFaceLoadFontFaceClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","loadFontFace | 动态加载字体"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/load-font-face/load-font-face-child", component: GenPagesAPILoadFontFaceLoadFontFaceChildClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","动态加载字体-子页面"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-location/get-location", component: GenPagesAPIGetLocationGetLocationClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getLocation | 获取当前位置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/open-location/open-location", component: GenPagesAPIOpenLocationOpenLocationClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","openLocation | 使用地图查看位置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/choose-location/choose-location", component: GenPagesAPIChooseLocationChooseLocationClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","chooseLocation | 使用地图选择位置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/interceptor/interceptor", component: GenPagesAPIInterceptorInterceptorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","interceptor | 拦截器"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/interceptor/page1", component: GenPagesAPIInterceptorPage1Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","拦截器测试页面 1"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/interceptor/page2", component: GenPagesAPIInterceptorPage2Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","拦截器测试页面 2"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/request/request", component: GenPagesAPIRequestRequestClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","request | 发起网络请求"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/upload-file/upload-file", component: GenPagesAPIUploadFileUploadFileClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","uploadFile | 上传文件"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/download-file/download-file", component: GenPagesAPIDownloadFileDownloadFileClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","downloadFile | 下载文件"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/websocket/socketTask", component: GenPagesAPIWebsocketSocketTaskClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","socketTask"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/websocket/websocket", component: GenPagesAPIWebsocketWebsocketClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","websocket"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/unicloud/unicloud/cloud-function", component: GenPagesAPIUnicloudUnicloudCloudFunctionClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","cloud function | 云函数"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/unicloud/unicloud/cloud-object", component: GenPagesAPIUnicloudUnicloudCloudObjectClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","cloud object | 云对象"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-system-info/get-system-info", component: GenPagesAPIGetSystemInfoGetSystemInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getSystemInfo | 获取系统信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-device-info/get-device-info", component: GenPagesAPIGetDeviceInfoGetDeviceInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getDeviceInfo | 获取设备信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-app-base-info/get-app-base-info", component: GenPagesAPIGetAppBaseInfoGetAppBaseInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getAppBaseInfo | 获取APP基础信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-system-setting/get-system-setting", component: GenPagesAPIGetSystemSettingGetSystemSettingClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getSystemSetting | 获取系统设置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/element-takesnapshot/element-takesnapshot", component: GenPagesAPIElementTakesnapshotElementTakesnapshotClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","takeSnapshot | 截图"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/element-get-bounding-client-rect-async/element-get-bounding-client-rect-async", component: GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getBoundingClientRectAsync | 异步获取元素信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/element-get-attribute/element-get-attribute", component: GenPagesAPIElementGetAttributeElementGetAttributeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getAttribute | 获取元素的属性值"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-app-authorize-setting/get-app-authorize-setting", component: GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSettingClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getAppAuthorizeSetting | 获取APP授权设置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/preview-image/preview-image", component: GenPagesAPIPreviewImagePreviewImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","previewImage | 图片预览"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/choose-image/choose-image", component: GenPagesAPIChooseImageChooseImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","chooseImage | 拍照或从相册选择图片"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-image-info/get-image-info", component: GenPagesAPIGetImageInfoGetImageInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getImageInfo | 获取图片信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/compress-image/compress-image", component: GenPagesAPICompressImageCompressImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","compressImage | 压缩图片"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/choose-video/choose-video", component: GenPagesAPIChooseVideoChooseVideoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","chooseVideo | 拍摄视频或从相册中选择视频"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/compress-video/compress-video", component: GenPagesAPICompressVideoCompressVideoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","compressVideo | 压缩视频"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-network-type/get-network-type", component: GenPagesAPIGetNetworkTypeGetNetworkTypeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getNetworkType | 获取网络类型"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/page-scroll-to/page-scroll-to", component: GenPagesAPIPageScrollToPageScrollToClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","pageScrollTo | 将页面滚动到指定位置"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/event-bus/event-bus", component: GenPagesAPIEventBusEventBusClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","eventBus | 事件总线"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/unicloud/unicloud/cloud-storage", component: GenPagesAPIUnicloudUnicloudCloudStorageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","cloud storage | 云存储"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/unicloud/unicloud/database", component: GenPagesAPIUnicloudUnicloudDatabaseClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","database | 数据库"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-battery-info/get-battery-info", component: GenPagesAPIGetBatteryInfoGetBatteryInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getBatteryInfo | 获取电池电量信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-window-info/get-window-info", component: GenPagesAPIGetWindowInfoGetWindowInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getWindowInfo | 获取窗口信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-window-info/window-area", component: GenPagesAPIGetWindowInfoWindowAreaClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","window area"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/element-draw/element-draw", component: GenPagesAPIElementDrawElementDrawClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getDrawableContext | 获取绘制对象"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/facial-recognition-meta-info/facial-recognition-meta-info", component: GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","facialRecognitionMetaInfo | 金融级实人认证"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-univerify-manager/get-univerify-manager", component: GenPagesAPIGetUniverifyManagerGetUniverifyManagerClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getUniverifyManager | App一键登录"],["navigationBarTextStyle","white"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-univerify-manager/univerify-custom-page", component: GenPagesAPIGetUniverifyManagerUniverifyCustomPageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTextStyle","black"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-univerify-manager/full-webview-page", component: GenPagesAPIGetUniverifyManagerFullWebviewPageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTextStyle","white"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/rpx2px/rpx2px", component: GenPagesAPIRpx2pxRpx2pxClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","rpx2px | 将rpx单位值转换成px"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-request-permission-listener/create-request-permission-listener", component: GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListenerClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createRequestPermissionListener | 监听权限申请"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/request-payment/request-payment", component: GenPagesAPIRequestPaymentRequestPaymentClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","requestPayment | 支付（requestPayment）"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-rewarded-video-ad/create-rewarded-video-ad", component: GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createRewardedVideoAd | 激励视频广告"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/request-payment/request-payment/request-payment-uni-pay", component: GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","uni-pay示例"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/request-payment/request-payment/order-detail", component: GenPagesAPIRequestPaymentRequestPaymentOrderDetailClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","订单详情示例"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-inner-audio-context/create-inner-audio-context", component: GenPagesAPICreateInnerAudioContextCreateInnerAudioContextClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createInnerAudioContext | 音频"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-inner-audio-context/inner-audio-format", component: GenPagesAPICreateInnerAudioContextInnerAudioFormatClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","inner-audio-format"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-inner-audio-context/inner-audio-path", component: GenPagesAPICreateInnerAudioContextInnerAudioPathClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","inner-audio-path"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-inner-audio-context/inner-audio-mult", component: GenPagesAPICreateInnerAudioContextInnerAudioMultClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","inner-audio-mult"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/theme-change/theme-change", component: GenPagesAPIThemeChangeThemeChangeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","themeChange | 主题切换"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-element-by-id/get-element-by-id", component: GenPagesAPIGetElementByIdGetElementByIdClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getElementById | 通过 id 获取 element"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-element-by-id/get-element-by-id-multiple-root-node", component: GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","获取节点-多根节点"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-selector-query/create-selector-query", component: GenPagesAPICreateSelectorQueryCreateSelectorQueryClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createSelectorQuery | 创建 SelectorQuery 实例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-selector-query/create-selector-query-onScroll", component: GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createSelectorQuery"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-native-view/element-getnativeview", component: GenPagesAPIGetNativeViewElementGetnativeviewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getNativeView | 获取原生 View"],["backgroundColor","#F8F8F8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/resize-observer/resize-observer", component: GenPagesAPIResizeObserverResizeObserverClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","UniResizeObserver"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/provider/provider", component: GenPagesAPIProviderProviderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","provider | 服务提供商"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/privacy/privacy", component: GenPagesAPIPrivacyPrivacyClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","privacy | 隐私信息授权"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/uni-push/uni-push", component: GenPagesAPIUniPushUniPushClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","推送"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/report/report", component: GenPagesAPIReportReportClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","report | 统计采集上报"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/dialog-page", component: GenPagesAPIDialogPageDialogPageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogPage"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/next-page", component: GenPagesAPIDialogPageNextPageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogNextPage"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/dialog-1", component: GenPagesAPIDialogPageDialog1Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogPage1"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/dialog-2", component: GenPagesAPIDialogPageDialog2Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogPage2"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/dialog-3", component: GenPagesAPIDialogPageDialog3Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogPage3"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/dialog-page/dialog-4", component: GenPagesAPIDialogPageDialog4Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","dialogPage4"],["navigationBarTextStyle","black"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/create-interstitial-ad/create-interstitial-ad", component: GenPagesAPICreateInterstitialAdCreateInterstitialAdClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","createInterstitialAd | 插屏广告"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-background-audio-manager/get-background-audio-manager", component: GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getBackgroundAudioManager | 背景音频"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/share-with-system/share-with-system", component: GenPagesAPIShareWithSystemShareWithSystemClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","shareWithSystem"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/tabBar/CSS", component: GenPagesTabBarCSSClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","CSS"],["backgroundColorContent","#f8f8f8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/tabBar/template", component: GenPagesTabBarTemplateClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","模板"],["backgroundColorContent","#f8f8f8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/list-news/list-news", component: GenPagesTemplateListNewsListNewsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","列表到详情示例（吸顶）"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/list-news/detail/detail", component: GenPagesTemplateListNewsDetailDetailClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","详情示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/drop-card/drop-card", component: GenPagesTemplateDropCardDropCardClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","drop-card"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/swiper-list/swiper-list", component: GenPagesTemplateSwiperListSwiperListClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","swiper-list"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/swiper-list2/swiper-list2", component: GenPagesTemplateSwiperList2SwiperList2Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","swiper-list2"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/slider-100/slider-100", component: GenPagesTemplateSlider100Slider100Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","slider x 100"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/swiper-vertical-video/swiper-vertical-video", component: GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationStyle","custom"],["backgroundColorContent","#000000"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/scroll-sticky/scroll-sticky", component: GenPagesTemplateScrollStickyScrollStickyClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","scroll-view自定义滚动吸顶"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/scroll-fold-nav/scroll-fold-nav", component: GenPagesTemplateScrollFoldNavScrollFoldNavClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationStyle","custom"],["navigationBarTextStyle","black"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/custom-refresher/custom-refresher", component: GenPagesTemplateCustomRefresherCustomRefresherClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","自定义下拉刷新"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/half-screen/half-screen", component: GenPagesTemplateHalfScreenHalfScreenClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","半屏弹窗"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/long-list/long-list", component: GenPagesTemplateLongListLongListClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","Android顶部搜索框随时下移长列表"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/long-list2/long-list2", component: GenPagesTemplateLongList2LongList2Class, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","顶部banner长列表嵌套滚动示例"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/long-list-nested/long-list-nested", component: GenPagesTemplateLongListNestedLongListNestedClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","顶部banner长列表嵌套滚动示例"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/long-waterflow-nested/long-waterflow-nested", component: GenPagesTemplateLongWaterflowNestedLongWaterflowNestedClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","顶部banner瀑布流长列表嵌套滚动示例"],["enablePullDownRefresh",true]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/pull-zoom-image/pull-zoom-image", component: GenPagesTemplatePullZoomImagePullZoomImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/navbar-lite/navbar-lite", component: GenPagesTemplateNavbarLiteNavbarLiteClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","自定义导航栏"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/custom-tab-bar/custom-tab-bar", component: GenPagesTemplateCustomTabBarCustomTabBarClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","自定义TabBar"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/calendar/calendar", component: GenPagesTemplateCalendarCalendarClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","日历"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/schema/schema", component: GenPagesTemplateSchemaSchemaClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","打开schema示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "uni_modules/uni-pay-x/pages/success/success", component: GenUniModulesUniPayXPagesSuccessSuccessClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""],["backgroundColor","#F8F8F8"],["navigationBarBackgroundColor","#007aff"],["navigationBarTextStyle","white"]]) } as UniPageRoute)
__uniRoutes.push({ path: "uni_modules/uni-pay-x/pages/ad-interactive-webview/ad-interactive-webview", component: GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebviewClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","ad"],["backgroundColor","#F8F8F8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "uni_modules/uni-pay-x/pages/pay-desk/pay-desk", component: GenUniModulesUniPayXPagesPayDeskPayDeskClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","收银台"],["backgroundColor","#F8F8F8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/custom-long-list/custom-long-list", component: GenPagesTemplateCustomLongListCustomLongListClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","自定义虚拟长列表"],["enablePullDownRefresh",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/template/test-background-color-content/test-background-color-content", component: GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContentClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""],["backgroundColorContent","#fffae8"]]) } as UniPageRoute)
__uniRoutes.push({ path: "uni_modules/uni-openLocation/pages/openLocation/openLocation", component: GenUniModulesUniOpenLocationPagesOpenLocationOpenLocationClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText"," "],["navigationStyle","custom"],["disableSwipeBack",false]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/component/button/privacy", component: GenPagesComponentButtonPrivacyClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""]]) } as UniPageRoute)
__uniRoutes.push({ path: "uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup", component: GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/save-image-to-photos-album/save-image-to-photos-album", component: GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","saveImageToPhotosAlbum | 保存图片到相册"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/save-video-to-photos-album/save-video-to-photos-album", component: GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","saveVideoToPhotosAlbum | 保存视频到相册"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/API/get-video-info/get-video-info", component: GenPagesAPIGetVideoInfoGetVideoInfoClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","getVideoInfo | 获取视频信息"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/background/background-color", component: GenPagesCSSBackgroundBackgroundColorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","background-color"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/background/background-image", component: GenPagesCSSBackgroundBackgroundImageClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","background-image"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-bottom", component: GenPagesCSSBorderBorderBottomClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-bottom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-color", component: GenPagesCSSBorderBorderColorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-color"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-left", component: GenPagesCSSBorderBorderLeftClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-left"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-radius", component: GenPagesCSSBorderBorderRadiusClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-radius"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-right", component: GenPagesCSSBorderBorderRightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-right"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-style", component: GenPagesCSSBorderBorderStyleClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-style"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-top", component: GenPagesCSSBorderBorderTopClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-top"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-width", component: GenPagesCSSBorderBorderWidthClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border-width"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border", component: GenPagesCSSBorderBorderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/complex-border/complex-border", component: GenPagesCSSBorderComplexBorderComplexBorderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border属性组合示例"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/dynamic-border", component: GenPagesCSSBorderDynamicBorderClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border动态修改"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/border/border-update", component: GenPagesCSSBorderBorderUpdateClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","border更新样式"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/box-shadow/box-shadow", component: GenPagesCSSBoxShadowBoxShadowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","box-shadow"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/display/flex", component: GenPagesCSSDisplayFlexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/display/none", component: GenPagesCSSDisplayNoneClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","none"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/align-content", component: GenPagesCSSFlexAlignContentClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","align-content"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/align-items", component: GenPagesCSSFlexAlignItemsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","align-items"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex-basis", component: GenPagesCSSFlexFlexBasisClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex-basis"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex-direction", component: GenPagesCSSFlexFlexDirectionClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex-direction"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex-flow", component: GenPagesCSSFlexFlexFlowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex-flow"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex-grow", component: GenPagesCSSFlexFlexGrowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex-grow"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex-shrink", component: GenPagesCSSFlexFlexShrinkClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex-shrink"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/flex", component: GenPagesCSSFlexFlexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","flex"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/flex/justify-content", component: GenPagesCSSFlexJustifyContentClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","justify-content"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/height", component: GenPagesCSSLayoutHeightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","height"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/max-height", component: GenPagesCSSLayoutMaxHeightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","max-height"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/max-width", component: GenPagesCSSLayoutMaxWidthClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","max-width"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/min-height", component: GenPagesCSSLayoutMinHeightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","min-height"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/min-width", component: GenPagesCSSLayoutMinWidthClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","min-width"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/position", component: GenPagesCSSLayoutPositionClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","position"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/width", component: GenPagesCSSLayoutWidthClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","width"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/z-index", component: GenPagesCSSLayoutZIndexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","z-index"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/layout/visibility", component: GenPagesCSSLayoutVisibilityClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","visibility"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/margin/margin-bottom", component: GenPagesCSSMarginMarginBottomClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","margin-bottom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/margin/margin-left", component: GenPagesCSSMarginMarginLeftClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","margin-left"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/margin/margin-right", component: GenPagesCSSMarginMarginRightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","margin-right"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/margin/margin-top", component: GenPagesCSSMarginMarginTopClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","margin-top"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/margin/margin", component: GenPagesCSSMarginMarginClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","margin"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/overflow/overflow", component: GenPagesCSSOverflowOverflowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","overflow"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/padding/padding-bottom", component: GenPagesCSSPaddingPaddingBottomClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","padding-bottom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/padding/padding-left", component: GenPagesCSSPaddingPaddingLeftClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","padding-left"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/padding/padding-right", component: GenPagesCSSPaddingPaddingRightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","padding-right"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/padding/padding-top", component: GenPagesCSSPaddingPaddingTopClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","padding-top"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/padding/padding", component: GenPagesCSSPaddingPaddingClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","padding"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/color", component: GenPagesCSSTextColorClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","color"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/font-family", component: GenPagesCSSTextFontFamilyClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","font-family"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/font-size", component: GenPagesCSSTextFontSizeClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","font-size"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/font-style", component: GenPagesCSSTextFontStyleClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","font-style"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/font-weight", component: GenPagesCSSTextFontWeightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","font-weight"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/letter-spacing", component: GenPagesCSSTextLetterSpacingClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","letter-spacing"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/font-family-icon", component: GenPagesCSSTextFontFamilyIconClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","font-family: uni-icon"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/line-height", component: GenPagesCSSTextLineHeightClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","line-height"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/text-align", component: GenPagesCSSTextTextAlignClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","text-align"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/text-overflow", component: GenPagesCSSTextTextOverflowClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","text-overflow"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/text/text-decoration-line", component: GenPagesCSSTextTextDecorationLineClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","text-decoration-line"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/transition/transition", component: GenPagesCSSTransitionTransitionClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","transition"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/pointer-events/pointer-events", component: GenPagesCSSPointerEventsPointerEventsClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","pointer-events"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/transform/translate", component: GenPagesCSSTransformTranslateClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","translate"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/transform/scale", component: GenPagesCSSTransformScaleClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","scale"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/transform/rotate", component: GenPagesCSSTransformRotateClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","rotate"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/variable/variable", component: GenPagesCSSVariableVariableClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","css 变量"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/CSS/overflow/overflow-visible-event", component: GenPagesCSSOverflowOverflowVisibleEventClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","overflow-visible-event"]]) } as UniPageRoute)
}
const __uniTabBar: Map<string, any | null> | null = utsMapOf([["color","@tabBarColor"],["selectedColor","@tabBarSelectedColor"],["borderStyle","@tabBarBorderStyle"],["backgroundColor","@tabBarBackgroundColor"],["list",[utsMapOf([["pagePath","pages/tabBar/component"],["iconPath","@tabBarComponentIconPath"],["selectedIconPath","@tabBarComponentSelectedIconPath"],["text","组件"]]),utsMapOf([["pagePath","pages/tabBar/API"],["iconPath","@tabBarAPIIconPath"],["selectedIconPath","@tabBarAPISelectedIconPath"],["text","接口"]]),utsMapOf([["pagePath","pages/tabBar/CSS"],["iconPath","@tabBarCSSIconPath"],["selectedIconPath","@tabBarCSSSelectedIconPath"],["text","CSS"]]),utsMapOf([["pagePath","pages/tabBar/template"],["iconPath","@tabBarTemplateIconPath"],["selectedIconPath","@tabBarTemplateSelectedIconPath"],["text","模板"]])]]])
const __uniLaunchPage: Map<string, any | null> = utsMapOf([["url","pages/tabBar/component"],["style",utsMapOf([["navigationBarTitleText","内置组件"],["backgroundColorContent","#f8f8f8"]])]])
function defineAppConfig(){
  __uniConfig.entryPagePath = '/pages/tabBar/component'
  __uniConfig.globalStyle = utsMapOf([["pageOrientation","portrait"],["navigationBarTitleText","Hello uniapp x"],["navigationBarTextStyle","@navigationBarTextStyle"],["navigationBarBackgroundColor","@navigationBarBackgroundColor"],["backgroundColorContent","@backgroundColorContent"],["backgroundColor","@backgroundColor"],["backgroundTextStyle","@backgroundTextStyle"]])
  __uniConfig.getTabBarConfig = ():Map<string, any> | null =>  utsMapOf([["color","@tabBarColor"],["selectedColor","@tabBarSelectedColor"],["borderStyle","@tabBarBorderStyle"],["backgroundColor","@tabBarBackgroundColor"],["list",[utsMapOf([["pagePath","pages/tabBar/component"],["iconPath","@tabBarComponentIconPath"],["selectedIconPath","@tabBarComponentSelectedIconPath"],["text","组件"]]),utsMapOf([["pagePath","pages/tabBar/API"],["iconPath","@tabBarAPIIconPath"],["selectedIconPath","@tabBarAPISelectedIconPath"],["text","接口"]]),utsMapOf([["pagePath","pages/tabBar/CSS"],["iconPath","@tabBarCSSIconPath"],["selectedIconPath","@tabBarCSSSelectedIconPath"],["text","CSS"]]),utsMapOf([["pagePath","pages/tabBar/template"],["iconPath","@tabBarTemplateIconPath"],["selectedIconPath","@tabBarTemplateSelectedIconPath"],["text","模板"]])]]])
  __uniConfig.tabBar = __uniConfig.getTabBarConfig()
  __uniConfig.conditionUrl = ''
  __uniConfig.uniIdRouter = new Map()
  __uniConfig.themeConfig = utsMapOf([["light",utsMapOf([["navigationBarTextStyle","white"],["navigationBarBackgroundColor","#007AFF"],["backgroundColorContent","#efeff4"],["backgroundColor","#efeff4"],["backgroundTextStyle","dark"],["tabBarColor","#7A7E83"],["tabBarSelectedColor","#007AFF"],["tabBarBorderStyle","black"],["tabBarBackgroundColor","#F8F8F8"],["tabBarComponentIconPath","static/component.png"],["tabBarComponentSelectedIconPath","static/componentHL.png"],["tabBarAPIIconPath","static/api.png"],["tabBarAPISelectedIconPath","static/apiHL.png"],["tabBarCSSIconPath","static/css.png"],["tabBarCSSSelectedIconPath","static/cssHL.png"],["tabBarTemplateIconPath","static/template.png"],["tabBarTemplateSelectedIconPath","static/templateHL.png"]])],["dark",utsMapOf([["navigationBarTextStyle","white"],["navigationBarBackgroundColor","#1F1F1F"],["backgroundColor","#1F1F1F"],["backgroundColorContent","#646464"],["backgroundTextStyle","light"],["tabBarColor","#cacaca"],["tabBarSelectedColor","#007AFF"],["tabBarBorderStyle","white"],["tabBarBackgroundColor","#1F1F1F"],["tabBarComponentIconPath","static/component.png"],["tabBarComponentSelectedIconPath","static/componentHL.png"],["tabBarAPIIconPath","static/api.png"],["tabBarAPISelectedIconPath","static/apiHL.png"],["tabBarCSSIconPath","static/css.png"],["tabBarCSSSelectedIconPath","static/cssHL.png"],["tabBarTemplateIconPath","static/template.png"],["tabBarTemplateSelectedIconPath","static/templateHL.png"]])]])
  __uniConfig.ready = true
}

export class UniCloudConfig extends io.dcloud.unicloud.InternalUniCloudConfig {
    override isDev : boolean = false
    override spaceList : string = "[{\"provider\":\"aliyun\",\"spaceName\":\"vercel-alcloud\",\"spaceId\":\"mp-51f7f546-a748-4915-aa6c-dd5f2e6cbf54\",\"clientSecret\":\"6S1BZudEGcP/ZypPkFZp1A==\",\"endpoint\":\"https://api.next.bspapp.com\"}]"
    override debuggerInfo ?: string = null
    override secureNetworkEnable : boolean = false
    override secureNetworkConfig ?: string = ""
    constructor() { super() }
}
