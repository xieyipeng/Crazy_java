package Unit6;

/**
 * 静态内部类
 */
public class c6_7_2_1 {
    private int prop1=5;
    private static int prop2=9;

    /**
     * 静态内部类
     */
    static class StaticInnerClass{
        private static int age;
        public void accessOuterProp(){
            //System.out.println(prop1);
            System.out.println(prop2);
        }
    }
}
