package Unit8;

import java.util.HashMap;
import java.util.Map;

/**
 * Map������Ĭ�Ϸ���
 */
public class c8_6_1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //��η����key-value���е�value�����ظ�
        map.put("���java����", 109);
        map.put("���iOS����", 10);
        map.put("���Ajax����", 79);
        map.put("������java EE��ҵӦ��ʵս",99);
        //�����滻KeyΪ�����XML���塱��value
        map.replace("���XML����",66);
        System.out.println(map);
        //ʹ��ԭ����value�ʹ���Ĳ�����������Ľ������ԭ����value
//        map.merge("���iOS����", 10, new BiFunction() {
//            @Override
//            public Object apply(Object o, Object o2) {
//                return (Integer)o+(Integer)o2;
//            }
//        });
        map.merge("���iOS����", 10, (o, o2) -> (Integer)o+(Integer)o2);
        System.out.println("mod "+map);
        //��keyΪ��java����Ӧ��valueΪ�գ���NULL��ʱ��ʹ�ü���Ľ����Ϊ�µ�value
//        map.computeIfAbsent("Java", new Function() {
//            @Override
//            public Object apply(Object o) {
//                return null;
//            }
//        });
        map.computeIfAbsent("Java", o -> o.toString().length());
        System.out.println(map);
        //��keyΪ��Java����Ӧ��value����ʱ��ʹ�ü���Ľ����Ϊ�µ�value
//        map.computeIfPresent("Java", new BiFunction() {
//            @Override
//            public Object apply(Object o, Object o2) {
//                return (Integer)o*(Integer)o2;
//            }
//        });
        map.computeIfPresent("Java", (o, o2) -> (Integer)o2*(Integer)o2);
        System.out.println(map);
    }
}
