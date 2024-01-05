package AbstarctFactoryPattern.factory;

import AbstarctFactoryPattern.entity.button.Button;
import AbstarctFactoryPattern.entity.button.LightButton;
import AbstarctFactoryPattern.entity.textfield.LightTextField;
import AbstarctFactoryPattern.entity.textfield.TextField;

// Concrete Factories for Light Theme
public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}

