package Facade_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create Subsystem objects
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        TheaterLights lights = new TheaterLights();

        // Create the facade that simplifies interaction with the subsystem
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, amplifier, lights);
        // Using facade to start the movie
        homeTheater.watchMovie("Inception");
        // Using facade to end the movie
        homeTheater.endMovie();
    }
}
