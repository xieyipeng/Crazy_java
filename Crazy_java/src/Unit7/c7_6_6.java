package Unit7;
/**
 * NumberFormat格式化数字
 */

import java.text.NumberFormat;
import java.util.Locale;

public class c7_6_6 {
    public static void main(String[] args) {
        //需要被格式化的数字
        double number = 1234000.567;
        //创建4个locale，分别代表中国日本德国美国
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN, Locale.US};
        NumberFormat[] numberFormats = new NumberFormat[12];
        for (int i = 0; i < locales.length; i++) {
            numberFormats[i * 3] = NumberFormat.getNumberInstance(locales[i]);
            numberFormats[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            numberFormats[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String tip = i == 0 ? "--中国格式--" :
                    i == 1 ? "--日本格式--" :
                            i == 2 ? "--德国格式--" :
                                    "--美国格式--";
            System.out.println(tip);
            System.out.println("通用数值格式" + numberFormats[i * 3].format(number));
            System.out.println("百分比数值格式" + numberFormats[i * 3 + 1].format(number));
            System.out.println("货币数值格式" + numberFormats[i * 3 + 2].format(number));
        }
    }
}
