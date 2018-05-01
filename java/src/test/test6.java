package test;

import java.util.*;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("输入10个整数：");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        double count=0;
        for (int i = 0; i < list.size(); i++) {
            count=count+list.get(i);
        }
        Collections.sort(list);
        double avg=count/10;
        System.out.println(list);
        System.out.println("最大值："+list.get(list.size()-1));
        System.out.println("最小值："+list.get(0));
        System.out.println("平均值："+avg);
        Date date=new Date();
        System.out.println(date);
    }
}
