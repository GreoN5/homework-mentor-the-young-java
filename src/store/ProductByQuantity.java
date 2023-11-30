package store;

public class ProductByQuantity extends Product {
    private static final int MINIMUM_QUANTITY = 0;
    private int quantity;

    public ProductByQuantity(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public boolean isProductAvailable() {
        return quantity > MINIMUM_QUANTITY;
    }

    @Override
    public void decreaseQuantity(double quantity) {
        if (quantity > MINIMUM_QUANTITY) {
            if (quantity > this.quantity) {
                this.quantity = MINIMUM_QUANTITY;
            } else {
                this.quantity -= (int)quantity;
            }
        } else {
            Utils.stopTheSystem("Invalid quantity is provided.");
        }
    }

    @Override
    public void increaseQuantity(double quantity) {
        if (quantity > MINIMUM_QUANTITY) {
            this.quantity += (int)quantity;
        } else {
            Utils.stopTheSystem("Invalid quantity is provided.");
        }
    }

    @Override
    public boolean hasSufficientAmount(double quantity) {
        if (quantity > MINIMUM_QUANTITY) {
            return this.quantity > quantity;
        }

        Utils.stopTheSystem("Invalid quantity is provided.");
        return false;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }
}
