package example1.variable;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500L;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        /*
        자신보다 범위가 작은 데이터 타입에 할당할 때는 데이터 타입을 명시해서 할당(캐스팅)
        double과 같은 소수 자료형을 int로 형변환 할 때는 소수점 아래 자리는 날라감 ㅠ
         */
    }
}
