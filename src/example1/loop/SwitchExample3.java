package example1.loop;

public class SwitchExample3 {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A': case 'B':
                System.out.println("Good");
                break;
            case 'C': case 'D':
                System.out.println("SoSo");
                break;
            default:
                System.out.println("Default");
        }
    }
}
