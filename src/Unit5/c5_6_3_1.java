package Unit5;

/**
 * ����ת��
 */
public class c5_6_3_1 {
    public static void main(String[] args) {

        Der der=new Der();
        System.out.println(((parent)der).tag);//����ת��
    }
}
class parent {
    public String tag="hello";
}
class Der extends parent{
    private String tag="hello world";
}