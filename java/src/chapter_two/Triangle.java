package chapter_two;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        char a = 'A';
        int line = scanner.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line * 2; j++) {
                if (j < line - i || j > line + i) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (a + i));
                }
            }
            System.out.println();
        }
    }
}
