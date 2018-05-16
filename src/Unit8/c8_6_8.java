package Unit8;

import java.util.EnumMap;

/**
 * EnumMap
 * 所有key都必须是单个枚举类的枚举值，创建EnumMap必须显式或隐式指定所对应的枚举类
 */
public class c8_6_8 {
    public static void main(String[] args) {
        EnumMap enumMap=new EnumMap(Season.class);
        enumMap.put(Season.SUMMER,"夏日炎炎");
        enumMap.put(Season.SPRING,"春暖花开");
        System.out.println(enumMap);
    }
}
