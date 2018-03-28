package Unit5;

/**
 * 静态初始化块
 * 先执行静态初始化块，在执行普通初始化块
 */
class Root{
    static {
        System.out.println("the root static initializer");
    }
    {
        System.out.println("the root initializer");
    }

    public Root() {
        System.out.println("the root construct");
    }
}
class Mid extends Root{
    static {
        System.out.println("the mid static initializer");
    }
    {
        System.out.println("the mid initializer");
    }

    public Mid() {
        System.out.println("the mid construct without number");
    }
    public Mid(String name){
        this();
        System.out.println("the mid construct with number,and the number is:"+name);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("the leaf static initializer");
    }
    {
        System.out.println("the leaf initializer");
    }

    public Leaf() {
        //super();
        super("java");
        System.out.println("the construct of leaf");
    }
}
public class c5_9_3_1 {
    public static void main(String[] args) {
        new Leaf();//静态初始化块只执行一次
        new Leaf();
    }
}
