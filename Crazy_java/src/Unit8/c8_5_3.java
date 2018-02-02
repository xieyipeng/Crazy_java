package Unit8;

import java.util.LinkedList;

/**
 * LinkList实现类
 *
 * 链表形式
 * 是List，同时实现了Deque，可以当作双端队列来用，也可以当作栈
 */
public class c8_5_3 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        //队列
        linkedList.offer("疯狂java讲义");
        //栈
        linkedList.push("轻量级java EE企业应用实战");
        //添加元素到队列队首
        linkedList.offerFirst("疯狂Android讲义");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("遍历中"+linkedList.get(i));
        }
        //访问并不删除栈顶元素
        System.out.println("栈顶元素  "+linkedList.peekFirst());
        //访问并不删除队列最后一个元素
        System.out.println(linkedList.peekLast());
        //栈顶元素出栈
        System.out.println(linkedList.pop());
        //队列中第一个元素被删除
        System.out.println(linkedList);
        //访问并删除队列最后一个元素
        System.out.println(linkedList.pollLast());
        //输出
        System.out.println(linkedList);
    }
}
