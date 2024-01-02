package design_patterns.behavioral.memento;

import java.util.Stack;

public class Undo {
    private Stack<DocumentStateMemento> history = new Stack<>();

    public void save(TextDocument document) {
        history.push(document.save());
    }

    public void undo(TextDocument document) {
        if (!history.isEmpty()) {
            document.restore(history.pop());
        }
    }
}
