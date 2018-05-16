package Unit8;

import java.util.HashMap;
import java.util.Map;

/**
 * Map
 * key 数组，value数组
 * Map 的 key 数组组成一个 Set 数组（无序，不重复）
 */
public class c8_6 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //多次放入的key-value对中的value可以重复
        map.put("疯狂java讲义", 109);
        map.put("疯狂iOS讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级java EE企业应用实战",99);
        System.out.println(map);
        System.out.println(map.put("疯狂iOS讲义", 10));
        System.out.println(map);
        //map是否包含值为 疯狂iOS讲义 的key
        System.out.println(map.containsKey("疯狂iOS讲义"));
        //是否包含值为 99 的value
        System.out.println(map.containsValue(99));

        //获取所有的key组成的集合
        for (Object key  : map.keySet()){
            System.out.println(key+"-->"+map.get(key));
        }
        map.remove("疯狂iOS讲义");
        System.out.println(map);
    }
}
