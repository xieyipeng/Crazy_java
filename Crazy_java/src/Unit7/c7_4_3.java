package Unit7;

import java.time.*;

/**
 * time��
 */
public class c7_4_3 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        //instant��ʱ
        System.out.println("����ʱ�̣�" + clock.instant());
        //��ȡclock��Ӧ�ĺ�����
        System.out.println("���룺" + clock.millis());
        System.out.println("���룺" + System.currentTimeMillis());
        //Duration
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000���൱��" + duration.toMinutes() + "��");
        System.out.println("6000���൱��" + duration.toHours() + "Сʱ");
        System.out.println("6000���൱��" + duration.toDays() + "��");
        //��Clock�������ټ�6000�룬�����µ�Clock
        Clock clock1 = Clock.offset(clock, duration);
        System.out.println("��ǰʱ�̼�6000��=" + clock1.instant());
        //Instant�÷�
        Instant instant = Instant.now();
        System.out.println("instant" + instant);
        //instant���6000�룬�����µ�instant
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println("instant" + instant1);
        //�����ַ�������Instant����
        Instant instant2 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant2);
        //��instant�����ϼ�5Сʱ4����
        Instant instant3 = instant2.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant3);
        //��ȡinstant3��5��ǰ��ʱ��
        Instant instant4 = instant3.minus(Duration.ofDays(5));
        System.out.println(instant4);
        //LocalData�÷�
        LocalDate localDate = LocalDate.now();
        System.out.println("localData"+localDate);
        //��ȡ2014��ĵ�146��
        localDate=LocalDate.ofYearDay(2014,146);
        System.out.println(localDate);
        //����Ϊ2014��5��21��
        localDate=LocalDate.of(2014, Month.MAY,21);
        System.out.println(localDate);
        //LocalTime�÷�
        LocalTime localTime=LocalTime.now();
        //����Ϊ22��33��
        localTime=LocalTime.of(22,33);
        System.out.println(localTime);
        //����һ���е�5503��
        localTime=LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);
        //localDateTime�÷�
        LocalDateTime localDateTime=LocalDateTime.now();
        //��ǰʱ�����25Сʱ3����
        LocalDateTime future=localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("��ǰʱ�����25Сʱ3������="+future);
        //Year,YearMonth,MonthDay
        Year year=Year.now();
        System.out.println("��ǰ��ݣ�"+year);
        year=year.plusYears(5);
        System.out.println(year);
        //...
    }
}
