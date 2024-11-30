package example1.operator;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println(result1);
        System.out.println(result2);

        byte b = 100;
//        byte b2 = -b;
        // byte의 연산 결과가 int 타입이므로 byte에 할당 불가 ㅠ
        int b2 = -b;
        System.out.println(b2);

    }
}
