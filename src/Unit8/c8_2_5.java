package Unit8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * ʹ��Predicate��������
 * PredicateҲ�Ǻ���ʱ�ӿ�
 */
public class c8_2_5 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("���java����");
        books.add("���IOS����");
        books.add("���Ajax����");
        books.add("������ java EE ��ҵӦ��ʵս");
//        books.removeIf(o -> o.toString().length() > 10);
//        books.removeIf(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return Integer.valueOf(o.toString())>2;
//            }
//        });
        System.out.println(books);

        //ͳ�ơ���񡱡�java���ַ������������ȴ���10������
        System.out.println(calAll(books, new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().contains("���");
            }
        }));
        System.out.println(calAll(books, new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().contains("java");
            }
        }));
        System.out.println(calAll(books, new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().length() > 10;
            }
        }));

    }

    private static int calAll(Collection books, Predicate predicate) {
        int total = 0;
        for (Object object : books) {
            if (predicate.test(object)) {
                total++;
            }
        }
        return total;
    }
}
