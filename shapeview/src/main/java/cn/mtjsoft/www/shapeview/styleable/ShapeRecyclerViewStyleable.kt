package cn.mtjsoft.www.shapeview.styleable

import cn.mtjsoft.www.shapeview.imp.IStyleable
import cn.mtjsoft.www.shapeview.R

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
class ShapeRecyclerViewStyleable : IStyleable {
    override val shape: Int
        get() = R.styleable.ShapeRecyclerView_shape
    override val solidColor: Int
        get() = R.styleable.ShapeRecyclerView_solidColor
    override val strokeColor: Int
        get() = R.styleable.ShapeRecyclerView_strokeColor
    override val startColor: Int
        get() = R.styleable.ShapeRecyclerView_startColor
    override val centerColor: Int
        get() = R.styleable.ShapeRecyclerView_centerColor
    override val endColor: Int
        get() = R.styleable.ShapeRecyclerView_endColor
    override val startSelectColor: Int
        get() = R.styleable.ShapeRecyclerView_startSelectColor
    override val centerSelectColor: Int
        get() = R.styleable.ShapeRecyclerView_centerSelectColor
    override val endSelectColor: Int
        get() = R.styleable.ShapeRecyclerView_endSelectColor
    override val orientation: Int
        get() = R.styleable.ShapeRecyclerView_orientation
    override val gradientType: Int
        get() = R.styleable.ShapeRecyclerView_gradientType
    override val gradientRadius: Int
        get() = R.styleable.ShapeRecyclerView_gradientRadius
    override val strokeWidth: Int
        get() = R.styleable.ShapeRecyclerView_strokeWidth
    override val dashWidth: Int
        get() = R.styleable.ShapeRecyclerView_dashWidth
    override val dashGap: Int
        get() = R.styleable.ShapeRecyclerView_dashGap
    override val radius: Int
        get() = R.styleable.ShapeRecyclerView_radius
    override val topLeftRadius: Int
        get() = R.styleable.ShapeRecyclerView_topLeftRadius
    override val topRightRadius: Int
        get() = R.styleable.ShapeRecyclerView_topRightRadius
    override val bottomLeftRadius: Int
        get() = R.styleable.ShapeRecyclerView_bottomLeftRadius
    override val bottomRightRadius: Int
        get() = R.styleable.ShapeRecyclerView_bottomRightRadius
    override val isOpenSelector: Int
        get() = 0
    override val textNormalColor: Int
        get() = 0
    override val textSelectColor: Int
        get() = 0
    override val solidSelectColor: Int
        get() = 0
    override val strokeSelectColor: Int
        get() = 0
}