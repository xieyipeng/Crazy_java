package Unit6;

import javax.swing.*;

/**
 * 方法引用和构造器引用
 *
 * @FunctionalInterface 函数式接口
 */
@FunctionalInterface
interface Converter {
    Integer convent(String from);
}

@FunctionalInterface
interface MyTest {
    String test(String a, int b, int c);
}

@FunctionalInterface
interface YourTest {
    JFrame win(String title);
}

public class c6_8_3_1 {
    public static void main(String[] args) {
        //1、引用类方法
        Converter converter1 = Integer::valueOf;
        Integer integer1 = converter1.convent("99");
        System.out.println(integer1);
        /**
         * //单个字符转换成数字
         * Converter converter1= new Converter() {
         * @Override
         * public Integer convent(Character from) {
         * return Integer.valueOf(from);
         * }
         * };
         *  Integer integer1=converter1.convent('*');
         *  System.out.println(integer1);
         */
        /**
         * //字符串转换数字
         * Converter converter1= from -> Integer.valueOf(from);
         * Converter converter1=new Converter() {
         * @Override
         * public Integer convent(String from) {
         * return Integer.valueOf(from);
         * Integer integer1=converter1.convent("99");
         * }
         * };
         */
        //2、引用特定对象的实例方法
        Converter converter2 = "fkit.org"::indexOf;
        Integer integer2 = converter2.convent("it");
        System.out.println(integer2);
        /**
         * //Converter converter2= from -> "fkit.org".indexOf(from);
         * Converter converter2=new Converter() {
         * @Override
         * public Integer convent(String from) {
         * return "fkit.org".indexOf(from);
         * }
         * };
         */
        //3、引用某类对象的实例方法
        MyTest myTest = String::substring;
        String str = myTest.test("Java I Love You", 2, 9);
        System.out.println(str);
        /**
         * //MyTest myTest = (a, b, c) -> a.substring(b, c);
         * MyTest myTest = new MyTest() {
         * @Override
         * public String test(String a, int b, int c) {
         * return a.substring(b, c);
         * }
         * };
         *  String str=myTest.test("Java I Love You",2,9);
         *  System.out.println(str);
         */
        //4、引用构造器
        YourTest yourTest = JFrame::new;
        JFrame jFrame = yourTest.win("我的窗口");
        System.out.println(jFrame);
        /**
         * //YourTest yourTest= title -> new JFrame(title);
         *YourTest yourTest=new YourTest() {
         * @Override
         * public JFrame win(String title) {
         * return new JFrame(title);
         * }
         * };
         *  JFrame jFrame=yourTest.win("我的窗口");
         *  System.out.println(jFrame);
         */
    }
}
