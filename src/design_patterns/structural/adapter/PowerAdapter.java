package design_patterns.structural.adapter;

public class PowerAdapter implements IAmericanElectricSocket {
    private IEuropeanAppliance appliance;

    public PowerAdapter(IEuropeanAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void connect() {
        if (appliance != null) {
            System.out.println("Adapter connects American socket to European.");
            appliance.plugIn();
        }
    }
}
