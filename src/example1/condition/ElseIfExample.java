package example1.condition;

public class ElseIfExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90) {
            System.out.println(score);
            System.out.println("Grade : A");
        } else if (score >= 80) {
            System.out.println(score);
            System.out.println("Grade : B");
        } else if (score >= 70) {
            System.out.println(score);
            System.out.println("Grade : C");
        } else {
            System.out.println(score);
            System.out.println("Grade : D");
        }
    }
}
