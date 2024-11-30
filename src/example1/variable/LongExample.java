package example1.variable;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10; // int를 long에 할당
        long var2 = 20L; // long 타입 할당
//        long var3 = 1000000000000; // int의 범위를 초과하면 에러 ㅠ
        long var3 = 1000000000000L;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
    }
}
