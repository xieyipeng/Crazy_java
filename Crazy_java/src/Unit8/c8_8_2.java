package Unit8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collection
 * �����滻����
 */
public class c8_8_2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(-5);
        arrayList.add(3);
        arrayList.add(0);
        System.out.println(arrayList);
        System.out.println("���Ԫ��" + Collections.max(arrayList));
        System.out.println("��СԪ��" + Collections.max(arrayList));
        Collections.replaceAll(arrayList,0,1);
        System.out.println(arrayList);
        //�ж�-5�ڼ����е�λ��
        System.out.println(Collections.frequency(arrayList,-5));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //�������ַ�����
        System.out.println(Collections.binarySearch(arrayList,3));
    }
}
