package example1.extend;

public class SuperSonicAirplane extends  Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("SuperSonicAirplane fly");
        } else {
            super.fly();
        }
    }
}
