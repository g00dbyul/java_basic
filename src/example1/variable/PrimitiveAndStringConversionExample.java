package example1.variable;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        System.out.println(args);
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("10.5");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        String str1 = String.valueOf(value1);
        String str2 = String.valueOf(value2);
        String str3 = String.valueOf(value3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
