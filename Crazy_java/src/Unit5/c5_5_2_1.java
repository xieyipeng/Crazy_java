package Unit5;

/**
 * 构造器内调用构造器
 */
public class c5_5_2_1 {
    public String name;

    public String color;
    public double weight;
    public c5_5_2_1(){

    }

    public c5_5_2_1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public c5_5_2_1(String name, String color, double weight) {
        this(name,color);//构造器内调用构造器
        this.weight = weight;
    }
}
