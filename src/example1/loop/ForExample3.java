package example1.loop;

public class ForExample3 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
