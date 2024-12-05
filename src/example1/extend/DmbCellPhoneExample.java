package example1.extend;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone(
                "Java", "Black", 10
        );

        System.out.println(dmbCellPhone.model);
        System.out.println(dmbCellPhone.color);
        System.out.println(dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hi");
        dmbCellPhone.receiveVoice("Yes");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(15);
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOff();
    }
}
