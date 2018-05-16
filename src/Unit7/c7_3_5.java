package Unit7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ThreadLocalRandom
 * Random
 */
public class c7_3_5 {
    public static void main(String[] args) {
        //在括号内写入Random的种子
        //Random random=new Random();
        Random random = new Random(System.currentTimeMillis());

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println("random.nextBoolean()" + random.nextBoolean());
        byte[] buffer = new byte[16];
        System.out.println("Arrays.toString(buffer)" + Arrays.toString(buffer));
        System.out.println("random.nextDouble()" + random.nextDouble());
        System.out.println("random.nextFloat()" + random.nextFloat());
        System.out.println("random.nextGaussian()" + random.nextGaussian());
        System.out.println("random.nextInt()" + random.nextInt());
    }
}
