package test1;

import java.util.Scanner;

public class BigAndSmall {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int a,b;
        System.out.println("请输入两个数：");
        a=scanner.nextInt();
        b=scanner.nextInt();
        if (a>b){
            System.out.println(a+" "+b);
        }else {
            System.out.println(b+" "+a);
        }
    }
}
