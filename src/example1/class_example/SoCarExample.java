package example1.class_example;

public class SoCarExample {
    public static void main(String[] args) {
        SoCar soCar = new SoCar();
        soCar.setGas(5);

        boolean gasState = soCar.isLeftGas();

        if (gasState) {
            System.out.println("Order : Lets go");
            soCar.run();
        }

        if (soCar.isLeftGas()) {
            System.out.println("Just Go");
        } else {
            System.out.println("Please give gas");
        }
    }
}
