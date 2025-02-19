@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.nativeButton;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import android.widget.Button;
open class NativeButton {
    open var `$element`: UniNativeViewElement;
    constructor(element: UniNativeViewElement){
        this.`$element` = element;
        this.bindView();
    }
    open var button: Button? = null;
    open fun bindView() {
        this.button = Button(this.`$element`.getAndroidActivity()!!);
        this.button?.setAllCaps(false);
        this.button?.setOnClickListener(fun(_){
            val detail: UTSJSONObject = UTSJSONObject();
            val event = UniNativeViewEvent("customClick", detail);
            this.`$element`.dispatchEvent(event);
        }
        );
        this.`$element`.bindAndroidView(this.button!!);
    }
    open fun updateText(text: String) {
        this.button?.setText(text);
    }
    open fun destroy() {}
}
