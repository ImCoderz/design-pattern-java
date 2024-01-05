package BuilderPattern.burgerbuilder.src.main.java.com.naama.Model;

public class CustomBurgerBuilder implements BurgerBuilder {
    private Bun bun;
    private Patty patty;
    private Cheese cheese;
    private Vegetables vegetables;
    private Sauce sauce;

    @Override
    public BurgerBuilder addBun(String type) {
        this.bun = new Bun(type);
        return this;
    }

    @Override
    public BurgerBuilder addPatty(String type) {
        this.patty = new Patty(type);
        return this;
    }

    @Override
    public BurgerBuilder addCheese(String type) {
        this.cheese = new Cheese(type);
        return this;
    }

    @Override
    public BurgerBuilder addVegetables(String type) {
        this.vegetables = new Vegetables(type);
        return this;
    }

    @Override
    public BurgerBuilder addSauce(String type) {
        this.sauce = new Sauce(type);
        return this;
    }

    @Override
    public Burger build() {
        return new Burger(bun, patty, cheese, vegetables, sauce);
    }
}
