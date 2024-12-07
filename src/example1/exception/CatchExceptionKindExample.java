package example1.exception;

public class CatchExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
            // 상위 예외 클래스가 하위 예외 클래스보다 아래에 위치해야 함(예외 발생시 catch 블록 순서대로 탐색)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } finally {
            System.out.println("Program is over");
        }
    }
}
