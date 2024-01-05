package BuilderPattern.burgerbuilder.src.main.java.com.naama.Model;

public interface BurgerBuilder {
    BurgerBuilder addBun(String type);
    BurgerBuilder addPatty(String type);
    BurgerBuilder addCheese(String type);
    BurgerBuilder addVegetables(String type);
    BurgerBuilder addSauce(String type);
    Burger build();
}

