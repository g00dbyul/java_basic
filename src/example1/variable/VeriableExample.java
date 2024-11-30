package example1.variable;

public class VeriableExample {
    public static void main(String[] args) {
        int value = 20;
        int result = value + 10;
        System.out.println("result = " + result);

        int hour = 3;
        int minute = 5;
        int totalMinutes = (hour * 60) + minute;
        System.out.println(hour + "시간 " + minute + "분");
        System.out.println("totalMinutes = " + totalMinutes);
    }
}
