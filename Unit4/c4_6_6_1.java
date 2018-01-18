package Unit4;

import java.util.Arrays;

//将4位字符串转换成中文读法
public class c4_6_6_1 {
    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    private String[] unitArr = {"十", "百", "千" };

    /**
     * 把浮点数转换成整数部分和小数部分
     *
     * @param num 需要被分解的浮点数
     * @return 分解出来的小数和整数部分
     */

    private String[] divide(double num) {
        //强转为long型，得到整数部分
        long zheng = (long) num;
        //浮点数减去整数部分，得到小数部分，小数部分乘以100，得到2位小数
        long xiao = Math.round((num - zheng) * 100);
        return new String[]{zheng + " ", String.valueOf(xiao)};
    }

    /**
     * 把四位的数字字符串转换为汉字字符串
     *
     * @param numStr 需要被转换的字符串
     * @return 转换完成的汉字字符串
     */
    private String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();
        for (int i = 0; i < numLen; i++) {
            //把char类型的数字转化成int型，他们ASCII正好差48
            //char型减去48得到int型
            //charAt()方法返回指定索引位置的字符值
            int num = numStr.charAt(i) - 48;
            //如果不是最后一位数字，且数字不是零，则要加单位
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            }
            //否则不加单位
            else {
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        c4_6_6_1 nr = new c4_6_6_1();
        System.out.println(Arrays.toString(nr.divide(2159674.485)));
        System.out.println(nr.toHanStr("8494"));
    }
}
