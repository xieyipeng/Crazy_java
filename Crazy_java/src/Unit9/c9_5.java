package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ת��
 */
class Apole<T extends Number> {
    T size;

    public Apole() {
    }

    public Apole(T size) {
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }
}

public class c9_5 {
    public static void main(String[] args) {
        System.out.println("****����****");
        Apole<Integer> integerApole1=new Apole<>(6);
        Integer integer=integerApole1.getSize();
        //��integerApole1���󸳸�����������Ϣ��integerApole2ʱ����ʧ�˼��������������Ϣ
        Apole integerApole2=integerApole1;
        //integerApole2ֻ֪��size��������Number
        Number size1=integerApole2.getSize();
        //����������
        //Integer size2=integerApole2.getSize();
        System.out.println("****ת��****");
        List<Integer> integerList=new ArrayList<>();
        integerList.add(6);
        integerList.add(9);
        List list=integerList;
        //����������𾯸棬�������б���ʱ��ȫ����
        List<String> stringList=list;
        //��ֻҪ���������Ԫ�أ�����������ʱ�쳣
        System.out.println(stringList.get(0));
    }
}
