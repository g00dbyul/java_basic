package example1.loop;

public class SwitchExample2 {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println(time);
        // break 꼭 쓰셈
        switch (time) {
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");
            case 10:
                System.out.println("10");
            default:
                System.out.println("Default");
        }
    }
}
