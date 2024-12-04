package example1.class_example;

public class SingltonExample {
    public static void main(String[] args) {
//        Singlton singltonExample = new Singlton();
        // Error Occured

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Singletons are equal");
        } else {
            System.out.println("Singletons are not equal");
        }
    }
}
