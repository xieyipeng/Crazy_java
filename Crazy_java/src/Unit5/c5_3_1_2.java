package Unit5;

/**
 * 局部变量和成员变量可以同名
 */
public class c5_3_1_2 {
    //成员变量
    private String name="李刚";
    private static double piece=45.3;

    public static void main(String[] args) {
        //方法里的局部变量，覆盖成员变量
        int piece=78;
        System.out.println(piece);
        //45.3
        System.out.println(c5_3_1_2.piece);
        new c5_3_1_2().info();

    }
    public void info(){
        //方法里的局部变量，覆盖成员变量
        String name="孙悟空";
        System.out.println(name);
        //this作为name的限定，输出'李刚'
        System.out.println(this.name);
    }
}
