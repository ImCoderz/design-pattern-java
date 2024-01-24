
// Abstraction
abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    abstract void draw();
}

// Implementation
interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double side);
}

// Refined Abstraction
class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}

// Refined Abstraction
class Square extends Shape {
    private double x, y, side;

    public Square(double x, double y, double side, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    void draw() {
        drawingAPI.drawSquare(x, y, side);
    }
}

// Concrete Implementation
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1 - Drawing Circle at (%.2f, %.2f) with radius %.2f%n", x, y, radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.printf("API1 - Drawing Square at (%.2f, %.2f) with side %.2f%n", x, y, side);
    }
}

// Concrete Implementation
class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2 - Drawing Circle at (%.2f, %.2f) with radius %.2f%n", x, y, radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.printf("API2 - Drawing Square at (%.2f, %.2f) with side %.2f%n", x, y, side);
    }
}

// Client Code
public class BridgePatternExample {
    public static void main(String[] args) {
        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI api2 = new DrawingAPI2();

        Shape circle = new Circle(1, 2, 3, api1);
        Shape square = new Square(4, 5, 6, api2);

        circle.draw();
        square.draw();
    }
}
