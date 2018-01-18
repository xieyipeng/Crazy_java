package Unit6;

public interface Output {
    int Maxsize=50;
    void out();
    void getData(String msg);
    default void print(String ...mags){
        for (String msg:
             mags) {
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("this test find");
    }
    static String staticTest(){//属于类不属于对象
        return "接口里的类方法";
    }
}
