package Unit4;

//continueֻ�Ǻ��Ա���ѭ����ʣ����䣬���ſ�ʼ��һ��ѭ��
public class c4_2_2_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            if (i == 1) {
                continue;
            }
            System.out.println("continue����������");
        }
    }
}
