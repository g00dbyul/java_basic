package example1.input_and_output;

public class ContinueKeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while (true) {
            keyCode = System.in.read();
            System.out.println(keyCode);
        }
    }
}
