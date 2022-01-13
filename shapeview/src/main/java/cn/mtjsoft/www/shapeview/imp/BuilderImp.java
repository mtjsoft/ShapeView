package cn.mtjsoft.www.shapeview.imp;

/**
 * @author mtj
 * @date 2022/1/13
 * @desc
 * @email mtjsoft3@gmail.com
 */
public interface BuilderImp {
    BuilderImp setSolidColor(int solidColor);

    BuilderImp setStrokeColor(int strokeColor);

    BuilderImp setStrokeWidth(int strokeWidth);

    BuilderImp setRadius(int radius);

    BuilderImp setTopLeftRadius(int topLeftRadius);

    BuilderImp setTopRightRadius(int topRightRadius);

    BuilderImp setBottomLeftRadius(int bottomLeftRadius);

    BuilderImp setBottomRightRadius(int bottomRightRadius);

    BuilderImp setOpenSelector(boolean openSelector);

    BuilderImp setTextNormalColor(int textNormalColor);

    BuilderImp setTextSelectColor(int textSelectColor);

    BuilderImp setSolidSelectColor(int solidSelectColor);

    BuilderImp setStrokeSelectColor(int strokeSelectColor);
}
