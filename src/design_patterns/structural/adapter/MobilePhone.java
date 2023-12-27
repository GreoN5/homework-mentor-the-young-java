package design_patterns.structural.adapter;

public class MobilePhone implements IEuropeanAppliance {
    @Override
    public void plugIn() {
        System.out.println("Mobile phone is plugged into European socket.");
    }
}
