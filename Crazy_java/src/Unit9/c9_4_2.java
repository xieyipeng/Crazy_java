package Unit9;

/**
 * �����﷨�뷺�͹�����
 */

class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}

class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("t�Ĳ���ֵ��" + t);
    }
}

public class c9_4_2 {
    public static void main(String[] args) {
        new Foo("���java����");
        new Foo(200);
        new <String>Foo("���Android����");
        System.out.println("*********");
        //�������ͣ�E��String��T��Integer
        MyClass<String> myClass1=new MyClass<String>(5);
        //��ʽָ��T
        MyClass<String> myClass2=new <Integer>MyClass<String>(56);
        //�����ʽָ��T�βε����ͣ��Ͳ���ʹ�á����Ρ��﷨
    }
}
