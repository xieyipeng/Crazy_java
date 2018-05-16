package Unit9;

/**
 * 不存在泛型类
 */
public class c9_2_3<T> {
    //下面代码错误，不能在静态变量声明中使用类型形参
    //static T info;
    T age;
    public void foo(T msg){

    }
    //下面代码错误，不能在静态方法里使用形参类型
//    public static void bar(T msg){
//
//    }
}
