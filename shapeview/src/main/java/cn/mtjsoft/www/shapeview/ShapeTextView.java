package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 实现自定义圆角背景
 */
public class ShapeTextView extends AppCompatTextView {

    //自定背景边框Drawable
    private GradientDrawable gradientDrawable;
    //选中时的Drawable
    private GradientDrawable selectorDrawable;
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
    // 是否使用选择器
    private boolean openSelector;
    // 未选中的字体颜色
    private int textNormalColor = Color.BLACK;
    // 选中的字体颜色
    private int textSelectColor = Color.RED;
    // 选中填充色
    private int solidSelectColor = 0;
    // 选中边框色
    private int strokeSelectColor = 0;

    public ShapeTextView(Context context) {
        this(context, null);
    }

    public ShapeTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        //默认背景
        gradientDrawable = getNeedDrawable(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius,
                        bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius},
                solidColor, strokeWidth, strokeColor);
        //如果设置了选中时的背景
        if (openSelector) {
            selectorDrawable = getNeedDrawable(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius,
                            bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius},
                    solidSelectColor, strokeWidth, strokeSelectColor);
            //动态生成Selector
            StateListDrawable stateListDrawable = new StateListDrawable();
            //是否选中
            int checked = android.R.attr.state_checked;
            stateListDrawable.addState(new int[]{checked}, selectorDrawable);
            stateListDrawable.addState(new int[]{}, gradientDrawable);
            setBackgroundDrawable(stateListDrawable);
        } else {
            setBackgroundDrawable(gradientDrawable);
        }
    }

    /**
     * 初始化参数
     *
     * @param context
     * @param attrs
     */
    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeTextView);
        // 填充以及边框
        solidColor = ta.getColor(R.styleable.ShapeTextView_solidColor, Color.TRANSPARENT);
        strokeColor = ta.getColor(R.styleable.ShapeTextView_strokeColor, Color.TRANSPARENT);
        strokeWidth = ta.getDimensionPixelSize(R.styleable.ShapeTextView_strokeWidth, 0);
        //四个角单独设置会覆盖radius设置
        radius = ta.getDimensionPixelSize(R.styleable.ShapeTextView_radius, 0);
        topLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeTextView_topLeftRadius, radius);
        topRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeTextView_topRightRadius, radius);
        bottomLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeTextView_bottomLeftRadius, radius);
        bottomRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeTextView_bottomRightRadius, radius);
        //选择器
        openSelector = ta.getBoolean(R.styleable.ShapeTextView_openSelector, false);
        textNormalColor = ta.getColor(R.styleable.ShapeTextView_textNormalColor, Color.BLACK);
        textSelectColor = ta.getColor(R.styleable.ShapeTextView_textSelectColor, Color.RED);
        solidSelectColor = ta.getColor(R.styleable.ShapeTextView_solidSelectColor, Color.TRANSPARENT);
        strokeSelectColor = ta.getColor(R.styleable.ShapeTextView_strokeSelectColor, Color.TRANSPARENT);
        ta.recycle();
    }

    /**
     * @param radius      四个角的半径
     * @param colors      渐变的颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    public static GradientDrawable getNeedDrawable(float[] radius, int[] colors, int strokeWidth, int strokeColor) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setCornerRadii(radius);
        drawable.setColors(colors);
        drawable.setStroke(strokeWidth, strokeColor);
        drawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);
        return drawable;
    }

    /**
     * @param radius      四个角的半径
     * @param bgColor     背景颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    public static GradientDrawable getNeedDrawable(float[] radius, int bgColor, int strokeWidth, int strokeColor) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadii(radius);
        drawable.setStroke(strokeWidth, strokeColor);
        drawable.setColor(bgColor);
        return drawable;
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
    public static GradientDrawable getNeedDrawable(float[] radius, int bgColor, int strokeWidth, int strokeColor, float dashWidth, float dashGap) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadii(radius);
        drawable.setStroke(strokeWidth, strokeColor, dashWidth, dashGap);
        drawable.setColor(bgColor);
        return drawable;
    }
}
