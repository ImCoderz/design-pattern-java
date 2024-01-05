package AbstarctFactoryPattern.factory;

import AbstarctFactoryPattern.entity.button.Button;
import AbstarctFactoryPattern.entity.button.DarkButton;
import AbstarctFactoryPattern.entity.textfield.DarkTextField;
import AbstarctFactoryPattern.entity.textfield.TextField;

// Concrete Factories for Dark Theme
public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}

