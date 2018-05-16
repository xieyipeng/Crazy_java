package Unit8;

import java.util.*;

/**
 * Collection
 * 同步控制
 */
public class c8_8_3 {
    public static void main(String[] args) {
        //创建4个线程安全的集合对象
        Collection collection= Collections.synchronizedCollection(new ArrayList());
        List list=Collections.synchronizedList(new ArrayList());
        Set set=Collections.synchronizedSet(new HashSet());
        Map map=Collections.synchronizedMap(new HashMap());
    }
}
