package Unit4;

//continue只是忽略本次循环的剩下语句，接着开始下一次循环
public class c4_2_2_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            if (i == 1) {
                continue;
            }
            System.out.println("continue后输出的语句");
        }
    }
}
