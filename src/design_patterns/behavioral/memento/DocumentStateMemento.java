package design_patterns.behavioral.memento;

public class DocumentStateMemento {
    private String content;

    public DocumentStateMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
