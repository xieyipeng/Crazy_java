package Unit8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterator迭代器遍历数组
 * Iterator必须依赖于Collection对象
 * 迭代过程中不能更改集合元素
 */
public class c8_2_2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.add(4);
        //获取books对应的迭代器
        Iterator iterator = books.iterator();
//        while (iterator.hasNext()){
//            String book = iterator.next().toString();
//            System.out.println(book);
//            if (book.equals("2")){
//                iterator.remove();
//            }
//            book="测试字符串";
//        }
//        System.out.println("*********");
//        System.out.println(books);
        while (iterator.hasNext()) {
            String book = iterator.next().toString();
            System.out.println(book);
            if (book.equals("2")) {
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
