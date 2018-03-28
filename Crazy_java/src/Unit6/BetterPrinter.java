package Unit6;

public class BetterPrinter implements Output {
    private String[] printData=new String[Maxsize*2];
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
}
