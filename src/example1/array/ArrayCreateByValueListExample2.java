package example1.array;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int scores[];
        scores = new int[] {83, 90, 86};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println(sum);

        double average = (double) sum / scores.length;
        System.out.println(average);
    }
}
