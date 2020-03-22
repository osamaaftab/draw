package com.osamaaftab.draw.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class ShapeView(context: Context?) : View(context) {

   private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        val width = width
        val height = height
        paint.color = Color.BLACK
        paint.strokeWidth = 1f
        paint.style = Paint.Style.STROKE

        canvas.drawRect(50f, 50f, width / 2 - 25.toFloat(), height / 2 - 25.toFloat(), paint)
        canvas.drawRect(width / 2 + 25.toFloat(), 50f, width - 50.toFloat(), height / 2 - 25.toFloat(), paint)
        canvas.drawRect(50f, height / 2 + 25.toFloat(), width / 2 - 25.toFloat(), height - 50.toFloat(), paint)
        canvas.drawRect(width / 2 + 25.toFloat(), height / 2 + 25.toFloat(), width - 50.toFloat(), height - 50.toFloat(), paint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(800, 800)
    }
}