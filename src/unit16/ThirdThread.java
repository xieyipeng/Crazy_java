package unit16;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        //ThirdThread thirdThread=new ThirdThread();
        FutureTask<Integer> futureTask=new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i=0;
                for (;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
                }
                return i;
            }
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
            if (i==20){
                new Thread(futureTask,"有返回栈的线程").start();
            }
        }
        try {
            System.out.println("子线程返回值："+futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
