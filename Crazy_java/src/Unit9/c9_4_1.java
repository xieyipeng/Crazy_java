package Unit9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * ���ͷ���
 * ���巺�ͷ���
 */
public class c9_4_1 {
    //���ͷ���
    static <T> void fromArrayToCollection(T [] a, Collection<T> collection){
        for (T o :
                a) {
            collection.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] object=new Object[10];
        Collection<Object> collection=new ArrayList<>();
        //���������T����Object����
        fromArrayToCollection(object,collection);

        String[] strings=new String[100];
        Collection<String> collection1=new ArrayList<>();
        //����T����String����
        fromArrayToCollection(strings,collection1);
        //...
    }
}
