package design_patterns.behavioral.memento;

public class TextDocument {
    private String content = "";

    public void addText(String text) {
        content += text;
    }

    public DocumentStateMemento save() {
        return new DocumentStateMemento(content);
    }

    public void restore(DocumentStateMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
