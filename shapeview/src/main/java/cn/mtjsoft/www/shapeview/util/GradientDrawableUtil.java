package cn.mtjsoft.www.shapeview.util;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

import cn.mtjsoft.www.shapeview.CustomBuilder;

public class GradientDrawableUtil {

    private static GradientDrawableUtil gradientDrawableUtil;

    public static GradientDrawableUtil init() {
        if (gradientDrawableUtil == null) {
            gradientDrawableUtil = new GradientDrawableUtil();
        }
        return gradientDrawableUtil;
    }

    /**
     * @param radius      四个角的半径
     * @param colors      渐变的颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    private GradientDrawable getNeedDrawable(@CustomBuilder.Shape int shape, float[] radius, int[] colors, int strokeWidth, int strokeColor, float dashWidth, float dashGap, GradientDrawable.Orientation orientation, @CustomBuilder.GradientType int gradient, float gradientRadius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(shape);
        drawable.setCornerRadii(radius);
        if (strokeWidth > 0) {
            if (dashWidth <= 0 || dashGap <= 0) {
                drawable.setStroke(strokeWidth, strokeColor);
            } else {
                drawable.setStroke(strokeWidth, strokeColor, dashWidth, dashGap);
            }
        }
        drawable.setOrientation(orientation);
        drawable.setColors(colors);
        drawable.setGradientType(gradient);
        if (gradient == GradientDrawable.RADIAL_GRADIENT) {
            drawable.setGradientRadius(gradientRadius);
        }
        return drawable;
    }

    /**
     * @param radius      四个角的半径
     * @param bgColor     背景颜色
     * @param strokeWidth 边框宽度
     * @param strokeColor 边框颜色
     * @return
     */
    private GradientDrawable getNeedDrawable(@CustomBuilder.Shape int shape, float[] radius, int bgColor, int strokeWidth, int strokeColor) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(shape);
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
    private GradientDrawable getNeedDrawable(@CustomBuilder.Shape int shape, float[] radius, int bgColor, int strokeWidth, int strokeColor, float dashWidth, float dashGap) {
        if (dashWidth <= 0 || dashGap <= 0) {
            return getNeedDrawable(shape, radius, bgColor, strokeWidth, strokeColor);
        }
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(shape);
        drawable.setCornerRadii(radius);
        drawable.setStroke(strokeWidth, strokeColor, dashWidth, dashGap);
        drawable.setColor(bgColor);
        return drawable;
    }

    /**
     * 获取常规 圆角 背景
     *
     * @param builder
     * @return
     */
    public GradientDrawable getNormalDrawable(CustomBuilder builder) {
        // 渐变色
        if (builder.getStartColor() != 0 && builder.getEndColor() != 0) {
            int size = 2;
            if (builder.getCenterColor() != 0) {
                size = 3;
            }
            int[] colors = new int[size];
            colors[0] = builder.getStartColor();
            if (size == 3) {
                colors[1] = builder.getCenterColor();
                colors[2] = builder.getEndColor();
            } else {
                colors[1] = builder.getEndColor();
            }
            return getNeedDrawable(builder.getShape(), new float[]{
                            builder.getTopLeftRadius(), builder.getTopLeftRadius(), builder.getTopRightRadius(), builder.getTopRightRadius(),
                            builder.getBottomRightRadius(), builder.getBottomRightRadius(), builder.getBottomLeftRadius(), builder.getBottomLeftRadius()
                    }, colors, builder.getStrokeWidth(), builder.getStrokeColor(), builder.getDashWidth(), builder.getDashGap(), builder.getOrientation(),
                    builder.getGradientType(), builder.getGradientRadius());
        }
        // 常规
        return getNeedDrawable(builder.getShape(), new float[]{
                builder.getTopLeftRadius(), builder.getTopLeftRadius(), builder.getTopRightRadius(), builder.getTopRightRadius(),
                builder.getBottomRightRadius(), builder.getBottomRightRadius(), builder.getBottomLeftRadius(), builder.getBottomLeftRadius()
        }, builder.getSolidColor(), builder.getStrokeWidth(), builder.getStrokeColor(), builder.getDashWidth(), builder.getDashGap());
    }

    /**
     * 获取选中状态 圆角 背景
     *
     * @param builder
     * @return
     */
    public GradientDrawable getSelectorDrawable(CustomBuilder builder) {
        // 渐变色
        if (builder.getStartSelectColor() != 0 && builder.getEndSelectColor() != 0) {
            int size = 2;
            if (builder.getCenterSelectColor()!= 0) {
                size = 3;
            }
            int[] colors = new int[size];
            colors[0] = builder.getStartSelectColor();
            if (size == 3) {
                colors[1] = builder.getCenterSelectColor();
                colors[2] = builder.getEndSelectColor();
            } else {
                colors[1] = builder.getEndSelectColor();
            }
            return getNeedDrawable(builder.getShape(), new float[]{
                            builder.getTopLeftRadius(), builder.getTopLeftRadius(), builder.getTopRightRadius(), builder.getTopRightRadius(),
                            builder.getBottomRightRadius(), builder.getBottomRightRadius(), builder.getBottomLeftRadius(), builder.getBottomLeftRadius()
                    }, colors, builder.getStrokeWidth(), builder.getStrokeColor(), builder.getDashWidth(), builder.getDashGap(), builder.getOrientation(),
                    builder.getGradientType(), builder.getGradientRadius());
        }
        return getNeedDrawable(builder.getShape(), new float[]{
                builder.getTopLeftRadius(), builder.getTopLeftRadius(), builder.getTopRightRadius(), builder.getTopRightRadius(),
                builder.getBottomRightRadius(), builder.getBottomRightRadius(), builder.getBottomLeftRadius(), builder.getBottomLeftRadius()
        }, builder.getSolidSelectColor(), builder.getStrokeWidth(), builder.getStrokeSelectColor(), builder.getDashWidth(), builder.getDashGap());
    }
}
