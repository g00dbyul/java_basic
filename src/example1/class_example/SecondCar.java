package example1.class_example;

public class SecondCar {
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    public SecondCar() {

    }

    public SecondCar(String model) {
        this.model = model;
    }

    public SecondCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public SecondCar(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
