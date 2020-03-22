package com.osamaaftab.draw.views

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import com.osamaaftab.draw.R
import com.osamaaftab.draw.Utils.Companion.applyFilter
import com.osamaaftab.draw.Utils.Companion.drawableToBitmap
import jp.co.cyberagent.android.gpuimage.filter.*

class ShapDrawableFilterView(context: Context?) : View(context) {
    @SuppressLint("DrawAllocation")
    public override fun onDraw(canvas: Canvas) {
        val width = width
        val height = height
        val sphereFilter = GPUImageSepiaToneFilter()
        val falseColorFilter = GPUImageFalseColorFilter()
        drawShape(50, 50, width / 2 - 25, height / 2 - 25, canvas, falseColorFilter)
        drawShape(width / 2 + 25, 50, width - 50, height / 2 - 25, canvas, sphereFilter)
        drawShape(50, height / 2 + 25, width / 2 - 25, height - 50, canvas, falseColorFilter)
        drawShape(width / 2 + 25, height / 2 + 25, width - 50, height - 50, canvas, sphereFilter)
    }

    private fun drawShape(
        left: Int,
        top: Int,
        right: Int,
        bottom: Int,
        canvas: Canvas,
        filter: GPUImageFilter
    ) {
        val rectangle = Rect(left, top, right, bottom)
        val drawable = resources.getDrawable(R.drawable.place_holder)
        drawable.bounds = rectangle
        var bitmap = drawableToBitmap(drawable)
        bitmap = applyFilter(bitmap, filter, context)
        canvas.drawBitmap(bitmap, null, rectangle, null)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(800, 800) //fixed the size of canvas to 800 x 800
    }
}