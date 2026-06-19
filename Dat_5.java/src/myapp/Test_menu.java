package myapp;

import java.util.Scanner;

public class Test_menu {

    public static void main(String[] args) {

        System.out.println("1: Ferrari");
        System.out.println("2: BMW");
        System.out.println("3: Nano");
        System.out.println("4: Start Race");
        System.out.println("0: Exit");

        int ch;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        Car[] myCars = new Car[3]; // null null null

        do {
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {

            case 1:
                if (index < myCars.length) {
                    Ferrari fObj = new Ferrari();
                    myCars[index] = fObj;
                    index++;
                    System.out.println("----Ferrari Added----");
                } else {
                    System.out.println("Garage Full!");
                }
                break;

            case 2:
                if (index < myCars.length) {
                    Bmw bObj = new Bmw();
                    myCars[index] = bObj;
                    index++;
                    System.out.println("----BMW Added----");
                } else {
                    System.out.println("Garage Full!");
                }
                break;

            case 3:
                if (index < myCars.length) {
                    Nano nObj = new Nano();
                    myCars[index] = nObj;
                    index++;
                    System.out.println("----Nano Added----");
                } else {
                    System.out.println("Garage Full!");
                }
                break;

            case 4:
                System.out.println("----Start Racing----");

                for (int i = 0; i < index; i++) {
                    myCars[i].speed(); // Runtime Polymorphism
                }
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (ch != 0);

        sc.close();
        System.out.println("----End----");
    }
}