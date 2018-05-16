package Unit7;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * java��֧�ֵĹ��Һ�����
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

        //��ȡϵͳĬ�ϵĹ�������
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        //����ָ���Ĺ��һ����Լ�����Դ�ļ�
        ResourceBundle resourceBundle=ResourceBundle.getBundle("mess_zh_CN.properties",myLocale);
        System.out.println(resourceBundle.getString("hello"));

    }
}
