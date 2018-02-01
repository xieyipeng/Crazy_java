package Unit8;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * EnumSet
 *      1������Ϊ�ƶ�ö�����͵�ö��ֵ
 *      2�������
 */
enum Season{
    SPRING,SUMMER,FALL,WINTER
}
public class c8_3_4{
    public static void main(String[] args) {
        EnumSet enumSet=EnumSet.allOf(Season.class);
        System.out.println(enumSet);
        //����һ��EnumSet�ռ��ϣ�����Ԫ����Season���ö��ֵ
        EnumSet enumSet1=EnumSet.noneOf(Season.class);
        System.out.println(enumSet1);
        enumSet1.add(Season.WINTER);
        enumSet1.add(Season.SPRING);
        System.out.println("1  "+enumSet1);
        //��ָ��ö�ٴ���EnumSet����
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
        //����collection��EnumSet����
        //���뱣֤collection�����Ԫ�ض���һ��ö���������ö������
        EnumSet enumSet5=EnumSet.copyOf(collection);
        System.out.println("5  "+enumSet5);

    }
}
