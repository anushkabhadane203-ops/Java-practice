package myapp;

import java.util.Scanner;

public class ManuDriven{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("---- CAR MENU----");
            System.out.println("1. Nano");
            System.out.println("2. BMW");
            System.out.println("3. Ferrari");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:
            
                Nano nano = new Nano();
                nano.speed();
                nano.safety();
                nano.abs();

            case 2:
            	   Bmw bmw = new Bmw();
                   bmw.speed();
                   bmw.safety();
                   bmw.abs();
            case 3:

                Ferrari fr = new Ferrari();
                fr.speed();
                fr.safety();
                fr.nos();
           
           
            

            case 4:
                System.out.println("Exiting Program...");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
