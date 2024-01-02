package design_patterns.behavioral.state;

public class TrafficLight {
    private ILightState state;

    public TrafficLight() {
        this.state = new RedLightState();
    }

    public void change() {
        state.handle(this);
    }

    public void setState(ILightState state) {
        this.state = state;
    }
}
