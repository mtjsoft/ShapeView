package cn.mtjsoft.www.shapeview.util;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * 跟Text有关的一些工具类
 * 
 * @author Mtj
 * 
 */
public class MtjTextUtils
{
    /**
     * 给文字设置颜色Spnnable
     * 
     * @param text
     * @param color
     * @param color_start
     * @param color_end
     */
    public static SpannableString setTextColorSpannable(String text, int color,
                                                        int color_start, int color_end)
    {
        SpannableString wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start,
                color_end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        return wordtoSpan;
    }

    /**
     * 给TextView 两处不同位置设置同一种颜色
     */
    public static SpannableString setTextColorSpannable(String text, int color,
                                                        int color_start_first, int color_end_first, int color_start_second,
                                                        int color_end_second)
    {
        SpannableString wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start_first,
                color_end_first, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start_second,
                color_end_second, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        return wordtoSpan;
    }

    /**
     * 设置TextView的特定位置的颜色
     * 
     * @param textView
     * @param text
     *            文本内容
     * @param color
     *            改变后的颜色
     * @param color_start
     *            改变的开始位置
     * @param color_end
     *            改变的结束位置
     */
    public static void setTextColor(TextView textView, String text, int color,
                                    int color_start, int color_end)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start,
                color_end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView.setText(wordtoSpan);
    }

    /**
     * 设置TextView的特定位置的大小
     * 
     * @param textView
     * @param text
     *            文本内容
     * @param size
     *            改变后的字体大小(单位px)
     * @param size_start
     *            改变的开始位置(包含)
     * @param size_end
     *            改变的结束位置(不包含)
     */
    public static void setTextSize(TextView textView, String text, int size,
                                   int size_start, int size_end)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new AbsoluteSizeSpan(size), size_start, size_end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(wordtoSpan);
    }

    /**
     * 设置TextView的特定位置的字体大小和颜色
     * 
     * @param textView
     * @param text
     * @param size
     * @param size_start
     * @param size_end
     * @param color
     * @param color_start
     *            改变的开始位置(包含)
     * @param color_end
     */
    public static void setTextSizeAndColor(TextView textView, String text,
                                           int size, int size_start, int size_end, int color, int color_start,
                                           int color_end)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new AbsoluteSizeSpan(size), size_start, size_end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start,
                color_end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView.setText(wordtoSpan);
    }

    public static void setTextSizeAndColor(TextView textView, String text,
                                           int size, int color, int size_color_start, int size_color_end)
    {
        setTextSizeAndColor(textView, text, size, size_color_start,
                size_color_end, color, size_color_start, size_color_end);
    }

    /**
     * 设置RadioButton特定位置的字体和颜色
     * 
     * @param radioButton
     * @param text
     * @param size
     * @param size_start
     * @param size_end
     * @param color
     * @param color_start
     * @param color_end
     */
    public static void setTextSizeAndColor(RadioButton radioButton,
                                           String text, int size, int size_start, int size_end, int color,
                                           int color_start, int color_end)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new AbsoluteSizeSpan(size), size_start, size_end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start,
                color_end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        radioButton.setText(wordtoSpan);
    }

    /**
     * 设置RadioButton特定位置的颜色和大小,当需要改变的颜色和大小的位置相同时调用
     * 
     * @param radioButton
     * @param text
     *            文本内容
     * @param size
     *            字体大小 单位是px
     * @param color
     *            字体颜色
     * @param sizec_color_start
     *            改变的开始位置(包含)
     * @param size_color_end
     *            改变的结束位置(不包含)
     */
    public static void setTextSizeAndColor(RadioButton radioButton,
                                           String text, int size, int color, int sizec_color_start,
                                           int size_color_end)
    {
        setTextSizeAndColor(radioButton, text, size, sizec_color_start,
                size_color_end, color, size_color_end, size_color_end);
    }

    /**
     * 设置TextView特定位置的大小颜色和样式,当三者改变的位置相同时调用
     * 
     * @param textView
     * @param text
     *            内容
     * @param size
     *            字体大小 单位为px
     * @param color
     *            颜色
     * @param style
     *            字体的显示样式
     * @param color_size_style_start
     *            开始的位置(包含)
     * @param color_size_style_end
     *            结束的位置(不包含)
     */
    public static void setTextSizeColorAndType(TextView textView, String text,
                                               int size, int color, int style, int color_size_style_start,
                                               int color_size_style_end)
    {
        setTextSizeColorAndType(textView, text, size, color_size_style_start,
                color_size_style_end, color, color_size_style_start,
                color_size_style_end, style, color_size_style_start,
                color_size_style_end);
    }

    /**
     * 设置TextView特定位置的大小颜色和样式
     */
    public static void setTextSizeColorAndType(TextView textView, String text,
                                               int size, int size_start, int size_end, int color, int color_start,
                                               int color_end, int style, int style_start, int style_end)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new AbsoluteSizeSpan(size), size_start, size_end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start,
                color_end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        wordtoSpan.setSpan(new StyleSpan(style), style_start, style_end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(wordtoSpan);
    }

    /**
     * 给TextView 两处不同位置设置同一种颜色
     */
    public static void setTextColor(TextView textView, String text, int color,
                                    int color_start_first, int color_end_first, int color_start_second,
                                    int color_end_second)
    {
        Spannable wordtoSpan = new SpannableString(text);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start_first,
                color_end_first, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(color), color_start_second,
                color_end_second, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView.setText(wordtoSpan);
    }

}
