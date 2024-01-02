package design_patterns.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        AtcTower atcTower = new AtcTower();
        Flight flight1 = new Flight(atcTower);
        Flight flight2 = new Flight(atcTower);
        Runway runway = new Runway();

        atcTower.registerRunway(runway);
        flight1.requestLanding();

        atcTower.clearRunway();
        flight2.requestLanding();
    }
}
