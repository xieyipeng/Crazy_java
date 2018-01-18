package Unit6;

/**
 * 枚举类：实例有限而且固定的类
 * 继承自java.long.Enum;
 *
 * @int compareTo(E o)       比较
 * @String name()            返回枚举实例的名字
 * @int ordinal()            返回枚举值再枚举类中的索引值
 * @String toString()        返回枚举常量的名称
 */
enum SeasonEnum {
    SPRING, SUMMER, FALL, WINTER;
}

public class c6_9_1_1 {
    public void judge(SeasonEnum seasonEnum) {
        switch (seasonEnum) {
            case SPRING:
                System.out.println("SPRING");
                break;
            case SUMMER:
                System.out.println("SUMMER");
                break;
            case FALL:
                System.out.println("FALL");
                break;
            case WINTER:
                System.out.println("WINTER");
                break;
        }
    }

    public static void main(String[] args) {
        /**
         * 枚举类默认有一个 values() 方法，返回枚举类的所有实例
         */
        for (SeasonEnum seasonEnum : SeasonEnum.values()) {
            System.out.println(seasonEnum);
        }
        new c6_9_1_1().judge(SeasonEnum.SPRING);
    }
}
