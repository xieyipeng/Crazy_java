import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("������1��99999�����֣�");
        int number=scanner.nextInt();
        if (number<1||number>99999){
            System.out.println("��������ȷ�����֣�");
        }else {
            int count=1;
            int temp1=number;
            while((temp1/10)>1){
                temp1=temp1/10;
                count++;
            }
            System.out.println("���������"+count+"λ���֡�");
            temp1=0;
            int temp2=number;
            while (temp2>0){
                temp1=temp1*10+temp2%10;
                temp2=temp2/10;
            }
            if (temp2==number){
                System.out.println("��������ǻ�������");
            }else {
                System.out.println("������ֲ��ǻ�������");
            }
        }
    }
}