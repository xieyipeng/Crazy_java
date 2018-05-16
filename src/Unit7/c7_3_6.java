package Unit7;

import java.math.BigDecimal;

/**
 * 预防精度丢失
 * BigDecimal
 */
class Arith {
    private static final int DEF_DIV_SCALE = 10;

    public Arith() {

    }

    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }

    public static double mul(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double sub(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }
}

public class c7_3_6 {
    public static void main(String[] args) {
        //容易引起精度丢失
        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);

        BigDecimal bigDecimal1 = new BigDecimal("0.05");
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.01);
        BigDecimal bigDecimal3 = new BigDecimal(0.05);

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2));

        System.out.println(bigDecimal3.add(bigDecimal2));
        System.out.println(bigDecimal3.subtract(bigDecimal2));
        System.out.println(bigDecimal3.multiply(bigDecimal2));
        System.out.println(bigDecimal3.divide(bigDecimal2));

        System.out.println(Arith.add(0.05, 0.01));
    }
}
