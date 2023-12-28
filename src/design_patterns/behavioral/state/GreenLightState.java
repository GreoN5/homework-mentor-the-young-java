package design_patterns.behavioral.state;

public class GreenLightState implements ILightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Green Light - Go!");
        trafficLight.setState(new YellowLightState());
    }
}
