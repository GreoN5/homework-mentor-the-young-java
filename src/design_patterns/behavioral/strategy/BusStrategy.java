package design_patterns.behavioral.strategy;

public class BusStrategy implements IRouteStrategy {
    @Override
    public void travel(String from, String to) {
        System.out.println("Taking the bus from " + from + " to " + to);
    }
}
