package facade;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private CDPlayer cdPlayer;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, CDPlayer cdPlayer, DVDPlayer dvdPlayer, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void lictenToCD() {

    }

    public void endCD() {

    }

    public void listenToRadio() {

    }

    public void endRadio() {

    }
}
