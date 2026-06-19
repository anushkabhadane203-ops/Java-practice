package myapp;

public class Ferrari extends Car {

    public void nos() {
        System.out.println("Ferrari NOS Activated");
    }

    @Override
    public void speed() {
        System.out.println("Ferrari Speed : 350 km/hr");
    }
}