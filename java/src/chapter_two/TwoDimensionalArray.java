package chapter_two;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        /**
         * 二维非矩阵数组
         */
        int[][] a = {{0}, {1, 2}, {2, 3, 4}, {3, 4, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
