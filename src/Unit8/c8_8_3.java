package Unit8;

import java.util.*;

/**
 * Collection
 * ͬ������
 */
public class c8_8_3 {
    public static void main(String[] args) {
        //����4���̰߳�ȫ�ļ��϶���
        Collection collection= Collections.synchronizedCollection(new ArrayList());
        List list=Collections.synchronizedList(new ArrayList());
        Set set=Collections.synchronizedSet(new HashSet());
        Map map=Collections.synchronizedMap(new HashMap());
    }
}
