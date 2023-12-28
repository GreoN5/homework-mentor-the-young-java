package design_patterns.behavioral.state;

public class RedLightState implements ILightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red Light - Stop!");
        trafficLight.setState(new YellowLightState());
    }
}
