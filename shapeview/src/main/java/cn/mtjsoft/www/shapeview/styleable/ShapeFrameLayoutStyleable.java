package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeFrameLayoutStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeFrameLayout_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeFrameLayout_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeFrameLayout_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeFrameLayout_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeFrameLayout_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeFrameLayout_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeFrameLayout_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeFrameLayout_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeFrameLayout_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeFrameLayout_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeFrameLayout_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeFrameLayout_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeFrameLayout_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeFrameLayout_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeFrameLayout_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeFrameLayout_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeFrameLayout_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeFrameLayout_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeFrameLayout_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeFrameLayout_bottomRightRadius;
    }

    @Override
    public int isOpenSelector() {
        return 0;
    }

    @Override
    public int getTextNormalColor() {
        return 0;
    }

    @Override
    public int getTextSelectColor() {
        return 0;
    }

    @Override
    public int getSolidSelectColor() {
        return 0;
    }

    @Override
    public int getStrokeSelectColor() {
        return 0;
    }
}
