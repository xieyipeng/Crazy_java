package Unit5;

/**
 * 组合
 * 继承：表达is-a的关系
 * 组合：表达has-a的关系
 */
//class animal1 {
//    private void beat(){
//        System.out.println("the heart is going...");
//    }
//    public void breath(){
//        beat();
//        System.out.println("he is breathing...");
//    }
//}
//class brid extends animal1{
//    public void fly(){
//        System.out.println("he is flying...");
//    }
//}
//class wolf extends animal1{
//    public void run(){
//        System.out.println("he is runing...");
//    }
//}
//public class c5_8_2_1 {
//    public static void main(String[] args) {
//        brid b=new brid();
//        b.breath();
//        b.fly();
//        wolf w=new wolf();
//        w.breath();
//        w.run();
//    }
//}
class animal1 {
    private void beat(){
        System.out.println("the heart is going...");
    }
    public void breath(){
        beat();
        System.out.println("he is breathing...");
    }
}
class Brid{
    private animal1 a;

    public Brid(animal1 a) {//construct
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void fly(){
        System.out.println("he is flying...");
    }
}
class Wolf{
    private animal1 a;

    public Wolf(animal1 a) {//construct
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void run(){
        System.out.println("he is runing...");
    }
}
public class c5_8_2_1{
    public static void main(String[] args) {
        animal1 a1=new animal1();
        Brid brid=new Brid(a1);
        brid.breath();
        brid.fly();
        animal1 a2=new animal1();
        Wolf wolf=new Wolf(a2);
        wolf.breath();
        wolf.run();
    }
}