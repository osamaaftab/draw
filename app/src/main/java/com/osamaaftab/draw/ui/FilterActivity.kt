package com.osamaaftab.draw.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.osamaaftab.draw.views.ShapDrawableFilterView

class FilterActivity : AppCompatActivity() {

    var drawView: ShapDrawableFilterView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drawView = ShapDrawableFilterView(this)
        drawView!!.setBackgroundColor(Color.WHITE)
        setContentView(drawView)
    }
}