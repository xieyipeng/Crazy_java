package Unit8;

import java.util.EnumMap;

/**
 * EnumMap
 * ����key�������ǵ���ö�����ö��ֵ������EnumMap������ʽ����ʽָ������Ӧ��ö����
 */
public class c8_6_8 {
    public static void main(String[] args) {
        EnumMap enumMap=new EnumMap(Season.class);
        enumMap.put(Season.SUMMER,"��������");
        enumMap.put(Season.SPRING,"��ů����");
        System.out.println(enumMap);
    }
}
