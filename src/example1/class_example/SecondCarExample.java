package example1.class_example;

public class SecondCarExample {
    public static void main(String[] args) {
        SecondCar secondCar = new SecondCar();
        System.out.println(secondCar.company);
        System.out.println();

        SecondCar secondCar2 = new SecondCar("Sonata");
        System.out.println(secondCar2.company);
        System.out.println(secondCar2.model);
        System.out.println();

        SecondCar secondCar3 = new SecondCar("Sonata", "Red");
        System.out.println(secondCar3.company);
        System.out.println(secondCar3.model);
        System.out.println(secondCar3.color);
        System.out.println();

        SecondCar secondCar4 = new SecondCar("Sonata", "Black", 200);
        System.out.println(secondCar4.company);
        System.out.println(secondCar4.model);
        System.out.println(secondCar4.color);
        System.out.println(secondCar4.maxSpeed);
    }
}
