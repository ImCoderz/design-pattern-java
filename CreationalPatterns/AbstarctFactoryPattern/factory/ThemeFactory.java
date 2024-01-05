package AbstarctFactoryPattern.factory;

import AbstarctFactoryPattern.entity.button.Button;
import AbstarctFactoryPattern.entity.textfield.TextField;

public interface ThemeFactory {
    Button createButton();
    TextField createTextField();
}
