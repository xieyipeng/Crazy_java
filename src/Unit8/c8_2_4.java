package Unit8;

import java.util.Collection;
import java.util.HashSet;

public class c8_2_4 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.add(4);
        for (Object object:
             books) {
            String book=object.toString();
            System.out.println(book);
            if (book.equals("2")){
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
