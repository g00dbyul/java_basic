package example1.loop;

public class ForExample5 {
    public static void main(String[] args) {
        for (int x = 2; x <= 9; x++) {
            System.out.println("**** " + x + " ****");
            for (int y = 1; y <= 9; y++) {
                System.out.println(x + " * " + y + " = " + x * y);
            }
        }
    }
}
