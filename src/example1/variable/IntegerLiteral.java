package example1.variable;

public class IntegerLiteral {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수는 0b, 0B로 시작
        int var2 = 0203; // 8진수는 0으로 시작
        int var3 = 365;
        int var4 = 0xB3; // 16진수는 0x, 0X로 시작

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
    }
}
