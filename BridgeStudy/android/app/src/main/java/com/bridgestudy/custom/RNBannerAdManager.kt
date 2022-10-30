package com.bridgestudy.custom

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext


class RNBannerAdManager(
    private val reactContext: ReactApplicationContext
) : SimpleViewManager<RNBannerAdView>() {

    override fun getName() = REACT_CLASS

    override fun createViewInstance(reactContext: ThemedReactContext): RNBannerAdView {
        return RNBannerAdView(reactContext)
    }

    companion object {
        const val REACT_CLASS = "RCTBannerView"
    }
}