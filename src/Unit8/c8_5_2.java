package Unit8;

import java.util.ArrayDeque;

/**
 * ˫�˶���
 * Deque�ӿ���ArrayDequeʵ����
 * ���Ե���ջ��ʹ��,Ҳ��������������������
 */
public class c8_5_2 {
    public static void main(String[] args) {
        //ջ
        ArrayDeque stack=new ArrayDeque();
        stack.push("���java����");
        stack.push("������java EE��ҵӦ��ʵս");
        stack.push("���Android����");
        //���
        System.out.println(stack);
        //���ջ��Ԫ�أ�������ջ
        System.out.println(stack.peek());
        //popջ��Ԫ��
        System.out.println(stack.pop());
        //���
        System.out.println(stack);

        //����
        ArrayDeque queue=new ArrayDeque();
        queue.offer("���java����");
        queue.offer("������java EE��ҵӦ��ʵս");
        queue.offer("���Android����");
        //���
        System.out.println(queue);
        //�������Ԫ�أ����ǲ�������
        System.out.println(queue.peek());
        //���
        System.out.println(queue);
        //�������Ԫ�أ�����Ԫ�س���
        System.out.println(queue.pop());
        //���
        System.out.println(queue);
    }
}
