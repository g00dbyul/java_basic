package example1.abstract_class;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("Internet Search");
    }
}
