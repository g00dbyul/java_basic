package example1.class_example;

public class ThirdCar {
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    public ThirdCar() {
    }

    public ThirdCar(String model) {
        this(model, null, 0);
    }

    public ThirdCar(String model, String color) {
        this(model, color, 0);
    }

    public ThirdCar(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
