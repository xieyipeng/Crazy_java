package Unit9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ����ͨ�������
 * ����src����Ԫ�ص�������ʲô��ֻҪdest����Ԫ�ص�
 * ������ǰ����ͬ����ǰ�ߵĸ��༴��
 */
public class c9_4_4 {
    public static <T> T copy(Collection<? super T> dest, Collection<T> src) {
        T last = null;
        for (T ele :
                src) {
            last = ele;
            dest.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        //�˴�����ȷ��֪�����һ�������Ƶ�Ԫ����Integer����
        //��src����Ԫ��������ͬ
        Integer last = copy(numberList, integerList);
        System.out.println(last);
    }
}
