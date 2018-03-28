package unit16;

public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i<100; i++) {
            //当线程类继承Thread类时，直接使用this获取当前线程
            //getName（）方法获取当前线程的名字
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //调用currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==20){
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
