package Unit7;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * java所支持的国家和语言
 */
public class c7_6_1 {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            System.out.println(locales[i].getDisplayCountry()
                    + "=" + locales[i].getCountry() + " "
                    + locales[i].getDisplayLanguage()
                    + "=" + locales[i].getLanguage());
        }

        //获取系统默认的国家语言
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        //根据指定的国家或语言加载资源文件
        ResourceBundle resourceBundle=ResourceBundle.getBundle("mess_zh_CN.properties",myLocale);
        System.out.println(resourceBundle.getString("hello"));

    }
}
