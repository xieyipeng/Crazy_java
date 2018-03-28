package test1;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month;
        System.out.println("请输入一个1到12的整形变量代表月份：");
        month=scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
           default:
                System.out.println("请输入正确的月份！！");
                break;
        }
    }
}