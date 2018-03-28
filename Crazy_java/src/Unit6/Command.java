package Unit6;

/**
 * 命令模式
 * 实现方法和处理分离
 */
public interface Command {
    void process(int[] target);
}
class ProcessArray{
    public void process(int[] target,Command cmd){
        cmd.process(target);
    }
}
class CommandTest{
    public static void main(String[] args) {
        ProcessArray processArray=new ProcessArray();
        int[] target={3,4,5,6};
        processArray.process(target,new PrintCommand());
        processArray.process(target,new AddCommand());

    }
}
class PrintCommand implements Command{

    @Override
    public void process(int[] target) {
        for (int tmp :
                target) {
            System.out.println(tmp);
        }
    }
}

class AddCommand implements Command {

    @Override
    public void process(int[] target) {
        int sum=0;
        for (int tmp :
                target) {
            sum += tmp;
        }
        System.out.println(sum);
    }
}