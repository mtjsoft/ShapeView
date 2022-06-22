package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeEditTextStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeEditText_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeEditText_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeEditText_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeEditText_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeEditText_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeEditText_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeEditText_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeEditText_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeEditText_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeEditText_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeEditText_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeEditText_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeEditText_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeEditText_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeEditText_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeEditText_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeEditText_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeEditText_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeEditText_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeEditText_bottomRightRadius;
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
