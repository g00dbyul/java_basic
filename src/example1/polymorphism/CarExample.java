package example1.polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i=1; i<=5; i++) {
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("Front left");
                    car.frontLeftTire = new HankookTire(15, "Front Left Tire");
                    break;
                case 2:
                    System.out.println("Front Right");
                    car.frontLeftTire = new KumhoTire(13, "Front Right Tire");
                    break;
                case 3:
                    System.out.println("Back left");
                    car.frontLeftTire = new HankookTire(14, "Back left Tire");
                    break;
                case 4:
                    System.out.println("Back right");
                    car.frontLeftTire = new KumhoTire(17, "Back Right Tire");
                    break;
                default:
                    System.out.println("Invalid problem location");
            }
            System.out.println("===============================");
        }
    }
}
