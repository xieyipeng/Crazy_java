package Unit5;

/**
 * static属于类而不属于任何对象
 * String... books 形参个数可变
 */
public class c5_2_3_1 {

    public static void test(int a, String... books) {
        for (String tem : books
                ) {
            System.out.println(tem);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(5, "nihao", "java");
    }
}
