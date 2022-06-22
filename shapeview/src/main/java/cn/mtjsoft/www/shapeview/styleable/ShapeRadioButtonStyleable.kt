package cn.mtjsoft.www.shapeview.styleable

import cn.mtjsoft.www.shapeview.imp.IStyleable
import cn.mtjsoft.www.shapeview.R

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
class ShapeRadioButtonStyleable : IStyleable {
    override val shape: Int
        get() = R.styleable.ShapeRadioButton_shape
    override val solidColor: Int
        get() = R.styleable.ShapeRadioButton_solidColor
    override val strokeColor: Int
        get() = R.styleable.ShapeRadioButton_strokeColor
    override val startColor: Int
        get() = R.styleable.ShapeRadioButton_startColor
    override val centerColor: Int
        get() = R.styleable.ShapeRadioButton_centerColor
    override val endColor: Int
        get() = R.styleable.ShapeRadioButton_endColor
    override val startSelectColor: Int
        get() = R.styleable.ShapeRadioButton_startSelectColor
    override val centerSelectColor: Int
        get() = R.styleable.ShapeRadioButton_centerSelectColor
    override val endSelectColor: Int
        get() = R.styleable.ShapeRadioButton_endSelectColor
    override val orientation: Int
        get() = R.styleable.ShapeRadioButton_orientation
    override val gradientType: Int
        get() = R.styleable.ShapeRadioButton_gradientType
    override val gradientRadius: Int
        get() = R.styleable.ShapeRadioButton_gradientRadius
    override val strokeWidth: Int
        get() = R.styleable.ShapeRadioButton_strokeWidth
    override val dashWidth: Int
        get() = R.styleable.ShapeRadioButton_dashWidth
    override val dashGap: Int
        get() = R.styleable.ShapeRadioButton_dashGap
    override val radius: Int
        get() = R.styleable.ShapeRadioButton_radius
    override val topLeftRadius: Int
        get() = R.styleable.ShapeRadioButton_topLeftRadius
    override val topRightRadius: Int
        get() = R.styleable.ShapeRadioButton_topRightRadius
    override val bottomLeftRadius: Int
        get() = R.styleable.ShapeRadioButton_bottomLeftRadius
    override val bottomRightRadius: Int
        get() = R.styleable.ShapeRadioButton_bottomRightRadius
    override val isOpenSelector: Int
        get() = R.styleable.ShapeRadioButton_openSelector
    override val textNormalColor: Int
        get() = R.styleable.ShapeRadioButton_textNormalColor
    override val textSelectColor: Int
        get() = R.styleable.ShapeRadioButton_textSelectColor
    override val solidSelectColor: Int
        get() = R.styleable.ShapeRadioButton_solidSelectColor
    override val strokeSelectColor: Int
        get() = R.styleable.ShapeRadioButton_strokeSelectColor
}