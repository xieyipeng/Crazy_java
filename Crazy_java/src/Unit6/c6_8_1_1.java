package Unit6;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

/**
 * lambda ����ʽ
 */
public class c6_8_1_1 {
    public void eat(Eatable eatable) {
        System.out.println(eatable);
        eatable.taste();
    }
    public void drive(Flyable flyable) {
        System.out.println("�����ڼ�ʻ��" + flyable);
        flyable.fly("���̿���ϴ�����ա�");
    }
    public void test(Addable addable) {
        System.out.println("5��3�ĺͣ� " + addable.add(5, 3));
    }

    public static void main(String[] args) {
        c6_8_1_1 c = new c6_8_1_1();
//        c.eat(() -> System.out.println("ƻ��ζ������"));
//        c.drive(weather -> {
//            System.out.println("����������" + weather);
//            System.out.println("ֱ��������ƽ��");
//        });
//        c.test((a, b) -> a + b);



        c.eat(new Eatable() {
            @Override
            public void taste() {
                System.out.println("ƻ��ζ������");
            }
        });
        c.drive(new Flyable() {
            @Override
            public void fly(String weather) {
                System.out.println("����������"+weather);
                System.out.println("ֱ��������ƽ��");
            }
        });
        c.test(new Addable() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });
    }
}