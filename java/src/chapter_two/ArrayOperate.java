package chapter_two;

import java.text.DecimalFormat;

public class ArrayOperate {
    public static void main(String[] args) {
        /**
         * 控制小数点的输出
         */
        int[] ints = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = ints[0];
        int min = ints[0];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            count = count + ints[i];
            if (ints[i] > max) {
                max = ints[i];
            }
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        double area = (double) count / ints.length;
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        System.out.println("最大值 " + max);
        System.out.println("最小值 " + min);
        System.out.println("平均值 " + decimalFormat.format(area));
        System.out.println("所有元素的和 " + count);
        System.out.println(ints.length);
    }
}
