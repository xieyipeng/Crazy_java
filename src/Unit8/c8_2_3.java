package Unit8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * lambda���ʽ����Iterator
 */
public class c8_2_3 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.add(4);
        Iterator iterator=books.iterator();
        iterator.forEachRemaining(o -> System.out.println("��������Ԫ�� "+o));
//        iterator.forEachRemaining(new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println("��������Ԫ�� "+o);
//            }
//        });
    }
}
