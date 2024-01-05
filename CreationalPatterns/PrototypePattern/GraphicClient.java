package PrototypePattern;

import PrototypePattern.entity.Circle;
import PrototypePattern.entity.GraphicElement;
import PrototypePattern.entity.Rectangle;
import PrototypePattern.entity.TextBlock;
import PrototypePattern.prototype.PrototypeManager;

public class GraphicClient {
    public static void main(String[] args) {
        // Create PrototypeManager
        PrototypeManager manager = new PrototypeManager();

        // Register prototypes
        manager.registerPrototype("circle", new Circle(10));
        manager.registerPrototype("rectangle", new Rectangle(20, 30));
        manager.registerPrototype("textBlock", new TextBlock("Hello, Prototype!"));

        // Clone and display prototypes
        GraphicElement clonedCircle = manager.clonePrototype("circle");
        GraphicElement clonedRectangle = manager.clonePrototype("rectangle");
        GraphicElement clonedTextBlock = manager.clonePrototype("textBlock");

        if (clonedCircle != null) {
            clonedCircle.display();
        }

        if (clonedRectangle != null) {
            clonedRectangle.display();
        }

        if (clonedTextBlock != null) {
            clonedTextBlock.display();
        }
    }
}

