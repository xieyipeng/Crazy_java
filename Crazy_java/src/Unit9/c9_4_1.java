package Unit9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 泛型方法
 * 定义泛型方法
 */
public class c9_4_1 {
    //泛型方法
    static <T> void fromArrayToCollection(T [] a, Collection<T> collection){
        for (T o :
                a) {
            collection.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] object=new Object[10];
        Collection<Object> collection=new ArrayList<>();
        //下面代码中T代表Object类型
        fromArrayToCollection(object,collection);

        String[] strings=new String[100];
        Collection<String> collection1=new ArrayList<>();
        //下面T代表String类型
        fromArrayToCollection(strings,collection1);
        //...
    }
}
