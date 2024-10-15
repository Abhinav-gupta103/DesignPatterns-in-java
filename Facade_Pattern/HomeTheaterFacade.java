package Facade_Pattern;

// Facade Class which will provide a simplified interface to operate the entire home theater system(turn it on and off);
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Amplifier amplifier;
    private TheaterLights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Amplifier amplifier,
            TheaterLights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.amplifier = amplifier;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.increaseVolume();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        lights.on();
        dvdPlayer.stop();
        projector.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
