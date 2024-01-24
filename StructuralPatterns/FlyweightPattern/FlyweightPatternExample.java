import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface CharFlyweight {
    void printCharacter();
}

// Concrete Flyweight
class Character implements CharFlyweight {
    private char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void printCharacter() {
        System.out.print(symbol);
    }
}

// Flyweight Factory
class CharacterFactory {
    private Map<Character, CharFlyweight> characterMap = new HashMap<>();

    CharFlyweight getCharacter(char symbol) {
        if (!characterMap.containsKey(symbol)) {
            characterMap.put(symbol, new Character(symbol));
        }
        return characterMap.get(symbol);
    }
}

// Client Code
public class FlyweightPatternExample {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        String textToPrint = "Hello, Flyweight Pattern!";
        char[] characters = textToPrint.toCharArray();

        // Print characters using flyweights
        for (char character : characters) {
            CharFlyweight charFlyweight = characterFactory.getCharacter(character);
            charFlyweight.printCharacter();
        }
    }
}
