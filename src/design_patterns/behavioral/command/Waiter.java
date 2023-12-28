package design_patterns.behavioral.command;

public class Waiter {
    public void takeOrder(ICommandOrder order) {
        order.execute();
    }
}
