package Unit7;

import java.util.Objects;

/**
 * java7 ������ Objects ��
 */
public class c7_3_2 {
    static c7_3_2 obj;
    private c7_3_2 c;

    /**
     * �Է����вν���Ч��
     *
     * @param c ����Ĳ���
     */
    void test(c7_3_2 c) {
        this.c = Objects.requireNonNull(c);
    }

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        //System.out.println(Objects.requireNonNull(obj,"obj����������NULL"));

    }
}
