package Unit5;

/**
 * ǿ��ת������
 * instanceof  �ж��Ƿ����ǿ��ת��
 */
public class c5_7_2_1 {
    public static void main(String[] args) {
        double d=3.14;
        long l=(long)d;
        System.out.println(l);
        Object object="hello";
        String objstr=(String)object;
        System.out.println(objstr);

        Object obj=new Integer(5);
        if(obj instanceof String){
            System.out.println("hello");
            String str=(String)obj;
        }
    }
}
