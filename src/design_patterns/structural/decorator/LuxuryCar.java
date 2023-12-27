package design_patterns.structural.decorator;

public class LuxuryCar extends CarDecorator {
    private static final String ADDITIONAL_DESCRIPTION = ", with Luxury Package";
    private static final double ADDITIONAL_PRICE = 7500.00;

    public LuxuryCar(ICar decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription().concat(ADDITIONAL_DESCRIPTION);
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice() + ADDITIONAL_PRICE;
    }
}
