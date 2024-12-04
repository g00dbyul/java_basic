package example1.class_example;

public class SoCar {
    int gas;
    void setGas(int gas) {
         this.gas = gas;
    }

    boolean isLeftGas() {
        return !(gas == 0);
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("Go Go ring");
                gas -= 1;
                System.out.println(gas);
            } else {
                System.out.println("No gas");
                return;
            }
        }
    }
}
