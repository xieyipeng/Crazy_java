package Unit8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection和Iterator接口
 */
public class c8_1_2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("孙悟空");
        collection.add(6);
        System.out.println("collection.size()" + collection.size());
        collection.remove(6);
        System.out.println("collection.size()" + collection.size());
        //判断是否包含“孙悟空”
        System.out.println("collection.contains孙悟空" + collection.contains("孙悟空"));
        collection.add("轻量级Java EE企业应用实战");
        System.out.println("collection" + collection);
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("Java疯狂讲义");
        System.out.println("collection是否完全包含books" + collection.containsAll(books));
        //减去collection里面的books内容
        collection.removeAll(books);
        System.out.println("collection" + collection);
        //删除collection里面的所有元素
        collection.clear();
        System.out.println("collection" + collection);
        //控制books里面只剩下collection包含的元素
        books.retainAll(collection);
        System.out.println("books" + books);
    }
}
