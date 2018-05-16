package unit16;

public class YieldThread extends Thread {
    public YieldThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i< 50; i++) {
            System.out.println(getName()+" "+i);
            if (i==20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThread yieldThread=new YieldThread("高级");
        //yieldThread.setPriority(Thread.MAX_PRIORITY);
        yieldThread.start();
        YieldThread yieldThread1=new YieldThread("低级");
        //yieldThread1.setPriority(Thread.MIN_PRIORITY);
        yieldThread1.start();
    }
}
