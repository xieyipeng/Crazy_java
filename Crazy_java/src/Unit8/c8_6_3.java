package Unit8;

import java.util.LinkedHashMap;
/**
 * LinkedHashMap实现类
 */
public class c8_6_3 {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("语文",50);
        linkedHashMap.put("数学",80);
        linkedHashMap.put("英语",100);
        linkedHashMap.forEach((o, o2) -> System.out.println(o+"-->"+o2));
    }
}
