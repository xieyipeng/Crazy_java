package Unit8;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap
 * ��IdentityHashMap�У�ֻ������key�����ϸ����ʱ������Ϊkey���
 * ������ͨ��HashMap��ֻҪͨ��equals()��������true����
 */
public class c8_6_7 {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap=new IdentityHashMap();
        //�������
        identityHashMap.put(new String ("����"),89);
        identityHashMap.put(new String ("����"),91);
        //���һ��
        identityHashMap.put("java",93);
        identityHashMap.put("java",98);
        System.out.println(identityHashMap);
    }
}
