package Unit8;

import java.util.LinkedList;

/**
 * LinkListʵ����
 *
 * ������ʽ
 * ��List��ͬʱʵ����Deque�����Ե���˫�˶������ã�Ҳ���Ե���ջ
 */
public class c8_5_3 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        //����
        linkedList.offer("���java����");
        //ջ
        linkedList.push("������java EE��ҵӦ��ʵս");
        //���Ԫ�ص����ж���
        linkedList.offerFirst("���Android����");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("������"+linkedList.get(i));
        }
        //���ʲ���ɾ��ջ��Ԫ��
        System.out.println("ջ��Ԫ��  "+linkedList.peekFirst());
        //���ʲ���ɾ���������һ��Ԫ��
        System.out.println(linkedList.peekLast());
        //ջ��Ԫ�س�ջ
        System.out.println(linkedList.pop());
        //�����е�һ��Ԫ�ر�ɾ��
        System.out.println(linkedList);
        //���ʲ�ɾ���������һ��Ԫ��
        System.out.println(linkedList.pollLast());
        //���
        System.out.println(linkedList);
    }
}
