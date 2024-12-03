package example1.array;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 99, 22 ,98, 85};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);

        double average = (double) sum / scores.length;
        System.out.println(average);
    }
}
