package example1.abstract_class;

public class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("Meow meow meow meow meow meow");
    }
}