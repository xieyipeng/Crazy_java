package Unit4;

//Arrays ����÷�
import java.util.Arrays;

public class c4_6_5_1 {
    public static void main(String[] args) {
        System.out.println("b�����Ԫ��Ϊ  ");
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("a������a2�����Ƿ����  " + Arrays.equals(a, a2));
        int[] b= Arrays.copyOf(a,6);//����a���飬�����µ�b����
        System.out.println("a������b�����Ƿ����  " + Arrays.equals(a, b));
        System.out.println("b�����Ԫ��Ϊ  " + Arrays.toString(b));
        Arrays.fill(b,2,4,1);//b����Ĵ�3��5��Ԫ�ظ�ֵΪ1
        System.out.println("b�����Ԫ��Ϊ  " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("b�����Ԫ��Ϊ  " + Arrays.toString(b));
    }
}
