package Unit6;

/**
 * ��ӡ����toString����
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
     * ��д toString����
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
        Person person=new Person("�����");
        System.out.println(person);//����+@+hashCode
        System.out.println(person.toString());//������һ��

        String s=person+"";
        System.out.println(s);//������һ��

        Apple apple=new Apple("red",16);
        /**
         * ��Ϊ�ٸ������� ��д ��toString���������Կ������
         */
        System.out.println(apple);



    }
}
