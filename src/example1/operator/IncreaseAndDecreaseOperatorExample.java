package example1.operator;

public class IncreaseAndDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z;

        System.out.println("========");
        x++;
        ++x;
        System.out.println(x);

        System.out.println("========");
        y--;
        --y;
        System.out.println(y);

        System.out.println("========");
        z = ++x + y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
