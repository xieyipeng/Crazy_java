package Unit8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * �̶����ȵ� List
 */
public class c8_4_3 {
    public static void main(String[] args) {
        List fixedList= Arrays.asList("������ java EE ��ҵӦ��ʵս",
                "���IOS����");
        //��ȡfixedList��ʵ����
        System.out.println(fixedList.getClass());
        //��������Ԫ��
//        fixedList.forEach(System.out::println);
        fixedList.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        //��ͼ���ӻ�ɾ����������
        //fixedList.add("���java����");
    }
}
