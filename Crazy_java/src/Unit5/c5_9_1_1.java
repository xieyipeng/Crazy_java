package Unit5;

/**
 * ��ʼ����
 * java��ִ�г�ʼ�����ڲ��Ĵ���
 */
public class c5_9_1_1 {
    int a=9;
    {
        int a=6;
        if (a>4){
            System.out.println("a>4,the first chushihuakuai...");
        }
    }

    {
        System.out.println("the  second chushihuakuai");
    }

    public c5_9_1_1() {
        System.out.println("construct");
    }

    public static void main(String[] args) {
        c5_9_1_1 c5_9_1_1=new c5_9_1_1();
        System.out.println(c5_9_1_1.a);
    }
}
