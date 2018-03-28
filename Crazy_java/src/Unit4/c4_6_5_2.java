package Unit4;

//java8Arrays增加的工具方法

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class c4_6_5_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, -5, -89, -15, -15, 32};
        //对arr1进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{4, -5, -89, -15, -15, 32};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            @Override
            //left代表数组中前一个索引处的元素，计算第一个元素时，left为1
            //right代表数组中当前索引处的元素
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });

        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
