package design_patterns.structural.decorator;

public class BasicCar implements ICar {
    private static final String DEFAULT_DESCRIPTION = "Basic car";
    private static final double DEFAULT_PRICE = 20000.00;

    @Override
    public String getDescription() {
        return DEFAULT_DESCRIPTION;
    }

    @Override
    public double getPrice() {
        return DEFAULT_PRICE;
    }
}
