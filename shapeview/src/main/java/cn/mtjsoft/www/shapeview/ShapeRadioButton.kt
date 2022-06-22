package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;
import cn.mtjsoft.www.shapeview.builder.CustomBuilder;
import cn.mtjsoft.www.shapeview.styleable.ShapeRadioButtonStyleable;
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 */
public class ShapeRadioButton extends AppCompatRadioButton {

    //自定背景边框Drawable
    private GradientDrawable gradientDrawable;
    //选中时的Drawable
    private GradientDrawable selectorDrawable;

    private CustomBuilder builder;

    private static final ShapeRadioButtonStyleable STYLEABLE = new ShapeRadioButtonStyleable();

    public ShapeRadioButton(Context context) {
        this(context, null);
    }

    public ShapeRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    /**
     * 初始化参数
     *
     * @param context
     * @param attrs
     */
    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeRadioButton);
        builder = new CustomBuilder(this, ta, STYLEABLE);
        setCustomBackground();
    }

    public void setBuilder(CustomBuilder builder) {
        this.builder = builder;
        setCustomBackground();
    }

    public CustomBuilder getBuilder() {
        return builder;
    }

    public GradientDrawable getGradientDrawable() {
        return gradientDrawable;
    }

    public GradientDrawable getSelectorDrawable() {
        return selectorDrawable;
    }

    private void setCustomBackground() {
        if (builder == null) {
            return;
        }
        builder.setLayerType(this);
        gradientDrawable = GradientDrawableUtil.init().getNormalDrawable(builder);
        //如果设置了选中时的背景
        if (builder.isOpenSelector()) {
            selectorDrawable = GradientDrawableUtil.init().getSelectorDrawable(builder);
            //动态生成Selector
            StateListDrawable stateListDrawable = new StateListDrawable();
            //是否选中
            int checked = android.R.attr.state_checked;
            stateListDrawable.addState(new int[]{checked}, selectorDrawable);
            stateListDrawable.addState(new int[]{}, gradientDrawable);
            // 设置背景色
            this.setBackground(stateListDrawable);
            int[][] states = new int[2][];
            states[0] = new int[]{android.R.attr.state_checked};
            states[1] = new int[]{};
            ColorStateList textColorStateList = new ColorStateList(states, new int[]{builder.getTextSelectColor(), builder.getTextNormalColor()});
            this.setTextColor(textColorStateList);
        } else {
            this.setBackground(gradientDrawable);
        }
        this.setFocusable(false);
        this.setClickable(true);
    }
}
