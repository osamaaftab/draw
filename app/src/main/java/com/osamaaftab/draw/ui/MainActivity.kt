package com.osamaaftab.draw.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.osamaaftab.draw.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

  //  var drawView: ShapDrawableFilterView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    drawView = ShapDrawableFilterView(this)
     //   drawView!!.setBackgroundColor(Color.WHITE)
        setContentView(R.layout.activity_main)
        draw_shape.setOnClickListener { startActivity(Intent(this,ShapeActivity::class.java)) }
        add_image.setOnClickListener { startActivity(Intent(this,DrawableActivity::class.java)) }
        add_filter.setOnClickListener { startActivity(Intent(this,FilterActivity::class.java)) }

    }
}
