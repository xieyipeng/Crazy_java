package Unit5;

/**
 * �̳к����
 * ��ϣ�ʵ���ิ�õ���Ҫ��ʽ,���ṩ���õķ�װ��
 *
 * final������
 * ���ó������࣬���ɵ�����
 *
 */
class bask{
    public bask() {
        test();
    }
    public void test() {
        System.out.println("�����й��캯�����õķ���");
    }
}
public class c5_8_1_1 extends bask{
    private String name;

    @Override
    public void test() {
        System.out.println("��������д����ķ���"+"the length of this name"+name.length());
    }

    public static void main(String[] args) {
        c5_8_1_1 c5_8_1_1=new c5_8_1_1();
    }
}