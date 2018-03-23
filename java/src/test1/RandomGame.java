package test1;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int number=1+random.nextInt(100);
        int UserIn=-1;
        int count=0;
        System.out.println("请输入你猜的数字：");
        while (UserIn!=number){
            count++;
            UserIn=scanner.nextInt();
            if (UserIn>number){
                System.out.println("您输入的数字太大了，请输入小一点的数字：");
            }else if (UserIn==number){
                System.out.println("随机数字为"+number+".");
                System.out.println("恭喜你猜中了！！"+"共用了"+count+"次");
            } else if (UserIn<number){
                System.out.println("您输入的数字太小了，请输入大一点的数字：");
            }
        }
    }
}