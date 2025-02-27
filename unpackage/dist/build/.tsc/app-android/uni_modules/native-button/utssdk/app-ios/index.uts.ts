import { UIButton, UIControl } from "UIKit"

export class NativeButton {

	element : UniNativeViewElement;
	button : UIButton | null;

	constructor(element : UniNativeViewElement) {
    // 接收组件传递过来的UniNativeViewElement
		this.element = element;
		super.init()
		this.bindView();
	}

	// element 绑定原生view
	bindView() {
    // 初始化原生 UIButton
    this.button = new UIButton(type=UIButton.ButtonType.system)
    // 构建方法选择器
    const method = Selector("buttonClickAction")
    // button 绑定点击回调方法
    button?.addTarget(this, action = method, for = UIControl.Event.touchUpInside)
    // UniNativeViewElement 绑定原生 view
		this.element.bindIOSView(this.button!);
	}

	updateText(text : string) {
    // 更新 button 显示文字
		this.button?.setTitle(text, for = UIControl.State.normal)
	}

	/**
	 * 按钮点击回调方法
	 * 在 swift 中，所有target-action (例如按钮的点击事件，NotificationCenter 的通知事件等)对应的 action 函数前面都要使用 @objc 进行标记。
	 */
	@objc buttonClickAction() {
    //构建自定义 UniNativeViewEvent 对象
		let event = new UniNativeViewEvent("customClick")
    //触发自定义事件
		this.element.dispatchEvent(event)
	}

	destroy() {
    // 释放 UTS 实例对象，避免内存泄露
		UTSiOS.destroyInstance(this)
	}
}

