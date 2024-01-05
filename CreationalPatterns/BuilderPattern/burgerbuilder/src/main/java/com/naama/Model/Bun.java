package BuilderPattern.burgerbuilder.src.main.java.com.naama.Model;

public class Bun {
    private String type;

    public Bun(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}



// public class BurgerClient {
//     public static void main(String[] args) {
//         // Use the builder to create a custom burger
//         BurgerBuilder burgerBuilder = new CustomBurgerBuilder();
//         Burger customBurger = burgerBuilder
//             .addBun("Sesame")
//             .addPatty("Beef")
//             .addCheese("Cheddar")
//             .addVegetables("Lettuce, Tomato, Onion")
//             .addSauce("Ketchup, Mustard")
//             .build();

//         // Display the custom burger composition
//         customBurger.display();
//     }
// }
