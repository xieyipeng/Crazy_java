package Unit7;

import java.time.*;

/**
 * time类
 */
public class c7_4_3 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        //instant即时
        System.out.println("当现时刻：" + clock.instant());
        //获取clock对应的毫秒数
        System.out.println("毫秒：" + clock.millis());
        System.out.println("毫秒：" + System.currentTimeMillis());
        //Duration
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + duration.toMinutes() + "分");
        System.out.println("6000秒相当于" + duration.toHours() + "小时");
        System.out.println("6000秒相当于" + duration.toDays() + "天");
        //在Clock基础上再加6000秒，返回新的Clock
        Clock clock1 = Clock.offset(clock, duration);
        System.out.println("当前时刻加6000秒=" + clock1.instant());
        //Instant用法
        Instant instant = Instant.now();
        System.out.println("instant" + instant);
        //instant添加6000秒，返回新的instant
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println("instant" + instant1);
        //根据字符串解析Instant对象
        Instant instant2 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant2);
        //在instant基础上加5小时4分钟
        Instant instant3 = instant2.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant3);
        //获取instant3的5天前的时刻
        Instant instant4 = instant3.minus(Duration.ofDays(5));
        System.out.println(instant4);
        //LocalData用法
        LocalDate localDate = LocalDate.now();
        System.out.println("localData"+localDate);
        //获取2014年的第146天
        localDate=LocalDate.ofYearDay(2014,146);
        System.out.println(localDate);
        //设置为2014年5月21日
        localDate=LocalDate.of(2014, Month.MAY,21);
        System.out.println(localDate);
        //LocalTime用法
        LocalTime localTime=LocalTime.now();
        //设置为22点33分
        localTime=LocalTime.of(22,33);
        System.out.println(localTime);
        //返回一天中的5503秒
        localTime=LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);
        //localDateTime用法
        LocalDateTime localDateTime=LocalDateTime.now();
        //当前时间加上25小时3分钟
        LocalDateTime future=localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前时间加上25小时3分钟是="+future);
        //Year,YearMonth,MonthDay
        Year year=Year.now();
        System.out.println("当前年份："+year);
        year=year.plusYears(5);
        System.out.println(year);
        //...
    }
}
