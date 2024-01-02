package design_patterns.behavioral.state;

public class YellowLightState implements ILightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow Light - Caution!");
        trafficLight.setState(new GreenLightState());
    }
}
