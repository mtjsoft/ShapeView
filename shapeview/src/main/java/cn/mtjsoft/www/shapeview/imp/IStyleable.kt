package cn.mtjsoft.www.shapeview.imp

/**
 * @author mtj
 * @date 2022/2/7
 * @desc
 * @email mtjsoft3@gmail.com
 */
interface IStyleable {
    val shape: Int
    val solidColor: Int
    val strokeColor: Int
    val startColor: Int
    val centerColor: Int
    val endColor: Int
    val startSelectColor: Int
    val centerSelectColor: Int
    val endSelectColor: Int
    val orientation: Int
    val gradientType: Int
    val gradientRadius: Int
    val strokeWidth: Int
    val dashWidth: Int
    val dashGap: Int
    val radius: Int
    val topLeftRadius: Int
    val topRightRadius: Int
    val bottomLeftRadius: Int
    val bottomRightRadius: Int
    val isOpenSelector: Int
    val textNormalColor: Int
    val textSelectColor: Int
    val solidSelectColor: Int
    val strokeSelectColor: Int
}