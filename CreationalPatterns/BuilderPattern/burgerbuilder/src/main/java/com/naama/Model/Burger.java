package BuilderPattern.burgerbuilder.src.main.java.com.naama.Model;

public class Burger {
    private Bun bun;
    private Patty patty;
    private Cheese cheese;
    private Vegetables vegetables;
    private Sauce sauce;

    public Burger(Bun bun, Patty patty, Cheese cheese, Vegetables vegetables, Sauce sauce) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sauce = sauce;
    }

    public void display() {
        System.out.println("Burger Composition:");
        System.out.println("Bun: " + bun.getType());
        System.out.println("Patty: " + patty.getType());
        System.out.println("Cheese: " + cheese.getType());
        System.out.println("Vegetables: " + vegetables.getType());
        System.out.println("Sauce: " + sauce.getType());
    }
}
