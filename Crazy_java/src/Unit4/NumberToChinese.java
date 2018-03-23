package Unit4;

import java.util.Scanner;

//实现从亿(9位)到零的整数向汉字转换
public class NumberToChinese {
    private final int MAXSIZE = 9;
    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private String[] unitArr = {"十", "百", "千", "万", "十万", "百万", "千", "亿"};
    private String[] unitArr1 = {"十", "百", "千", "万", "十", "百", "千万", "亿"};

    /**
     * 判断num是几位数
     *
     * @param num 判断num是几位数
     * @return 返回是i位数
     */
    private int geti(int num) {
        int i = 0;
        if (num != 0) {
            while (num > 0) {
                num = num / 10;
                i++;//num是i位数
            }
        }
        return i;
    }

    /**
     * 取得字符串str的第i位数字
     *
     * @param str 取得字符串str的第i位数字
     * @param i   取得字符串str的第i位数字
     * @return 返回第i位数字
     * static修饰的方法不能调用没有static修饰的方法
     * static中不能有this
     */
    private static int getNum(String str, int i) {//charAt()函数元素标号相反
        int num = str.charAt(i) - 48;//ASCII值差48
        return num;
    }

    /**
     * 数字转换为汉字
     *
     * @param str 传进来的数字字符串
     * @return 转换好的汉字
     */
    private String NuToCh(String str) {
        String result = "";
        int number = Integer.parseInt(str);
        if (number == 0) {
            result = result + hanArr[number];
        } else {
            if (number < 0 || number > 999999999) {
                System.out.println("error");
            } else {
                int i = geti(number);
                switch (i) {
                    case 1:
                        int a0 = getNum(str, 0);
                        result = result + hanArr[a0];
                        break;
                    case 2:
                        int b0 = getNum(str, 0);
                        int b1 = getNum(str, 1);
                        if (b1 == 0) {
                            result = result + hanArr[b0] + unitArr[0];
                        } else {
                            result = result + hanArr[b0] + unitArr[0] + hanArr[b1];
                        }
                        break;
                    case 3:
                        int c0 = getNum(str, 0);
                        int c1 = getNum(str, 1);
                        int c2 = getNum(str, 2);
                        if (c1 == 0 && c2 == 0) {
                            result = result + hanArr[c0] + unitArr[1];
                        } else {
                            if (c2 == 0) {
                                result = result + hanArr[c0] + unitArr[1] + hanArr[c1] + unitArr[0];
                            } else {
                                result = result + hanArr[c0] + unitArr[1] + hanArr[c1] + unitArr[0] + hanArr[c2];
                            }
                        }
                        break;
                    case 4:
                        int[] d = new int[4];
                        for (int j = 0; j < 4; j++) {
                            d[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 4; j++) {
                            if (j != 3 && d[j] != 0) {
                                result = result + hanArr[d[j]] + unitArr[2 - j];
                            } else {
                                result = result + hanArr[d[j]];
                            }
                        }
                        //删除中间多余的零
                        StringBuffer buffer = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer.length() - 1; j++) {
                            if (buffer.charAt(j) == '零' && buffer.charAt(j + 1) == '零') {
                                buffer.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除末尾多余的零
                        while (buffer.charAt(buffer.length() - 1) == '零') {
                            buffer.deleteCharAt(buffer.length() - 1);
                        }
                        result = buffer.toString();
                        break;
                    case 5:
                        int[] e = new int[5];
                        for (int j = 0; j < 5; j++) {
                            e[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 5; j++) {
                            if (j != 4 && e[j] != 0) {
                                result = result + hanArr[e[j]] + unitArr[3 - j];
                            } else {
                                result = result + hanArr[e[j]];
                            }
                        }
                        StringBuffer buffer1 = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer1.length() - 1; j++) {
                            if (buffer1.charAt(j) == '零' && buffer1.charAt(j + 1) == '零') {
                                buffer1.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除末尾多余的零
                        while (buffer1.charAt(buffer1.length() - 1) == '零') {
                            buffer1.deleteCharAt(buffer1.length() - 1);
                        }
                        result = buffer1.toString();
                        break;
                    case 6:
                        int[] f = new int[6];
                        for (int j = 0; j < 6; j++) {
                            f[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 6; j++) {
                            if (j <= 1) {
                                result = result + hanArr[f[j]] + unitArr1[4 - j];
                            } else if (j != 5) {
                                result = result + hanArr[f[j]] + unitArr[4 - j];
                            } else {
                                result = result + hanArr[f[j]];
                            }
                        }
                        StringBuffer buffer2 = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '零' && buffer2.charAt(j + 1) == '零') {
                                buffer2.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除“ 壹十零万零千零百零十壹 ”中的零
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '零' && buffer2.charAt(j + 1) == '十') {
                                buffer2.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '零' && buffer2.charAt(j + 1) == '百') {
                                buffer2.deleteCharAt(j);
                                buffer2.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '零' && buffer2.charAt(j + 1) == '千') {
                                buffer2.deleteCharAt(j);
                                buffer2.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '零' && buffer2.charAt(j + 1) == '万') {
                                buffer2.deleteCharAt(j);
                            }
                        }
                        //删除末尾多余的零
                        while (buffer2.charAt(buffer2.length() - 1) == '零') {
                            buffer2.deleteCharAt(buffer2.length() - 1);
                        }
                        result = buffer2.toString();
                        break;
                    case 7:
                        int[] g = new int[7];
                        for (int j = 0; j < 7; j++) {
                            g[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 7; j++) {
                            if (j != 6 && g[j] != 0) {
                                result = result + hanArr[g[j]] + unitArr[5 - j];
                            } else {
                                result = result + hanArr[g[j]];
                            }
                        }
                        StringBuffer buffer3 = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '零' && buffer3.charAt(j + 1) == '零') {
                                buffer3.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除“ 壹十零万零千零百零十壹 ”中的零
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '零' && buffer3.charAt(j + 1) == '十') {
                                buffer3.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '零' && buffer3.charAt(j + 1) == '百') {
                                buffer3.deleteCharAt(j);
                                buffer3.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '零' && buffer3.charAt(j + 1) == '千') {
                                buffer3.deleteCharAt(j);
                                buffer3.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '零' && buffer3.charAt(j + 1) == '万') {
                                buffer3.deleteCharAt(j);
                            }
                        }
                        //删除末尾多余的零
                        while (buffer3.charAt(buffer3.length() - 1) == '零') {
                            buffer3.deleteCharAt(buffer3.length() - 1);
                        }
                        result = buffer3.toString();
                        break;
                    case 8:
                        int[] h = new int[8];
                        for (int j = 0; j < 8; j++) {
                            h[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 8; j++) {
                            if (j != 7 && h[j] != 0) {
                                result = result + hanArr[h[j]] + unitArr[6 - j];
                            } else {
                                result = result + hanArr[h[j]];
                            }
                        }
                        StringBuffer buffer4 = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '零' && buffer4.charAt(j + 1) == '零') {
                                buffer4.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除“ 壹十零万零千零百零十壹 ”中的零
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '零' && buffer4.charAt(j + 1) == '十') {
                                buffer4.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '零' && buffer4.charAt(j + 1) == '百') {
                                buffer4.deleteCharAt(j);
                                buffer4.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '零' && buffer4.charAt(j + 1) == '千') {
                                buffer4.deleteCharAt(j);
                                buffer4.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '零' && buffer4.charAt(j + 1) == '万') {
                                buffer4.deleteCharAt(j);
                            }
                        }
                        //删除末尾多余的零
                        while (buffer4.charAt(buffer4.length() - 1) == '零') {
                            buffer4.deleteCharAt(buffer4.length() - 1);
                        }
                        result = buffer4.toString();
                        break;
                    case 9:
                        int[] k = new int[9];
                        for (int j = 0; j < 9; j++) {
                            k[j] = getNum(str, j);
                        }
                        for (int j = 0; j < 9; j++) {
                            if (j != 8 && k[j] != 0) {
                                result = result + hanArr[k[j]] + unitArr[7 - j];
                            } else {
                                result = result + hanArr[k[j]];
                            }
                        }
                        StringBuffer buffer5 = new StringBuffer(result);//string 转化为 StringBuffer
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '零' && buffer5.charAt(j + 1) == '零') {
                                buffer5.deleteCharAt(j);
                                //每次删除一个零后，后面的元素向前移动一位比如“ 一千 零 零零 ”删除一位，而for中j++
                                j--;
                            }
                        }
                        //删除“ 壹十零万零千零百零十壹 ”中的零
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '零' && buffer5.charAt(j + 1) == '十') {
                                buffer5.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '零' && buffer5.charAt(j + 1) == '百') {
                                buffer5.deleteCharAt(j);
                                buffer5.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '零' && buffer5.charAt(j + 1) == '千') {
                                buffer5.deleteCharAt(j);
                                buffer5.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '零' && buffer5.charAt(j + 1) == '万') {
                                buffer5.deleteCharAt(j);
                            }
                        }
                        //删除末尾多余的零
                        while (buffer5.charAt(buffer5.length() - 1) == '零') {
                            buffer5.deleteCharAt(buffer5.length() - 1);
                        }
                        result = buffer5.toString();
                        break;
                    default:
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NumberToChinese numberToChinese = new NumberToChinese();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字");
        String str = scanner.nextLine();
        System.out.println(numberToChinese.NuToCh(str));
    }
}