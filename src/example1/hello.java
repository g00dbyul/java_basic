package example1;

public class hello {
    public static void main(String[] args) {
        System.err.println("Hello");
        int a = 0;
        System.err.println(a);
        byte b = 5;
        int c = b;
        System.err.println(b);
        System.err.println(c);
        b = (byte) a;
        System.err.println(b);
    }
}
