package example1.class_example;

public class CalcStaticExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * CalcStatic.pi;
        int result2 = CalcStatic.plus(10, 5);
        int result3 = CalcStatic.minus(10, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
