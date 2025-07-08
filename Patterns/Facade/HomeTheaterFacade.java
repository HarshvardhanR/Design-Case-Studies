package Facade;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Screen screen) {
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.off();
        projector.off();
        screen.up();
    }
}

