package Unit5;

/**
 * Òþ²ØºÍ·â×°
 */
public class c5_4_1_1 {
    private int age;
    private String name;

    public c5_4_1_1() {
        this.age = age;
    }
    public c5_4_1_1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        if (name.length()>6||name.length()<2){
            System.out.println("the name is error");
        }
        else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age>100||age<0){
            System.out.println("the age is error");
        }
        else {
            this.age = age;
        }

    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        c5_4_1_1 c = new c5_4_1_1();
        c.age = 1000;
        c.setAge(1000);
        System.out.println(c.getAge());
        c.setAge(30);
        System.out.println(c.getAge());
        c.setName("Àî¸Õ");
        System.out.println(c.getName());
    }
}
