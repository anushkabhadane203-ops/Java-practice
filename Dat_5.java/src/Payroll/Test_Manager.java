package Payroll;

public class Test_Manager {

    public static void main(String[] args) {

        Manager mObj = new Manager();
        mObj.display();

        System.out.println("----Manager----");

        Manager mgr2 = new Manager(103, "ABC", 123456, 5000);
        mgr2.assignTask();
        mgr2.display();

        System.out.println("------End------");
    }
}