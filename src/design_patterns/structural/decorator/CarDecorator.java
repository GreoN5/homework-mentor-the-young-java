package design_patterns.structural.decorator;

public abstract class CarDecorator implements ICar {
    protected ICar decoratedCar;

    public CarDecorator(ICar decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice();
    }
}
