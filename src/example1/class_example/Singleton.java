package example1.class_example;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return instance;
    }
}
