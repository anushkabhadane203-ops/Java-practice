package myapp;

public class Test_DwnCasting {

    public static void main(String[] args) {

        Car obj = new Bmw(); // Upcasting

//        obj.speed();

        if (obj instanceof Bmw) {
            Bmw b = (Bmw) obj; // Downcasting
            b.abs(); // BMW-specific method
            System.out.println("---DOWN CASTED TO BMW---");
        }

        if (obj instanceof Ferrari) {
            Ferrari f = (Ferrari) obj; // Downcasting
            f.nos();
            System.out.println("---DOWN CASTED TO FERRARI---");
        }


        if (obj instanceof Nano) {
            Nano n = (Nano) obj; // Downcasting
            n.nanoDisplay();
            System.out.println("---DOWN CASTED TO NANO---");
        }
    }
}