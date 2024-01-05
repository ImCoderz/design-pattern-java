package BuilderPattern.Restaurant;

class MainCourse {
    private String name;

    public MainCourse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Side dish
class SideDish {
    private String name;

    public SideDish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Drink
class Drink {
    private String name;

    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Dessert
class Dessert {
    private String name;

    public Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Step 2: Create a builder interface

interface MealBuilder {
    MealBuilder addMainCourse(String mainCourse);
    MealBuilder addSideDish(String sideDish);
    MealBuilder addDrink(String drink);
    MealBuilder addDessert(String dessert);
    Meal build();
}

// Step 3: Create a concrete builder

class CustomMealBuilder implements MealBuilder {
    private MainCourse mainCourse;
    private SideDish sideDish;
    private Drink drink;
    private Dessert dessert;

    @Override
    public MealBuilder addMainCourse(String mainCourse) {
        this.mainCourse = new MainCourse(mainCourse);
        return this;
    }

    @Override
    public MealBuilder addSideDish(String sideDish) {
        this.sideDish = new SideDish(sideDish);
        return this;
    }

    @Override
    public MealBuilder addDrink(String drink) {
        this.drink = new Drink(drink);
        return this;
    }

    @Override
    public MealBuilder addDessert(String dessert) {
        this.dessert = new Dessert(dessert);
        return this;
    }

    @Override
    public Meal build() {
        return new Meal(mainCourse, sideDish, drink, dessert);
    }
}

// Step 4: Create the product (Meal) class

class Meal {
    private MainCourse mainCourse;
    private SideDish sideDish;
    private Drink drink;
    private Dessert dessert;

    public Meal(MainCourse mainCourse, SideDish sideDish, Drink drink, Dessert dessert) {
        this.mainCourse = mainCourse;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public void display() {
        System.out.println("Meal Order:");
        System.out.println("Main Course: " + mainCourse.getName());
        System.out.println("Side Dish: " + sideDish.getName());
        System.out.println("Drink: " + drink.getName());
        System.out.println("Dessert: " + dessert.getName());
    }
}

// Step 5: Client code to use the builder

public class RestaurantClient {
    public static void main(String[] args) {
        // Use the builder to create a custom meal order
        MealBuilder mealBuilder = new CustomMealBuilder();
        Meal customMeal = mealBuilder
            .addMainCourse("Grilled Chicken")
            .addSideDish("Mashed Potatoes")
            .addDrink("Iced Tea")
            .addDessert("Chocolate Cake")
            .build();

        // Display the custom meal order
        customMeal.display();
    }
}
