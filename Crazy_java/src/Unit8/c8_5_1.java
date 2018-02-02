package Unit8;

import java.util.PriorityQueue;

/**
 * 队列
 * PriorityQueue会根据加入元素，的大小进行排序
 * 即，去除的第一个元素并不是所谓的第一个元素
 */
public class c8_5_1 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(6);
        priorityQueue.offer(-3);
        priorityQueue.offer(20);
        priorityQueue.offer(18);
        //并没有很好的排序
        System.out.println(priorityQueue);
        //访问第一个元素并删除
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        //访问第一个元素不删除
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
