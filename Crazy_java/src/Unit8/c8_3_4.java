package Unit8;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * EnumSet
 *      1、内容为制定枚举类型的枚举值
 *      2、有序的
 */
enum Season{
    SPRING,SUMMER,FALL,WINTER
}
public class c8_3_4{
    public static void main(String[] args) {
        EnumSet enumSet=EnumSet.allOf(Season.class);
        System.out.println(enumSet);
        //创建一个EnumSet空集合，集合元素是Season类的枚举值
        EnumSet enumSet1=EnumSet.noneOf(Season.class);
        System.out.println(enumSet1);
        enumSet1.add(Season.WINTER);
        enumSet1.add(Season.SPRING);
        System.out.println("1  "+enumSet1);
        //以指定枚举创建EnumSet集合
        EnumSet enumSet2=EnumSet.of(Season.SPRING,Season.WINTER);
        System.out.println("2  "+enumSet2);
        EnumSet enumSet3=EnumSet.range(Season.SUMMER,Season.WINTER);
        System.out.println("3  "+enumSet3);
        EnumSet enumSet4=EnumSet.complementOf(enumSet3);
        System.out.println("4  "+enumSet4);

        Collection collection=new HashSet();
        collection.clear();
        collection.add(Season.SPRING);
        collection.add(Season.WINTER);
        //复制collection到EnumSet集合
        //必须保证collection里面的元素都是一个枚举类下面的枚举类型
        EnumSet enumSet5=EnumSet.copyOf(collection);
        System.out.println("5  "+enumSet5);

    }
}
