package example1.variable;

public class StringFunctionExample {
    public static void main(String[] args) {
        String str = "Hello World";
        /*
         * indexOf : 문자열 혹은 문자의 인덱스 출력
         * 없을 경우 -1 리턴
         */
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("X"));
        System.out.println(str.indexOf('o'));

        // 문자열 길이 출력
        System.out.println(str.length());
        
        // 반복문으로 문자열 원소 접근
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("==============");
        for (char c: str.toCharArray()) {
            System.out.println(c);
        }

        System.out.println(str.substring(1, 5));
        /*
         * startWith() - 문자열이 해당 문자열로 시작하면 true
         * endWith() - 문자열이 해당 문자열로 끝나면 true
         */
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("X"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.endsWith("X"));

        String[] splited = str.split(" ");
        System.out.println(splited[0] + splited[1]);

        // 해당 문자열 패턴의 포함 여부
        System.out.println(str.contains("ll"));
        System.out.println(str.contains("xx"));
    }
}
