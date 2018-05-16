package Unit8;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * 使用java8新增的Stream操作
 */
public class c8_2_6 {
    public static void main(String[] args) {
        IntStream intStream=IntStream.builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .build();
        //对流的操作只能进行一次
        //System.out.println("最大值"+intStream.max().getAsInt());
        //System.out.println(intStream.sum());

        //新建立一个Stream，每个元素都是原来的2倍加一
        IntStream intStream1=intStream.map(operand -> operand*2+1);
        intStream1.forEach(System.out::println);
    }
}
