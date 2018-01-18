package Unit6;

/**
 * 抽象方法的枚举类
 */
enum Operation {
    PLUS {
        public double eval(double a, double b) {
            return a + b;
        }
    }, MINUS {
        public double eval(double a, double b) {
            return a - b;
        }
    }, TIMES {
        public double eval(double a, double b) {
            return a * b;
        }
    }, DIVIDE {
        public double eval(double a, double b) {
            return a / b;
        }
    };

    public abstract double eval(double a, double b);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3, 4));
    }
}

public class c6_9_5_1 {
}
