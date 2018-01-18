package Unit6;

/**
 * 单例类
 */
class Singlengh{
    private static Singlengh singlengh;

    /**
     * 对构造器使用private修饰
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
