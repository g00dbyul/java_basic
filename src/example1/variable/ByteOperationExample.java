package example1.variable;

public class ByteOperationExample {
    public static void main(String[] args) {
        byte result = 10 + 20;
        System.out.println(result);

        byte x = 10;
        byte y = 20;
//        byte result2 = x+y;
        int result2 = x + y;
        System.out.println(result2);
        // byte와  byte의 연산은 int로 반환됨...?

        /*
        JVM은 작은 정수타입(short, byte)를 사용할 때 이를 32비트 크기로 자동 형변환하게 되어 있음
        */
        // "자바의 정수 연산은 최소 단위가 4바이트이다."

// "그래서 byte나 short의 연산 단위가 기본으로 4바이트이다."
//
// - 자바는 정수 변수에 대해 산술 연산을 수행할 때,
//   그 변수의 값이 4바이트 보다 작다면(byte나 short 라면),
//   4바이트로 만들어 연산을 수행한다.
// - 즉 임시 4바이트 정수 메모리를 만든 다음에
//   그 메모리에 값을 담은 후에 연산을 수행한다.
// - 따라서 x + y는 바로 실행하지 않고
//   임의의 4바이트 정수 메모리를 만든 다음에
//   그 메모리에 x와 y 값을 넣고 연산을 수행한다.
// - 연산 결과도 당연히 4바이트이다.
//   그래서 4바이트 값을 1바이트 메모리에 넣지 못하기 때문에
//   컴파일 오류가 발생하는 것이다!
    }
}
