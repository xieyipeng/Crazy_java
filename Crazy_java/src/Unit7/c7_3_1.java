package Unit7;

/**
 * Object类
 * 自我克隆
 */
class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

public class c7_3_1 implements Cloneable {
    int age;
    Address address;

    public c7_3_1(int age) {
        this.age = age;
    }
    public c7_3_1 clone()
            throws CloneNotSupportedException{
        return (c7_3_1)super.clone();
    }
}
class CloneTest{
    public static void main(String[] args)
            throws CloneNotSupportedException{
        c7_3_1 c1=new c7_3_1(29);
        c7_3_1 c2=c1.clone();
        System.out.println(c1==c2);                      //false
        System.out.println(c1.address==c2.address);      //true
        System.out.println(c1.address);                  //NULL
    }
}
