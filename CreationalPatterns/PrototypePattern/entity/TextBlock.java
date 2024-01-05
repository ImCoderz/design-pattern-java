package PrototypePattern.entity;

public class TextBlock implements GraphicElement {
    private String text;

    public TextBlock(String text) {
        this.text = text;
    }

    @Override
    public GraphicElement clone() {
        return new TextBlock(this.text);
    }
    
    @Override
    public void display() {
        System.out.println("Text Block with text: " + text);
    }
}

