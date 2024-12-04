package example1.class_example;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.powerOn();
        int result = calc.plus(5,6);
        System.out.println(result);

        byte x = 10;
        byte y = 4;

        double result2 = calc.divide(x, y);
        System.out.println(result2);
        calc.powerOff();
    }
}
