package cn.mtjsoft.www.shapeview;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;
import cn.mtjsoft.www.shapeview.imp.BuilderImp;


public class CustomBuilder implements BuilderImp {


    @Shape
    private int shape = GradientDrawable.RECTANGLE;

    //填充色
    private int solidColor = 0;
    //边框色
    private int strokeColor = 0;

    //渐变开始颜色
    private int startColor = 0;
    //渐变中间色
    private int centerColor = 0;
    //渐变结束色
    private int endColor = 0;
    //openSelector开启时，选中时的渐变颜色
    private int startSelectColor = 0;
    private int centerSelectColor = 0;
    private int endSelectColor = 0;
    //渐变方向
    private GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
    //渐变类型 支持 线性渐变，放射性渐变，扫描式渐变
    @GradientType
    private int gradientType = GradientDrawable.LINEAR_GRADIENT;
    //渐变半径. 只有当渐变类型设置为 RADIAL_GRADIENT  时，半径才有效。
    private float gradientRadius = 0;

    //边框宽度
    private int strokeWidth = 0;
    //虚线边框宽度
    private float dashWidth = 0;
    //虚线边框间隙
    private float dashGap = 0;

    //四个角的弧度
    private int radius = 0;
    private int topLeftRadius = radius;
    private int topRightRadius = radius;
    private int bottomLeftRadius = radius;
    private int bottomRightRadius = radius;

    // 是否使用选择器
    private boolean openSelector = false;
    // 未选中的字体颜色
    private int textNormalColor = Color.BLACK;
    // 选中的字体颜色
    private int textSelectColor = Color.RED;
    // 选中填充色
    private int solidSelectColor = 0;
    // 选中边框色
    private int strokeSelectColor = 0;


    @IntDef({GradientDrawable.LINEAR_GRADIENT, GradientDrawable.RADIAL_GRADIENT, GradientDrawable.SWEEP_GRADIENT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GradientType {
    }

    @IntDef({GradientDrawable.RECTANGLE, GradientDrawable.OVAL, GradientDrawable.LINE, GradientDrawable.RING})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
    }

    public CustomBuilder() {
    }

    @Override
    public CustomBuilder setShape(@Shape int shape) {
        this.shape = shape;
        return this;
    }

    @Override
    public CustomBuilder setSolidColor(int solidColor) {
        this.solidColor = solidColor;
        return this;
    }

    @Override
    public CustomBuilder setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    @Override
    public CustomBuilder setColors(int startColor, int centerColor, int endColor) {
        this.startColor = startColor;
        this.centerColor = centerColor;
        this.endColor = endColor;
        return this;
    }

    @Override
    public CustomBuilder setSelectColors(int startColor, int centerColor, int endColor) {
        this.startSelectColor = startColor;
        this.centerSelectColor = centerColor;
        this.endSelectColor = endColor;
        return this;
    }

    @Override
    public CustomBuilder setOrientation(GradientDrawable.Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public CustomBuilder setOrientationById(int orientation) {
        switch (orientation) {
            case 0:
                this.orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
            case 1:
                this.orientation = GradientDrawable.Orientation.TR_BL;
                break;
            case 2:
                this.orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                break;
            case 3:
                this.orientation = GradientDrawable.Orientation.BR_TL;
                break;
            case 4:
                this.orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                break;
            case 5:
                this.orientation = GradientDrawable.Orientation.BL_TR;
                break;
            case 7:
                this.orientation = GradientDrawable.Orientation.TL_BR;
                break;
            default:
                this.orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                break;
        }
        return this;
    }

    @Override
    public CustomBuilder setGradientType(@GradientType int gradientType) {
        this.gradientType = gradientType;
        return this;
    }

    @Override
    public CustomBuilder setGradientRadius(float gradientRadius) {
        this.gradientRadius = gradientRadius;
        return this;
    }

    @Override
    public CustomBuilder setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    @Override
    public CustomBuilder setDashWidth(float dashWidth) {
        this.dashWidth = dashWidth;
        return this;
    }

    @Override
    public CustomBuilder setDashGap(float dashGap) {
        this.dashGap = dashGap;
        return this;
    }

    @Override
    public CustomBuilder setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public CustomBuilder setTopLeftRadius(int topLeftRadius) {
        this.topLeftRadius = topLeftRadius;
        return this;
    }

    @Override
    public CustomBuilder setTopRightRadius(int topRightRadius) {
        this.topRightRadius = topRightRadius;
        return this;
    }

    @Override
    public CustomBuilder setBottomLeftRadius(int bottomLeftRadius) {
        this.bottomLeftRadius = bottomLeftRadius;
        return this;
    }

    @Override
    public CustomBuilder setBottomRightRadius(int bottomRightRadius) {
        this.bottomRightRadius = bottomRightRadius;
        return this;
    }

    @Override
    public CustomBuilder setOpenSelector(boolean openSelector) {
        this.openSelector = openSelector;
        return this;
    }

    @Override
    public CustomBuilder setTextNormalColor(int textNormalColor) {
        this.textNormalColor = textNormalColor;
        return this;
    }

    @Override
    public CustomBuilder setTextSelectColor(int textSelectColor) {
        this.textSelectColor = textSelectColor;
        return this;
    }

    @Override
    public CustomBuilder setSolidSelectColor(int solidSelectColor) {
        this.solidSelectColor = solidSelectColor;
        return this;
    }

    @Override
    public CustomBuilder setStrokeSelectColor(int strokeSelectColor) {
        this.strokeSelectColor = strokeSelectColor;
        return this;
    }

    /**
     * GET
     *
     * @return
     */
    public int getShape() {
        return shape;
    }

    public int getSolidColor() {
        return solidColor;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public int getStartColor() {
        return startColor;
    }

    public int getCenterColor() {
        return centerColor;
    }

    public int getEndColor() {
        return endColor;
    }

    public int getStartSelectColor() {
        return startSelectColor;
    }

    public int getCenterSelectColor() {
        return centerSelectColor;
    }

    public int getEndSelectColor() {
        return endSelectColor;
    }

    public GradientDrawable.Orientation getOrientation() {
        return orientation;
    }

    public int getGradientType() {
        return gradientType;
    }

    public float getGradientRadius() {
        return gradientRadius;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public float getDashWidth() {
        return dashWidth;
    }

    public float getDashGap() {
        return dashGap;
    }

    public int getRadius() {
        return radius;
    }

    public int getTopLeftRadius() {
        return topLeftRadius;
    }

    public int getTopRightRadius() {
        return topRightRadius;
    }

    public int getBottomLeftRadius() {
        return bottomLeftRadius;
    }

    public int getBottomRightRadius() {
        return bottomRightRadius;
    }

    public boolean isOpenSelector() {
        return openSelector;
    }

    public int getTextNormalColor() {
        return textNormalColor;
    }

    public int getTextSelectColor() {
        return textSelectColor;
    }

    public int getSolidSelectColor() {
        return solidSelectColor;
    }

    public int getStrokeSelectColor() {
        return strokeSelectColor;
    }
}
