package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ͨ���
 * String��Object������࣬��:
 * List<String>�ಢ����List<Object>�������
 */
public class c9_3 {
    public static void main(String[] args) {
        // 0.5������Integer����
        Integer[] integers=new Integer[5];
        Number[] numbers=integers;
        numbers[0]=0.2;
        System.out.println(numbers);

        //�ڷ��������˸Ľ�
        List<Integer> list=new ArrayList<>();
        //����������
        //List<Number> list1=list;
    }
}
