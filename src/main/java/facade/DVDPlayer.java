package facade;

public class DVDPlayer {

    public void on() {
        System.out.println("DVD Player - ON");
    }

    public void off() {
        System.out.println("DVD Player - OFF");
    }

    public void eject() {
        System.out.println("DVD Player - Disk eject");
    }

    public void pause() {
        System.out.println("DVD Player - Pause");
    }

    public void play() {
        System.out.println("DVD Player - Play");
    }

    public void stop() {
        System.out.println("DVD Player - Stop");
    }

    public void setSurroundAudio() {
        System.out.println("DVD Player - Surround Audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD Player - Two Channel Audio");
    }
}
