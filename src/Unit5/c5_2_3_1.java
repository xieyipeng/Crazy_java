package Unit5;

/**
 * static��������������κζ���
 * String... books �βθ����ɱ�
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
