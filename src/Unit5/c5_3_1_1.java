package Unit5;

/**
 * 成员变量和局部变量
 */

class Person{
    public String name;//实例变量
    public static int eyeNum;//类变量
}

public class c5_3_1_1 {
    public static void main(String[] args) {
        //自动初始化
        System.out.println("Person的eyeNum类变量值"+Person.eyeNum);
        Person p=new Person();
        //通过person对象来访问name变量
        System.out.println("Person的eyeNum类变量值和name实例变量值为："+p.eyeNum+" "+p.name);
        p.name="孙悟空";
        Person.eyeNum=2;
        System.out.println("Person的eyeNum类变量值和name实例变量值为："+p.eyeNum+" "+p.name);
        System.out.println("Person的eyeNum类变量值"+Person.eyeNum);//通过p修改Person的eyeNum;
        Person p2=new Person();
        System.out.println("p2对象的eyeNum类变量值"+p2.eyeNum);
    }
}