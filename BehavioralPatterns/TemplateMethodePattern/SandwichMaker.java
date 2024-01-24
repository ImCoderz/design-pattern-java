package BehavioralPatterns.TemplateMethodePattern;

// Abstract class defining the template method
abstract class Sandwich {
    // Template method
    public final void makeSandwich() {
        cutBread();
        addIngredients();
        addCondiments();
        wrapSandwich();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void addIngredients();
    protected abstract void addCondiments();

    // Concrete methods with default implementations
    protected void cutBread() {
        System.out.println("Cutting the bread");
    }

    protected void wrapSandwich() {
        System.out.println("Wrapping the sandwich");
    }
}

// Concrete subclass for a vegetarian sandwich
class VegetarianSandwich extends Sandwich {
    @Override
    protected void addIngredients() {
        System.out.println("Adding vegetables");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding ketchup and mayo");
    }
}

// Concrete subclass for a chicken sandwich
class ChickenSandwich extends Sandwich {
    @Override
    protected void addIngredients() {
        System.out.println("Adding chicken");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding mustard");
    }
}

public class SandwichMaker {
    public static void main(String[] args) {
        // Making a vegetarian sandwich
        System.out.println("Making a Vegetarian Sandwich:");
        Sandwich vegetarianSandwich = new VegetarianSandwich();
        vegetarianSandwich.makeSandwich();

        System.out.println("\n-------------------------\n");

        // Making a chicken sandwich
        System.out.println("Making a Chicken Sandwich:");
        Sandwich chickenSandwich = new ChickenSandwich();
        chickenSandwich.makeSandwich();
    }
}
