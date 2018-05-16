package Unit8;

import java.util.Collection;
import java.util.HashSet;

/**
 * lambda±í´ïÊ½
 */
public class c8_2_1 {
    public static void main(String[] args) {
        Collection books=new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.add(4);
        books.forEach(object -> System.out.println(object));
//        books.forEach(new Consumer() {
//            @Override
//            public void accept(Object object) {
//                System.out.println(object);
//            }
//        });
    }
}
