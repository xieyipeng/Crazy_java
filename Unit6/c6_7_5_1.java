package Unit6;

/**
 * �����ڲ���
 */
interface Products{
    public double getPrice();
    public String getName();
}
public class c6_7_5_1 {
    public void test(Products products){
        System.out.println(products.getName()+"  "+products.getPrice());
    }

    public static void main(String[] args) {
        c6_7_5_1 c=new c6_7_5_1();
        /**
         *   new ʵ�ֽӿ� | ���๹������ʵ���б�
         *   {
         *      //�����ڲ�������岿��
         *    }
         */
        c.test(new Products() {
            @Override
            public double getPrice() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "�Կ�";
            }
        });
    }
}
