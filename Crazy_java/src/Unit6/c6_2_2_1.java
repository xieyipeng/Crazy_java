package Unit6;

/**
 * == �� equals ����
 * ==��
 * ����ǻ������ͱ������Ҷ�����ֵ���ͣ���ôֻҪ����������ֵ��ȣ��ͷ���true
 * �����������������ͱ�����ֻ������ָ��ͬһ������ʱ������true
 *   ** ==���������ж�������û�и��ӹ�ϵ�ı��� **
 */

/**
 * ��дequals��������Person==Dog
 */
class P{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class dog{

}
public class c6_2_2_1 {
    public static void main(String[] args) {
        int it=65;
        float dl=65.0f;
        System.out.println("if the 65==65.0? "+(it==dl));
        char ch='A';
        System.out.println("if the ch==65? "+(ch==it));

        /**
         * ��� String s1= "hello";
         *     String s2= "hello";
         *     ��==�ж�Ϊtrue
         */
        //false
        String s1= new String ("hello");
        String s2= new String ("hello");

        System.out.println("if the s1==s2? "+(s1==s2));
        System.out.println("if the si equals s2? "+(s1.equals(s2)));

        P p=new P();
        System.out.println(p.equals(new dog()));

    }
}
