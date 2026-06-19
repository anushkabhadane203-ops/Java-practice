package myapp;

// Object class : java.lang.Object
public class Car {

    private int carid;
    private String name;
    private double price;

    public Car() {
        super();
        System.out.println("-----Car Constructor-----");
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return carid + " " + name + " " + price;
    }

    public void speed() {
        System.out.println("Car Speed");
    }

    public void safety() {
        System.out.println("Car Safety Features");
    }
}