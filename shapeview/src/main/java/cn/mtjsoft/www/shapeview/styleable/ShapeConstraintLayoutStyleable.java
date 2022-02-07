package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeConstraintLayoutStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeConstraintLayout_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeConstraintLayout_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeConstraintLayout_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeConstraintLayout_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeConstraintLayout_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeConstraintLayout_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeConstraintLayout_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeConstraintLayout_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeConstraintLayout_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeConstraintLayout_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeConstraintLayout_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeConstraintLayout_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeConstraintLayout_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeConstraintLayout_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeConstraintLayout_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeConstraintLayout_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeConstraintLayout_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeConstraintLayout_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeConstraintLayout_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeConstraintLayout_bottomRightRadius;
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
