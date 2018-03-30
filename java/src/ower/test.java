package ower;

import java.util.*;

public class test {
    public static void main(String[] args) {
        /**
         * 保存输入的数据
         */
        Scanner scanner1 = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("请输入行数：");
        int lineNumber = scanner1.nextInt();
        for (int i = 0; i < lineNumber; i++) {
            Scanner scanner2 = new Scanner(System.in);
            String string = scanner2.nextLine();
            String[] strings = string.split(" ");
            for (int j = 0; j < strings.length; j++) {
                list.add(Integer.parseInt(strings[j]));
            }
        }
//        System.out.println(list);
//        System.out.println(list.hashCode());
//        System.out.println("排序后"+list);
//        System.out.println(list.hashCode());
        /**
         * 找出并删除相同的数据
         */
        List<Integer> result = new ArrayList<>();
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    result.add(list.get(i));
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
//        无法记录被删除的数据
//        HashSet<Integer> temp = new HashSet<>(list);
//        ArrayList<Integer> withoutSame=new ArrayList<>(temp);
//        System.out.println(withoutSame);
        /**
         * 排序
         */
        Collections.sort(list);
        /**
         * 找出缺少的元素
         */
        int minNumber = list.get(0);
        int maxNumber = list.get(list.size() - 1);
        for (int i = minNumber; i < maxNumber; i++) {
            if (!list.contains(i)){
                result.add(i);
            }
        }
        /**
         * 最终输出
         */
        System.out.println(result);
    }
}