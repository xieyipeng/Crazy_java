package Unit5;

/**
 * 继承
 * 重写父类的方法
 */
public class c5_6_1_1 extends Fruit{

    @Override
    public void fly() {
        System.out.println("I can run at this land");

        super.fly();
    }

    public static void main(String[] args) {
        Fruit fruit=new Fruit();
        fruit.weight=5.6;
        fruit.info();

        fruit.fly();
        c5_6_1_1 c5_6_1_1=new c5_6_1_1();
        c5_6_1_1.fly();

    }
}
class Fruit{
    public double weight;
    public void info(){
        System.out.println("this fruit is "+weight+"g");
    }
    public void fly(){
        System.out.println("the bired can fly");
    }
}
