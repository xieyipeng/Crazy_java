package Unit9;

/**
 * 泛型方法与方法重载
 * java8改进的类型推断
 */
class MyUtil<E>{
    public static <Z> MyUtil<Z>nil(){
        return null;
    }
    public static <Z> MyUtil<Z> cons(Z head,MyUtil<Z> tail){
        return null;
    }
    E head(){
        return null;
    }
}
public class c9_4_5 {
    public static void main(String[] args) {
        //可通过方法赋值的目标参数来推断类型参数为String
        MyUtil<String> stringMyUtil1=MyUtil.nil();
        //无需指定参数类型
        MyUtil<String> stringMyUtil2=MyUtil.<String>nil();
        //可调用cons方法所需的参数类型来推断类型参数为Integer
        MyUtil.cons(42,MyUtil.nil());
        //无需指定参数类型
        MyUtil.cons(42,MyUtil.<Integer>nil());
    }
}
