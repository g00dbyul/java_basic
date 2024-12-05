package example1.polymorphism;

public class HankookTire extends Tire {
    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "Hankook Tire Life" + (maxRotation - accumulateRotation));
            return true;
        } else {
            System.out.println("*** " + location + "Hankook Tire Break");
            return false;
        }
    }
}
