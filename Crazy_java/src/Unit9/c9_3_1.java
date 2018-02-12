package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用类型通配符
 * List<?>  类型通配符
 */
public class c9_3_1 {
    public void test(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<?> list=new ArrayList<>();
        //这种带通配符的仅表示他是各种泛型List的父类，但并不能把元素加进去
        //list.add(new Object());
    }
}
