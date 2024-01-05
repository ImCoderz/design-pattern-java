package PrototypePattern.entity;

public class Circle implements GraphicElement {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public GraphicElement clone() {
        return new Circle(this.radius);
    }

    @Override
    public void display() {
        System.out.println("Circle with radius " + radius);
    }
}
