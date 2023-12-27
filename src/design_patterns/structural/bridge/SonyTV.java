package design_patterns.structural.bridge;

public class SonyTV implements ITV {
    @Override
    public void on() {
        System.out.println("Sony is turned on.");
    }

    @Override
    public void off() {
        System.out.println("Sony is turned off.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}
