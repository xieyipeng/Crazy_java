package Unit8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection��Iterator�ӿ�
 */
public class c8_1_2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("�����");
        collection.add(6);
        System.out.println("collection.size()" + collection.size());
        collection.remove(6);
        System.out.println("collection.size()" + collection.size());
        //�ж��Ƿ����������ա�
        System.out.println("collection.contains�����" + collection.contains("�����"));
        collection.add("������Java EE��ҵӦ��ʵս");
        System.out.println("collection" + collection);
        Collection books = new HashSet();
        books.add("������Java EE��ҵӦ��ʵս");
        books.add("Java�����");
        System.out.println("collection�Ƿ���ȫ����books" + collection.containsAll(books));
        //��ȥcollection�����books����
        collection.removeAll(books);
        System.out.println("collection" + collection);
        //ɾ��collection���������Ԫ��
        collection.clear();
        System.out.println("collection" + collection);
        //����books����ֻʣ��collection������Ԫ��
        books.retainAll(collection);
        System.out.println("books" + books);
    }
}
