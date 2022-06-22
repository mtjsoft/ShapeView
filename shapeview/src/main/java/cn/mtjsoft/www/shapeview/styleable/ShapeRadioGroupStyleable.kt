package cn.mtjsoft.www.shapeview.styleable

import cn.mtjsoft.www.shapeview.imp.IStyleable
import cn.mtjsoft.www.shapeview.R

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
class ShapeRadioGroupStyleable : IStyleable {
    override val shape: Int
        get() = R.styleable.ShapeRadioGroup_shape
    override val solidColor: Int
        get() = R.styleable.ShapeRadioGroup_solidColor
    override val strokeColor: Int
        get() = R.styleable.ShapeRadioGroup_strokeColor
    override val startColor: Int
        get() = R.styleable.ShapeRadioGroup_startColor
    override val centerColor: Int
        get() = R.styleable.ShapeRadioGroup_centerColor
    override val endColor: Int
        get() = R.styleable.ShapeRadioGroup_endColor
    override val startSelectColor: Int
        get() = R.styleable.ShapeRadioGroup_startSelectColor
    override val centerSelectColor: Int
        get() = R.styleable.ShapeRadioGroup_centerSelectColor
    override val endSelectColor: Int
        get() = R.styleable.ShapeRadioGroup_endSelectColor
    override val orientation: Int
        get() = R.styleable.ShapeRadioGroup_orientation
    override val gradientType: Int
        get() = R.styleable.ShapeRadioGroup_gradientType
    override val gradientRadius: Int
        get() = R.styleable.ShapeRadioGroup_gradientRadius
    override val strokeWidth: Int
        get() = R.styleable.ShapeRadioGroup_strokeWidth
    override val dashWidth: Int
        get() = R.styleable.ShapeRadioGroup_dashWidth
    override val dashGap: Int
        get() = R.styleable.ShapeRadioGroup_dashGap
    override val radius: Int
        get() = R.styleable.ShapeRadioGroup_radius
    override val topLeftRadius: Int
        get() = R.styleable.ShapeRadioGroup_topLeftRadius
    override val topRightRadius: Int
        get() = R.styleable.ShapeRadioGroup_topRightRadius
    override val bottomLeftRadius: Int
        get() = R.styleable.ShapeRadioGroup_bottomLeftRadius
    override val bottomRightRadius: Int
        get() = R.styleable.ShapeRadioGroup_bottomRightRadius
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