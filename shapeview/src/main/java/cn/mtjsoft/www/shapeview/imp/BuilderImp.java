package cn.mtjsoft.www.shapeview.imp;

import android.graphics.drawable.GradientDrawable;

import cn.mtjsoft.www.shapeview.CustomBuilder;

/**
 * @author mtj
 * @date 2022/1/13
 * @desc
 * @email mtjsoft3@gmail.com
 */
public interface BuilderImp {

    BuilderImp setShape(@CustomBuilder.Shape int shape);

    BuilderImp setSolidColor(int solidColor);

    BuilderImp setStrokeColor(int strokeColor);

    BuilderImp setColors(int startColor, int centerColor, int endColor);

    BuilderImp setSelectColors(int startColor, int centerColor, int endColor);

    BuilderImp setOrientation(GradientDrawable.Orientation orientation);

    BuilderImp setGradientType(@CustomBuilder.GradientType int gradientType);

    BuilderImp setGradientRadius(float gradientRadius);

    BuilderImp setStrokeWidth(int strokeWidth);

    BuilderImp setDashWidth(float dashWidth);

    BuilderImp setDashGap(float dashGap);

    BuilderImp setRadius(int radius);

    BuilderImp setTopLeftRadius(int topLeftRadius);

    BuilderImp setTopRightRadius(int topRightRadius);

    BuilderImp setBottomLeftRadius(int bottomLeftRadius);

    BuilderImp setBottomRightRadius(int bottomRightRadius);

    BuilderImp setOpenSelector(boolean openSelector);

    BuilderImp setTextNormalColor(int textNormalColor);

    BuilderImp setTextSelectColor(int textSelectColor);

    BuilderImp setSolidSelectColor(int solidSelectColor);

    BuilderImp setStrokeSelectColor(int strokeSelectColor);
}
