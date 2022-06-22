package cn.mtjsoft.www.shapeview.styleable

import cn.mtjsoft.www.shapeview.imp.IStyleable
import cn.mtjsoft.www.shapeview.R

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
class ShapeCheckBoxStyleable : IStyleable {
    override val shape: Int
        get() = R.styleable.ShapeCheckBox_shape
    override val solidColor: Int
        get() = R.styleable.ShapeCheckBox_solidColor
    override val strokeColor: Int
        get() = R.styleable.ShapeCheckBox_strokeColor
    override val startColor: Int
        get() = R.styleable.ShapeCheckBox_startColor
    override val centerColor: Int
        get() = R.styleable.ShapeCheckBox_centerColor
    override val endColor: Int
        get() = R.styleable.ShapeCheckBox_endColor
    override val startSelectColor: Int
        get() = R.styleable.ShapeCheckBox_startSelectColor
    override val centerSelectColor: Int
        get() = R.styleable.ShapeCheckBox_centerSelectColor
    override val endSelectColor: Int
        get() = R.styleable.ShapeCheckBox_endSelectColor
    override val orientation: Int
        get() = R.styleable.ShapeCheckBox_orientation
    override val gradientType: Int
        get() = R.styleable.ShapeCheckBox_gradientType
    override val gradientRadius: Int
        get() = R.styleable.ShapeCheckBox_gradientRadius
    override val strokeWidth: Int
        get() = R.styleable.ShapeCheckBox_strokeWidth
    override val dashWidth: Int
        get() = R.styleable.ShapeCheckBox_dashWidth
    override val dashGap: Int
        get() = R.styleable.ShapeCheckBox_dashGap
    override val radius: Int
        get() = R.styleable.ShapeCheckBox_radius
    override val topLeftRadius: Int
        get() = R.styleable.ShapeCheckBox_topLeftRadius
    override val topRightRadius: Int
        get() = R.styleable.ShapeCheckBox_topRightRadius
    override val bottomLeftRadius: Int
        get() = R.styleable.ShapeCheckBox_bottomLeftRadius
    override val bottomRightRadius: Int
        get() = R.styleable.ShapeCheckBox_bottomRightRadius
    override val isOpenSelector: Int
        get() = R.styleable.ShapeCheckBox_openSelector
    override val textNormalColor: Int
        get() = R.styleable.ShapeCheckBox_textNormalColor
    override val textSelectColor: Int
        get() = R.styleable.ShapeCheckBox_textSelectColor
    override val solidSelectColor: Int
        get() = R.styleable.ShapeCheckBox_solidSelectColor
    override val strokeSelectColor: Int
        get() = R.styleable.ShapeCheckBox_strokeSelectColor
}