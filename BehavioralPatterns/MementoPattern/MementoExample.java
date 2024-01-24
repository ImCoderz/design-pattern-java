package BehavioralPatterns.MementoPattern;

import java.util.Stack;


// Originator
class TextEditor {
    private StringBuilder content;

    public TextEditor() {
        this.content = new StringBuilder();
    }

    public void appendText(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public TextMemento save() {
        return new TextMemento(content.toString());
    }

    public void restore(TextMemento memento) {
        this.content = new StringBuilder(memento.getState());
    }
}

// Memento
class TextMemento {
    private final String state;

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Caretaker
class TextEditorHistory {
    private final Stack<TextMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            TextMemento memento = history.pop();
            textEditor.restore(memento);
        }
    }
}

public class MementoExample {
    public static void main(String[] args) {
        // Create a text editor
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Make changes and save states
        textEditor.appendText("Hello, ");
        history.saveState(textEditor);

        textEditor.appendText("world!");
        history.saveState(textEditor);

        // Print current content
        System.out.println("Current content: " + textEditor.getContent());

        // Undo the last change
        history.undo(textEditor);

        // Print content after undo
        System.out.println("Content after undo: " + textEditor.getContent());
    }
}
