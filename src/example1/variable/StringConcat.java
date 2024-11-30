package example1.variable;

public class StringConcat {
    public static void main(String[] args) {
        int value = 10 + 2 + 8;
        System.out.println(value);

        String str1 = 10 + 2 + "8";
        System.out.println(str1);

        String str2 = "10" + 2 + 8;
        System.out.println(str2);

        String str3 = "10" + (2 + 8);
        System.out.println(str3);

        /*
        정수 + 문자열 => 문자열
        다만, 정수 연산이 먼저 수행되는 경우 정수 연산 수행 후, 문자열 연산 => 결과가 달라질 수 있음
         */
    }
}
