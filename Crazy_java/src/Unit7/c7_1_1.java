package Unit7;

/**
 * ���û�����
 * ����java����Ĳ���
 * public
 * static
 * void
 * String[] args - args���ַ�����������
 */
public class c7_1_1 {
    public static void main(String[] args) {
        System.out.println(args.length);               //���0;
        /**
         * ������java����ʱ���������������һ�������ַ�����
         * JVM�ͻ����Щ�ַ������θ���args���顣
         */
        for (String arg : args) {                      //��ִ��
            System.out.println("hello");
            System.out.println(arg);
        }
    }
}
