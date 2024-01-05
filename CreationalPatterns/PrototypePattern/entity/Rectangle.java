package PrototypePattern.entity;

public class Rectangle implements GraphicElement {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public GraphicElement clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void display() {
        System.out.println("Rectangle with width " + width + " and height " + height);
    }
}

