package design_patterns.structural.flyweight;

public class ConcreteBook {
    private String title;
    private String author;

    public ConcreteBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
