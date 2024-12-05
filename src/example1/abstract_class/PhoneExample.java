package example1.abstract_class;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("John Smith");
//        Phone phone = new Phone();
//        추상클래스로 인스턴스 생성 불가능

        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
