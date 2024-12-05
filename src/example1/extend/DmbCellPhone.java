package example1.extend;

public class DmbCellPhone extends CellPhone {
    int channel;

    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("Turning on dmb");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("Changed channel to " + this.channel);
    }

    void turnOffDmb() {
        System.out.println("Turning off dmb");
    }
}
