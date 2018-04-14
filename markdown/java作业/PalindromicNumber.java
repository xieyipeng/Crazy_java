import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入1到99999的数字：");
        int number=scanner.nextInt();
        if (number<1||number>99999){
            System.out.println("请输入正确的数字！");
        }else {
            int count=1;
            int temp1=number;
            while((temp1/10)>1){
                temp1=temp1/10;
                count++;
            }
            System.out.println("您输入的是"+count+"位数字。");
            temp1=0;
            int temp2=number;
            while (temp2>0){
                temp1=temp1*10+temp2%10;
                temp2=temp2/10;
            }
            if (temp2==number){
                System.out.println("这个数字是回文数。");
            }else {
                System.out.println("这个数字不是回文数。");
            }
        }
    }
}