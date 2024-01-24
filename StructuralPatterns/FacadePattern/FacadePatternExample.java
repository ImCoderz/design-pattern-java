// Subsystem 1: Amplifier
class Amplifier {
    void on() {
        System.out.println("Amplifier is on");
    }

    void off() {
        System.out.println("Amplifier is off");
    }

    void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}

// Subsystem 2: DVD Player
class DVDPlayer {
    void on() {
        System.out.println("DVD Player is on");
    }

    void off() {
        System.out.println("DVD Player is off");
    }

    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

// Subsystem 3: Lights
class Lights {
    void dim() {
        System.out.println("Lights are dimmed");
    }

    void brighten() {
        System.out.println("Lights are brightened");
    }
}

// Facade
class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Lights lights) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
    }

    // Simplified methods for common actions
    void watchMovie(String movie) {
        amplifier.on();
        dvdPlayer.on();
        lights.dim();
        amplifier.setVolume(8);
        dvdPlayer.play(movie);
    }

    void endMovie() {
        amplifier.off();
        dvdPlayer.off();
        lights.brighten();
    }
}

// Client Code
public class FacadePatternExample {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, lights);

        // Watch a movie using the facade
        homeTheater.watchMovie("The Matrix");

        // End the movie using the facade
        homeTheater.endMovie();
    }
}
