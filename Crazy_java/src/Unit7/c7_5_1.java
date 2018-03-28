package Unit7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * 用于匹配字符串的模板
 * <p>
 * 创建正则表达式
 * Pattern和Matcher类
 */
public class c7_5_1 {
    public static void main(String[] args) {
        String string = "我想求购一本《方框java讲义》，尽快联系我15035081949，" +
                "交朋友，电话号码13934892595" +
                "出售二手电脑，联系方式15035086636";
        //compile 编译
        Matcher matcher = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //邮箱地址
        String string1 = "java is very easy!";
        System.out.println("目标字符串是" + string1);
        Matcher matcher1 = Pattern.compile("\\w+").matcher(string1);
        while (matcher1.find()) {
            System.out.println(matcher1.group() + "子串的起始位置：" + matcher1.start() + ",结束位置：" + matcher1.end());
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
            String result = mail + "  " + (matcher2.matches() ? "是" : "不是");
            System.out.println(result);
        }

        //用正则表达式对目标进行分割、查找、替换
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
            System.out.println(matcher3.replaceAll("哈哈:)"));
        }
    }
}
