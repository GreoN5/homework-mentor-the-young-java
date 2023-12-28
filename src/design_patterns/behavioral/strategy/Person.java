package design_patterns.behavioral.strategy;

public class Person {
    private IRouteStrategy modeOfTransportation;

    public void setTransportationMode(IRouteStrategy mode) {
        this.modeOfTransportation = mode;
    }

    public void travel(String from, String to) {
        modeOfTransportation.travel(from, to);
    }
}
