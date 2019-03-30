package team.garage;

public class GarageDoor {

    String name;
    boolean door;

    public GarageDoor(String name) {
        this.name = name;
        door = false;
    }

    public void up() {
        door = true;
        System.out.println("Door opened");
    }

    public void down() {
        door = false;
        System.out.println("Door closed");
    }

    public void stop() {

        System.out.println("STOP");
    }

    public void lightOn() {
        System.out.println("Garage light on");
    }

    public void lightOff() {
        System.out.println("Garage light off");
    }
}
