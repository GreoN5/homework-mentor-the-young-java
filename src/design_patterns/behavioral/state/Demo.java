package design_patterns.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 3; i++) {
            trafficLight.change();
        }
    }
}
