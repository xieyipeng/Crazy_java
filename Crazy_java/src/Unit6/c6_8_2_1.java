package Unit6;

/**
 * lambda����ʽ����
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
            System.out.println("�����Ϊ: "+sum);
        });
        Runnable runnable= () -> {
            int sum=0;
            for (int i = 0; i < 100; i++) {
                sum=sum+i;
            }
            System.out.println("��0�ӵ�99 = "+sum);
        };
        runnable.run();
    }
}