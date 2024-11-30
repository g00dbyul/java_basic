package example1.variable;

public class CharExample {
    public static void main(String[] args) {
        // char 타입을 사용할 땐 '' 를 사용해야 함!
        char c1 = 'A';
        char c2 = 65; // 10진수 정수 리터럴 할당
        char c3 = '\u0041'; // 16진수 리터럴 할당
        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
