package example1.operator;

public class ConditionalOperatorExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(grade);
    }
}