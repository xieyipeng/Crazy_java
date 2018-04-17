package test4;

public class Demo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println("----");
        HourlyWorker hourlyWorker = new HourlyWorker();
        System.out.println("----");
        worker.firstName = "wor";
        worker.lastName = "ker";
        worker.setSalary(10);
        worker.setCommission(10);
        worker.setQuantity(10);
        System.out.println(worker.toString());
        System.out.println(worker.earning());
        System.out.println("******");
        hourlyWorker.firstName = "hourly";
        hourlyWorker.lastName = "Worker";
        hourlyWorker.setHourse(5);
        hourlyWorker.setWage(10);
        System.out.println(hourlyWorker.toString());
        System.out.println(hourlyWorker.earning());
    }
}