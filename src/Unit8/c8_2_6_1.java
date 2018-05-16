package Unit8;

import java.util.Collection;
import java.util.HashSet;

/**
 * 流的操作
 */
public class c8_2_6_1 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("疯狂java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("轻量级 java EE 企业应用实战");
//        System.out.println(books.stream().filter(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return o.toString().contains("疯狂");
//            }
//        }).count());
//        System.out.println(books.stream().filter(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return o.toString().contains("java");
//            }
//        }).count());
//        System.out.println(books.stream().filter(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return o.toString().length()>10;
//            }
//        }).count());
//        books.stream().mapToInt(new ToIntFunction() {
//            @Override
//            public int applyAsInt(Object value) {
//                return value.toString().length();
//            }
//        }).forEach(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println(value);
//            }
//        });
        System.out.println(books.stream().filter(o -> o.toString()
                .contains("疯狂"))
                .count());
        System.out.println(books.stream().filter(o -> o.toString()
                .contains("java"))
                .count());
        System.out.println(books.stream().filter(o -> o.toString()
                .length()>10)
                .count());
        books.stream().mapToInt(value -> value.toString()
                .length())
                .forEach(value -> System.out.println(value));
    }
}
