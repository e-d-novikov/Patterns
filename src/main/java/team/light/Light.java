package team.light;

public class Light {

    private String name;
    public boolean light;

    public Light(String name) {
        light = false;
        this.name = name;
    }

    public void on() {
        light = true;
        System.out.println("Light is on");
    }

    public void off() {
        light = false;
        System.out.println("Light is off");
    }
}
