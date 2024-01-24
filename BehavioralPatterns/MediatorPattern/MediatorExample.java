package BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface ChatMediator {
    void sendMessage(User sender, String message);
}

// Concrete Mediator
class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : users) {
            // Exclude the sender from receiving the message
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}

// Colleague interface
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}

// Concrete Colleague
class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives message: " + message);
    }
}

public class MediatorExample {
    public static void main(String[] args) {
        // Create a chat mediator
        ChatMediatorImpl chatMediator = new ChatMediatorImpl();

        // Create users and add them to the mediator
        User user1 = new ChatUser(chatMediator, "User 1");
        User user2 = new ChatUser(chatMediator, "User 2");
        User user3 = new ChatUser(chatMediator, "User 3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        // Users send messages through the mediator
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
    }
}

