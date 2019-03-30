package facade;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        CDPlayer cdPlayer = new CDPlayer();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade facade = new HomeTheaterFacade(amplifier,
                tuner, cdPlayer, dvdPlayer, projector, lights, screen, popper);

        facade.watchMovie();
        facade.endMovie();
    }
}
