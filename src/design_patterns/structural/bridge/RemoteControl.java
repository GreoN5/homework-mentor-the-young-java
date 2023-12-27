package design_patterns.structural.bridge;

public abstract class RemoteControl {
    protected ITV tv;

    public RemoteControl(ITV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}
