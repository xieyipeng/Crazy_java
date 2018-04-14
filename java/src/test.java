
public class test {
    public static void main(String[] args) {
        new Son();
    }
}
class Parent {
    protected int n = 5;
    protected static int m = 5;
    static {
        m = m * 2;
        System.out.println("父类静态块调用；    m="+m);
    }
    {
        n = n * 2;
        m = m * 2;
        System.out.print("父类构造块调用；");
        System.out.print("n="+n);
        System.out.println("    m="+m);
    }

    public Parent() {
        this.n = n * 10;
        m = m + 10;
        System.out.print("父类构造函数；    n="+n);
        System.out.println("    m="+m);
    }

    public Parent(int n) {
        this.n = n * 10;
        System.out.println("这是带参数的父类构造方法");

    }
}

class Son extends Parent {
    private int sn=3;
    private static int sm=3;
    static {
        m = m + 2;
        sm=sm+2;
        System.out.println("子类静态块调用；    m="+m);
    }
    {
        n = n + 2;
        sn=sn+2;
        m = m + 2;
        System.out.println("子类构造块调用；");
        System.out.print("n="+n);
        System.out.print("   sn="+sn);
        System.out.println("    m="+m);
    }

    public Son() {
        //super();
        /**
         * 父类静态块调用；    m=10
         * 子类静态块调用；    m=12
         * 父类构造块调用；n=10    m=24
         * 父类构造函数；    n=100    m=34
         * 子类构造块调用；
         * n=102   sn=5    m=36
         * 子类构造函数；n=112    m=46
         */
        super(10);
        /**
         * 父类静态块调用；    m=10
         * 子类静态块调用；    m=12
         * 父类构造块调用；n=10    m=24
         * 这是带参数的父类构造方法
         * 子类构造块调用；
         * n=102   sn=5    m=26
         * 子类构造函数；n=112    m=36
         */
        this.n = n + 10;
        sn=sn+10;
        m = m + 10;
        System.out.print("子类构造函数；n="+n);
        System.out.println("    m="+m);
    }
}
