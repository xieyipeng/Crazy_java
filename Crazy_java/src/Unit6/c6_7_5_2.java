package Unit6;

/**
 * 匿名内部类
 * 通过继承父类
 */
abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(){

    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class c6_7_5_2 {
    public void test(Device device){
        System.out.println(device.getName()+"  "+device.getPrice());
    }

    public static void main(String[] args) {
        c6_7_5_2 c=new c6_7_5_2();
        c.test(new Device("red") {
            @Override
            public double getPrice() {
                return 68.7;
            }
        });

        Device device=new Device() {
            {
                System.out.println("初始化块");
            }
            @Override
            public double getPrice() {
                return 56.2;
            }

            @Override
            public String getName() {
                return "键盘";
            }
        };
        c.test(device);
    }
}
