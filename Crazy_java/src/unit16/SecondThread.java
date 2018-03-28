package unit16;

public class SecondThread implements Runnable {
    private int i;
    @Override
    public void run() {
        //线程的执行体
        for (;i<100;i++){
            //实现Runable接口时，想获取当前线程，只能用Thread.currentThread()方法
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==20){
                SecondThread secondThread=new SecondThread();
                new Thread(secondThread,"新线程1").start();
                new Thread(secondThread,"新线程2").start();
            }
        }
    }
}
