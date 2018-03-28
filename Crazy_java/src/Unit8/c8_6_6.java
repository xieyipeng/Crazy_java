package Unit8;

import java.util.WeakHashMap;

/**
 * WeakHashMap
 * HashMap�����������ǿ���ã����ᱻ�ڴ�����
 * WeakHashMap�����˶���������ã����ܱ��ڴ����
 * <p>
 * ���������ջ��ƻ����˸�key����Ӧ��ʵ�ʶ����WeakHashMap
 * ���Զ�ɾ����key��Ӧ��key-value��
 */
public class c8_6_6 {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(new String("����"), new String("����"));
        weakHashMap.put(new String("��ѧ"), new String("����"));
        weakHashMap.put(new String("Ӣ��"), new String("�е�"));
        //�����һ��key-value��,key��ϵͳ������ַ�������
        //��key��һ���ַ������͵�ֱ����
        //�������ջ��Ʋ�������
        weakHashMap.put("java", new String("�е�"));
        //���4��
        System.out.println("first  " + weakHashMap);
        //֪ͨϵͳ������������
        System.gc();
        System.runFinalization();
        //ͨ������£���ֻ����һ��key-value��
        System.out.println("last  " + weakHashMap);
    }
}
