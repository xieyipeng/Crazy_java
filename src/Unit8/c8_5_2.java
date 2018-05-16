package Unit8;

import java.util.ArrayDeque;

/**
 * 双端队列
 * Deque接口与ArrayDeque实现类
 * 可以当成栈来使用,也可以用来当做队列来用
 */
public class c8_5_2 {
    public static void main(String[] args) {
        //栈
        ArrayDeque stack=new ArrayDeque();
        stack.push("疯狂java讲义");
        stack.push("轻量级java EE企业应用实战");
        stack.push("疯狂Android讲义");
        //输出
        System.out.println(stack);
        //输出栈顶元素，但不出栈
        System.out.println(stack.peek());
        //pop栈顶元素
        System.out.println(stack.pop());
        //输出
        System.out.println(stack);

        //队列
        ArrayDeque queue=new ArrayDeque();
        queue.offer("疯狂java讲义");
        queue.offer("轻量级java EE企业应用实战");
        queue.offer("疯狂Android讲义");
        //输出
        System.out.println(queue);
        //输出队首元素，但是不出队列
        System.out.println(queue.peek());
        //输出
        System.out.println(queue);
        //输出队首元素，对手元素出队
        System.out.println(queue.pop());
        //输出
        System.out.println(queue);
    }
}
