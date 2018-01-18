package Unit6;

/**
 * ö���ࣺʵ�����޶��ҹ̶�����
 * �̳���java.long.Enum;
 *
 * @int compareTo(E o)       �Ƚ�
 * @String name()            ����ö��ʵ��������
 * @int ordinal()            ����ö��ֵ��ö�����е�����ֵ
 * @String toString()        ����ö�ٳ���������
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
         * ö����Ĭ����һ�� values() ����������ö���������ʵ��
         */
        for (SeasonEnum seasonEnum : SeasonEnum.values()) {
            System.out.println(seasonEnum);
        }
        new c6_9_1_1().judge(SeasonEnum.SPRING);
    }
}
