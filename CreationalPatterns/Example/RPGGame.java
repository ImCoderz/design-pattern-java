package Example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Product: Character
abstract class Character {
    protected String name;

    public abstract void attack(Character opponent);

    public abstract Character clone();

    public String getName() {
        return name;
    }
}

// Concrete Product: Player
class Player extends Character {
    public Player(String name) {
        this.name = name;
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(name + " attacks!");
        // Implement player attack logic
    }

    @Override
    public Character clone() {
        return new Player(name);
    }
}

// Concrete Product: Enemy
class Enemy extends Character {
    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(name + " attacks!");
        // Implement enemy attack logic
    }

    @Override
    public Character clone() {
        return new Enemy(name);
    }
}

// Abstract Factory: CharacterFactory
interface CharacterFactory {
    Character createCharacter(String name);
}

// Concrete Factory: PlayerFactory
class PlayerFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Player(name);
    }
}

// Concrete Factory: EnemyFactory
class EnemyFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Enemy(name);
    }
}

// Singleton: GameManager
class GameManager {
    private static GameManager instance;

    private GameManager() {
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void manageGame(Character player, Character enemy) {
        System.out.println("Game starts!");

        player.attack(enemy);
        enemy.attack(player);

        System.out.println("Game over.");
    }
}

// Builder: CharacterBuilder
interface CharacterBuilder {
    Character buildCharacter(String name);
}

// Concrete Builder: PlayerBuilder
class PlayerBuilder implements CharacterBuilder {
    @Override
    public Character buildCharacter(String name) {
        return new Player(name);
    }
}

// Concrete Builder: EnemyBuilder
class EnemyBuilder implements CharacterBuilder {
    @Override
    public Character buildCharacter(String name) {
        return new Enemy(name);
    }
}

// Prototype: CharacterCache
class CharacterCache {
    private Map<String, Character> characterCache = new HashMap<>();

    public Character getCharacter(String type) {
        if (characterCache.containsKey(type)) {
            return characterCache.get(type).clone();
        } else {
            System.out.println("Character not found in cache. Creating a new one.");
            Character character = createCharacter(type);
            characterCache.put(type, character);
            return character;
        }
    }

    private Character createCharacter(String type) {
        CharacterBuilder builder;
        if ("Player".equalsIgnoreCase(type)) {
            builder = new PlayerBuilder();
        } else if ("Enemy".equalsIgnoreCase(type)) {
            builder = new EnemyBuilder();
        } else {
            throw new IllegalArgumentException("Invalid character type: " + type);
        }
        return builder.buildCharacter(type);
    }
}

// Object Pool: CharacterPool
class CharacterPool {
    private static final int MAX_POOL_SIZE = 10;
    private BlockingQueue<Character> characterPool = new ArrayBlockingQueue<>(MAX_POOL_SIZE);

    private static CharacterPool instance = new CharacterPool();

    private CharacterPool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            characterPool.offer(new Player("PooledPlayer" + i));
        }
    }

    public static CharacterPool getInstance() {
        return instance;
    }

    public Character borrowCharacter() {
        try {
            return characterPool.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error borrowing character from pool", e);
        }
    }

    public void returnCharacter(Character character) {
        characterPool.offer(character);
    }
}

public class RPGGame {
    public static void main(String[] args) {
        // Using Factory
        CharacterFactory playerFactory = new PlayerFactory();
        CharacterFactory enemyFactory = new EnemyFactory();

        Character player = playerFactory.createCharacter("Player1");
        Character enemy = enemyFactory.createCharacter("Enemy1");

        // Using Singleton
        GameManager.getInstance().manageGame(player, enemy);

        // Using Prototype
        CharacterCache characterCache = new CharacterCache();
        Character cachedPlayer = characterCache.getCharacter("Player");
        Character cachedEnemy = characterCache.getCharacter("Enemy");

        GameManager.getInstance().manageGame(cachedPlayer, cachedEnemy);

        // Using Object Pool
        CharacterPool characterPool = CharacterPool.getInstance();
        Character pooledPlayer1 = characterPool.borrowCharacter();
        Character pooledPlayer2 = characterPool.borrowCharacter();

        GameManager.getInstance().manageGame(pooledPlayer1, pooledPlayer2);

        // Returning characters to the pool
        characterPool.returnCharacter(pooledPlayer1);
        characterPool.returnCharacter(pooledPlayer2);
    }
}
