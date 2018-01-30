package Unit7;
/**
 * NumberFormat��ʽ������
 */

import java.text.NumberFormat;
import java.util.Locale;

public class c7_6_6 {
    public static void main(String[] args) {
        //��Ҫ����ʽ��������
        double number = 1234000.567;
        //����4��locale���ֱ�����й��ձ��¹�����
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN, Locale.US};
        NumberFormat[] numberFormats = new NumberFormat[12];
        for (int i = 0; i < locales.length; i++) {
            numberFormats[i * 3] = NumberFormat.getNumberInstance(locales[i]);
            numberFormats[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            numberFormats[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String tip = i == 0 ? "--�й���ʽ--" :
                    i == 1 ? "--�ձ���ʽ--" :
                            i == 2 ? "--�¹���ʽ--" :
                                    "--������ʽ--";
            System.out.println(tip);
            System.out.println("ͨ����ֵ��ʽ" + numberFormats[i * 3].format(number));
            System.out.println("�ٷֱ���ֵ��ʽ" + numberFormats[i * 3 + 1].format(number));
            System.out.println("������ֵ��ʽ" + numberFormats[i * 3 + 2].format(number));
        }
    }
}
