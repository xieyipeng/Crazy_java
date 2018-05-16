package Unit8;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 * 可以保存插入顺序
 */
public class c8_3_2 {
    public static void main(String[] args) {
        LinkedHashSet books=new LinkedHashSet();
        books.add("疯狂java讲义");
        books.add("轻量级java EE企业应用实践");
        System.out.println(books);
        books.remove("疯狂java讲义");
        books.add("疯狂java讲义");
        System.out.println(books);
    }
}
