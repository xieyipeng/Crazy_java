package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * ʹ������ͨ���
 * List<?>  ����ͨ���
 */
public class c9_3_1 {
    public void test(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<?> list=new ArrayList<>();
        //���ִ�ͨ����Ľ���ʾ���Ǹ��ַ���List�ĸ��࣬�������ܰ�Ԫ�ؼӽ�ȥ
        //list.add(new Object());
    }
}
