package Unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * ����
 */
public class c9_1_1 {
    //����ʱ��������͵��쳣
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("���java����");
        list.add("���Android����");
        //��Integer���Ͷ��󶪽�ȥ
        list.add(5);
        //ѭ���������
//        list.forEach(new Consumer() {
//            @Override
//            public void accept(Object object) {
//                System.out.println(((String)object).length());
//            }
//        });
        list.forEach(new Consumer() {
            @Override
            public void accept(Object object) {
                System.out.println(object.toString().length());
            }
        });
    }
}
