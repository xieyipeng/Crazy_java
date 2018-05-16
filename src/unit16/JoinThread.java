package unit16;

public class JoinThread extends Thread{
    public JoinThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }
    public static void main(String[] args) throws Exception{
        new JoinThread("新线程").start();
        for (int i = 0; i < 100; i++) {
            if (i==20){
                JoinThread joinThread=new JoinThread("被join的Thread");
                joinThread.start();
                joinThread.join();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
