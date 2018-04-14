import java.util.Scanner;

public class Research {
    public static void main(String[] args) {
        //查找字串出现的次数
        Scanner scanner=new Scanner(System.in);
        String string="aabbccdaaabbcadccdba";
        int count=0;
        String stringChild;
        System.out.println("请输入字串：");
        stringChild=scanner.nextLine();
        for (int i = 0; i < string.length()-stringChild.length(); i++) {
            boolean beSure=true;
            int temp=i;
            for (int j = 0; j < stringChild.length(); j++) {
                int number=temp+j;
                if (string.charAt(number)!=stringChild.charAt(j)){
                    beSure=false;
                    break;
                }
            }
            if (beSure){
                count++;
            }
        }
        System.out.println(count);
    }
}