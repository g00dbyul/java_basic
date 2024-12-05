package example1.polymorphism;

public class Car {
    Tire frontLeftTire = new Tire(6, "frontLeftTire");
    Tire frontRightTire = new Tire(2, "frontRightTire");
    Tire backLeftTire = new Tire(3, "backLeftTire");
    Tire backRightTire = new Tire(4, "backRightTire");

    int run() {
        System.out.println("Car is running");
        if(frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if(frontRightTire.roll() == false) {
            stop();
            return 2;
        }
        if(backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if(backRightTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("Car is stopped");
    }
}
