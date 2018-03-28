package Unit9;

/**
 * 菱形语法与泛型构造器
 */

class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}

class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("t的参数值：" + t);
    }
}

public class c9_4_2 {
    public static void main(String[] args) {
        new Foo("疯狂java讲义");
        new Foo(200);
        new <String>Foo("疯狂Android讲义");
        System.out.println("*********");
        //两个类型，E是String，T是Integer
        MyClass<String> myClass1=new MyClass<String>(5);
        //显式指定T
        MyClass<String> myClass2=new <Integer>MyClass<String>(56);
        //如果显式指定T形参的类型，就不能使用“菱形”语法
    }
}
