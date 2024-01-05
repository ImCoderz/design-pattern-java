package BuilderPattern.burgerbuilder.src.main.resources;

import com.naama.Model.Burger;
import com.naama.Model.CustomBurgerBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BurgerBuilderUI extends Application {

    private CustomBurgerBuilder burgerBuilder = new CustomBurgerBuilder();
    private HBox burgerLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Burger Builder");

        // Create buttons for each component
        Button addBunButton = createButton("Add Bun");
        Button addPattyButton = createButton("Add Patty");
        Button addCheeseButton = createButton("Add Cheese");
        Button addVegetablesButton = createButton("Add Vegetables");
        Button addSauceButton = createButton("Add Sauce");
        Button buildButton = createButton("Build Burger");

        // Create the burger layout
        burgerLayout = new HBox(10);
        burgerLayout.setPadding(new Insets(10));

        // Add event handlers to the buttons
        addBunButton.setOnAction(e -> burgerBuilder.addBun("Default Bun"));
        addPattyButton.setOnAction(e -> burgerBuilder.addPatty("Default Patty"));
        addCheeseButton.setOnAction(e -> burgerBuilder.addCheese("Default Cheese"));
        addVegetablesButton.setOnAction(e -> burgerBuilder.addVegetables("Default Vegetables"));
        addSauceButton.setOnAction(e -> burgerBuilder.addSauce("Default Sauce"));
        buildButton.setOnAction(e -> buildBurger());

        // Create a layout
        VBox mainLayout = new VBox(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.getChildren().addAll(addBunButton, addPattyButton, addCheeseButton, addVegetablesButton, addSauceButton, buildButton, burgerLayout);

        // Create a scene
        Scene scene = new Scene(mainLayout, 400, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setMinWidth(150);
        return button;
    }

    private void buildBurger() {
        Burger burger = burgerBuilder.build();
        System.out.println("\nFinal Burger:");
        burger.display();
        resetBuilder();  // Optionally reset the builder for a new burger
    }

    private void resetBuilder() {
        burgerBuilder = new CustomBurgerBuilder();
        updateBurgerLayout();  // Clear the layout when resetting the builder
    }

    private void updateBurgerLayout() {
        burgerLayout.getChildren().clear();
    }
}
