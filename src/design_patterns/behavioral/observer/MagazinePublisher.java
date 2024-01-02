package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MagazinePublisher {
    private List<Person> subscribers = new ArrayList<>();
    private String latestEdition;

    public void registerSubscriber(Person subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Person subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Person subscriber : subscribers) {
            subscriber.update(latestEdition);
        }
    }

    public void releaseNewEdition(String edition) {
        this.latestEdition = edition;
        notifySubscribers();
    }
}
