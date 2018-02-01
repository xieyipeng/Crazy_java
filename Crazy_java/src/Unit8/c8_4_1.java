package Unit8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List
 * ���Ե���collection������з���
 * ��Ϊ�����������������һЩ�й��������·���
 * List�ж���ȣ�ֻҪequals()������Ⱦͺ�
 */
public class c8_4_1 {
    public static void main(String[] args) {
        List books=new ArrayList();
        books.add(new String("������ java EE ��ҵӦ��ʵս"));
        books.add(new String("���IOS����"));
        books.add(new String("���java����"));
        System.out.println(books);
        //�����ַ�����ӽ��ڶ���λ��
        books.add(1,"���Ajax����");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        //�ж�ָ��Ԫ����List�е�λ��
        System.out.println(books.indexOf(new String("���Ajax����")));
        //���ڶ���Ԫ���滻��
        books.set(1,new String("�����"));
        System.out.println(books);
        //��������ĵڶ���Ԫ�أ���������������Ԫ�أ����������س��Ӽ�
        System.out.println(books.subList(1,2));
        //   [������ java EE ��ҵӦ��ʵս, �����, ���java����]
        System.out.println(books);
        //Sort������ReplaceAll����
        books.sort((o1, o2) -> o1.toString().length()-o2.toString().length());
//        books.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return o1.toString().length()-o2.toString().length();
//            }
//        });
        System.out.println("����  "+books);
        books.replaceAll(o -> o.toString().length());
//        books.replaceAll(new UnaryOperator() {
//            @Override
//            public Object apply(Object o) {
//                return o.toString().length();
//            }
//        });
        System.out.println(books);

        //List�ṩ��ListIterator

        String[] book={
                "������ java EE ��ҵӦ��ʵս",
                "���IOS����",
                "���java����"
        };
        List bookList=new ArrayList();
        for (int i = 0; i < book.length; i++) {
            bookList.add(book[i]);
        }
        ListIterator listIterator=bookList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.add("--�ָ���--");
        }
        System.out.println("--������--");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
