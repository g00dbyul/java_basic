package example1.class_example;

public class CalculatorOverloading {
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }
}
