package cn.mtjsoft.www.shapeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import cn.mtjsoft.www.shapeview.imp.BuilderImp;
import cn.mtjsoft.www.shapeview.util.GradientDrawableUtil;

/**
 * 实现自定义圆角背景
 */
public class ShapeTextView extends AppCompatTextView {
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

    public ShapeTextView(Context context) {
        this(context, null);
    }

    public ShapeTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        setCustomBackground();
    }

    /**
     * 初始化参数
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
        ta.recycle();
    }

    public static class Builder implements BuilderImp {
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

        private boolean openSelector;

        private int textNormalColor;

        private int textSelectColor;

        private int solidSelectColor;

        private int strokeSelectColor;

        public Builder() {
        }

        @Override
        public BuilderImp setSolidColor(int solidColor) {
            this.solidColor = solidColor;
            return this;
        }

        @Override
        public BuilderImp setStrokeColor(int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        @Override
        public BuilderImp setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        @Override
        public BuilderImp setRadius(int radius) {
            this.radius = radius;
            return this;
        }

        @Override
        public BuilderImp setTopLeftRadius(int topLeftRadius) {
            this.topLeftRadius = topLeftRadius;
            return this;
        }

        @Override
        public BuilderImp setTopRightRadius(int topRightRadius) {
            this.topRightRadius = topRightRadius;
            return this;
        }

        @Override
        public BuilderImp setBottomLeftRadius(int bottomLeftRadius) {
            this.bottomLeftRadius = bottomLeftRadius;
            return this;
        }

        @Override
        public BuilderImp setBottomRightRadius(int bottomRightRadius) {
            this.bottomRightRadius = bottomRightRadius;
            return this;
        }

        @Override
        public BuilderImp setOpenSelector(boolean openSelector) {
            this.openSelector = openSelector;
            return this;
        }

        @Override
        public BuilderImp setTextNormalColor(int textNormalColor) {
            this.textNormalColor = textNormalColor;
            return this;
        }

        @Override
        public BuilderImp setTextSelectColor(int textSelectColor) {
            this.textSelectColor = textSelectColor;
            return this;
        }

        @Override
        public BuilderImp setSolidSelectColor(int solidSelectColor) {
            this.solidSelectColor = solidSelectColor;
            return this;
        }

        @Override
        public BuilderImp setStrokeSelectColor(int strokeSelectColor) {
            this.strokeSelectColor = strokeSelectColor;
            return this;
        }
    }

    public void setBuilder(Builder builder) {
        setCustomBackground();
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
        gradientDrawable = GradientDrawableUtil.init().getNeedDrawable(new float[] {
            topLeftRadius, topLeftRadius, topRightRadius, topRightRadius, bottomRightRadius, bottomRightRadius, bottomLeftRadius,
            bottomLeftRadius
        }, solidColor, strokeWidth, strokeColor);
        this.setBackground(gradientDrawable);
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
    }
}
