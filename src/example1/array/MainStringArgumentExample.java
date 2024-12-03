package example1.array;

public class MainStringArgumentExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("값이 부족");
            System.exit(0);
        }

        String arg1 = args[0];
        String arg2 = args[1];

        int num1 = Integer.parseInt(arg1);
        int num2 = Integer.parseInt(arg2);
        System.out.println(num1 + num2);
    }
}
