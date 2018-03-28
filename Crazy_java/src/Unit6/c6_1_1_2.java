package Unit6;

/**
 * 基本类型变量与字符串之间的转换
 * valueOf();
 */
public class c6_1_1_2 {
    public static void main(String[] args) {
        String intStr="123";
        int it1=Integer.parseInt(intStr);//parse 句法分析;句法分析结果
        int it2=new Integer(intStr);
        System.out.println(it1);
        System.out.println(it2);

        String floatStr="12.33";
        float ft1=Float.parseFloat(floatStr);
        float ft2=new Float(floatStr);
        System.out.println(ft1);
        System.out.println(ft2);

        String ftStr=String.valueOf(2.345f);
        System.out.println(ftStr);

        String dbStr=String.valueOf(3.12);
        System.out.println(dbStr);

        String boolStr=String.valueOf(true);
        //System.out.println(boolStr);

        System.out.println(boolStr.toUpperCase());//把字符串转换为大写
        System.out.println(boolStr.toLowerCase());//把字符串转换为小写
    }
}
