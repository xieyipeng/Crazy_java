package Unit6;

/**
 * == 和 equals 方法
 * ==：
 * 如果是基本类型变量，且都是数值类型，那么只要两个变量的值相等，就返回true
 * 但对于两个引用类型变量，只有他们指向同一个对象时，返回true
 *   ** ==不能用来判断类型上没有父子关系的变量 **
 */

/**
 * 重写equals方法，令Person==Dog
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
         * 变成 String s1= "hello";
         *     String s2= "hello";
         *     用==判断为true
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
