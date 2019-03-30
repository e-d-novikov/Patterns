package facade;

public class Amplifier {

    public Tuner tuner;
    public DVDPlayer dvdPlayer;
    public CDPlayer cdPlayer;
    private int volume;

    public Amplifier() {
        this.volume = 10;
    }

    public void on() {
        System.out.println("Amplifier ON");
    }

    public void off() {
        System.out.println("Amplifier OFF");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setDvdPlayer(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound() {
        System.out.println("Stereo");
    }

    public void setSurroundSound() {
        System.out.println("Surround");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
