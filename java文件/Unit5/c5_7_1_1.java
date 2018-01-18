package Unit5;

/**
 *   多态
 *   编译时类型与运行时类型
 */
class Baseclass {
    public int book = 6;

    public void base() {
        System.out.println("父类中的普通方法");
    }

    public void test() {
        System.out.println("父类中被覆盖的方法");
    }
}
public class c5_7_1_1 extends Baseclass{
    public String book="轻量级java";
    public void test(){
        System.out.println("子类中覆盖父类的方法");
    }
    public void sub(){
        System.out.println("子类中的普通方法");
    }
    public static void main(String[] args) {
        Baseclass baseclass=new Baseclass();//编译时类型与运行时类型相同
        System.out.println(baseclass.book);
        baseclass.base();
        baseclass.test();

        c5_7_1_1 c=new c5_7_1_1();//编译时类型与运行时类型相同
        System.out.println(c.book);
        c.sub();
        c.test();

        Baseclass plo=new c5_7_1_1();//编译时类型与运行时类型不同，发生多态，向上转型
        System.out.println(plo.book);//调用父类的book
        plo.base();//执行父类的base
        plo.test();//执行当前类的test
    }
}