package Unit9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 设置通配符下限
 * 不管src集合元素的类型是什么，只要dest集合元素的
 * 类型与前者相同或是前者的父类即可
 */
public class c9_4_4 {
    public static <T> T copy(Collection<? super T> dest, Collection<T> src) {
        T last = null;
        for (T ele :
                src) {
            last = ele;
            dest.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        //此处可明确地知道最后一个被复制的元素是Integer类型
        //与src集合元素类型相同
        Integer last = copy(numberList, integerList);
        System.out.println(last);
    }
}
