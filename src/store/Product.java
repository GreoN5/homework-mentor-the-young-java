package store;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract boolean isProductAvailable();
    public abstract double getQuantity();
    public abstract void decreaseQuantity(double quantity);
    public abstract void increaseQuantity(double quantity);
    public abstract boolean hasSufficientAmount(double quantity);

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
