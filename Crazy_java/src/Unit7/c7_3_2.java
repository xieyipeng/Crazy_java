package Unit7;

import java.util.Objects;

/**
 * java7 新增的 Objects 类
 */
public class c7_3_2 {
    static c7_3_2 obj;
    private c7_3_2 c;

    /**
     * 对方法行参进行效验
     *
     * @param c 传入的参数
     */
    void test(c7_3_2 c) {
        this.c = Objects.requireNonNull(c);
    }

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        //System.out.println(Objects.requireNonNull(obj,"obj参数不能是NULL"));

    }
}
