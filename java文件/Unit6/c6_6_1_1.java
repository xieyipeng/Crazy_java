package Unit6;

/**
 * java 8 允许在接口里定义默认方法
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
            System.out.println("打印机打印: "+printData[0]);
            //将作业队列整体前移一位，上下的作业数减一
            System.arraycopy(printData,1,printData,0,--dataNum);//实现数组之间的复制
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