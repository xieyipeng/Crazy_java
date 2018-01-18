package Unit6;

/**
 * 抽象类
 */
abstract class Shape {
    {
        System.out.println("初始化块...");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
public class c6_5_1_1 extends Shape {
    private double a;
    private double b;
    private double c;
    public c6_5_1_1(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setSide(double a, double b, double c) {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("两边之和大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calPerimeter() {
        return a + b + c;
    }
    @Override
    public String getType() {
        return "三角形";
    }
}
class circle extends Shape {
    private double radius;
    public circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calPerimeter() {
        return 2*radius*Math.PI;
    }
    @Override
    public String getType() {
        return "圆形";
    }
    public static void main(String[] args) {
        Shape shape1=new c6_5_1_1("red",3,5,4);
        Shape shape2=new circle("green",2);
        System.out.println(shape1.getType());
        System.out.println(shape1.calPerimeter());
        System.out.println(shape2.getType());
        System.out.println(shape2.calPerimeter());
    }
}