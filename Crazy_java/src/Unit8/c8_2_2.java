package Unit8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterator��������������
 * Iterator����������Collection����
 * ���������в��ܸ��ļ���Ԫ��
 */
public class c8_2_2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.add(4);
        //��ȡbooks��Ӧ�ĵ�����
        Iterator iterator = books.iterator();
//        while (iterator.hasNext()){
//            String book = iterator.next().toString();
//            System.out.println(book);
//            if (book.equals("2")){
//                iterator.remove();
//            }
//            book="�����ַ���";
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
