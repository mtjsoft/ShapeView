package cn.mtjsoft.www.shapeview.util

import android.graphics.drawable.GradientDrawable
import cn.mtjsoft.www.shapeview.builder.CustomBuilder
import cn.mtjsoft.www.shapeview.builder.CustomBuilder.GradientType

class GradientDrawableUtil {
    /**
     * @param radius      四个角的半径
     * @param colors      渐变的颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    private fun getNeedDrawable(
        @CustomBuilder.Shape shape: Int,
        radius: FloatArray,
        colors: IntArray,
        strokeWidth: Int,
        strokeColor: Int,
        dashWidth: Float,
        dashGap: Float,
        orientation: GradientDrawable.Orientation,
        @GradientType gradient: Int,
        gradientRadius: Float
    ): GradientDrawable {
        val drawable = GradientDrawable()
        drawable.setDither(true)
        drawable.shape = shape
        drawable.cornerRadii = radius
        if (strokeWidth > 0) {
            if (dashWidth <= 0 || dashGap <= 0) {
                drawable.setStroke(strokeWidth, strokeColor)
            } else {
                drawable.setStroke(strokeWidth, strokeColor, dashWidth, dashGap)
            }
        }
        drawable.orientation = orientation
        drawable.colors = colors
        drawable.gradientType = gradient
        if (gradient == GradientDrawable.RADIAL_GRADIENT) {
            drawable.gradientRadius = gradientRadius
        }
        return drawable
    }

    /**
     * @param radius      四个角的半径
     * @param bgColor     背景颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    private fun getNeedDrawable(
        @CustomBuilder.Shape shape: Int,
        radius: FloatArray,
        bgColor: Int,
        strokeWidth: Int,
        strokeColor: Int
    ): GradientDrawable {
        val drawable = GradientDrawable()
        drawable.shape = shape
        drawable.cornerRadii = radius
        drawable.setStroke(strokeWidth, strokeColor)
        drawable.setColor(bgColor)
        return drawable
    }

    /**
     * @param radius      四个角的半径
     * @param bgColor     背景颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @param dashWidth   虚线边框宽度
     * @param dashGap     虚线边框间隙
     * @return
     */
    private fun getNeedDrawable(
        @CustomBuilder.Shape shape: Int,
        radius: FloatArray,
        bgColor: Int,
        strokeWidth: Int,
        strokeColor: Int,
        dashWidth: Float,
        dashGap: Float
    ): GradientDrawable {
        if (dashWidth <= 0 || dashGap <= 0) {
            return getNeedDrawable(shape, radius, bgColor, strokeWidth, strokeColor)
        }
        val drawable = GradientDrawable()
        drawable.shape = shape
        drawable.cornerRadii = radius
        drawable.setStroke(strokeWidth, strokeColor, dashWidth, dashGap)
        drawable.setColor(bgColor)
        return drawable
    }

    /**
     * 获取常规 圆角 背景
     *
     * @param builder
     * @return
     */
    fun getNormalDrawable(builder: CustomBuilder): GradientDrawable {
        // 渐变色
        if (builder.startColor != 0 && builder.endColor != 0) {
            var size = 2
            if (builder.centerColor != 0) {
                size = 3
            }
            val colors = IntArray(size)
            colors[0] = builder.startColor
            if (size == 3) {
                colors[1] = builder.centerColor
                colors[2] = builder.endColor
            } else {
                colors[1] = builder.endColor
            }
            return getNeedDrawable(
                builder.shape,
                floatArrayOf(
                    builder.topLeftRadius.toFloat(),
                    builder.topLeftRadius.toFloat(),
                    builder.topRightRadius.toFloat(),
                    builder.topRightRadius.toFloat(),
                    builder.bottomRightRadius.toFloat(),
                    builder.bottomRightRadius.toFloat(),
                    builder.bottomLeftRadius.toFloat(),
                    builder.bottomLeftRadius.toFloat()
                ),
                colors,
                builder.strokeWidth,
                builder.strokeColor,
                builder.dashWidth,
                builder.dashGap,
                builder.orientation,
                builder.gradientType,
                builder.gradientRadius
            )
        }
        // 常规
        return getNeedDrawable(
            builder.shape,
            floatArrayOf(
                builder.topLeftRadius.toFloat(),
                builder.topLeftRadius.toFloat(),
                builder.topRightRadius.toFloat(),
                builder.topRightRadius.toFloat(),
                builder.bottomRightRadius.toFloat(),
                builder.bottomRightRadius.toFloat(),
                builder.bottomLeftRadius.toFloat(),
                builder.bottomLeftRadius.toFloat()
            ),
            builder.solidColor,
            builder.strokeWidth,
            builder.strokeColor,
            builder.dashWidth,
            builder.dashGap
        )
    }

    /**
     * 获取选中状态 圆角 背景
     *
     * @param builder
     * @return
     */
    fun getSelectorDrawable(builder: CustomBuilder): GradientDrawable {
        // 渐变色
        if (builder.startSelectColor != 0 && builder.endSelectColor != 0) {
            var size = 2
            if (builder.centerSelectColor != 0) {
                size = 3
            }
            val colors = IntArray(size)
            colors[0] = builder.startSelectColor
            if (size == 3) {
                colors[1] = builder.centerSelectColor
                colors[2] = builder.endSelectColor
            } else {
                colors[1] = builder.endSelectColor
            }
            return getNeedDrawable(
                builder.shape,
                floatArrayOf(
                    builder.topLeftRadius.toFloat(),
                    builder.topLeftRadius.toFloat(),
                    builder.topRightRadius.toFloat(),
                    builder.topRightRadius.toFloat(),
                    builder.bottomRightRadius.toFloat(),
                    builder.bottomRightRadius.toFloat(),
                    builder.bottomLeftRadius.toFloat(),
                    builder.bottomLeftRadius.toFloat()
                ),
                colors,
                builder.strokeWidth,
                builder.strokeColor,
                builder.dashWidth,
                builder.dashGap,
                builder.orientation,
                builder.gradientType,
                builder.gradientRadius
            )
        }
        return getNeedDrawable(
            builder.shape,
            floatArrayOf(
                builder.topLeftRadius.toFloat(),
                builder.topLeftRadius.toFloat(),
                builder.topRightRadius.toFloat(),
                builder.topRightRadius.toFloat(),
                builder.bottomRightRadius.toFloat(),
                builder.bottomRightRadius.toFloat(),
                builder.bottomLeftRadius.toFloat(),
                builder.bottomLeftRadius.toFloat()
            ),
            builder.solidSelectColor,
            builder.strokeWidth,
            builder.strokeSelectColor,
            builder.dashWidth,
            builder.dashGap
        )
    }

    companion object {
        private val gradientDrawableUtil: GradientDrawableUtil by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            GradientDrawableUtil()
        }

        @JvmStatic
        fun init(): GradientDrawableUtil {
            return gradientDrawableUtil
        }
    }
}