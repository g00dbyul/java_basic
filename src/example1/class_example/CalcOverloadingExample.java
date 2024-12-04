package example1.class_example;

public class CalcOverloadingExample {
    public static void main(String[] args) {
        CalculatorOverloading calc = new CalculatorOverloading();
        double result1 = calc.areaRectangle(10);
        double result2 = calc.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
