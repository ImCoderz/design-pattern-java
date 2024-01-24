package BehavioralPatterns.VisitorPattern;

import java.util.Arrays;
import java.util.List;

// Visitor interface
interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitSquare(Square square);
}

// Element interface
interface Shape {
    void accept(ShapeVisitor visitor);
}

// Concrete Element 1: Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }
}

// Concrete Element 2: Square
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitSquare(this);
    }
}

// Concrete Visitor: AreaCalculator
class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;

    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        totalArea += area;
    }

    @Override
    public void visitSquare(Square square) {
        double area = Math.pow(square.getSide(), 2);
        totalArea += area;
    }

    public double getTotalArea() {
        return totalArea;
    }
}

// Usage
public class AreaDemo {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(3.0),
                new Square(2.5),
                new Circle(5.0)
        );

        AreaCalculator areaCalculator = new AreaCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total Area: " + areaCalculator.getTotalArea());
    }
}

