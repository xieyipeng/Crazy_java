
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int number=1+random.nextInt(100);
        int UserIn=-1;
        int count=0;
		System.out.println("��������µ����֣�");
        while (UserIn!=number){
            count++;
            UserIn=scanner.nextInt();
            if (UserIn>number){
                System.out.println("�����������̫���ˣ�������Сһ������֣�");
            }else if (UserIn==number){
                System.out.println("�������Ϊ"+number+".");
                System.out.println("��ϲ������ˣ���������"+count+"��");
            } else if (UserIn<number){
                System.out.println("�����������̫С�ˣ��������һ������֣�");
            }
        }
    }
}
