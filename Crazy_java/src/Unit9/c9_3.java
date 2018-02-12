package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符
 * String是Object类的子类，但:
 * List<String>类并不是List<Object>类的子类
 */
public class c9_3 {
    public static void main(String[] args) {
        // 0.5并不是Integer类型
        Integer[] integers=new Integer[5];
        Number[] numbers=integers;
        numbers[0]=0.2;
        System.out.println(numbers);

        //在泛型上有了改进
        List<Integer> list=new ArrayList<>();
        //下面代码出错
        //List<Number> list1=list;
    }
}
