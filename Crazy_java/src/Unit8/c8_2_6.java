package Unit8;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * ʹ��java8������Stream����
 */
public class c8_2_6 {
    public static void main(String[] args) {
        IntStream intStream=IntStream.builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .build();
        //�����Ĳ���ֻ�ܽ���һ��
        //System.out.println("���ֵ"+intStream.max().getAsInt());
        //System.out.println(intStream.sum());

        //�½���һ��Stream��ÿ��Ԫ�ض���ԭ����2����һ
        IntStream intStream1=intStream.map(operand -> operand*2+1);
        intStream1.forEach(System.out::println);
    }
}
