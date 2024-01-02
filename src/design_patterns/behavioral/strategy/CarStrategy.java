package design_patterns.behavioral.strategy;

public class CarStrategy implements IRouteStrategy {
    @Override
    public void travel(String from, String to) {
        System.out.println("Driving from " + from + " to " + to);
    }
}
