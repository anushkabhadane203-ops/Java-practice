package myapp;

public class TestRacing {

    public static void main(String[] args) {

        Nano nano = new Nano();
        nano.speed();
        nano.safety();
        nano.abs();

        System.out.println("----------------");

        Bmw bmw = new Bmw();
        bmw.speed();
        bmw.safety();
        bmw.abs();

        System.out.println("----------------");

        Ferrari fr = new Ferrari();
        fr.speed();
        fr.safety();
        fr.nos();
    }
}