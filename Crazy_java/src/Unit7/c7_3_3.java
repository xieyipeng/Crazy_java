package Unit7;

/**
 * String
 *      ���ɱ���
 * StringBuffer
 *      �ɱ䣬����Լ���Ҫ��֮��ɵ��� toString() ת���� String
 * StringBuilder
 *      �� StringBuffer �������ƣ��࿼�����̰߳�ȫ
 */
public class c7_3_3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        //׷���ַ���
        stringBuilder.append("java");
        System.out.println(stringBuilder);
        //����
        stringBuilder.insert(0,"hello ");
        System.out.println(stringBuilder);
        //�滻
        stringBuilder.replace(5,6,",");
        System.out.println(stringBuilder);
        //��ת
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());   //����޶�
        stringBuilder.setLength(5);
        System.out.println(stringBuilder);
    }
}
