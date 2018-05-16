package Unit5;

/**
 * 继承和组合
 * 组合：实现类复用的重要方式,能提供更好的封装性
 *
 * final修饰类
 * 设置成最终类，不可当父类
 *
 */
class bask{
    public bask() {
        test();
    }
    public void test() {
        System.out.println("父类中构造函数调用的方法");
    }
}
public class c5_8_1_1 extends bask{
    private String name;

    @Override
    public void test() {
        System.out.println("子类中重写父类的方法"+"the length of this name"+name.length());
    }

    public static void main(String[] args) {
        c5_8_1_1 c5_8_1_1=new c5_8_1_1();
    }
}
