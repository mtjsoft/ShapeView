package cn.mtjsoft.www.shapeview.styleable;

import cn.mtjsoft.www.shapeview.R;
import cn.mtjsoft.www.shapeview.imp.IStyleable;

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
public class ShapeRecyclerViewStyleable implements IStyleable {
    @Override
    public int getShape() {
        return R.styleable.ShapeRecyclerView_shape;
    }

    @Override
    public int getSolidColor() {
        return R.styleable.ShapeRecyclerView_solidColor;
    }

    @Override
    public int getStrokeColor() {
        return R.styleable.ShapeRecyclerView_strokeColor;
    }

    @Override
    public int getStartColor() {
        return R.styleable.ShapeRecyclerView_startColor;
    }

    @Override
    public int getCenterColor() {
        return R.styleable.ShapeRecyclerView_centerColor;
    }

    @Override
    public int getEndColor() {
        return R.styleable.ShapeRecyclerView_endColor;
    }

    @Override
    public int getStartSelectColor() {
        return R.styleable.ShapeRecyclerView_startSelectColor;
    }

    @Override
    public int getCenterSelectColor() {
        return R.styleable.ShapeRecyclerView_centerSelectColor;
    }

    @Override
    public int getEndSelectColor() {
        return R.styleable.ShapeRecyclerView_endSelectColor;
    }

    @Override
    public int getOrientation() {
        return R.styleable.ShapeRecyclerView_orientation;
    }

    @Override
    public int getGradientType() {
        return R.styleable.ShapeRecyclerView_gradientType;
    }

    @Override
    public int getGradientRadius() {
        return R.styleable.ShapeRecyclerView_gradientRadius;
    }

    @Override
    public int getStrokeWidth() {
        return R.styleable.ShapeRecyclerView_strokeWidth;
    }

    @Override
    public int getDashWidth() {
        return R.styleable.ShapeRecyclerView_dashWidth;
    }

    @Override
    public int getDashGap() {
        return R.styleable.ShapeRecyclerView_dashGap;
    }

    @Override
    public int getRadius() {
        return R.styleable.ShapeRecyclerView_radius;
    }

    @Override
    public int getTopLeftRadius() {
        return R.styleable.ShapeRecyclerView_topLeftRadius;
    }

    @Override
    public int getTopRightRadius() {
        return R.styleable.ShapeRecyclerView_topRightRadius;
    }

    @Override
    public int getBottomLeftRadius() {
        return R.styleable.ShapeRecyclerView_bottomLeftRadius;
    }

    @Override
    public int getBottomRightRadius() {
        return R.styleable.ShapeRecyclerView_bottomRightRadius;
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
