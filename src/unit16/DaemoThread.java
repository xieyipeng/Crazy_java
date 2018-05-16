package unit16;

public class DaemoThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        DaemoThread daemoThread=new DaemoThread();
        daemoThread.setDaemon(true);
        daemoThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
