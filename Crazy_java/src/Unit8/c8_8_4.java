package Unit8;

import java.util.*;

/**
 * ���ò��ɱ伯��
 */
public class c8_8_4 {
    public static void main(String[] args) {
        //����һ���յģ����ɱ��List����
        List list= Collections.emptyList();
        //����һ��ֻ��һ��Ԫ�أ��Ҳ��ɱ��Set����
        Set set=Collections.singleton("���java����");
        //����һ����ͨ��Map����
        Map map=new HashMap();
        map.put("����","80");
        map.put("Java","82");
        //������ͨ��Map�����Ӧ�Ĳ��ɱ�汾
        Map map1=Collections.unmodifiableMap(map);
    }
}
