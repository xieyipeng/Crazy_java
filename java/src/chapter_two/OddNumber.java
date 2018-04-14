package chapter_two;

public class OddNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 200; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + " ");
            }
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
