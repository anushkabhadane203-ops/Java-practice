package Payroll;

public class Manager extends Employee {

    private double incentives;

    // Default Constructor
    public Manager() {
        super();
        incentives = 0;
        System.out.println("----Manager Default Constructor----");
    }

    // Parameterized Constructor
    public Manager(int empid, String name, double salary, double incentives) {
        super(empid, name, salary);
        this.incentives = incentives;
        System.out.println("----Manager Parameterized Constructor----");
    }

    // Method
    public void assignTask() {
        System.out.println("Task Assigned to Employee");
    }

    // Display Method
    public void display() {
        super.display();
        System.out.println("Incentives : " + incentives);
    }
}
