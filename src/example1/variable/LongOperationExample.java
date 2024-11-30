package example1.variable;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 1;
        int value2 = 10;
        long value3 = 100L;
        long result = value1 + value2 + value3;
        // long타입의 범위가 가장 넓으므로 long 으로 변환
        System.out.println(result);
    }
}
