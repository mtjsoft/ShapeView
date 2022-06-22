package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeLinearLayoutStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeLinearLayout_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeLinearLayout_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeLinearLayout_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeLinearLayout_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeLinearLayout_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeLinearLayout_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeLinearLayout_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeLinearLayout_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeLinearLayout_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeLinearLayout_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeLinearLayout_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeLinearLayout_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeLinearLayout_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeLinearLayout_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeLinearLayout_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeLinearLayout_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeLinearLayout_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeLinearLayout_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeLinearLayout_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeLinearLayout_bottomRightRadius;
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
