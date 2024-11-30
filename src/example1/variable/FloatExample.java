package example1.variable;

public class FloatExample {
    public static void main(String[] args) {
        // float var1 = 3.14; // double을 float에 쓸 수 없음 ㅠ
        float var2 = 3.14f;
        double var3 = 3.14;

        // 정밀도 테스트
        float var4 = 0.123456789123456789f;
        double var5 = 0.123456789123456789; // double이 더 세밀한 표현 가능

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}
