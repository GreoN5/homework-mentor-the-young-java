package design_patterns.behavioral.strategy;

public class WalkStrategy implements IRouteStrategy {
    @Override
    public void travel(String from, String to) {
        System.out.println("Walking from " + from + " to " + to);
    }
}
