package Unit7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ
 * ����ƥ���ַ�����ģ��
 * <p>
 * ����������ʽ
 * Pattern��Matcher��
 */
public class c7_5_1 {
    public static void main(String[] args) {
        String string = "������һ��������java���塷��������ϵ��15035081949��" +
                "�����ѣ��绰����13934892595" +
                "���۶��ֵ��ԣ���ϵ��ʽ15035086636";
        //compile ����
        Matcher matcher = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //�����ַ
        String string1 = "java is very easy!";
        System.out.println("Ŀ���ַ�����" + string1);
        Matcher matcher1 = Pattern.compile("\\w+").matcher(string1);
        while (matcher1.find()) {
            System.out.println(matcher1.group() + "�Ӵ�����ʼλ�ã�" + matcher1.start() + ",����λ�ã�" + matcher1.end());
        }

        String[] mails = {
                "kongyeeku@163.com",
                "kongyeeku@gmail.com",
                "ligang@crazyit.org",
                "wawa@abc.xx"
        };
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn||net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher2 = null;
        for (String mail : mails) {
            if (matcher2 == null) {
                matcher2 = mailPattern.matcher(mail);
            } else {
                matcher2.reset(mail);
            }
            String result = mail + "  " + (matcher2.matches() ? "��" : "����");
            System.out.println(result);
        }

        //��������ʽ��Ŀ����зָ���ҡ��滻
        String[] msgs = {
                "java has regular expressions in 1.4",
                "regular expressions now expressing in java",
                "Java represses oracular expressions"
        };
        Pattern pattern = Pattern.compile("re\\W*");
        Matcher matcher3 = null;
        for (int i = 0; i < msgs.length; i++) {
            if (matcher3 == null) {
                matcher3=pattern.matcher(msgs[i]);
            }else {
                matcher3.reset(msgs[i]);
            }
            System.out.println(matcher3.replaceAll("����:)"));
        }
    }
}
