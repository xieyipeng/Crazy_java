package Unit8;

import java.util.HashMap;
import java.util.Map;

/**
 * Map
 * key ���飬value����
 * Map �� key �������һ�� Set ���飨���򣬲��ظ���
 */
public class c8_6 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //��η����key-value���е�value�����ظ�
        map.put("���java����", 109);
        map.put("���iOS����", 10);
        map.put("���Ajax����", 79);
        map.put("������java EE��ҵӦ��ʵս",99);
        System.out.println(map);
        System.out.println(map.put("���iOS����", 10));
        System.out.println(map);
        //map�Ƿ����ֵΪ ���iOS���� ��key
        System.out.println(map.containsKey("���iOS����"));
        //�Ƿ����ֵΪ 99 ��value
        System.out.println(map.containsValue(99));

        //��ȡ���е�key��ɵļ���
        for (Object key  : map.keySet()){
            System.out.println(key+"-->"+map.get(key));
        }
        map.remove("���iOS����");
        System.out.println(map);
    }
}
