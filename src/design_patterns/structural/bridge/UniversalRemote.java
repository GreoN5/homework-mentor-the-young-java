package design_patterns.structural.bridge;

public class UniversalRemote extends RemoteControl {
    public UniversalRemote(ITV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        tv.on();
    }

    @Override
    public void turnOff() {
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        tv.changeChannel(channel);
    }
}
