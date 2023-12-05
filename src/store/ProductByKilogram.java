package store;

public class ProductByKilogram extends Product {
    private static final double MINIMUM_KILOS = 0.00;
    private double kilogram;

    public ProductByKilogram(String name, double price, double kilogram) {
        super(name, price);
        this.kilogram = kilogram;
    }

    @Override
    public boolean isProductAvailable() {
        return kilogram > MINIMUM_KILOS;
    }

    @Override
    public void decreaseQuantity(double quantity) {
        if (quantity > MINIMUM_KILOS) {
            if (quantity > kilogram) {
                kilogram = MINIMUM_KILOS;
            } else {
                kilogram -= quantity;
            }
        } else {
            Utils.stopTheSystem("Invalid kilos are provided.");
        }
    }

    @Override
    public void increaseQuantity(double quantity) {
        if (quantity > MINIMUM_KILOS) {
            kilogram += quantity;
        } else {
            Utils.stopTheSystem("Invalid kilos are provided.");
        }
    }

    @Override
    public boolean hasSufficientAmount(double quantity) {
        if (quantity > MINIMUM_KILOS) {
            return kilogram > quantity;
        }

        Utils.stopTheSystem("Invalid kilos are provided.");
        return false;
    }

    @Override
    public double getQuantity() {
        return kilogram;
    }
}
