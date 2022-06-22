package cn.mtjsoft.www.shapeview.builder

import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.View
import androidx.annotation.IntDef
import cn.mtjsoft.www.shapeview.imp.BuilderImp
import cn.mtjsoft.www.shapeview.imp.IStyleable

class CustomBuilder : BuilderImp {
    private lateinit var mView: View

    /**
     * GET
     */
    @Shape
    var shape = GradientDrawable.RECTANGLE
        private set

    //填充色
    var solidColor = 0
        private set

    //边框色
    var strokeColor = 0
        private set

    //渐变开始颜色
    var startColor = 0
        private set

    //渐变中间色
    var centerColor = 0
        private set

    //渐变结束色
    var endColor = 0
        private set

    //openSelector开启时，选中时的渐变颜色
    var startSelectColor = 0
        private set
    var centerSelectColor = 0
        private set
    var endSelectColor = 0
        private set

    //渐变方向
    var orientation: GradientDrawable.Orientation = GradientDrawable.Orientation.LEFT_RIGHT
        private set

    //渐变类型 支持 线性渐变，放射性渐变，扫描式渐变
    @GradientType
    var gradientType = GradientDrawable.LINEAR_GRADIENT
        private set

    //渐变半径. 只有当渐变类型设置为 RADIAL_GRADIENT  时，半径才有效。
    var gradientRadius = 0f
        private set

    //边框宽度
    var strokeWidth = 0
        private set

    //虚线边框宽度
    var dashWidth = 0f
        private set

    //虚线边框间隙
    var dashGap = 0f
        private set

    //四个角的弧度
    var radius = 0
        private set
    var topLeftRadius = radius
        private set
    var topRightRadius = radius
        private set
    var bottomLeftRadius = radius
        private set
    var bottomRightRadius = radius
        private set

    // 是否使用选择器
    var isOpenSelector = false
        private set

    // 未选中的字体颜色
    var textNormalColor = Color.BLACK
        private set

    // 选中的字体颜色
    var textSelectColor = Color.RED
        private set

    // 选中填充色
    var solidSelectColor = 0
        private set

    // 选中边框色
    var strokeSelectColor = 0
        private set

    @IntDef(
        GradientDrawable.LINEAR_GRADIENT,
        GradientDrawable.RADIAL_GRADIENT,
        GradientDrawable.SWEEP_GRADIENT
    )
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    annotation class GradientType

    @IntDef(
        GradientDrawable.RECTANGLE,
        GradientDrawable.OVAL,
        GradientDrawable.LINE,
        GradientDrawable.RING
    )
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    annotation class Shape {}

    constructor()
    constructor(view: View, ta: TypedArray, styleable: IStyleable) {
        mView = view
        shape = ta.getInt(styleable.shape, GradientDrawable.RECTANGLE)
        if (shape > GradientDrawable.RING) {
            shape = GradientDrawable.RECTANGLE
        }
        // 渐变
        startColor = ta.getColor(styleable.startColor, 0)
        centerColor = ta.getColor(styleable.centerColor, 0)
        endColor = ta.getColor(styleable.endColor, 0)
        startSelectColor = ta.getColor(styleable.startSelectColor, 0)
        centerSelectColor = ta.getColor(styleable.centerSelectColor, 0)
        endSelectColor = ta.getColor(styleable.endSelectColor, 0)
        var orientation = ta.getInt(styleable.orientation, 6)
        if (orientation > 7) {
            orientation = 6
        }
        setOrientationById(orientation)
        gradientType = ta.getInt(styleable.gradientType, GradientDrawable.LINEAR_GRADIENT)
        if (gradientType > GradientDrawable.SWEEP_GRADIENT) {
            gradientType = GradientDrawable.LINEAR_GRADIENT
        }
        gradientRadius = ta.getFloat(styleable.gradientRadius, 0f)
        // 填充以及边框
        solidColor = ta.getColor(styleable.solidColor, Color.TRANSPARENT)
        strokeColor = ta.getColor(styleable.strokeColor, Color.TRANSPARENT)
        strokeWidth = ta.getDimensionPixelSize(styleable.strokeWidth, 0)
        dashWidth = ta.getDimensionPixelSize(styleable.dashWidth, 0).toFloat()
        dashGap = ta.getDimensionPixelSize(styleable.dashGap, 0).toFloat()
        // 四个角单独设置会覆盖radius设置
        radius = ta.getDimensionPixelSize(styleable.radius, 0)
        topLeftRadius = ta.getDimensionPixelSize(styleable.topLeftRadius, radius)
        topRightRadius = ta.getDimensionPixelSize(styleable.topRightRadius, radius)
        bottomLeftRadius = ta.getDimensionPixelSize(styleable.bottomLeftRadius, radius)
        bottomRightRadius = ta.getDimensionPixelSize(styleable.bottomRightRadius, radius)
        // 选择器
        isOpenSelector = ta.getBoolean(styleable.isOpenSelector, false)
        if (isOpenSelector) {
            textNormalColor = ta.getColor(styleable.textNormalColor, Color.BLACK)
            textSelectColor = ta.getColor(styleable.textSelectColor, Color.RED)
            solidSelectColor = ta.getColor(styleable.solidSelectColor, Color.TRANSPARENT)
            strokeSelectColor = ta.getColor(styleable.strokeSelectColor, Color.TRANSPARENT)
        }
        ta.recycle()
    }

