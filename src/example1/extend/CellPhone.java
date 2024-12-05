package example1.extend;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("Powering on");
    }

    void powerOff() {
        System.out.println("Powering off");
    }

    void bell() {
        System.out.println("Bell");
    }

    void sendVoice(String voice) {
        System.out.println("Sending voice: " + voice);
    }

    void receiveVoice(String voice) {
        System.out.println("Receiving voice: " + voice);
    }

    void hangUp() {
        System.out.println("Hanging up");
    }
}
