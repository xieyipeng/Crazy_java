package Unit8;

import java.util.LinkedHashMap;
/**
 * LinkedHashMapʵ����
 */
public class c8_6_3 {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("����",50);
        linkedHashMap.put("��ѧ",80);
        linkedHashMap.put("Ӣ��",100);
        linkedHashMap.forEach((o, o2) -> System.out.println(o+"-->"+o2));
    }
}
