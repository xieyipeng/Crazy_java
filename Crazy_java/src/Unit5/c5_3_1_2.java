package Unit5;

/**
 * �ֲ������ͳ�Ա��������ͬ��
 */
public class c5_3_1_2 {
    //��Ա����
    private String name="���";
    private static double piece=45.3;

    public static void main(String[] args) {
        //������ľֲ����������ǳ�Ա����
        int piece=78;
        System.out.println(piece);
        //45.3
        System.out.println(c5_3_1_2.piece);
        new c5_3_1_2().info();

    }
    public void info(){
        //������ľֲ����������ǳ�Ա����
        String name="�����";
        System.out.println(name);
        //this��Ϊname���޶������'���'
        System.out.println(this.name);
    }
}
