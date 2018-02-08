package Unit8;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

/**
 * SortedMap接口和TreeMap实现类
 * 和Set一样，Map接口派生出一个SortedMap接口，SortedMap接口也有一个TreeMap实现类
 * TreeMap就是一个红黑树数据结构
 */

class F implements Comparable{
    int count;

    public F(int count) {
        this.count = count;
    }

    public String toString() {
        return "F[count:" + count + "]";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == F.class) {
            F f = (F) object;
            return f.count == this.count;
        }
        return false;
    }

    public int compareTo(Object object) {
        F f = (F) object;
        return count > f.count ? 1 : count < f.count ? -1 : 0;
    }
}

public class c8_6_5 {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put(new F(3),"轻量级java EE企业 应用实践");
        treeMap.put(new F(-5),"疯狂java讲义");
        treeMap.put(new F(9),"疯狂Android讲义");
        System.out.println(treeMap);
        //返回第一个对象的Entry
        System.out.println(treeMap.firstEntry());
        //返回第一个对象的key
        System.out.println(treeMap.firstKey());
        //返回改treeMap的比new(2)大的最小key值
        System.out.println(treeMap.higherKey(new F(2)));
        //返回改treeMap的比new(2)小的最大的key-value对
        System.out.println(treeMap.lowerEntry(new F(2)));
        //返回该TreeMap的子TreeMap
        System.out.println(treeMap.subMap(new F(-1),new F(4)));
    }
}
