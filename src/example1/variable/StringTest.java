package example1.variable;

public class StringTest {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.hashCode());

        str = str + "!";
        System.out.println(str.hashCode());
        str = str.replace("!", "");
        System.out.println(str.hashCode());
        System.out.println();

        StringBuilder stb = new StringBuilder("Hello World");

        System.out.println(stb.hashCode());
        stb.append("!");
        System.out.println(stb.hashCode());

        /*
        Java에서 문자열(String)은 Immutable Object이다.
        문자열의 값을 변경할 수 없다는 의미이다.(생성 후 상태가 바뀌지 않는다.)
        문자열 추가 및 삭제 연산으로 기존의 변수에 수정을 한다면,
        내부적으로는 기존의 참조를 끊고, 새로운 참조를 생성한다.
        => 추가, 삭제 연산의 비용이 크다.

        근데, replace()는 예외다...;;

        반대로, String Builder는 생성 후 그 상태를 변경할 수 있다.
        => 추가 삭제 연산에 유리하다.
         */

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
