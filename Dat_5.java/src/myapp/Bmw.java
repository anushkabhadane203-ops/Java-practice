package myapp;

public class Bmw extends Car {

    public void abs() {
        System.out.println("BMW Luxury Features");
    }

    @Override
    public void speed() {
        System.out.println("BMW Speed : 250 km/hr");
    }
}