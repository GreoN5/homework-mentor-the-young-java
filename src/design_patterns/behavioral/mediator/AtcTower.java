package design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AtcTower implements IAtcTower {
    private Runway runway;
    private List<Flight> flightsWaiting = new ArrayList<>();

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        flightsWaiting.add(flight);
    }

    @Override
    public boolean isRunwayAvailable() {
        return runway.isAvailable();
    }

    @Override
    public void grantLandingPermission(Flight flight) {
        if (runway.isAvailable()) {
            flight.land();
            runway.setAvailable(false);
        } else {
            flightsWaiting.add(flight);
        }
    }

    @Override
    public void clearRunway() {
        runway.setAvailable(true);
        System.out.println("Runway cleared!");

        if (!flightsWaiting.isEmpty()) {
            Flight nextFlight = flightsWaiting.get(0);
            flightsWaiting.remove(nextFlight);

            nextFlight.requestLanding();
        }
    }
}
