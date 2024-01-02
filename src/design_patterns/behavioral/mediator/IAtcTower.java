package design_patterns.behavioral.mediator;

public interface IAtcTower {
    void registerRunway(Runway runway);
    void registerFlight(Flight flight);
    boolean isRunwayAvailable();
    void grantLandingPermission(Flight flight);
    void clearRunway();
}
