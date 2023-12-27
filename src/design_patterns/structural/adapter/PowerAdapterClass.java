package design_patterns.structural.adapter;

public class PowerAdapterClass extends EuropeanApplianceClass implements IAmericanElectricSocket {
    @Override
    public void connect() {
        System.out.println("Adapter connects American socket to European.");
        super.plugIn();
    }
}
