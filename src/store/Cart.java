package store;

public class Cart {
    private static final int MINIMUM_NUMBER_PRODUCTS = 1;
    private static final int ZERO_PRODUCT_QUANTITY = 0;
    private static final double STARTING_SUM = 0.00;

    private Product[] products;

    public Cart(int numberOfProducts) {
        if (numberOfProducts < MINIMUM_NUMBER_PRODUCTS) {
            numberOfProducts = MINIMUM_NUMBER_PRODUCTS;
        }

        products = new Product[numberOfProducts];
    }

    public void addProduct(Product product, double quantity) {
        if (product == null) {
            Utils.stopTheSystem("Cannot add non-existing product.");
        }

        if (!product.isProductAvailable()) {
            System.out.println("Product is not available at the moment.");
        } else {
            for (int index = 0; index < products.length; index++) {
                Product cartProduct = products[index];
                if (cartProduct == null) {
                    products[index] = ProductFactory.retrieveProductWithQuantity(product, quantity);
                    break;
                }

                if (cartProduct.getName().equals(product.getName())) {
                    cartProduct.increaseQuantity(quantity);
                    break;
                }

                if (index == products.length - 1) {
                    System.out.println("There is no empty space left in the cart.");
                }
            }
        }
    }

    public void removeProduct(Product product, double quantity) {
        if (product == null) {
            Utils.stopTheSystem("Cannot remove non-existing product.");
        }

        for (int index = 0; index < products.length; index++) {
            Product cartProduct = products[index];
            if (cartProduct == null) {
                continue;
            }

            if (cartProduct.getName().equals(product.getName())) {
                cartProduct.decreaseQuantity(quantity);
                if (cartProduct.getQuantity() == ZERO_PRODUCT_QUANTITY) {
                    products[index] = null;
                }

                break;
            }
        }
    }

    public void cleanCart() {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                continue;
            }

            products[index] = null;
        }
    }

    public double calculateSumOfProducts() {
        double sum = STARTING_SUM;
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                continue;
            }

            sum += products[index].getPrice();
        }

        return sum;
    }

    public Product[] getProducts() {
        return products;
    }
}
