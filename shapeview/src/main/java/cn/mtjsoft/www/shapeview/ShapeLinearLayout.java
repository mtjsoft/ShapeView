package cn.mtjsoft.www.shapeview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 */
public class ShapeLinearLayout extends LinearLayout {

    //自定背景边框Drawable
    private GradientDrawable gradientDrawable;

    private CustomBuilder builder;

    public ShapeLinearLayout(Context context) {
        this(context, null);
    }

    public ShapeLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
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
        @SuppressLint("CustomViewStyleable")
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeLinearLayout);
        int shape = ta.getInt(R.styleable.ShapeLinearLayout_shape, GradientDrawable.RECTANGLE);
        if (shape > GradientDrawable.RING) {
            shape = GradientDrawable.RECTANGLE;
        }
        // 渐变
        int startColor = ta.getColor(R.styleable.ShapeLinearLayout_startColor, 0);
        int centerColor = ta.getColor(R.styleable.ShapeLinearLayout_centerColor, 0);
        int endColor = ta.getColor(R.styleable.ShapeLinearLayout_endColor, 0);
        int startSelectColor = ta.getColor(R.styleable.ShapeLinearLayout_startSelectColor, 0);
        int centerSelectColor = ta.getColor(R.styleable.ShapeLinearLayout_centerSelectColor, 0);
        int endSelectColor = ta.getColor(R.styleable.ShapeLinearLayout_endSelectColor, 0);
        int orientation = ta.getInt(R.styleable.ShapeLinearLayout_orientation, 6);
        if (orientation > 7) {
            orientation = 6;
        }
        int gradientType = ta.getInt(R.styleable.ShapeLinearLayout_gradientType, GradientDrawable.LINEAR_GRADIENT);
        if (gradientType > GradientDrawable.SWEEP_GRADIENT) {
            gradientType = GradientDrawable.LINEAR_GRADIENT;
        }
        float gradientRadius = ta.getFloat(R.styleable.ShapeLinearLayout_gradientRadius, 0);
        // 填充以及边框
        int solidColor = ta.getColor(R.styleable.ShapeLinearLayout_solidColor, Color.TRANSPARENT);
        int strokeColor = ta.getColor(R.styleable.ShapeLinearLayout_strokeColor, Color.TRANSPARENT);
        int strokeWidth = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_strokeWidth, 0);
        int dashWidth = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_dashWidth, 0);
        int dashGap = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_dashGap, 0);
        //四个角单独设置会覆盖radius设置
        int radius = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_radius, 0);
        int topLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_topLeftRadius, radius);
        int topRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_topRightRadius, radius);
        int bottomLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_bottomLeftRadius, radius);
        int bottomRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeLinearLayout_bottomRightRadius, radius);
        ta.recycle();
        setBuilder(new CustomBuilder()
                .setShape(shape)
                .setColors(startColor, centerColor, endColor)
                .setSelectColors(startSelectColor, centerSelectColor, endSelectColor)
                .setOrientationById(orientation)
                .setGradientType(gradientType)
                .setGradientRadius(gradientRadius)
                .setSolidColor(solidColor)
                .setStrokeColor(strokeColor)
                .setStrokeWidth(strokeWidth)
                .setDashWidth(dashWidth)
                .setDashGap(dashGap)
                .setRadius(radius)
                .setTopLeftRadius(topLeftRadius)
                .setTopRightRadius(topRightRadius)
                .setBottomLeftRadius(bottomLeftRadius)
                .setBottomRightRadius(bottomRightRadius)
        );
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
        //默认背景
        gradientDrawable = GradientDrawableUtil.init().getNormalDrawable(builder);
        this.setBackground(gradientDrawable);
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
    }
}
