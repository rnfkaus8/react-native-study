package com.bridgestudy.custom

import android.content.Context
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bridgestudy.R

class RNBannerAdView : FrameLayout {

    val imageView: ImageView
    val textView: TextView
    val button: Button

    constructor(context: Context) : super(context) {
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        this.addView(imageView)
        this.addView(textView)
        this.addView(button)
    }

}
