package Unit8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List
 * 可以调用collection里的所有方法
 * 因为有索引，所以添加了一些有关索引的新方法
 * List判断相等，只要equals()方法相等就好
 */
public class c8_4_1 {
    public static void main(String[] args) {
        List books=new ArrayList();
        books.add(new String("轻量级 java EE 企业应用实战"));
        books.add(new String("疯狂IOS讲义"));
        books.add(new String("疯狂java讲义"));
        System.out.println(books);
        //将新字符串添加进第二个位置
        books.add(1,"疯狂Ajax讲义");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        //判断指定元素在List中的位置
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
        //将第二个元素替换掉
        books.set(1,new String("疯狂讲义"));
        System.out.println(books);
        //降级合理的第二个元素（包括）到第三个元素（不包括）截成子集
        System.out.println(books.subList(1,2));
        //   [轻量级 java EE 企业应用实战, 疯狂讲义, 疯狂java讲义]
        System.out.println(books);
        //Sort方法和ReplaceAll方法
        books.sort((o1, o2) -> o1.toString().length()-o2.toString().length());
//        books.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return o1.toString().length()-o2.toString().length();
//            }
//        });
        System.out.println("排序  "+books);
        books.replaceAll(o -> o.toString().length());
//        books.replaceAll(new UnaryOperator() {
//            @Override
//            public Object apply(Object o) {
//                return o.toString().length();
//            }
//        });
        System.out.println(books);

        //List提供了ListIterator

        String[] book={
                "轻量级 java EE 企业应用实战",
                "疯狂IOS讲义",
                "疯狂java讲义"
        };
        List bookList=new ArrayList();
        for (int i = 0; i < book.length; i++) {
            bookList.add(book[i]);
        }
        ListIterator listIterator=bookList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.add("--分隔符--");
        }
        System.out.println("--反迭代--");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
