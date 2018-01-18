package Unit5;

/**
 * ผฬณะ
 */
class create{
    public create() {
        System.out.println("this is null create");
    }
}

class animal extends create{
    public animal(String name) {
        System.out.println("the animal create with one thing:"+name);
    }

    public animal(String name,int age) {

        this(name);

        System.out.println("the animal create with two thing:"+age);
    }
}

public class c5_6_4_2 extends animal{
    public c5_6_4_2() {
        super("hui tai lang",13);
        System.out.println("the c5_6_4_2 create with noll thing");
    }

    public static void main(String[] args) {
        new c5_6_4_2();
    }

}
