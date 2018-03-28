package Unit6;

/**
 * lambda���ʽ�������ڲ������ϵ������
 */
@FunctionalInterface
interface Displayable {
    void display();

    /**
     * �ӿ��е�Ĭ�Ϸ�����
     * <p>
     * Default������ָ��
     * �ڽӿ��ڲ�������һЩĬ�ϵķ���ʵ�֣�Ҳ���ǽӿ��п��԰�������
     * �壬�������Java֮ǰ�汾�Խӿڵ��﷨���ƣ�,�Ӷ�ʹ�ýӿ��ڽ�
     * ����չ��ʱ�򣬲����ƻ���ӿ���ص�ʵ������롣
     *
     * @param a ��һ������
     * @param b �ڶ�������
     * @return a+b
     */
    default int add(int a, int b) {
        return a + b;
    }
}

public class c6_8_4_1 {
    private int age = 12;
    private static String name = "��������������";

    public void test() {
        String book = "���java����";
        Displayable displayable = () -> {
            //book�൱������ʽ��final����
            //String a="hello";
            //book=a;
            System.out.println("book:" + book); //���� ��effectively final�� �ľֲ�����
            System.out.println("age:" + age);   //�����ⲿ���ʵ������
            System.out.println("name" + name);  //���������
            //System.out.println(add(3,5));   //����
            /**
             * lambda���ʽ�в��ܵ��ýӿ��е�Ĭ�Ϸ���
             * lambda���ʽֻ��Ϊ����ʱ�ӿڴ���ʵ��
             * ��ʹ�������ڲ�������Ե��ã�����lambda���ʽ���ܵ��� add() ����
             */
        };
        /**
         * //lambda���ʽ
         * Displayable displayable=new Displayable() {
         * @Override
         * public void display() {
         * System.out.println("book:"+book);
         * System.out.println("age:"+age);
         * System.out.println("name"+name);
         * }
         * };
         */
        displayable.display();
        System.out.println(displayable.add(3, 5));
    }

    public static void main(String[] args) {
        c6_8_4_1 c = new c6_8_4_1();
        c.test();
    }
}
