package Unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 泛型
 */
public class c9_1_1 {
    //编译时不检查类型的异常
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("疯狂java讲义");
        list.add("疯狂Android讲义");
        //将Integer类型对象丢进去
        list.add(5);
        //循环输出出错
//        list.forEach(new Consumer() {
//            @Override
//            public void accept(Object object) {
//                System.out.println(((String)object).length());
//            }
//        });
        list.forEach(new Consumer() {
            @Override
            public void accept(Object object) {
                System.out.println(object.toString().length());
            }
        });
    }
}
