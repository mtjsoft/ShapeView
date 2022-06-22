package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeTextViewStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeTextView_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeTextView_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeTextView_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeTextView_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeTextView_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeTextView_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeTextView_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeTextView_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeTextView_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeTextView_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeTextView_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeTextView_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeTextView_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeTextView_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeTextView_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeTextView_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeTextView_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeTextView_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeTextView_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeTextView_bottomRightRadius;
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
