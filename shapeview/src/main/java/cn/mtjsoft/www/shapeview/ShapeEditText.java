package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 */
public class ShapeEditText extends AppCompatEditText {

    //自定背景边框Drawable
    private GradientDrawable gradientDrawable;
    //填充色
    private int solidColor = 0;
    //边框色
    private int strokeColor = 0;
    //边框宽度
    private int strokeWidth = 0;
    //四个角的弧度
    private int radius;
    private int topLeftRadius;
    private int topRightRadius;
    private int bottomLeftRadius;
    private int bottomRightRadius;

    public ShapeEditText(Context context) {
        this(context, null);
    }

    public ShapeEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        //默认背景
        setCustomBackground();
    }

    /**
     * 初始化参数
     *
     * @param context
     * @param attrs
     */
    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeEditText);
        // 填充以及边框
        solidColor = ta.getColor(R.styleable.ShapeEditText_solidColor, Color.TRANSPARENT);
        strokeColor = ta.getColor(R.styleable.ShapeEditText_strokeColor, Color.TRANSPARENT);
        strokeWidth = ta.getDimensionPixelSize(R.styleable.ShapeEditText_strokeWidth, 0);
        //四个角单独设置会覆盖radius设置
        radius = ta.getDimensionPixelSize(R.styleable.ShapeEditText_radius, 0);
        topLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeEditText_topLeftRadius, radius);
        topRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeEditText_topRightRadius, radius);
        bottomLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeEditText_bottomLeftRadius, radius);
        bottomRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeEditText_bottomRightRadius, radius);
        ta.recycle();
    }

    public void setSolidColor(int solidColor) {
        this.solidColor = solidColor;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setTopLeftRadius(int topLeftRadius) {
        this.topLeftRadius = topLeftRadius;
    }

    public void setTopRightRadius(int topRightRadius) {
        this.topRightRadius = topRightRadius;
    }

    public void setBottomLeftRadius(int bottomLeftRadius) {
        this.bottomLeftRadius = bottomLeftRadius;
    }

    public void setBottomRightRadius(int bottomRightRadius) {
        this.bottomRightRadius = bottomRightRadius;
    }

    public void setCustomBackground() {
        //默认背景
        gradientDrawable = GradientDrawableUtil.init().getNeedDrawable(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius,
                        bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius},
                solidColor, strokeWidth, strokeColor);
        this.setBackground(gradientDrawable);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
    }
}
