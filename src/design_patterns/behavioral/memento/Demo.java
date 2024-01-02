package design_patterns.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        Undo undo = new Undo();

        document.addText("Hello");
        undo.save(document);
        System.out.println(document.getContent());

        document.addText(" World");
        undo.save(document);
        System.out.println(document.getContent());

        undo.undo(document);
        System.out.println("After undo: " + document.getContent());

        undo.undo(document);
        System.out.println("After undo: " + document.getContent());
    }
}
