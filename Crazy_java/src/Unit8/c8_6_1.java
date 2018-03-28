package Unit8;

import java.util.HashMap;
import java.util.Map;

/**
 * Map新增的默认方法
 */
public class c8_6_1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //多次放入的key-value对中的value可以重复
        map.put("疯狂java讲义", 109);
        map.put("疯狂iOS讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级java EE企业应用实战",99);
        //尝试替换Key为“疯狂XML讲义”的value
        map.replace("疯狂XML讲义",66);
        System.out.println(map);
        //使用原来的value和传入的参数计算出来的结果覆盖原来的value
//        map.merge("疯狂iOS讲义", 10, new BiFunction() {
//            @Override
//            public Object apply(Object o, Object o2) {
//                return (Integer)o+(Integer)o2;
//            }
//        });
        map.merge("疯狂iOS讲义", 10, (o, o2) -> (Integer)o+(Integer)o2);
        System.out.println("mod "+map);
        //当key为“java”对应的value为空（或NULL）时，使用计算的结果作为新的value
//        map.computeIfAbsent("Java", new Function() {
//            @Override
//            public Object apply(Object o) {
//                return null;
//            }
//        });
        map.computeIfAbsent("Java", o -> o.toString().length());
        System.out.println(map);
        //当key为“Java”对应的value存在时，使用计算的结果作为新的value
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
