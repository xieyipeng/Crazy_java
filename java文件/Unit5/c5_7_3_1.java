package Unit5;

/**
 * instanceof ǰһ�����������������ͱ���������Ĳ�������һ����
 *            �ж�ǰ��Ķ����Ƿ��Ǻ�������ʵ��
 *
 *            ǰ��Ĳ������ı���ʱ����Ҫô����������ͬ��Ҫô���и��Ӽ̳й�ϵ���������
 */
public class c5_7_3_1 {
    public static void main(String[] args) {
        Object hello="Hello";//����ʱ���ͣ�Object
        System.out.println("hello�Ƿ���object��ʵ����"+(hello instanceof Object));
        System.out.println("hello�Ƿ���string��ʵ����"+(hello instanceof String));
        System.out.println("hello�Ƿ���math��ʵ����"+(hello instanceof Math));
        System.out.println("hello�Ƿ���comparable��ʵ����"+(hello instanceof Comparable));
//        string��math�޹أ��������´������
//        String a="hello";
//        System.out.println(a instanceof Math);
    }
}
