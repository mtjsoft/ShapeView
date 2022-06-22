package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeImageViewStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeImageView_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeImageView_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeImageView_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeImageView_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeImageView_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeImageView_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeImageView_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeImageView_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeImageView_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeImageView_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeImageView_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeImageView_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeImageView_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeImageView_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeImageView_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeImageView_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeImageView_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeImageView_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeImageView_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeImageView_bottomRightRadius;
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
