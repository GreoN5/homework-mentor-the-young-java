package design_patterns.behavioral.mediator;

public class Flight {
    private AtcTower atcTower;

    public Flight(AtcTower atcTower) {
        this.atcTower = atcTower;
    }

    public void requestLanding() {
        atcTower.grantLandingPermission(this);
    }

    public void land() {
        System.out.println("Landing...");
    }
}