    fun setLayerType(view: View) {
        mView = view
        // 有虚线，需要关闭硬件加速
        if (dashWidth > 0 && dashGap > 0) {
            // 需要关闭硬件加速，否则虚线或者阴影在某些手机上面无法生效
            mView.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        }
    }

    override fun setShape(@Shape shape: Int): CustomBuilder {
        this.shape = shape
        return this
    }

    override fun setSolidColor(solidColor: Int): CustomBuilder {
        this.solidColor = solidColor
        return this
    }

    override fun setStrokeColor(strokeColor: Int): CustomBuilder {
        this.strokeColor = strokeColor
        return this
    }

    override fun setColors(startColor: Int, centerColor: Int, endColor: Int): CustomBuilder {
        this.startColor = startColor
        this.centerColor = centerColor
        this.endColor = endColor
        return this
    }

    override fun setSelectColors(startColor: Int, centerColor: Int, endColor: Int): CustomBuilder {
        startSelectColor = startColor
        centerSelectColor = centerColor
        endSelectColor = endColor
        return this
    }

    override fun setOrientation(orientation: GradientDrawable.Orientation): CustomBuilder {
        this.orientation = orientation
        return this
    }

    private fun setOrientationById(orientation: Int): CustomBuilder {
        when (orientation) {
            0 -> this.orientation = GradientDrawable.Orientation.TOP_BOTTOM
            1 -> this.orientation = GradientDrawable.Orientation.TR_BL
            2 -> this.orientation = GradientDrawable.Orientation.RIGHT_LEFT
            3 -> this.orientation = GradientDrawable.Orientation.BR_TL
            4 -> this.orientation = GradientDrawable.Orientation.BOTTOM_TOP
            5 -> this.orientation = GradientDrawable.Orientation.BL_TR
            7 -> this.orientation = GradientDrawable.Orientation.TL_BR
            else -> this.orientation = GradientDrawable.Orientation.LEFT_RIGHT
        }
        return this
    }

    override fun setGradientType(@GradientType gradientType: Int): CustomBuilder {
        this.gradientType = gradientType
        return this
    }

    override fun setGradientRadius(gradientRadius: Float): CustomBuilder {
        this.gradientRadius = gradientRadius
        return this
    }

    override fun setStrokeWidth(strokeWidth: Int): CustomBuilder {
        this.strokeWidth = strokeWidth
        return this
    }

    override fun setDashWidth(dashWidth: Float): CustomBuilder {
        this.dashWidth = dashWidth
        return this
    }

    override fun setDashGap(dashGap: Float): CustomBuilder {
        this.dashGap = dashGap
        return this
    }

    override fun setRadius(radius: Int): CustomBuilder {
        this.radius = radius
        return this
    }

    override fun setTopLeftRadius(topLeftRadius: Int): CustomBuilder {
        this.topLeftRadius = topLeftRadius
        return this
    }

    override fun setTopRightRadius(topRightRadius: Int): CustomBuilder {
        this.topRightRadius = topRightRadius
        return this
    }

    override fun setBottomLeftRadius(bottomLeftRadius: Int): CustomBuilder {
        this.bottomLeftRadius = bottomLeftRadius
        return this
    }

    override fun setBottomRightRadius(bottomRightRadius: Int): CustomBuilder {
        this.bottomRightRadius = bottomRightRadius
        return this
    }

    override fun setOpenSelector(openSelector: Boolean): CustomBuilder {
        isOpenSelector = openSelector
        return this
    }

    override fun setTextNormalColor(textNormalColor: Int): CustomBuilder {
        this.textNormalColor = textNormalColor
        return this
    }

    override fun setTextSelectColor(textSelectColor: Int): CustomBuilder {
        this.textSelectColor = textSelectColor
        return this
    }

    override fun setSolidSelectColor(solidSelectColor: Int): CustomBuilder {
        this.solidSelectColor = solidSelectColor
        return this
    }

    override fun setStrokeSelectColor(strokeSelectColor: Int): CustomBuilder {
        this.strokeSelectColor = strokeSelectColor
        return this
    }
}