package test4;

public abstract class Employee {
    String firstName;
    String lastName;
    public Employee() {
        System.out.println("Employee!!");
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return firstName+lastName;
    }
    public double earning(){
        return 50;
    }
}
