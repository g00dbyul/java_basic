package example1.input_and_output;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();
            System.out.println(input);

            if (input.equals("q")) {
                break;
            }
        }
    }
}
