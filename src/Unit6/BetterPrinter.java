package Unit6;

public class BetterPrinter implements Output {
    private String[] printData=new String[Maxsize*2];
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
}
