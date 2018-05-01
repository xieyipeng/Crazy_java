package test;

import java.beans.Visibility;

public class Bike implements Vehicle {
    @Override
    public String  start() {
        return "Bike start";
    }

    @Override
    public String  stop() {
        return "Bike stop";
    }
}
