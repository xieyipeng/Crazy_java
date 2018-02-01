package Unit8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 固定长度的 List
 */
public class c8_4_3 {
    public static void main(String[] args) {
        List fixedList= Arrays.asList("轻量级 java EE 企业应用实战",
                "疯狂IOS讲义");
        //获取fixedList的实现类
        System.out.println(fixedList.getClass());
        //遍历集合元素
//        fixedList.forEach(System.out::println);
        fixedList.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        //试图增加或删除都将报错
        //fixedList.add("疯狂java讲义");
    }
}
