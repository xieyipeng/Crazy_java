package Unit6;

/**
 * 打印对象，toString方法
 */
class Apple{
    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 重写 toString方法
     * @return string
     */
    public String toString(){
        return "the color is :"+color+","+"the weight is :"+weight;
    }

}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
public class c6_2_1_1 {
    public static void main(String[] args) {
        Person person=new Person("孙悟空");
        System.out.println(person);//类名+@+hashCode
        System.out.println(person.toString());//和上面一样

        String s=person+"";
        System.out.println(s);//和上面一样

        Apple apple=new Apple("red",16);
        /**
         * 因为再父类里面 重写 了toString方法，所以可以输出
         */
        System.out.println(apple);



    }
}
