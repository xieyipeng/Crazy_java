package Unit9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * java7的“菱形”用法
 */
public class c9_1_3 {
    public static void main(String[] args) {
        //java自动推断出ArrayList里面的类型是String
        List<String> list=new ArrayList<>();
        list.add("疯狂java讲义");
        list.add("疯狂Android讲义");
        //遍历
        list.forEach(s -> System.out.println(s.length()));
        //java自动推断出Map里应该是Sting，List<String>
        Map<String ,List<String>> map=new HashMap<>();
        //自动推断
        List<String > strings=new ArrayList<>();
        strings.add("斜月三星洞");
        strings.add("西天取经路");
        map.put("孙悟空",strings);
        map.forEach((s, strings1) -> System.out.println(s+"-->"+ strings1));
    }
}
