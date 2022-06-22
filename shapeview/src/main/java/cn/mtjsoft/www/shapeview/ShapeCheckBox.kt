package cn.mtjsoft.www.shapeview

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatCheckBox
import cn.mtjsoft.www.shapeview.builder.CustomBuilder
import cn.mtjsoft.www.shapeview.styleable.ShapeCheckBoxStyleable
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil.Companion.init

/**
 * 实现自定义圆角背景
 */
class ShapeCheckBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : AppCompatCheckBox(context, attrs, defStyleAttr) {
    //自定背景边框Drawable
    var gradientDrawable: GradientDrawable? = null
        private set

    //选中时的Drawable
    var selectorDrawable: GradientDrawable? = null
        private set
    private lateinit var builder: CustomBuilder

    /**
     * 初始化参数
     */
    private fun init(context: Context, attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeCheckBox)
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
        //如果设置了选中时的背景
        if (builder.isOpenSelector) {
            selectorDrawable = init().getSelectorDrawable(builder)
            //动态生成Selector
            val stateListDrawable = StateListDrawable()
            //是否选中
            val checked = android.R.attr.state_checked
            stateListDrawable.addState(intArrayOf(checked), selectorDrawable)
            stateListDrawable.addState(intArrayOf(), gradientDrawable)
            // 设置背景色
            this.background = stateListDrawable
            val states = arrayOfNulls<IntArray>(2)
            states[0] = intArrayOf(android.R.attr.state_checked)
            states[1] = intArrayOf()
            val textColorStateList = ColorStateList(
                states,
                intArrayOf(builder.textSelectColor, builder.textNormalColor)
            )
            this.setTextColor(textColorStateList)
        } else {
            this.background = gradientDrawable
        }
        this.isFocusable = false
        this.isClickable = true
    }

    companion object {
        private val STYLEABLE = ShapeCheckBoxStyleable()
    }

    init {
        init(context, attrs)
    }
}