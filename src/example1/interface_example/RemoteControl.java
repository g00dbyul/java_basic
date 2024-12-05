package example1.interface_example;

public interface RemoteControl {
    // 상수 선언 public static final 생략 가능
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
