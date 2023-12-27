package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static Map<String, ConcreteBook> library = new HashMap<>();

    private BookFactory() {}

    public static Book getBook(String title, String author, int year, String coverColor) {
        ConcreteBook concreteBook = getConcreteBook(title, author);
        Book book = new Book(year, coverColor, concreteBook);

        return book;
    }

    private static ConcreteBook getConcreteBook(String title, String author) {
        String key = title + " - " + author;
        if(!library.containsKey(key)) {
            library.put(key, new ConcreteBook(title, author));
        }

        return library.get(key);
    }
}
