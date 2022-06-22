package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeRelativeLayoutStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeRelativeLayout_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeRelativeLayout_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeRelativeLayout_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeRelativeLayout_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeRelativeLayout_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeRelativeLayout_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeRelativeLayout_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeRelativeLayout_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeRelativeLayout_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeRelativeLayout_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeRelativeLayout_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeRelativeLayout_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeRelativeLayout_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeRelativeLayout_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeRelativeLayout_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeRelativeLayout_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeRelativeLayout_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeRelativeLayout_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeRelativeLayout_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeRelativeLayout_bottomRightRadius;
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
