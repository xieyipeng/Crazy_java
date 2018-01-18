package Unit4;

//Arrays 类的用法
import java.util.Arrays;

public class c4_6_5_1 {
    public static void main(String[] args) {
        System.out.println("b数组的元素为  ");
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("a数组与a2数组是否相等  " + Arrays.equals(a, a2));
        int[] b= Arrays.copyOf(a,6);//复制a数组，生成新的b数组
        System.out.println("a数组与b数组是否相等  " + Arrays.equals(a, b));
        System.out.println("b数组的元素为  " + Arrays.toString(b));
        Arrays.fill(b,2,4,1);//b数组的从3到5的元素赋值为1
        System.out.println("b数组的元素为  " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("b数组的元素为  " + Arrays.toString(b));
    }
}
