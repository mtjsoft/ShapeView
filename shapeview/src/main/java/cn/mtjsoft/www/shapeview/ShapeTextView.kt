package cn.mtjsoft.www.shapeview

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import cn.mtjsoft.www.shapeview.builder.CustomBuilder
import cn.mtjsoft.www.shapeview.styleable.ShapeTextViewStyleable
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil.Companion.init

/**
 * 实现自定义圆角背景
 */
class ShapeTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {
    //自定背景边框Drawable
    var gradientDrawable: GradientDrawable? = null
        private set
    private lateinit var builder: CustomBuilder

    /**
     * 初始化参数
     */
    private fun init(context: Context, attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeTextView)
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
        private val STYLEABLE = ShapeTextViewStyleable()
    }

    init {
        init(context, attrs)
    }
}