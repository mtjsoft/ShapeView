package cn.mtjsoft.www.shapeview.imp;

import android.os.Build;

import androidx.annotation.RequiresApi;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public interface IStyleable {
    int getShape();

    int getSolidColor();

    int getStrokeColor();

    int getStartColor();

    int getCenterColor();

    int getEndColor();

    int getStartSelectColor();

    int getCenterSelectColor();

    int getEndSelectColor();

    int getOrientation();

    int getGradientType();

    int getGradientRadius();

    int getStrokeWidth();

    int getDashWidth();

    int getDashGap();

    int getRadius();

    int getTopLeftRadius();

    int getTopRightRadius();

    int getBottomLeftRadius();

    int getBottomRightRadius();

    int isOpenSelector();

    int getTextNormalColor();

    int getTextSelectColor();

    int getSolidSelectColor();

    int getStrokeSelectColor();
}
