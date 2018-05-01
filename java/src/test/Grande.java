package test;

import java.util.Date;
import java.util.Scanner;

public class Grande {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int grande=scanner.nextInt();
        if (grande>100){
            System.out.println("成绩格式不正确！");
        }else if (grande>=90){
            System.out.println("优");
        }else if (grande>=80){
            System.out.println("良");
        }else if (grande>=70){
            System.out.println("中");
        }else if (grande>=60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        Date date=new Date();
        System.out.println(date);
    }
}
