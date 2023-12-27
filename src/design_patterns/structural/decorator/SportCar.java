package design_patterns.structural.decorator;

public class SportCar extends CarDecorator {
    private static final String ADDITIONAL_DESCRIPTION = ", with Sports Package";
    private static final double ADDITIONAL_PRICE = 5000.00;

    public SportCar(ICar decoratedCar) {
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
