package example1.abstract_class;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("Breath");
    }

    public abstract void sound();
}
