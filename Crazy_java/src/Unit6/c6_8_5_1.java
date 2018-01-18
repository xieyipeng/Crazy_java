package Unit6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda表达式调用Arrays的类方法
 */
public class c6_8_5_1 {
    public static void main(String[] args) {
        //1、
        String[] strings1 = new String[]{"java", "windows", "ios", "mac", "linux", "android"};
        System.out.println(Arrays.toString(strings1));
        Arrays.parallelSort(strings1, Comparator.comparingInt(String::length));
        /**
         * Arrays.parallelSort(strings1, new Comparator<String>() {
         * @Override
         * public int compare(String o1, String o2) {
         * return o1.length()-o2.length();
         * }
         * });
         */
        /**
         * 输出字符串数组的ASCII值
         */
        for (String a : strings1) {
            int num = 0;
            for (int i = 0; i < a.length(); i++) {
                num = num + (int) a.charAt(i);
                //num=num+Integer.valueOf(a.charAt(i));
            }
            System.out.print(a + " ");
            System.out.println(num);
        }
        //2、
        int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr1, ((left, right) -> left * right));
        System.out.println(Arrays.toString(arr1));
        //3、
        long[] arr2 = new long[5];
        Arrays.parallelSetAll(arr2, operand -> operand * 5);
        System.out.println(Arrays.toString(arr2));
    }
}
