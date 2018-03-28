package Unit6;

/**
 * lambda表达式与匿名内部类的联系和区别
 */
@FunctionalInterface
interface Displayable {
    void display();

    /**
     * 接口中的默认方法。
     * <p>
     * Default方法是指：
     * 在接口内部包含了一些默认的方法实现（也就是接口中可以包含方法
     * 体，这打破了Java之前版本对接口的语法限制）,从而使得接口在进
     * 行扩展的时候，不会破坏与接口相关的实现类代码。
     *
     * @param a 第一个数字
     * @param b 第二个数字
     * @return a+b
     */
    default int add(int a, int b) {
        return a + b;
    }
}

public class c6_8_4_1 {
    private int age = 12;
    private static String name = "疯狂软件教育中心";

    public void test() {
        String book = "疯狂java讲义";
        Displayable displayable = () -> {
            //book相当于有隐式的final修饰
            //String a="hello";
            //book=a;
            System.out.println("book:" + book); //访问 “effectively final” 的局部变量
            System.out.println("age:" + age);   //访问外部类的实例变量
            System.out.println("name" + name);  //访问类变量
            //System.out.println(add(3,5));   //出错
            /**
             * lambda表达式中不能调用接口中的默认方法
             * lambda表达式只能为函数时接口创建实例
             * 若使用匿名内部类则可以调用，但是lambda表达式不能调用 add() 函数
             */
        };
        /**
         * //lambda表达式
         * Displayable displayable=new Displayable() {
         * @Override
         * public void display() {
         * System.out.println("book:"+book);
         * System.out.println("age:"+age);
         * System.out.println("name"+name);
         * }
         * };
         */
        displayable.display();
        System.out.println(displayable.add(3, 5));
    }

    public static void main(String[] args) {
        c6_8_4_1 c = new c6_8_4_1();
        c.test();
    }
}
