package AbstarctFactoryPattern;

import AbstarctFactoryPattern.entity.button.Button;
import AbstarctFactoryPattern.entity.textfield.TextField;
import AbstarctFactoryPattern.factory.DarkThemeFactory;
import AbstarctFactoryPattern.factory.ThemeFactory;

// Client Code
public class GUIFrameworkClient {
    public static void main(String[] args) {
        // Choose the theme (e.g., Light or Dark)
        ThemeFactory themeFactory = new DarkThemeFactory();

        // Create UI components using the chosen theme
        Button button = themeFactory.createButton();
        button.render();

        TextField textField = themeFactory.createTextField();
        textField.render();

        // Additional UI components can be created using the same themeFactory
    }
}
