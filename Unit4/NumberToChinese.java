package Unit4;

import java.util.Scanner;

//ʵ�ִ���(9λ)�������������ת��
public class NumberToChinese {
    private final int MAXSIZE = 9;
    private String[] hanArr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
    private String[] unitArr = {"ʮ", "��", "ǧ", "��", "ʮ��", "����", "ǧ", "��"};
    private String[] unitArr1 = {"ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ��", "��"};

    /**
     * �ж�num�Ǽ�λ��
     *
     * @param num �ж�num�Ǽ�λ��
     * @return ������iλ��
     */
    private int geti(int num) {
        int i = 0;
        if (num != 0) {
            while (num > 0) {
                num = num / 10;
                i++;//num��iλ��
            }
        }
        return i;
    }

    /**
     * ȡ���ַ���str�ĵ�iλ����
     *
     * @param str ȡ���ַ���str�ĵ�iλ����
     * @param i   ȡ���ַ���str�ĵ�iλ����
     * @return ���ص�iλ����
     * static���εķ������ܵ���û��static���εķ���
     * static�в�����this
     */
    private static int getNum(String str, int i) {//charAt()����Ԫ�ر���෴
        int num = str.charAt(i) - 48;//ASCIIֵ��48
        return num;
    }

    /**
     * ����ת��Ϊ����
     *
     * @param str �������������ַ���
     * @return ת���õĺ���
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
                        //ɾ���м�������
                        StringBuffer buffer = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer.length() - 1; j++) {
                            if (buffer.charAt(j) == '��' && buffer.charAt(j + 1) == '��') {
                                buffer.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer.charAt(buffer.length() - 1) == '��') {
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
                        StringBuffer buffer1 = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer1.length() - 1; j++) {
                            if (buffer1.charAt(j) == '��' && buffer1.charAt(j + 1) == '��') {
                                buffer1.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer1.charAt(buffer1.length() - 1) == '��') {
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
                        StringBuffer buffer2 = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '��' && buffer2.charAt(j + 1) == '��') {
                                buffer2.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ���� Ҽʮ������ǧ�����ʮҼ ���е���
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '��' && buffer2.charAt(j + 1) == 'ʮ') {
                                buffer2.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '��' && buffer2.charAt(j + 1) == '��') {
                                buffer2.deleteCharAt(j);
                                buffer2.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '��' && buffer2.charAt(j + 1) == 'ǧ') {
                                buffer2.deleteCharAt(j);
                                buffer2.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer2.length() - 1; j++) {
                            if (buffer2.charAt(j) == '��' && buffer2.charAt(j + 1) == '��') {
                                buffer2.deleteCharAt(j);
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer2.charAt(buffer2.length() - 1) == '��') {
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
                        StringBuffer buffer3 = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '��' && buffer3.charAt(j + 1) == '��') {
                                buffer3.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ���� Ҽʮ������ǧ�����ʮҼ ���е���
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '��' && buffer3.charAt(j + 1) == 'ʮ') {
                                buffer3.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '��' && buffer3.charAt(j + 1) == '��') {
                                buffer3.deleteCharAt(j);
                                buffer3.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '��' && buffer3.charAt(j + 1) == 'ǧ') {
                                buffer3.deleteCharAt(j);
                                buffer3.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer3.length() - 1; j++) {
                            if (buffer3.charAt(j) == '��' && buffer3.charAt(j + 1) == '��') {
                                buffer3.deleteCharAt(j);
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer3.charAt(buffer3.length() - 1) == '��') {
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
                        StringBuffer buffer4 = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '��' && buffer4.charAt(j + 1) == '��') {
                                buffer4.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ���� Ҽʮ������ǧ�����ʮҼ ���е���
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '��' && buffer4.charAt(j + 1) == 'ʮ') {
                                buffer4.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '��' && buffer4.charAt(j + 1) == '��') {
                                buffer4.deleteCharAt(j);
                                buffer4.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '��' && buffer4.charAt(j + 1) == 'ǧ') {
                                buffer4.deleteCharAt(j);
                                buffer4.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer4.length() - 1; j++) {
                            if (buffer4.charAt(j) == '��' && buffer4.charAt(j + 1) == '��') {
                                buffer4.deleteCharAt(j);
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer4.charAt(buffer4.length() - 1) == '��') {
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
                        StringBuffer buffer5 = new StringBuffer(result);//string ת��Ϊ StringBuffer
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '��' && buffer5.charAt(j + 1) == '��') {
                                buffer5.deleteCharAt(j);
                                //ÿ��ɾ��һ����󣬺����Ԫ����ǰ�ƶ�һλ���硰 һǧ �� ���� ��ɾ��һλ����for��j++
                                j--;
                            }
                        }
                        //ɾ���� Ҽʮ������ǧ�����ʮҼ ���е���
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '��' && buffer5.charAt(j + 1) == 'ʮ') {
                                buffer5.deleteCharAt(j + 1);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '��' && buffer5.charAt(j + 1) == '��') {
                                buffer5.deleteCharAt(j);
                                buffer5.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '��' && buffer5.charAt(j + 1) == 'ǧ') {
                                buffer5.deleteCharAt(j);
                                buffer5.deleteCharAt(j);
                            }
                        }
                        for (int j = 0; j < buffer5.length() - 1; j++) {
                            if (buffer5.charAt(j) == '��' && buffer5.charAt(j + 1) == '��') {
                                buffer5.deleteCharAt(j);
                            }
                        }
                        //ɾ��ĩβ�������
                        while (buffer5.charAt(buffer5.length() - 1) == '��') {
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
        System.out.println("��������");
        String str = scanner.nextLine();
        System.out.println(numberToChinese.NuToCh(str));
    }
}