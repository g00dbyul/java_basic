package example1.input_and_output;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("가격 : %d원\n",value);
        System.out.printf("가격 : %6d원\n",value);
        System.out.printf("가격 : %-6d원\n",value);
        System.out.printf("가격 : %06d원\n",value);

        /*
        %nd : n칸만큼 공간 확보(앞의 공간은 공백)
        %-nd : n칸 공간 확보, 앞에서 부터 출력, 뒷 공간은 공백
        %xnd : n z칸 공간 확보, 공백 대신 x로 대체
        -가 있으면, 왼쪽정렬, 없으면 오른쪽 정렬 이렇게 이해 하는게 쉬울듯
         */

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름 %d인 원의 넓이 : %10.2f\n",10,area);
        /*
        * %n.mf : n자리 만큼 확보, 소수점은 m자리 까지
        * %d : 정수, %f : 실수 %s : 문자열
         */

        String name = "홍길동";
        String job = "도둑";
        System.out.printf("%6d|%-10s|%10s", 1, name, job);

    }
}
