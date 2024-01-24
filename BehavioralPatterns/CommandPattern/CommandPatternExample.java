package BehavioralPatterns.CommandPattern;

interface Command {
    void execute();
}

// Concrete commands
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Receiver
class Light {
    private boolean isLightOn = false;

    public void turnOn() {
        isLightOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff() {
        isLightOn = false;
        System.out.println("Light is OFF");
    }

    public boolean isLightOn() {
        return isLightOn;
    }
}

// Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();

        // Creating command objects
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Creating invoker
        RemoteControl remoteControl = new RemoteControl();

        // Associating commands with invoker
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton(); // Output: Light is ON
        System.out.println("Is light on? " + light.isLightOn()); // Output: Is light on? true

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton(); // Output: Light is OFF
        System.out.println("Is light on? " + light.isLightOn()); // Output: Is light on? false
    }
}

