package Unit8;

import java.util.*;

/**
 * 设置不可变集合
 */
public class c8_8_4 {
    public static void main(String[] args) {
        //创建一个空的，不可变的List对象
        List list= Collections.emptyList();
        //创建一个只有一个元素，且不可变的Set对象
        Set set=Collections.singleton("疯狂java讲义");
        //创建一个普通的Map对象
        Map map=new HashMap();
        map.put("语文","80");
        map.put("Java","82");
        //返回普通的Map对象对应的不可变版本
        Map map1=Collections.unmodifiableMap(map);
    }
}
