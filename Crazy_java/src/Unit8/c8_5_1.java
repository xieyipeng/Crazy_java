package Unit8;

import java.util.PriorityQueue;

/**
 * ����
 * PriorityQueue����ݼ���Ԫ�أ��Ĵ�С��������
 * ����ȥ���ĵ�һ��Ԫ�ز�������ν�ĵ�һ��Ԫ��
 */
public class c8_5_1 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(6);
        priorityQueue.offer(-3);
        priorityQueue.offer(20);
        priorityQueue.offer(18);
        //��û�кܺõ�����
        System.out.println(priorityQueue);
        //���ʵ�һ��Ԫ�ز�ɾ��
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        //���ʵ�һ��Ԫ�ز�ɾ��
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
