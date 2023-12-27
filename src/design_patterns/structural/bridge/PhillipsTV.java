package design_patterns.structural.bridge;

public class PhillipsTV implements ITV {
    @Override
    public void on() {
        System.out.println("Phillips is turned on.");
    }

    @Override
    public void off() {
        System.out.println("Phillips is turned off.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}
