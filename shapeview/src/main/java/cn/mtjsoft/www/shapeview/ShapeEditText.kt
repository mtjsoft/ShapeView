package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;
import cn.mtjsoft.www.shapeview.builder.CustomBuilder;
import cn.mtjsoft.www.shapeview.styleable.ShapeEditTextStyleable;
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 *
 * @author mtj
 */
public class ShapeEditText extends AppCompatEditText {
    /**
     * 自定背景Drawable
     */
    private GradientDrawable gradientDrawable;

    private CustomBuilder builder;

    private static final ShapeEditTextStyleable STYLEABLE = new ShapeEditTextStyleable();

    public ShapeEditText(Context context) {
        this(context, null);
    }

    public ShapeEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    /**
     * 初始化参数
     */
    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeEditText);
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

    private void setCustomBackground() {
        if (builder == null) {
            return;
        }
        builder.setLayerType(this);
        gradientDrawable = GradientDrawableUtil.init().getNormalDrawable(builder);
        this.setBackground(gradientDrawable);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
    }
}
