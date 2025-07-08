package Facade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, screen);

        homeTheater.watchMovie("Inception");
        System.out.println("----- Intermission -----");
        homeTheater.endMovie();
    }
}
