package AbstarctFactoryPattern.entity.button;

// Concrete Products for Dark Theme
public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}

