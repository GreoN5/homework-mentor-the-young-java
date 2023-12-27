package design_patterns.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        testTvRemote(new SamsungTV(), 5);
        testTvRemote(new PhillipsTV(), 1);
        testTvRemote(new SonyTV(), 2);
    }

    private static void testTvRemote(ITV tv, int channel) {
        UniversalRemote remote = new UniversalRemote(tv);

        remote.turnOn();
        remote.setChannel(channel);
        remote.turnOff();
    }
}
