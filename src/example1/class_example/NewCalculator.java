package example1.class_example;

public class NewCalculator {
    int plus(int a, int b) {
        return a + b;
    }

    double avg(int a, int b) {
        double sum = plus(a,b);
        double avg = sum/2;
        return avg;
    }

    void execute() {
        double result = avg(7,10);
        println("The result is: " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
