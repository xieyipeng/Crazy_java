package Unit6;

/**
 * java 8 �����ڽӿ��ﶨ��Ĭ�Ϸ���
 */
interface Product{
    int getProductTime();
}
public class c6_6_1_1 implements Product,Output{

    private String[] printData=new String[Maxsize];
    private int dataNum=0;

    @Override
    public void out() {
        while (dataNum>0){
            System.out.println("��ӡ����ӡ: "+printData[0]);
            //����ҵ��������ǰ��һλ�����µ���ҵ����һ
            System.arraycopy(printData,1,printData,0,--dataNum);//ʵ������֮��ĸ���
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum>=Maxsize){
            System.out.println("it is full");
        }else {
            printData[dataNum++]=msg;
        }
    }

    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o=new c6_6_1_1();
        o.getData("hello1");
        o.getData("hello2");
        o.out();
        o.getData("hello3");
        o.getData("hello4");
        o.out();

        o.print("hello5","hello6","hello7");
        o.test();

        Product product=new c6_6_1_1();
        System.out.println(product.getProductTime());
        Object object=product;
    }
}