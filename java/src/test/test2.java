package test;

import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字：");
        int number=scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        Date date=new Date();
        System.out.println(date);
    }
}
