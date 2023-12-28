package design_patterns.behavioral.observer;

public class Person implements ISubscriber {
    @Override
    public void update(String edition) {
        System.out.println("Received the latest edition: " + edition);
    }
}
