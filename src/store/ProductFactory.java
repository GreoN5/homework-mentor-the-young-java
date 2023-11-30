package store;

public class ProductFactory {
    private ProductFactory() {}

    public static Product retrieveProductWithQuantity(Product product, double quantity) {
        if (product instanceof ProductByKilogram) {
            return new ProductByKilogram(product.getName(), product.getPrice(), quantity);
        }

        if (product instanceof ProductByQuantity) {
            return new ProductByQuantity(product.getName(), product.getPrice(), (int)quantity);
        }

        return null;
    }
}
