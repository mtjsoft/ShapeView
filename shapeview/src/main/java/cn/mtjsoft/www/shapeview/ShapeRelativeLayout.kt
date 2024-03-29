package cn.mtjsoft.www.shapeview

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.RelativeLayout
import cn.mtjsoft.www.shapeview.builder.CustomBuilder
import cn.mtjsoft.www.shapeview.styleable.ShapeRelativeLayoutStyleable
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil.Companion.init

/**
 * 实现自定义圆角背景
 */
class ShapeRelativeLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {
    //自定背景边框Drawable
    var gradientDrawable: GradientDrawable? = null
        private set
    private lateinit var builder: CustomBuilder

    /**
     * 初始化参数
     */
    private fun init(context: Context, attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeRelativeLayout)
        builder = CustomBuilder(this, ta, STYLEABLE)
        setCustomBackground()
    }

    fun setBuilder(builder: CustomBuilder) {
        this.builder = builder
        setCustomBackground()
    }

    fun getBuilder(): CustomBuilder {
        return builder
    }

    private fun setCustomBackground() {
        builder.setLayerType(this)
        gradientDrawable = init().getNormalDrawable(builder)
        this.background = gradientDrawable
        this.isFocusable = false
        this.isFocusableInTouchMode = false
    }

    companion object {
        private val STYLEABLE = ShapeRelativeLayoutStyleable()
    }

    init {
        init(context, attrs)
    }
}