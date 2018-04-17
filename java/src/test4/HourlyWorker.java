package test4;

public class HourlyWorker extends Worker {
    private double wage;
    private double hourse;

    public HourlyWorker() {
        System.out.println("hour worker!!");
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHourse(double hourse) {
        this.hourse = hourse;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double earning() {
        return hourse * wage;
    }
}
