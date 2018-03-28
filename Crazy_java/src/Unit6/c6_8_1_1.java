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
 * lambda 表达式
 */
public class c6_8_1_1 {
    public void eat(Eatable eatable) {
        System.out.println(eatable);
        eatable.taste();
    }
    public void drive(Flyable flyable) {
        System.out.println("我正在驾驶：" + flyable);
        flyable.fly("【碧空如洗的晴日】");
    }
    public void test(Addable addable) {
        System.out.println("5和3的和： " + addable.add(5, 3));
    }

    public static void main(String[] args) {
        c6_8_1_1 c = new c6_8_1_1();
//        c.eat(() -> System.out.println("苹果味道不错"));
//        c.drive(weather -> {
//            System.out.println("今天天气：" + weather);
//            System.out.println("直升机飞行平稳");
//        });
//        c.test((a, b) -> a + b);



        c.eat(new Eatable() {
            @Override
            public void taste() {
                System.out.println("苹果味道不错");
            }
        });
        c.drive(new Flyable() {
            @Override
            public void fly(String weather) {
                System.out.println("今天天气是"+weather);
                System.out.println("直升机飞行平稳");
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
