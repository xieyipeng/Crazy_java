package Unit7;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 * Calendar¿‡
 */
public class c7_4_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        System.out.println("YEAR  " + calendar1.get(YEAR));
        System.out.println(calendar1.get(MONTH));
        System.out.println(calendar1.get(DATE));
        calendar1.set(2003, 10, 23, 12, 32, 23);
        System.out.println(calendar1.getTime());
        calendar1.add(YEAR, -1);
        System.out.println(calendar1.getTime());
        calendar1.add(MONTH, -8);
        System.out.println(calendar1.getTime());
    }
}
