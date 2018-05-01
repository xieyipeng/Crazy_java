package test;

public class Demo5 {
    public static void main(String[] args) {
        Person person=new Person();
        Buss buss=new Buss();
        Bike bike=new Bike();
        person.addVehicle(buss);
        person.addVehicle(bike);
    }
}
