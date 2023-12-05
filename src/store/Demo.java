package store;

public class Demo {
    public static void main(String[] args) {
        ProductByKilogram meat = new ProductByKilogram("Meat", 10.00, 12.50);
        ProductByKilogram cheese = new ProductByKilogram("Cheese", 8.00, 23.00);
        ProductByKilogram fish = new ProductByKilogram("Fish", 9.59, 17.00);

        ProductByQuantity beer = new ProductByQuantity("Beer", 3.50, 21);
        ProductByQuantity book = new ProductByQuantity("Book", 10.00, 60);
        ProductByQuantity chair = new ProductByQuantity("Chair", 60.00, 3);

//        Product[] products = new Product[] {
//          meat, cheese, fish,
//          beer, book, chair
//        };

//        Store lidl = new Store("Lidl", "bul. Hristo Botev 59", 1000, products);
//        lidl.showStoreInfo();
//
//        Buyer misho = new Buyer(100);
//        Buyer gosho = new Buyer(1000);
//        Buyer pesho = new Buyer(20);
//
//        misho.goToShopping(lidl, 10);
//        gosho.goToShopping(lidl, 20);
//        pesho.goToShopping(lidl, 5);
//
//        misho.addProductToCart(beer, 2);
//        misho.addProductToCart(meat, 2.50);
//        misho.addProductToCart(cheese, 0.50);
//
//        gosho.addProductToCart(meat, 5.50);
//        gosho.addProductToCart(cheese, 2.50);
//        gosho.addProductToCart(fish, 5.00);
//        gosho.addProductToCart(beer, 10);
//        gosho.addProductToCart(book, 5);
//
//        pesho.addProductToCart(beer, 3);
//        pesho.addProductToCart(book, 2);
//        pesho.addProductToCart(cheese, 1.00);
//
//        gosho.removeProductFromCart(fish, 1.00);
//        pesho.removeProductFromCart(beer, 1);
//        misho.removeProductFromCart(cheese, 0.50);
//
//        gosho.showCartInfo();
//        pesho.showCartInfo();
//        misho.showCartInfo();
//
//        misho.payForProducts();
//        gosho.payForProducts();
//        pesho.payForProducts();
//        lidl.showProductsInfo();

        Store kaufland = new Store("Kaufland", "bul. Ilinden 75", 1000, 50);
        kaufland.showStoreInfo();

        kaufland.addNewProduct(meat);
        kaufland.addNewProduct(cheese);
        kaufland.addNewProduct(fish);
        kaufland.addNewProduct(beer);
        kaufland.addNewProduct(book);
        kaufland.addNewProduct(chair);

        Buyer misho = new Buyer(100);
        Buyer gosho = new Buyer(1000);
        Buyer pesho = new Buyer(20);

        misho.goToShopping(kaufland, 10);
        gosho.goToShopping(kaufland, 20);
        pesho.goToShopping(kaufland, 5);

        misho.addProductToCart(beer, 2);
        misho.addProductToCart(meat, 2.50);
        misho.addProductToCart(cheese, 0.50);

        gosho.addProductToCart(meat, 5.50);
        gosho.addProductToCart(cheese, 2.50);
        gosho.addProductToCart(fish, 5.00);
        gosho.addProductToCart(beer, 10);
        gosho.addProductToCart(book, 5);

        pesho.addProductToCart(beer, 3);
        pesho.addProductToCart(book, 2);
        pesho.addProductToCart(cheese, 1.00);

        gosho.removeProductFromCart(fish, 1.00);
        pesho.removeProductFromCart(beer, 1);
        misho.removeProductFromCart(cheese, 0.50);

        gosho.showCartInfo();
        pesho.showCartInfo();
        misho.showCartInfo();

        misho.payForProducts();
        gosho.payForProducts();
        pesho.payForProducts();
        kaufland.showProductsInfo();
    }
}
