package Unit8;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 * ���Ա������˳��
 */
public class c8_3_2 {
    public static void main(String[] args) {
        LinkedHashSet books=new LinkedHashSet();
        books.add("���java����");
        books.add("������java EE��ҵӦ��ʵ��");
        System.out.println(books);
        books.remove("���java����");
        books.add("���java����");
        System.out.println(books);
    }
}
