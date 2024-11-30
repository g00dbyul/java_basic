package example1.variable;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        byte byteValue2 = 20;
        int intValue = byteValue + byteValue2;
        System.out.println(intValue);

        char charValue = 'A';
        char charValue2 = 1;
        int intValue2 = (charValue + charValue2);
        System.out.println(intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);
        // int에 할당했기 때문에, 소수점 아래는 생략됨, 소수점까지 포함된 결과를 저장하려면 double에 할당

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);
    }
}
