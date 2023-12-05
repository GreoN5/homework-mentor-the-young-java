package store;

public class Buyer {
    private static final double MINIMUM_MONEY = 0.00;

    private Cart cart;
    private Store store;
    private double availableMoney;

    public Buyer(double money) {
        if (money < MINIMUM_MONEY) {
            money = MINIMUM_MONEY;
        }

        availableMoney = money;
    }

    public void addProductToCart(Product product, double quantity) {
        if (product == null || !store.doesProductExist(product)) {
            Utils.stopTheSystem("Cannot add non-existing product.");
        }

        cart.addProduct(product, quantity);
        store.putProductInCart(product, quantity);
    }

    public void removeProductFromCart(Product product, double quantity) {
        if (product == null || !store.doesProductExist(product)) {
            Utils.stopTheSystem("Cannot remove non-existing product.");
        }

        cart.removeProduct(product, quantity);
        store.returnProduct(product, quantity);
    }

    public void payForProducts() {
        double sum = cart.calculateSumOfProducts();

        if (sum > availableMoney) {
            System.out.println("Sorry, you don't have enough money to pay. You have to return your products in the cart.");

            Product[] cartProducts = cart.getProducts();
            for (int index = 0; index < cartProducts.length; index++) {
                Product product = cartProducts[index];
                if (product == null) {
                    continue;
                }

                store.returnProduct(product, product.getQuantity());
            }
        } else {
            availableMoney -= sum;
            store.addCashFromCustomer(sum);

            System.out.println("You have successfully paid for your products. You have " + availableMoney + " left.");
        }

        cart.cleanCart();
    }

    public void goToShopping(Store store, int numberOfProducts) {
        if (store == null) {
            Utils.stopTheSystem("There is no available store.");
        }

        this.store = store;
        cart = new Cart(numberOfProducts);
    }

    public void showCartInfo() {
        Product[] products = cart.getProducts();

        System.out.println("Products in cart:");
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                continue;
            }

            System.out.println("Product - " + product.getName() + "\n" +
                    "Price - " + product.getPrice() + "\n" +
                    "Quantity - " + product.getQuantity());
        }

        System.out.println();
    }
}
