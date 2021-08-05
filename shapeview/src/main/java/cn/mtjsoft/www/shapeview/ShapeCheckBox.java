package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 */
public class ShapeCheckBox extends AppCompatCheckBox {

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

    public ShapeCheckBox(Context context) {
        this(context, null);
    }

    public ShapeCheckBox(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        //默认背景
        gradientDrawable = GradientDrawableUtil.init().getNeedDrawable(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius,
                        bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius},
                solidColor, strokeWidth, strokeColor);
        //如果设置了选中时的背景
        if (openSelector) {
            selectorDrawable = GradientDrawableUtil.init().getNeedDrawable(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius,
                            bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius},
                    solidSelectColor, strokeWidth, strokeSelectColor);
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
            ColorStateList textColorStateList = new ColorStateList(states, new int[]{textSelectColor, textNormalColor});
            this.setTextColor(textColorStateList);
        } else {
            this.setBackground(gradientDrawable);
        }
        this.setFocusable(false);
        this.setClickable(true);
    }

    /**
     * 初始化参数
     *
     * @param context
     * @param attrs
     */
    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ShapeCheckBox);
        // 填充以及边框
        solidColor = ta.getColor(R.styleable.ShapeCheckBox_solidColor, Color.TRANSPARENT);
        strokeColor = ta.getColor(R.styleable.ShapeCheckBox_strokeColor, Color.TRANSPARENT);
        strokeWidth = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_strokeWidth, 0);
        //四个角单独设置会覆盖radius设置
        radius = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_radius, 0);
        topLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_topLeftRadius, radius);
        topRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_topRightRadius, radius);
        bottomLeftRadius = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_bottomLeftRadius, radius);
        bottomRightRadius = ta.getDimensionPixelSize(R.styleable.ShapeCheckBox_bottomRightRadius, radius);
        //选择器
        openSelector = ta.getBoolean(R.styleable.ShapeCheckBox_openSelector, false);
        textNormalColor = ta.getColor(R.styleable.ShapeCheckBox_textNormalColor, Color.BLACK);
        textSelectColor = ta.getColor(R.styleable.ShapeCheckBox_textSelectColor, Color.RED);
        solidSelectColor = ta.getColor(R.styleable.ShapeCheckBox_solidSelectColor, Color.TRANSPARENT);
        strokeSelectColor = ta.getColor(R.styleable.ShapeCheckBox_strokeSelectColor, Color.TRANSPARENT);
        ta.recycle();
    }
}
