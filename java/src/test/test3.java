package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入0-9之间的整数");
        long number=scanner.nextLong();
        if (number>9||number<0){
            System.out.println("数字错误！");
            return;
        }else {
            List<Long> list=new ArrayList<>();
            list.add(number);
            for (int i = 0; i < 9; i++) {
                list.add(list.get(list.size()-1)*10+number);
            }
            long count=0;
            for (int i = 0; i < list.size(); i++) {
                count=count+list.get(i);
            }
            System.out.println("count:"+count);
            Date date=new Date();
            System.out.println(date);
        }
    }
}
