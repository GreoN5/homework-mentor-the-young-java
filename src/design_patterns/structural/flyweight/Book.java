package design_patterns.structural.flyweight;

public class Book {
    private int year;
    private String coverColor;
    private ConcreteBook book;

    public Book(int year, String coverColor, ConcreteBook book) {
        this.year = year;
        this.coverColor = coverColor;
        this.book = book;
    }

    public void printInfo() {
        System.out.println("Author: " + book.getAuthor() + "\n" +
                "Title: " + book.getTitle() + "\n" +
                "Year: " + year + "\n" +
                "Cover color: " + coverColor);
    }
}
