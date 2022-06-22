package cn.mtjsoft.www.shapeview.imp

import android.graphics.drawable.GradientDrawable
import cn.mtjsoft.www.shapeview.builder.CustomBuilder
import cn.mtjsoft.www.shapeview.builder.CustomBuilder.GradientType

/**
 * @author mtj
 * @date 2022/1/13
 * @desc
 * @email mtjsoft3@gmail.com
 */
interface BuilderImp {
    fun setShape(@CustomBuilder.Shape shape: Int): BuilderImp
    fun setSolidColor(solidColor: Int): BuilderImp
    fun setStrokeColor(strokeColor: Int): BuilderImp
    fun setColors(startColor: Int, centerColor: Int, endColor: Int): BuilderImp
    fun setSelectColors(startColor: Int, centerColor: Int, endColor: Int): BuilderImp
    fun setOrientation(orientation: GradientDrawable.Orientation): BuilderImp
    fun setGradientType(@GradientType gradientType: Int): BuilderImp
    fun setGradientRadius(gradientRadius: Float): BuilderImp
    fun setStrokeWidth(strokeWidth: Int): BuilderImp
    fun setDashWidth(dashWidth: Float): BuilderImp
    fun setDashGap(dashGap: Float): BuilderImp
    fun setRadius(radius: Int): BuilderImp
    fun setTopLeftRadius(topLeftRadius: Int): BuilderImp
    fun setTopRightRadius(topRightRadius: Int): BuilderImp
    fun setBottomLeftRadius(bottomLeftRadius: Int): BuilderImp
    fun setBottomRightRadius(bottomRightRadius: Int): BuilderImp
    fun setOpenSelector(openSelector: Boolean): BuilderImp
    fun setTextNormalColor(textNormalColor: Int): BuilderImp
    fun setTextSelectColor(textSelectColor: Int): BuilderImp
    fun setSolidSelectColor(solidSelectColor: Int): BuilderImp
    fun setStrokeSelectColor(strokeSelectColor: Int): BuilderImp
}