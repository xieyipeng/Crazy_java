package Unit8;

import java.util.TreeMap;

/**
 * SortedMap�ӿں�TreeMapʵ����
 * ��Setһ����Map�ӿ�������һ��SortedMap�ӿڣ�SortedMap�ӿ�Ҳ��һ��TreeMapʵ����
 * TreeMap����һ����������ݽṹ
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
        treeMap.put(new F(3),"������java EE��ҵ Ӧ��ʵ��");
        treeMap.put(new F(-5),"���java����");
        treeMap.put(new F(9),"���Android����");
        System.out.println(treeMap);
        //���ص�һ�������Entry
        System.out.println(treeMap.firstEntry());
        //���ص�һ�������key
        System.out.println(treeMap.firstKey());
        //���ظ�treeMap�ı�new(2)�����Сkeyֵ
        System.out.println(treeMap.higherKey(new F(2)));
        //���ظ�treeMap�ı�new(2)С������key-value��
        System.out.println(treeMap.lowerEntry(new F(2)));
        //���ظ�TreeMap����TreeMap
        System.out.println(treeMap.subMap(new F(-1),new F(4)));
    }
}
