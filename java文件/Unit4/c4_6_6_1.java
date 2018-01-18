package Unit4;

import java.util.Arrays;

//��4λ�ַ���ת�������Ķ���
public class c4_6_6_1 {
    private String[] hanArr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
    private String[] unitArr = {"ʮ", "��", "ǧ" };

    /**
     * �Ѹ�����ת�����������ֺ�С������
     *
     * @param num ��Ҫ���ֽ�ĸ�����
     * @return �ֽ������С������������
     */

    private String[] divide(double num) {
        //ǿתΪlong�ͣ��õ���������
        long zheng = (long) num;
        //��������ȥ�������֣��õ�С�����֣�С�����ֳ���100���õ�2λС��
        long xiao = Math.round((num - zheng) * 100);
        return new String[]{zheng + " ", String.valueOf(xiao)};
    }

    /**
     * ����λ�������ַ���ת��Ϊ�����ַ���
     *
     * @param numStr ��Ҫ��ת�����ַ���
     * @return ת����ɵĺ����ַ���
     */
    private String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();
        for (int i = 0; i < numLen; i++) {
            //��char���͵�����ת����int�ͣ�����ASCII���ò�48
            //char�ͼ�ȥ48�õ�int��
            //charAt()��������ָ������λ�õ��ַ�ֵ
            int num = numStr.charAt(i) - 48;
            //����������һλ���֣������ֲ����㣬��Ҫ�ӵ�λ
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            }
            //���򲻼ӵ�λ
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
