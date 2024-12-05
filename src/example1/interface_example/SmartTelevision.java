package example1.interface_example;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("SmartTelevision is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision is turning off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current Smart Television volume is " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println("SmartTelevision searching for " + url);
    }
}
