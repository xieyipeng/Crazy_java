package Unit5;

/**
 *   ��̬
 *   ����ʱ����������ʱ����
 */
class Baseclass {
    public int book = 6;

    public void base() {
        System.out.println("�����е���ͨ����");
    }

    public void test() {
        System.out.println("�����б����ǵķ���");
    }
}
public class c5_7_1_1 extends Baseclass{
    public String book="������java";
    public void test(){
        System.out.println("�����и��Ǹ���ķ���");
    }
    public void sub(){
        System.out.println("�����е���ͨ����");
    }
    public static void main(String[] args) {
        Baseclass baseclass=new Baseclass();//����ʱ����������ʱ������ͬ
        System.out.println(baseclass.book);
        baseclass.base();
        baseclass.test();

        c5_7_1_1 c=new c5_7_1_1();//����ʱ����������ʱ������ͬ
        System.out.println(c.book);
        c.sub();
        c.test();

        Baseclass plo=new c5_7_1_1();//����ʱ����������ʱ���Ͳ�ͬ��������̬������ת��
        System.out.println(plo.book);//���ø����book
        plo.base();//ִ�и����base
        plo.test();//ִ�е�ǰ���test
    }
}