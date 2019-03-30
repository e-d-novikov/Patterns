package team.stereo;

public class Stereo {

    private String name;
    private boolean on;
    private boolean cd;
    private boolean dvd;
    private boolean radio;
    private int volume;

    public Stereo(String name) {
        this.name = name;
        this.on = false;
        this.cd = false;
        this.dvd = false;
        this.radio = false;
        this.volume = 10;
    }

    public void on() {
        on = true;
        System.out.println("Stereo ON");
    }

    public void off() {
        on = false;
        cd = false;
        dvd = false;
        radio = false;
        System.out.println("Stereo OFF");
    }

    public void setCD() {
        cd = true;
        dvd = false;
        radio = false;
        System.out.println("Set CD");
    }

    public void setDVD() {
        cd = false;
        dvd = true;
        radio = false;
        System.out.println("Set DVD");
    }

    public void setRadio() {
        cd = false;
        dvd = false;
        radio = true;
        System.out.println("Set Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume " + volume);
    }
}
