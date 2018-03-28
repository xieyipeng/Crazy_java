package Unit5;

/**
 * 子类中不能调用父类的构造器，但可以调用父类构造器的初始化代码
 */
class base{
    public double size;
    public String name;

    public base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}
public class c5_6_4_1 extends base{

    public String color;


    public c5_6_4_1(double size, String name,String color) {
        super(size, name);//调用父类构造器的初始化代码
        this.color=color;
    }

    public static void main(String[] args) {
        c5_6_4_1 c5_6_4_1=new c5_6_4_1(5.6,"xiaoming", "red");
        System.out.println(c5_6_4_1.color+"--"+c5_6_4_1.name+"--"+c5_6_4_1.size);
    }

}
