package Unit6;

/**
 * �������ͱ������ַ���֮���ת��
 * valueOf();
 */
public class c6_1_1_2 {
    public static void main(String[] args) {
        String intStr="123";
        int it1=Integer.parseInt(intStr);//parse �䷨����;�䷨�������
        int it2=new Integer(intStr);
        System.out.println(it1);
        System.out.println(it2);

        String floatStr="12.33";
        float ft1=Float.parseFloat(floatStr);
        float ft2=new Float(floatStr);
        System.out.println(ft1);
        System.out.println(ft2);

        String ftStr=String.valueOf(2.345f);
        System.out.println(ftStr);

        String dbStr=String.valueOf(3.12);
        System.out.println(dbStr);

        String boolStr=String.valueOf(true);
        //System.out.println(boolStr);

        System.out.println(boolStr.toUpperCase());//���ַ���ת��Ϊ��д
        System.out.println(boolStr.toLowerCase());//���ַ���ת��ΪСд
    }
}
