package design_patterns.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        Book book = BookFactory.getBook("Hello World", "Stephanie", 2000, "orange");

        book.printInfo();
    }
}
