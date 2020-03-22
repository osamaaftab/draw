package com.osamaaftab.draw.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import com.osamaaftab.draw.R
import com.osamaaftab.draw.Utils

class ShapDrawableView(context: Context?) : View(context) {
    public override fun onDraw(canvas: Canvas) {
        val width = width
        val height = height
        drawShape(50, 50, width / 2 - 25, height / 2 - 25, canvas)
        drawShape(width / 2 + 25, 50, width - 50, height / 2 - 25, canvas)
        drawShape(50, height / 2 + 25, width / 2 - 25, height - 50, canvas)
        drawShape(width / 2 + 25, height / 2 + 25, width - 50, height - 50, canvas)
    }

    private fun drawShape(left: Int, top: Int, right: Int, bottom: Int, canvas: Canvas) {
        val rectangle = Rect(left, top, right, bottom)
        val drawable = resources.getDrawable(R.drawable.place_holder)
        drawable.bounds = rectangle
        var bitmap =
            Utils.drawableToBitmap(drawable)
        canvas.drawBitmap(bitmap, null, rectangle, null)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(800, 800) //fixed the size of canvas to 800 x 800
    }
}