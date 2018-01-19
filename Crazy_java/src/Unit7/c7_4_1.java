package Unit7;

import java.util.Date;

/**
 * DataÀà
 */
public class c7_4_1 {
    public static void main(String[] args) {
        Date date1=new Date();
        Date date2=new Date(System.currentTimeMillis()+100);
        System.out.println(date2);
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.before(date2));
    }
}
