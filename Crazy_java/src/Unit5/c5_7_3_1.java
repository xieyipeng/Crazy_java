package Unit5;

/**
 * instanceof 前一个操作数是引用类型变量，后面的操作数是一个类
 *            判断前面的对象是否是后面的类的实例
 *
 *            前面的操作数的编译时类型要么与后面的类相同，要么具有父子继承关系，否则出错
 */
public class c5_7_3_1 {
    public static void main(String[] args) {
        Object hello="Hello";//编译时类型：Object
        System.out.println("hello是否是object的实例："+(hello instanceof Object));
        System.out.println("hello是否是string的实例："+(hello instanceof String));
        System.out.println("hello是否是math的实例："+(hello instanceof Math));
        System.out.println("hello是否是comparable的实例："+(hello instanceof Comparable));
//        string与math无关，所以以下代码出错
//        String a="hello";
//        System.out.println(a instanceof Math);
    }
}
