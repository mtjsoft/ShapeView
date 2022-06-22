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
        get() = R.styleable.ShapeRadioButton_sv_shape
    override val solidColor: Int
        get() = R.styleable.ShapeRadioButton_sv_solidColor
    override val strokeColor: Int
        get() = R.styleable.ShapeRadioButton_sv_strokeColor
    override val startColor: Int
        get() = R.styleable.ShapeRadioButton_sv_startColor
    override val centerColor: Int
        get() = R.styleable.ShapeRadioButton_sv_centerColor
    override val endColor: Int
        get() = R.styleable.ShapeRadioButton_sv_endColor
    override val startSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_startSelectColor
    override val centerSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_centerSelectColor
    override val endSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_endSelectColor
    override val orientation: Int
        get() = R.styleable.ShapeRadioButton_sv_orientation
    override val gradientType: Int
        get() = R.styleable.ShapeRadioButton_sv_gradientType
    override val gradientRadius: Int
        get() = R.styleable.ShapeRadioButton_sv_gradientRadius
    override val strokeWidth: Int
        get() = R.styleable.ShapeRadioButton_sv_strokeWidth
    override val dashWidth: Int
        get() = R.styleable.ShapeRadioButton_sv_dashWidth
    override val dashGap: Int
        get() = R.styleable.ShapeRadioButton_sv_dashGap
    override val radius: Int
        get() = R.styleable.ShapeRadioButton_sv_radius
    override val topLeftRadius: Int
        get() = R.styleable.ShapeRadioButton_sv_topLeftRadius
    override val topRightRadius: Int
        get() = R.styleable.ShapeRadioButton_sv_topRightRadius
    override val bottomLeftRadius: Int
        get() = R.styleable.ShapeRadioButton_sv_bottomLeftRadius
    override val bottomRightRadius: Int
        get() = R.styleable.ShapeRadioButton_sv_bottomRightRadius
    override val isOpenSelector: Int
        get() = R.styleable.ShapeRadioButton_sv_openSelector
    override val textNormalColor: Int
        get() = R.styleable.ShapeRadioButton_sv_textNormalColor
    override val textSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_textSelectColor
    override val solidSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_solidSelectColor
    override val strokeSelectColor: Int
        get() = R.styleable.ShapeRadioButton_sv_strokeSelectColor
}