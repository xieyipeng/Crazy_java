package Unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 使用泛型
 */
public class c9_1_2 {
    public static void main(String[] args) {
        //创建一个只想保存字符串的集合
        List<String> strings=new ArrayList<>();
        strings.add("疯狂java讲义");
        strings.add("疯狂Android讲义");
        //下面编译出错
        //strings.add(5);
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        });
    }
}
