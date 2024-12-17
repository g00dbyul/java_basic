package example1.variable;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(stringBuilder.length());
        // append 문자열 뒤에 추가
        for (int i=0; i<5; i++) {
            stringBuilder.append(Integer.toString(i));
        }
        System.out.println(stringBuilder);

        // 문자열 삽입 offset 위치에
        System.out.println(stringBuilder.insert(3, "AA"));
        // 문자열 자르기 
        System.out.println(stringBuilder.substring(3, 5));

        // 문자 삭제 index 기준
        System.out.println(stringBuilder.deleteCharAt(3));

        // 문자열 뒤집기
        System.out.println(stringBuilder.reverse());

        // 문자 대체 - 인덱스 기준
        stringBuilder.setCharAt(1, 'X');
        System.out.println(stringBuilder);
        

        String builderToString = stringBuilder.toString();

        
    }
}
