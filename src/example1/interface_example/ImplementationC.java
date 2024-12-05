package example1.interface_example;

public class ImplementationC implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("ImplementationC methodC");
    }

    @Override
    public void methodA() {
        System.out.println("ImplementationC methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC methodB");
    }
}
