package example1.abstract_class;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    public void turnOff() {
        System.out.println("Phone is turned off");
    }
}
