package Unit7;

import java.io.File;
import java.util.Scanner;

/**
 * ʹ�� Scanner ��ȡ��������
 * Scanner �ǻ����������ʽ���ı�ɨ����
 * Scanner ��������Ҫ����
 *      1��hasNextXxx();  �ж��Ƿ�����һ��
 *      2��nextXxx();     ��ȡ��һ��������
 *
 * throws Exception �������������κ��쳣����
 */
public class c7_1_2 {
    public static void main(String[] args) throws Exception{
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println("���ݣ�"+scanner.next());
//        }
        //��ȡ�ļ�
        Scanner scanner=new Scanner(new File("F:\\VS-community\\View.txt"));
        System.out.println("�������£�");
        while (scanner.hasNextLine()){
            //���ж�ȡ
            System.out.println(scanner.nextLine());
        }
    }
}