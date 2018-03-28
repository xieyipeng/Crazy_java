package Unit6;

public class OutputFactory {
    public Output getOutput(){
        //return new BetterPrinter();
        return new c6_6_1_1();
    }

    public static void main(String[] args) {
        OutputFactory outputFactory=new OutputFactory();
        Computer computer=new Computer(outputFactory.getOutput());
        computer.KeyIn("hello1");
        computer.KeyIn("hello2");
        computer.priit();
    }
}
