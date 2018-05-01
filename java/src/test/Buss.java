package test;

public class Buss implements Vehicle{

    @Override
    public String  start() {
        return "Buss start";
    }

    @Override
    public String  stop() {
        return "Buss stop";
    }
}
