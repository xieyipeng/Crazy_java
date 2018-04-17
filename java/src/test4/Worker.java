package test4;

public class Worker extends Employee {
    private double salary;
    private double commission;
    private int quantity;

    public Worker() {
        System.out.println("worker!!");
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double earning() {
        return salary + commission + quantity;
    }
}
