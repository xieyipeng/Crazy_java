package Unit6;

/**
 * 接口的枚举类
 */
interface GenderDesc{
    void info();
}
enum Gender1 implements GenderDesc{
    MALE("男") {
        @Override
        public void info() {
            System.out.println("hello female");
        }
    },FEMALE("女") {
        @Override
        public void info() {
            System.out.println("hello male");
        }
    };
    public final String name;
    Gender1(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
public class c6_9_4_1 {
    public static void main(String[] args) {
        Gender1 gender1=Enum.valueOf(Gender1.class,"FEMALE");
        System.out.println(gender1.name);
    }
}
