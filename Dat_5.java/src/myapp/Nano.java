package myapp;

public class Nano extends Car {

    public void abs() {
        System.out.println("Nano ABS Activated");
    }

    public void nanoDisplay() {
        System.out.println("----- Nano Display -----");
    }

    @Override
    public void speed() {
        System.out.println("Nano Speed : 100 km/hr");
    }
}