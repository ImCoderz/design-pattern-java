// Component
interface Coffee {
    double cost();
    String description();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}

// Concrete Decorator
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Additional cost for milk
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}

// Concrete Decorator
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2; // Additional cost for sugar
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}

// Client Code
public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

        // Decorate the simple coffee with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        // Decorate the milk coffee with sugar
        Coffee sweetCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sweetCoffee.cost() + ", Description: " + sweetCoffee.description());
    }
}
