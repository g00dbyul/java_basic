package example1.polymorphism;

public class Tire {
    public int maxRotation;
    public int accumulateRotation;
    public String location;

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "Life" + (maxRotation - accumulateRotation));
            return true;
        } else {
            System.out.println("*** " + location + " Break");
            return false;
        }
    }
}
