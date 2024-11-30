package example1.variable;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 형변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = 'A';
        intValue = charValue;
        System.out.println(intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println(longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println(floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(doubleValue);

        /*
        범위
        byte < char < int < long < float < double

        범위의 크기가 작은 데이터 타입은 본인과 같거나 큰 데이터 타입에 자동적으로 할당
         */
    }
}
