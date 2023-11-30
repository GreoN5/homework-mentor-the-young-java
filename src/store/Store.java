package store;

public class Store {
    private static final int CASH_RESERVES = 100;
    private static final int MIN_PRODUCT_CAPACITY = 50;
    private static final int NO_PRODUCTS_QUANTITY = 0;
    private static final double NO_CASH_CUSTOMER = 0;

    private String name;
    private String address;
    private double cash;
    private Product[] products;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Store(String name, String address, double cash) {
        this(name, address);

        if (cash < CASH_RESERVES) {
            cash = CASH_RESERVES;
        }
        this.cash = cash;
    }

    public Store(String name, String address, double cash, int productCapacity) {
        this(name, address, cash);

        if (productCapacity < MIN_PRODUCT_CAPACITY) {
            productCapacity = MIN_PRODUCT_CAPACITY;
        }
        this.products = new Product[productCapacity];
    }

    public Store(String name, String address, double cash, Product[] products) {
        this(name, address, cash);

        if (products == null || products.length == NO_PRODUCTS_QUANTITY) {
            Utils.stopTheSystem("There are no products defined in the shop.");
        }
        this.products = products;
    }

    public void putProductInCart(Product product, double quantity) {
        if (product == null) {
            Utils.stopTheSystem("Cannot add non-existing product.");
        }

        for (int index = 0; index < products.length; index++) {
            Product storedProduct = products[index];
            if (storedProduct == null) {
                continue;
            }

            if (storedProduct.getName().equals(product.getName())) {
                if (storedProduct.hasSufficientAmount(quantity)) {
                    storedProduct.decreaseQuantity(quantity);
                    break;
                }

                System.out.println("There is not enough quantity of this product.");
            }
        }
    }

    public void returnProduct(Product product, double quantity) {
        if (product == null) {
            Utils.stopTheSystem("Cannot add non-existing product.");
        }

        for (int index = 0; index < products.length; index++) {
            Product storedProduct = products[index];
            if (storedProduct == null) {
                continue;
            }

            if (storedProduct.getName().equals(product.getName())) {
                storedProduct.increaseQuantity(quantity);
                break;
            }
        }
    }

    public void addNewProduct(Product product) {
        if (product == null) {
            Utils.stopTheSystem("Cannot add non-existing product.");
        }

        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                products[index] = product;
                break;
            }
        }
    }

    public boolean doesProductExist(Product product) {
        boolean productExists = false;
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                continue;
            }

            if (products[index].getName().equals(product.getName())) {
                productExists = true;
                break;
            }
        }

        return productExists;
    }

    public void addCashFromCustomer(double cash) {
        if (cash < NO_CASH_CUSTOMER) {
            Utils.stopTheSystem("Invalid cash has been provided from customer.");
        }

        this.cash += cash;
    }

    public void showProductsInfo() {
        if (products.length == NO_PRODUCTS_QUANTITY) {
            System.out.println("Currently the store does not have any products.");
        } else {
            for (int index = 0; index < products.length; index++) {
                Product product = products[index];
                if (product == null) {
                    continue;
                }

                System.out.println("Product - " + product.getName() + "\n" +
                        "Price: " + product.getPrice() + "\n" +
                        "Quantity: " + product.getQuantity());
            }

            System.out.println();
        }
    }

    public void showStoreInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Products: ");
        showProductsInfo();
    }
}
