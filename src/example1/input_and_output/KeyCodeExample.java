package example1.input_and_output;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        keyCode = System.in.read();
        System.out.println(keyCode);

        keyCode = System.in.read();
        System.out.println(keyCode);

        keyCode = System.in.read();
        System.out.println(keyCode);
    }
}
