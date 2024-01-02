package design_patterns.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        Radio radio = new Radio();
        IStationSelector selector = radio.createIterator();

        while (selector.hasNext()) {
            RadioStation station = selector.next();
            System.out.println("Tuning into: " + station.getFrequency());
        }
    }
}
