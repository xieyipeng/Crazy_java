package Unit6;

public class Computer {
    /**
     *   ½Ó¿Ú
     */
    private Output output;

    public Computer(Output output) {
        this.output = output;
    }
    public void KeyIn(String msg){
        output.getData(msg);
    }
    public void priit(){
        output.out();
    }
}
