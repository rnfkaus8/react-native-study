package com.bridgestudy.custom

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class RNBannerAdPackage: ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
        return emptyArray<NativeModule>().toMutableList()
    }

    override fun createViewManagers(
        reactContext: ReactApplicationContext
    ) = listOf(RNBannerAdManager(reactContext))
}