package Facade_Pattern;

// Subsystem Classes
public class TheaterLights {
    public void dim(int level) {
        System.out.println("Theater light dimmed to " + level + "%.");
    }

    public void on() {
        System.out.println("Theater lights are on.");
    }
}
