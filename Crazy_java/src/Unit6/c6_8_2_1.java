package Unit6;

/**
 * lambda表达式举例
 */
public class c6_8_2_1 {
    public static void main(String[] args) {
        ProcessArray processArray=new ProcessArray();
        int[] target={3,4,5,6};
        processArray.process(target, target1 -> {
            int sum=0;
            for (int temp: target1){
                sum=sum+temp;
            }
            System.out.println("数组和为: "+sum);
        });
        Runnable runnable= () -> {
            int sum=0;
            for (int i = 0; i < 100; i++) {
                sum=sum+i;
            }
            System.out.println("从0加到99 = "+sum);
        };
        runnable.run();
    }
}
