package com.osamaaftab.draw.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.osamaaftab.draw.views.ShapDrawableView

class DrawableActivity : AppCompatActivity() {

    var shapDrawableView: ShapDrawableView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shapDrawableView = ShapDrawableView(this)
        shapDrawableView!!.setBackgroundColor(Color.WHITE)
        setContentView(shapDrawableView)
    }
}