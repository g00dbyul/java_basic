package example1.abstract_class;

public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("Mong Mong Mong Mong Mong Mong Mong");
    }
}
