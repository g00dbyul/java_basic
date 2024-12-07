package example1.exception;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("String");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } finally {
            System.out.println("Program executed successfully");
        }
    }
}
