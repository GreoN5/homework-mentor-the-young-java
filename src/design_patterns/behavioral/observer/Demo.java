package design_patterns.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        MagazinePublisher publisher = new MagazinePublisher();
        Person subscriber1 = new Person();
        Person subscriber2 = new Person();

        publisher.registerSubscriber(subscriber1);
        publisher.registerSubscriber(subscriber2);

        publisher.releaseNewEdition("October Edition");
    }
}
