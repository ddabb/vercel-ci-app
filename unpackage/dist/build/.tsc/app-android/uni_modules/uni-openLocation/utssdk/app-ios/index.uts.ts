import { OpenLocation, OpenLocationOptions, OpenLocationSuccessImpl } from "../interface.uts"
import { OpenLocationFailImpl } from "../unierror.uts"

export const openLocation : OpenLocation = function (options : OpenLocationOptions) {
  const uuid = `${Date.now()}${Math.floor(Math.random() * 1e7)}`
  const baseEventName = `uni_open_location_${uuid}`
  const readyEventName = `${baseEventName}_ready`
  const optionsEventName = `${baseEventName}_options`
  const successEventName = `${baseEventName}_success`
  const failEventName = `${baseEventName}_fail`

  uni.$on(readyEventName, (..._ : any) => {
    uni.$emit(optionsEventName, JSON.parse(JSON.stringify(options)!))
  })
  uni.$on(successEventName, (..._ : any) => {
    const res = new OpenLocationSuccessImpl()
    options.success?.(res)
    options.complete?.(res)
  })
  uni.$on(failEventName, (..._ : any) => {
    const res = new OpenLocationFailImpl(4)
    options.fail?.(res)
    options.complete?.(res)
  })
  uni.openDialogPage({
    url: `/uni_modules/uni-openLocation/pages/openLocation/openLocation?readyEventName=${readyEventName}&optionsEventName=${optionsEventName}&successEventName=${successEventName}&failEventName=${failEventName}`,
    fail(err) {
      const res = new OpenLocationFailImpl(4)
      options.fail?.(res)
      options.complete?.(res)
      uni.$off(readyEventName)
      uni.$off(successEventName)
      uni.$off(failEventName)
    }
  })
};
