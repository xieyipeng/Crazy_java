package Unit8;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * 繁琐的接口：Enumeration
 * Enumeration迭代器只能用来遍历Vector、Hashtable这种古老的集合
 */
public class c8_9 {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("疯狂java讲义");
        vector.add("轻量级java EE企业应用实践");
        Hashtable hashtable=new Hashtable();
        hashtable.put("语文","80");
        hashtable.put("数学","83");
        Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        Enumeration enumeration1=hashtable.keys();
        while (enumeration1.hasMoreElements()){
            Object object=enumeration1.nextElement();
            System.out.println("key "+hashtable.get(object));
        }
    }
}
