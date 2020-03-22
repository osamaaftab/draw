package com.osamaaftab.draw.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.osamaaftab.draw.views.ShapeView

class ShapeActivity : AppCompatActivity() {

    var shapeView: ShapeView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shapeView = ShapeView(this)
        shapeView!!.setBackgroundColor(Color.WHITE)
        setContentView(shapeView)

    }
}