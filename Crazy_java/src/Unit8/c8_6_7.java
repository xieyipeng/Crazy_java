package Unit8;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap
 * 在IdentityHashMap中，只有两个key对象严格相等时，才认为key相等
 * 对于普通的HashMap，只要通过equals()方法返回true即可
 */
public class c8_6_7 {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap=new IdentityHashMap();
        //添加两个
        identityHashMap.put(new String ("语文"),89);
        identityHashMap.put(new String ("语文"),91);
        //添加一个
        identityHashMap.put("java",93);
        identityHashMap.put("java",98);
        System.out.println(identityHashMap);
    }
}
