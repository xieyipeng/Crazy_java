package Unit6;

/**
 * ��װ��
 */
public class c6_1_1_1 {
    public static void main(String[] args) {
        Integer inObj=5;
        Object boolObj=true;
        int it=inObj;
        if(boolObj instanceof Boolean){
            boolean b=(Boolean)boolObj;
            System.out.println(b);
        }
    }
}
