package Unit6;

/**
 * ������
 */
class Singlengh{
    private static Singlengh singlengh;

    /**
     * �Թ�����ʹ��private����
     */
    private Singlengh(){

    }
    public static Singlengh getSinglengh(){
        if(singlengh==null){
            singlengh=new Singlengh();
        }
        return singlengh;
    }
}
public class c6_3_2_1 {
    public static void main(String[] args) {
        Singlengh singlengh1=Singlengh.getSinglengh();
        Singlengh singlengh2=Singlengh.getSinglengh();
        System.out.println(singlengh1==singlengh2);
    }
}
