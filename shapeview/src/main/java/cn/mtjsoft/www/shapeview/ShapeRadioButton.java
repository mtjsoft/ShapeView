package cn.mtjsoft.www.shapeview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;
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
        @SuppressLint("CustomViewStyleable")
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeRadioButton);
        int shape = ta.getInt(R.styleable.ShapeRadioButton_shape, GradientDrawable.RECTANGLE);
        if (shape > GradientDrawable.RING) {
            shape = GradientDrawable.RECTANGLE;
        }
        // 渐变
        int startColor = ta.getColor(R.styleable.ShapeRadioButton_startColor, 0);
        int centerColor = ta.getColor(R.styleable.ShapeRadioButton_centerColor, 0);
        int endColor = ta.getColor(R.styleable.ShapeRadioButton_endColor, 0);
        int startSelectColor = ta.getColor(R.styleable.ShapeRadioButton_startSelectColor, 0);
        int centerSelectColor = ta.getColor(R.styleable.ShapeRadioButton_centerSelectColor, 0);
        int endSelectColor = ta.getColor(R.styleable.ShapeRadioButton_endSelectColor, 0);
        int orientation = ta.getInt(R.styleable.ShapeRadioButton_orientation, 6);
        if (orientation > 7) {
            orientation = 6;
        }
        int gradientType = ta.getInt(R.styleable.ShapeRadioButton_gradientType, GradientDrawable.LINEAR_GRADIENT);
        if (gradientType > GradientDrawable.SWEEP_GRADIENT) {
            gradientType = GradientDrawable.LINEAR_GRADIENT;
        }
        float gradientRadius = ta.getFloat(R.styleable.ShapeRadioButton_gradientRadius, 0);
        // 填充以及边框
        int solidColor = ta.getColor(R.styleable.ShapeRadioButton_solidColor, Color.TRANSPARENT);
        int strokeColor = ta.getColor(R.styleable.ShapeRadioButton_strokeColor, Color.TRANSPARENT);
        int strokeWidth = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_strokeWidth, 0);
        int dashWidth = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_dashWidth, 0);
        int dashGap = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_dashGap, 0);
        //四个角单独设置会覆盖radius设置
        int radius = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_radius, 0);
        int topLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_topLeftRadius, radius);
        int topRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_topRightRadius, radius);
        int bottomLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_bottomLeftRadius, radius);
        int bottomRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeRadioButton_bottomRightRadius, radius);
        //选择器
        boolean openSelector = ta.getBoolean(R.styleable.ShapeRadioButton_openSelector, false);
        int textNormalColor = ta.getColor(R.styleable.ShapeRadioButton_textNormalColor, Color.BLACK);
        int textSelectColor = ta.getColor(R.styleable.ShapeRadioButton_textSelectColor, Color.RED);
        int solidSelectColor = ta.getColor(R.styleable.ShapeRadioButton_solidSelectColor, Color.TRANSPARENT);
        int strokeSelectColor = ta.getColor(R.styleable.ShapeRadioButton_strokeSelectColor, Color.TRANSPARENT);
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
                .setOpenSelector(openSelector)
                .setTextNormalColor(textNormalColor)
                .setTextSelectColor(textSelectColor)
                .setSolidSelectColor(solidSelectColor)
                .setStrokeSelectColor(strokeSelectColor)
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

    public GradientDrawable getSelectorDrawable() {
        return selectorDrawable;
    }

    private void setCustomBackground() {
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
