package Unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * ʹ�÷���
 */
public class c9_1_2 {
    public static void main(String[] args) {
        //����һ��ֻ�뱣���ַ����ļ���
        List<String> strings=new ArrayList<>();
        strings.add("���java����");
        strings.add("���Android����");
        //����������
        //strings.add(5);
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        });
    }
}
