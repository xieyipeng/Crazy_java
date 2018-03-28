package Unit8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * 使用Predicate操作集合
 * Predicate也是函数时接口
 */
public class c8_2_5 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("疯狂java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("轻量级 java EE 企业应用实战");
//        books.removeIf(o -> o.toString().length() > 10);
//        books.removeIf(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return Integer.valueOf(o.toString())>2;
//            }
//        });
        System.out.println(books);

        //统计“疯狂”“java”字符串和书名长度大于10的数量
        System.out.println(calAll(books, new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().contains("疯狂");
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
