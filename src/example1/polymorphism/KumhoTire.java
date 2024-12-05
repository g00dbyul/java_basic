package example1.polymorphism;

public class KumhoTire extends Tire {
    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "Kumho Tire Life" + (maxRotation - accumulateRotation));
            return true;
        } else {
            System.out.println("*** " + location + "Kumho Tire Break");
            return false;
        }
    }
}
