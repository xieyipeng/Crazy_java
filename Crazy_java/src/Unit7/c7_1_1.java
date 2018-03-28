package Unit7;

/**
 * 与用户互动
 * 运行java程序的参数
 * public
 * static
 * void
 * String[] args - args是字符串数组类型
 */
public class c7_1_1 {
    public static void main(String[] args) {
        System.out.println(args.length);               //输出0;
        /**
         * 若运行java程序时，在类名后面加上一个或多个字符串，
         * JVM就会把这些字符串依次赋给args数组。
         */
        for (String arg : args) {                      //不执行
            System.out.println("hello");
            System.out.println(arg);
        }
    }
}
