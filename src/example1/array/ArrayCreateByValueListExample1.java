package example1.array;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 참조 변수 선언과 동시에 값 할당
        int[] scores = { 83, 90, 87 };

        System.out.println("scores[0]: " + scores[0]);
        System.out.println("scores[1]: " + scores[1]);
        System.out.println("scores[2]: " + scores[2]);

        int sum = 0;
        for (int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum: " + sum);
        double average = (double) sum / scores.length;
        System.out.println("average: " + average);
    }
}
