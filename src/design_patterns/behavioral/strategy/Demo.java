package design_patterns.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        Person traveler = new Person();

        traveler.setTransportationMode(new WalkStrategy());
        traveler.travel("Home", "Coffee shop");

        traveler.setTransportationMode(new CarStrategy());
        traveler.travel("Coffee shop", "Office");
    }
}
