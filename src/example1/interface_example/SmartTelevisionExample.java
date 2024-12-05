package example1.interface_example;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision smartTelevision = new SmartTelevision();
        RemoteControl rc = smartTelevision;
        Searchable searchable = smartTelevision;

        // 다중 인터페이스 구현 시 해당 인터페이스 타입으로 인스턴스를 생성하면, 인스턴스의 함수만 실행 가능
        rc.turnOn();
        rc.turnOff();

        searchable.search("URL");
    }
}
