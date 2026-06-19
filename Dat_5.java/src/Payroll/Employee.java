package Payroll;

public class Employee {

    protected int empid;
    protected String name;
    protected double salary;

    public Employee() {
        empid = 101;
        name = "Ram";
        salary = 25000;
        System.out.println("----Employee Default Constructor----");
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        System.out.println("----Employee Parameterized Constructor----");
    }

    public void display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}