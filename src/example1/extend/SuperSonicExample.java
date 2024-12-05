package example1.extend;

public class SuperSonicExample {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();
        superSonicAirplane.takeOff();
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = SuperSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = SuperSonicAirplane.NORMAL;
        superSonicAirplane.fly();
    }
}
